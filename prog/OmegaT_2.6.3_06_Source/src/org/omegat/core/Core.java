/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2008 Alex Buloichik
               2010 Wildrich Fourie
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 **************************************************************************/

package org.omegat.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.omegat.core.data.IProject;
import org.omegat.core.data.NotLoadedProject;
import org.omegat.core.spellchecker.ISpellChecker;
import org.omegat.core.spellchecker.SpellChecker;
import org.omegat.core.threads.IAutoSave;
import org.omegat.core.threads.SaveThread;
import org.omegat.filters2.master.FilterMaster;
import org.omegat.gui.comments.CommentsTextArea;
import org.omegat.gui.dictionaries.DictionariesTextArea;
import org.omegat.gui.editor.EditorController;
import org.omegat.gui.editor.IEditor;
import org.omegat.gui.editor.mark.BidiMarkerFactory;
import org.omegat.gui.editor.mark.IMarker;
import org.omegat.gui.editor.mark.NBSPMarker;
import org.omegat.gui.editor.mark.RemoveTagMarker;
import org.omegat.gui.editor.mark.TagMarker;
import org.omegat.gui.editor.mark.WhitespaceMarkerFactory;
import org.omegat.gui.exttrans.MachineTranslateTextArea;
import org.omegat.gui.glossary.GlossaryTextArea;
import org.omegat.gui.main.ConsoleWindow;
import org.omegat.gui.main.IMainWindow;
import org.omegat.gui.main.MainWindow;
import org.omegat.gui.matches.IMatcher;
import org.omegat.gui.matches.MatchesTextArea;
import org.omegat.gui.multtrans.MultipleTransPane;
import org.omegat.gui.notes.INotes;
import org.omegat.gui.notes.NotesTextArea;
import org.omegat.gui.tagvalidation.ITagValidation;
import org.omegat.gui.tagvalidation.TagValidationTool;

/**
 * Class which contains all components instances.
 * 
 * Note about threads synchronization: each component must have only local
 * synchronization. It mustn't synchronize around other components or some other
 * objects.
 * 
 * Components which works in Swing UI thread can have other synchronization
 * idea: it can not be synchronized to access to some data which changed only in
 * UI thread.
 * 
 * @author Alex Buloichik (alex73mail@gmail.com)
 * @author Wildrich Fourie
 */
public class Core {
    private static IProject currentProject;
    private static IMainWindow mainWindow;
    protected static IEditor editor;
    private static ITagValidation tagValidation;
    private static IMatcher matcher;
    private static ISpellChecker spellChecker;
    private static FilterMaster filterMaster;

    private static IAutoSave saveThread;

    private static GlossaryTextArea glossary;
    private static MachineTranslateTextArea machineTranslatePane;
    @SuppressWarnings("unused")
    private static DictionariesTextArea dictionaries;
    @SuppressWarnings("unused")
    private static MultipleTransPane multiple;
    private static INotes notes;
    @SuppressWarnings("unused")
    private static CommentsTextArea comments;

    private static Map<String, String> cmdLineParams;

    private static final List<IMarker> markers = new ArrayList<IMarker>();

    /** Get project instance. */
    public static IProject getProject() {
        return currentProject;
    }

    /** Set new current project. */
    public static void setProject(final IProject newCurrentProject) {
        currentProject = newCurrentProject;
    }

    /** Get main window instance. */
    public static IMainWindow getMainWindow() {
        return mainWindow;
    }

    /** Get editor instance. */
    public static IEditor getEditor() {
        return editor;
    }

    /** Get tag validation component instance. */
    public static ITagValidation getTagValidation() {
        return tagValidation;
    }

    /** Get matcher component instance. */
    public static IMatcher getMatcher() {
        return matcher;
    }

    /** Get spell checker instance. */
    public static ISpellChecker getSpellChecker() {
        return spellChecker;
    }

    public static FilterMaster getFilterMaster() {
        return filterMaster;
    }

    public static void setFilterMaster(FilterMaster newFilterMaster) {
        filterMaster = newFilterMaster;
    }

    public static MachineTranslateTextArea getMachineTranslatePane() {
        return machineTranslatePane;
    }

    public static IAutoSave getAutoSave() {
        return saveThread;
    }

    /** Get glossary instance. */
    public static GlossaryTextArea getGlossary() {
        return glossary;
    }
    
    /** Get notes instance. */
    public static INotes getNotes() {
        return notes;
    }

    /**
     * Initialize application components.
     */
    public static void initializeGUI(final Map<String, String> params) throws Exception {
        cmdLineParams = params;

        // 1. Initialize project
        currentProject = new NotLoadedProject();

        // 2. Initialize application frame
        MainWindow me = new MainWindow();
        mainWindow = me;

        Core.registerMarker(new TagMarker());
        Core.registerMarker(new RemoveTagMarker());
        Core.registerMarker(new NBSPMarker());
        Core.registerMarker(new WhitespaceMarkerFactory.SpaceMarker());
        Core.registerMarker(new WhitespaceMarkerFactory.TabMarker());
        Core.registerMarker(new WhitespaceMarkerFactory.LFMarker());
        Core.registerMarker(new BidiMarkerFactory.RLMMarker());
        Core.registerMarker(new BidiMarkerFactory.LRMMarker());
        Core.registerMarker(new BidiMarkerFactory.PDFMarker());
        Core.registerMarker(new BidiMarkerFactory.LROMarker());
        Core.registerMarker(new BidiMarkerFactory.RLOMarker());

        // 3. Initialize other components. They add themselves to the main window.
        editor = new EditorController(me);
        tagValidation = new TagValidationTool(me);
        matcher = new MatchesTextArea(me);
        glossary = new GlossaryTextArea();
        notes = new NotesTextArea(me);
        comments = new CommentsTextArea(me);
        machineTranslatePane = new MachineTranslateTextArea();
        dictionaries = new DictionariesTextArea();
        spellChecker = new SpellChecker();
        multiple = new MultipleTransPane();

        SaveThread th = new SaveThread();
        saveThread = th;
        th.start();
    }

    /**
     * Initialize application components.
     */
    public static void initializeConsole(final Map<String, String> params) throws Exception {
        cmdLineParams = params;
        tagValidation = new TagValidationTool();
        currentProject = new NotLoadedProject();
        mainWindow = new ConsoleWindow();
    }

    /**
     * Set main window instance for unit tests.
     * 
     * @param mainWindow
     */
    protected static void setMainWindow(IMainWindow mainWindow) {
        Core.mainWindow = mainWindow;
    }

    /**
     * Set project instance for unit tests.
     * 
     * @param currentProject
     */
    protected static void setCurrentProject(IProject currentProject) {
        Core.currentProject = currentProject;
    }

    /**
     * Register class for calculate marks.
     * 
     * @param marker
     *            marker implementation
     */
    public static void registerMarker(IMarker marker) {
        markers.add(marker);
    }

    public static List<IMarker> getMarkers() {
        return markers;
    }

    public static Map<String, String> getParams() {
        return cmdLineParams;
    }
}

Перевод на русский язык: © Андрей Кутузов, Андрей Сербовец, Павел Марьянов, Михаил Васильев 2013.

==============================================================================
  ОмегаТ 2.0, файл Read Me

  1.  Об ОмегаТ
  2.  Что собой представляет ОмегаТ?
  3.  Установка ОмегаТ
  4.  Как помочь ОмегаТ
  5.  ОмегаТ работает неправильно? Нужна помощь?
  6.  Сведения о выпуске

==============================================================================
  1.  Об ОмегаТ


Самую свежую информацию об ОмегаТ можно найти на веб-сайте
      http://www.omegat.org/

Поддержка пользователей осуществляется в многоязычной почтовой рассылке на Yahoo (архивы рассылки доступны без подписки):
     http://groups.yahoo.com/group/OmegaT/

Запросы на новые возможности (на английском языке) можно разместить на SourceForge:
     http://sourceforge.net/tracker/?group_id=68187&atid=520350

Там же можно опубликовать сообщения об ошибках (на английском языке):
     http://sourceforge.net/tracker/?group_id=68187&atid=520347

==============================================================================
  2.  Что собой представляет ОмегаТ?

ОмегаТ — это программа автоматизированного перевода (CAT, Computer Assisted Translation). Это свободная программа. Это означает, что за её использование (в том числе в профессиональных целях) не нужно никому платить. Кроме того, её можно свободно изменять и/или распространять при условии соблюдения лицензионного соглашения.

Основные особенности ОмегаТ:
  - запускается в любой операционной системе, поддерживающей Java;
  - поддерживает работу с памятью переводов в формате TMX;
  - гибкая сегментация по предложениям (по методике, схожей с SRX);
  - поиск по проекту и внешним файлам памяти переводов;
  - поиск файлов поддерживаемых форматов в любом каталоге; 
  - подбор нечётких совпадений;
  - интеллектуальная обработка проектов, в том числе со сложными иерархиями каталогов;
  - поддержка глоссариев (терминологическая справка); 
  - поддержка свободных программ проверки орфографии;
  - поддержка словарей формата StarDict;
  - поддержка службы машинного перевода Google Translate;
  - доступная и исчерпывающая документация;
  - документация и интерфейс переведены на множество языков.

В ОмегаТ «из коробки» поддерживаются следующие форматы файлов:

- Текстовые фалы (plain text)

  - тексты ASCII (.txt и т. п.)
  - кодированный текст (*.UTF8)
  - пакеты Java resource (*.properties);
  - файлы PO (*.po)
  - файлы INI (Ключ=Значение) (*.ini)
  - файлы DTD (*.DTD)
  - файлы DocuWiki (*.txt)
  - файлы субтитров SubRip (*.srt)
  - файлы локализации Magneto CE (*.csv)

- Текстовые фалы с тегами

  - файлы OpenOffice.org / OpenDocument (*.odt, *.ott, *.ods, *.ots, *.odp, *.otp)
  - файлы Microsoft Open XML
  - файлы (X)HTML (*.html, *.xhtml, *.xht)
  - файлы HTML Help Compiler (*.hhc, *.hhk)
  - файлы DocBook (*.xml)
  - одноязычные XLIFF (*.xlf, *.xliff, *.sdlxliff)
  - файлы QuarkXPress CopyFlowGold (*.tag, *.xtg)
  - файлы ResX (*.resx)
  - пакеты исходных данных Android (*.xml)
  - файлы LaTex (*.tex, *.latex)
  - файлы Помощи (*.xml) и Руководства (*.hmxp)
  - файлы Typo3 LocManager (*.xml)
  - файлы WiX Localization (*.wxl)
  - файлы Iceni Infix (*.xml)
  - файлы Flash XML export (*.xml)
  - файлы Wordfast TXML
  - Camtasia для Windows (*.camproj)
  - файлы Visio (*.vxd)

В ОмегаТ можно настроить поддержку и других форматов файлов.

ОмегаТ автоматически обработает даже самую сложную иерархию исходных каталогов, найдёт все поддерживаемые файлы и создаст каталог перевода с идентичной структурой, куда будут также скопированы и файлы форматов, которые не поддерживаются.

Чтобы быстро ознакомиться с возможностями ОмегаТ, запустите программу и прочитайте в открывшемся окне краткое руководство.

Полное руководство пользователя поставляется вместе с программой, его можно найти в меню «Справка».

==============================================================================
 3. Установка ОмегаТ

3.1 Для запуска ОмегаТ необходимо, чтобы в вашей системе была установлена Java Runtime Environment версии 1.5 и выше. Чтобы сэкономить ваше время, мы предлагаем пакеты, устанавливающие сразу и ОмегаТ, и Java Runtime Environment. 

Если Java у вас уже установлена, проще всего — установить текущую версию ОмегаТ с помощью Java Web Start. 
Для этого, загрузите указанный ниже файл и запустите его:

   http://omegat.sourceforge.net/webstart/OmegaT.jnlp

В результате, на ваш компьютер будет установлена ОмегаТ и пакет программного обеспечения, необходимый для ее работы. В дальнейшем, наличие соединения с Интернет не обязательно.

Во время установки, в зависимости от операционной системы, могут появиться несколько предупреждений системы безопасности. Сертификат самостоятельно подписан от имени Дидье Бриэля (Didier Briel). 
Права, которые вы даете этой версии (они могут быть сформулированы, например, как: «неограниченный доступ к компьютеру») идентичны правам, которые есть у локально установленной версии (процедуру её установки мы рассмотрим позже), а именно: разрешается доступ к жесткому диску вашего компьютера. При последующих запусках OmegaT.jnlp, при наличии доступа в Интернет, будут загружены и установлены обновления (если они есть, конечно), и лишь затем запустится ОмегаТ. 

Также, установить ОмегаТ можно и другим способом: 

Если у вас установлены ОС MS Windows или GNU/Linux и имеется JRE нужной версии, можно загрузить «облегчённую» версию ОмегаТ без JRE (установочный пакет можно отличить по маркировке «Without_JRE» после номера версии). 
Если сомневаетесь, мы рекомендуем вам использовать версию с JRE в комплекте. Это вполне безопасно, даже если JRE уже установлена в вашей системе, эта версия не будет с ней конфликтовать.

Пользователи GNU/Linux:
ОмегаТ будет работать со свободными реализациями Java, которые поставляются со многими дистрибутивами GNU/Linux (например, Ubuntu), но, возможно, вы столкнётесь с ошибками или неработающим функционалом. Мы рекомендуем загрузить и установить либо Oracle Java Runtime Environment (JRE), либо версию ОмегаТ с JRE (файл *.tar.bz2 помеченный «Linux»). Если вы установили в свою систему Java, удостоверьтесь, что, каталог, в который она установилась, указан в переменной PATH, или, при запуске ОмегаТ указывайте полный путь к Java. Если вы новичок в мире GNU/Linux, мы опять же советуем использовать версию ОмегаТ с JRE в комплекте. Это вполне безопасно, JRE не будет конфликтовать с другими реализациями Java, которые могут быть уже установлены на вашей системе.

Пользователи Mac:
В версиях Mac OS X до Mac OS X 10.7 JRE уже установлена. При первом запуске приложения, для работы которого необходима Java, Mac OS X Lion предложит пользователю автоматически загрузить и установить её.

Пользователи GNU/Linux на PowerPC:
вам придётся загрузить JRE в реализации IBM, поскольку Sun не предоставляет JRE для PPC-систем. Это можно сделать по адресу:

    http://www.ibm.com/developerworks/java/jdk/linux/download.html 


3.2 Установка
* Пользователи Windows:
просто запустите программу установки. Если хотите, программа установки может создать ярлыки для запуска ОмегаТ.

* Пользователи GNU/Linux:
Поместить архив в любую подходящую папку и распакуйте его; ОмегаТ готова к работе. Также, вы может воспользоваться удобным скриптом установки (linux-install.sh). Для этого, откройте окно эмулятора терминала (консоль), перейдите в папку, содержащую OmegaT.jar и linux-install.sh, и запустить скрипт, командой ./linux-install.sh.

* Пользователи Mac:
Скопируйте архив OmegaT.zip в любую подходящую папку и распакуйте его. В появившемся каталоге содержится HTML документация и исполняемый файл OmegaT.app.

* Остальные:
чтобы установить ОмегаТ, просто создайте для неё подходящую папку. Скопируйте туда архив zip или tar.bz2 с ОмегаТ и распакуйте.

3.3 Запуск ОмегаТ
Запустите ОмегаТ как описано ниже.

* Пользователи Windows:
Если во время установки вы выбрали создание ярлыка на рабочем столе, просто дважды щёлкните по нему мышью. Если же нет, просто дважды щёлкните мышью по файлу OmegaT.exe. Если в файловом менеджере (Проводнике Windows) вы видите только файл OmegaT, но не OmegaT.exe, включите отображение расширений файлов в настройках Проводника Windows.

* Пользователи GNU/Linux:
Если вы воспользовались предоставляемым скриптом установки, вы можете запустить ОмегаТ нажав
ALT+F2
и введя в появившемся окне:
omegat

* Пользователи Mac:
Дважды щёлкните мышью по файлу OmegaT.app.

* Из файлового менеджера (все системы):
Дважды щёлкните по файлу OmegaT.jar. Это сработает, только если JAR-файлы ассоциированы в операционной системе с программой Java.

* Из командной строки (все системы):
Для запуска Omegat введите команду:

cd <папка, в которой находится OmegaT.jar>

<путь к исполняемому файлу Java и его имя> -jar OmegaT.jar

(Исполняемый файл Java - это файл java.exe в Windows и java в GNU/Linux.
Если Java установлена на системном уровне, полный путь к файлу Java вводить не обязательно.)

Настройка запуска ОмегаТ

* Пользователи Windows:
Программа установки может создать ярлыки в главном меню, на рабочем столе и на панели быстрого запуска. Кроме того, можно вручную перетащить файл OmegaT.exe в меню «Пуск», на рабочий стол или на панель быстрого запуска.

* Пользователи GNU/Linux:
Для удобного запуска ОмегаТ можно использовать имеющийся Kaptain-скрипт (omegat.kaptn). Для использования этого скрипта, сначала надо установить Kaptain. Затем, Kaptain-скрипт можно запустить, нажав
ALT+F2
и введя:
omegat.kaptn

Для получения более подробной информации о Kaptain и о добавлении соответствующих пунктов в меню, прочтите HowTo «OmegeT на GNU/Linux».

Пользователи Mac:
Для удобства запуска, просто перетащите OmegaT.app в док или на панель Finder. Также, ОмегаТ всегда можно запустить с помощью Spotlight.

==============================================================================
 4. Участие в проекте ОмегаТ

Чтобы принять участие в разработке ОмегаТ, свяжитесь с разработчиками по адресу:
    http://lists.sourceforge.net/lists/listinfo/omegat-development

Если вы хотите перевести интерфейс ОмегаТ, руководство пользователя или другие документы, прочитайте этот текст:
      
      http://www.omegat.org/en/translation-info.html

И подпишитесь на список рассылки переводчиков:
      http://lists.sourceforge.net/mailman/listinfo/omegat-l10n

Если у вас есть другие предложения, подпишитесь на список рассылки для пользователей:
      http://tech.groups.yahoo.com/group/omegat/

И погрузитесь в мир ОмегаТ...

  Создатель ОмегаТ — Keith Godfrey;
  Координатор проекта ОмегаТ — Marc Prior;

В разработке приняли участие (в алфавитном порядке):

Программисты:
  Zoltan Bartko;
  Volker Berlin;
  Didier Briel (руководитель разработки);
  Kim Bruning;
  Alex Buloichik (ведущий разработчик);
  Sandra Jean Chua;
  Thomas Cordonnier;
  Martin Fleurke;  
  Wildrich Fourie;
  Phillip Hall;
  Jean-Christophe Helary;
  Thomas Huriaux;
  Hans-Peter Jacobs;
  Ibai Lakunza Velasco;
  Guido Leenders;
  Aaron Madlon-Kay;
  Fabián Mandelbaum;
  John Moran;
  Maxym Mykhalchuk; 
  Arno Peters;
  Henry Pijffers; 
  Briac Pilpré;
  Tiago Saboga;
  Andrzej Sawuła;
  Benjamin Siband;
  Yu Tang;
  Rashid Umarov;  
  Antonio Vilei;
  Martin Wunderlich;
  Michael Zakharov.

Также помогали:
  Sabine Cretella;
  Dmitri Gabinski;
  Jean-Christophe Helary (координатор команды локализации);
  Vito Smolej (координатор создания документации);
  Samuel Murray;
  Marc Prior; 
  и много, много других прекрасных людей.

(Если вы считаете, что серьёзно помогли проекту ОмегаТ, но не видите вашего имени в списке, пожалуйста, сообщите нам об этом).

ОмегаТ использует следующие библиотеки:
  HTMLParser 1.6 (авторы: Somik Raha, Derrick Oswald и другие; лицензия: LGPL)
  MRJ Adapter 1.0.8. Автор — Steve Roy (лицензия LGPL)
  Инфраструктура VLDocking Framework 2.1.4. Производство VLSolutions (лицензия CeCILL)
  Hunspell. Авторы: László Németh и другие (лицензия LGPL)
  JNA. Авторы: Todd Fast, Timothy Wall и другие (лицензия LGPL)
  Swing-Layout 1.0.2 (лицензия LGPL)
  Jmyspell 2.1.4 (лицензия LGPL)
  JAXB (лицензия GPLv2 + classpath exception)
  SJXP 1.0.2 (лицензия GPLv2)
  SVNKit 1.3.7 (лицензия TMate)
  Sequence Library (лицензия Sequence Library)
  ANTLR 3.4 (лицензия ANTLR 3)
  SQLJet 1.1.3 (лицензия GPL v2)
  JGit (лицензия Eclipse Distribution)
  JSch (лицензия JSch)
  Base64 (общественное достояние)
  Diff (лицензия GPL)

==============================================================================
 5.  ОмегаТ работает неправильно? Нужна помощь?

Прежде, чем сообщать об ошибке, убедитесь, что вы внимательно прочли документацию. Возможно, это не ошибка, а особенность ОмегаТ. Если в лог-файле ОмегаТ вы видите слова «Error», «Warning», «Exception» или «died unexpectedly», тогда, вероятно, вы действительно обнаружили проблему. Файл «log.txt» расположен в каталоге пользовательских настроек, для получения более подробной информации, прочтите руководство пользователя.

Дальше — нужно удостовериться, что об этой ошибке ещё не сообщили другие пользователи. Для этого просмотрите отчёты об ошибках на сайте SourceForge. Если же вы уверены, что вы первый, кто нашёл некую воспроизводимую последовательность действий, которая вызывает нечто неправильное, пожалуйста, заполните сообщение об ошибке.

Хорошее сообщение об ошибке включает три важных пункта:
  - последовательность действий для воспроизведения ошибки;
  - описание того, что должно было произойти;
  - описание того, что произошло на самом деле.

Вы можете прикрепить копии файлов, фрагменты логов, скриншоты — всё, что по вашему мнению, поможет разработчикам найти и исправить ошибку.

Чтобы просмотреть архивы списка рассылки для пользователей ОмегаТ, зайдите на:
     http://groups.yahoo.com/group/OmegaT/

Чтобы просмотреть страницу сообщений об ошибках и отправить новое сообщение, перейдите на страницу по адресу:
     http://sourceforge.net/tracker/?group_id=68187&atid=520347

Чтобы отслеживать состояние своего сообщения об ошибке, можно зарегистрироваться на SourceFourge.

==============================================================================
6.   Сведения о выпуске

Подробные сведения об изменениях в этой и предыдущих версиях см. в файле «changes.txt».


==============================================================================

 My-project

==============================================================================
СТРУКТУРА ПРОЕКТА:
1) База Данных: SQLite
2) Серверная часть:MyBatis + Spring
3) Клиентская часть: JSP + Jquery +Bootstrap
4) пакет dao: мапперы Mybatis
5) пакет service: классы сервисы для бизнес логики
6) пакет controller: классы контроллеры(для связи с клиентской части)

=============================================================================
МАНУАЛ ЗАПУСКА ПРОЕКТА:
1) git clone https://github.com/YernarB/My-project.git
2) заходим до ~/My-Project/hello_world.
3) запускаем команду: gradle war
4) копируем файл ~/My-Project/hello_world/build/libs/hello_world-1.0.war в томкат.
5) запускаем томкат.

============================================================================
МАНУАЛ импортирования проекта в екслипс:
1) git clone https://github.com/YernarB/My-project.git
2) заходим до ~/My-Project/hello_world.
3) запускаем команду: gradle eclipse
4) импортируем в еклипсе сам проект
============================================================================
P.S. так как проект запускается через SQLite нет надобности указывать db.properties.

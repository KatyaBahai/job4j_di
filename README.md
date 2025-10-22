Проект для практики Spring dependency injection. 

Отличия BeanFactory и ApplicationContext.
Интерфейс BeanFactory — это самая базовая версия контейнеров IoC, а интерфейс ApplicationContext - это один из потомков, который расширяет возможности BeanFactory .
BeanFactory загружает компоненты по запросу, а ApplicationContext загружает все компоненты при запуске . Таким образом, BeanFactory легче по сравнению с ApplicationContext .
ApplicationContext обладает гораздо более широким функционалом, чем BeanFactory.

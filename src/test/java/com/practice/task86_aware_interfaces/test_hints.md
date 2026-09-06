# task86 aware_interfaces (internals)
- @SpringBootTest: setApplicationContext вызван контейнером, контекст не null.
- lookup(SomeBean.class) возвращает бин.
- Главный вывод: это анти-паттерн для прикладного кода — норм инъекция лучше. Знать «что есть», не «применять везде».

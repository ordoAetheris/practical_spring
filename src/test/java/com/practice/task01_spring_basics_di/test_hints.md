# task01 spring_basics_di
- @SpringBootTest: контекст поднимается, бин GreetingService внедрён (не null).
- Юнит без Spring: new GreetingService(fakeRepo) → greet("Оля") == "Привет, Оля!".
- Понять: конструкторная инъекция vs field-инъекция (почему конструктор лучше — final, тестируемость).

# Подсказки: Testcontainers
## Обязательно
- PostgreSQLContainer started → JPA repository CRUD работает.
- @DynamicPropertySource: spring.datasource.url из container.
- @ServiceConnection: автоматически (без @DynamicPropertySource).
## Продвинутые
- Reusable containers: второй тест класс переиспользует container.

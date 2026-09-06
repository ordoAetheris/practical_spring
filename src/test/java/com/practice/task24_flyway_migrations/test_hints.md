# Подсказки: Flyway Migrations
## Обязательно
- После всех миграций: таблицы существуют, данные корректны.
- V3 (Java migration): email заполнен из legacy.
- V4: NOT NULL constraint работает (insert без email → ошибка).
## Продвинутые
- Zero-downtime pattern: V2+V3+V4 в правильном порядке.
- flyway_schema_history: все миграции recorded.

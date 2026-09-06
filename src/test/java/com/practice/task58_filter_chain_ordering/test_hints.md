# Подсказки: Filter Chain Ordering
## Обязательно
- Log output: "CorsFilter.before → AuthFilter.before → LoggingFilter.before → handler → reverse".
- @Order(1) выполняется раньше @Order(3).
## Как тестировать
- Captured log → verify order of filter entries.

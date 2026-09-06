# Подсказки: @ConfigurationProperties

## Обязательно протестировать
- Валидные properties: все поля забиндились
- Невалидные (port=-1): BindValidationException при поднятии контекста
- Nested: server.host, cache.ttl доступны
- Default values: отсутствующий property → default
- Relaxed binding: app.max-size == app.maxSize

## Как тестировать
- @SpringBootTest + application-test.yml с тестовыми значениями
- ApplicationContextRunner для быстрых тестов без полного контекста

# Подсказки: API Versioning
## Обязательно
- URL: /api/v1/users → v1 response. /api/v2/users → v2.
- Header: X-API-Version: 2 → v2 handler.
- Sunset header на deprecated v1.
## Продвинутые
- Custom @ApiVersion: один контроллер, routing по header/mediatype.

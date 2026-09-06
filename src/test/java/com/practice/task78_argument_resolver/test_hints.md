# Подсказки: Custom Argument Resolver
## Обязательно
- GET /profile с valid auth → @CurrentUser UserInfo populated.
- Без auth → UserInfo null или 401.
- MockMvc: verify controller receives correct UserInfo.

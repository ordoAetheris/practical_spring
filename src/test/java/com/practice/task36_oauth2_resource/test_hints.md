# Подсказки: OAuth2 Resource Server
## Обязательно
- Valid JWT (от IdP) → доступ. Invalid → 401. Expired → 401.
- Roles extraction: realm_access.roles → GrantedAuthority.
- Audience check: token для другого сервиса → rejected.

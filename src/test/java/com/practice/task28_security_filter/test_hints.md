# Подсказки: Custom Security Filter
## Обязательно
- /api/** с valid X-API-Key → 200. Без key → 401.
- /web/** с form login → 200. Без login → redirect to login page.
- API chain не interference с web chain.
## Продвинутые
- Filter ordering: API key filter BEFORE UsernamePasswordAuth.

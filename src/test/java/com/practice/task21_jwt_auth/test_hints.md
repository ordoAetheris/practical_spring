# Подсказки: JWT Authentication
## Обязательно
- generateAccessToken: валидный JWT с claims (sub, roles, exp)
- parseToken: корректный → Claims. Expired → exception. Tampered → exception.
- Refresh flow: valid refresh → new access. Expired refresh → 401.
- Filter: valid token в header → Authentication в SecurityContext. Без token → anonymous.
## Продвинутые
- Secret rotation: старый token не валидируется новым ключом

# Подсказки: CSRF Protection
## Обязательно
- POST без CSRF token → 403. POST с token → ok.
- Cookie XSRF-TOKEN → header X-XSRF-TOKEN.
- Stateless JWT API: CSRF disabled → POST без token → ok (объяснить почему безопасно).

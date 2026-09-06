# Подсказки: CORS
## Обязательно
- Allowed origin → CORS headers в response. Disallowed → нет CORS headers.
- OPTIONS preflight → 200 с Access-Control-Allow-*.
- Credentials: Access-Control-Allow-Credentials: true.
## Как тестировать
- MockMvc: perform(options("/api").header("Origin", "http://evil.com"))

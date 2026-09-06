# Подсказки: Global Exception Handler
## Обязательно
- NotFoundException → 404 ProblemDetail с type/title/detail
- @Valid error → 400 + список field errors
- Unknown exception → 500 (generic)
- Content-Type: application/problem+json

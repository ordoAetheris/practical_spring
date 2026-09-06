# Подсказки: Content Negotiation
## Обязательно
- Accept: application/json → JSON. Accept: application/xml → XML. Accept: text/csv → CSV.
- CSV: корректный формат (header + rows, кавычки для запятых).
- Unsupported Accept → 406 Not Acceptable.

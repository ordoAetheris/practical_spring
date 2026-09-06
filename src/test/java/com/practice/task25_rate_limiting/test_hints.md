# Подсказки: Rate Limiting
## Обязательно
- 100 requests/min: первые 100 → 200 OK. 101-й → 429 + Retry-After header.
- Per-IP: разные IP → разные buckets.
## Стресс
- Concurrent requests от одного IP: не превысить лимит (atomic bucket).

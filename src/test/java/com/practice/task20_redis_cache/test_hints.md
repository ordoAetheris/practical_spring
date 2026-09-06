# Подсказки: Redis Cache
## Обязательно
- @Cacheable: первый findById → DB query. Второй → cache hit (нет DB query).
- @CacheEvict: после update → следующий findById идёт в DB.
- TTL: после 10 мин → cache miss.
## Продвинутые
- Self-invocation: this.findById() внутри того же @Service → cache bypass! Классическая ловушка.
- Custom key: verify через Redis CLI (KEYS *).
- Testcontainers Redis: GenericContainer("redis:7-alpine").

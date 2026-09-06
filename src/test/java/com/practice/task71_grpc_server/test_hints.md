# Подсказки: gRPC Server
## Обязательно
- GetUser(id) → User response. NOT_FOUND for missing. CreateUser → created.
- ServerInterceptor logs method name + duration.
## Как тестировать
- InProcessServer + InProcessChannel (no network).

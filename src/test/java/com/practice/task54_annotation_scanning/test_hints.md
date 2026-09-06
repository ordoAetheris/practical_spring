# Подсказки: Annotation Scanning
## Обязательно
- Registry contains all @BusinessEvent handlers after startup.
- dispatch("order.created", payload) → OrderCreatedHandler invoked.
- dispatch("unknown") → no handler, no error.

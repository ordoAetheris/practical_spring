# Подсказки: Event-Driven (Outbox + Saga)
## Обязательно
- DB save + outbox event → one transaction. Poller publishes event.
- Idempotent consumer: same eventId processed once.
- Saga: all steps ok → complete. Step fails → compensations in reverse order.
## Gotcha
- Dual write: save DB + send Kafka separately → event lost on crash between them. Outbox fixes this.

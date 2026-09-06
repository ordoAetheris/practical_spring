# Подсказки: RabbitMQ Patterns
## Обязательно
- Fanout: message → all bound queues. Topic: "order.*" matches "order.created".
- Request-Reply: convertSendAndReceive → response received.

# Подсказки: RabbitMQ Consumer
## Обязательно
- @RabbitListener: message consumed. Manual ack: message removed from queue.
- Nack without requeue → DLQ. Nack with requeue → retry.
- DLQ: dead-lettered messages appear in DLQ queue.

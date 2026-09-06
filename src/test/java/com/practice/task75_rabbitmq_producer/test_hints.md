# Подсказки: RabbitMQ Producer
## Обязательно
- convertAndSend → message arrives in queue. JSON format.
- Publisher confirms: ack received.
## Как тестировать
- Testcontainers RabbitMQ: GenericContainer("rabbitmq:3-management").

# Подсказки: Kafka Producer
## Обязательно
- send(topic, key, value): message in correct partition (by key hash).
- Idempotent: duplicate send → one message in topic.
## Как тестировать
- Testcontainers KafkaContainer. EmbeddedKafka для unit tests.

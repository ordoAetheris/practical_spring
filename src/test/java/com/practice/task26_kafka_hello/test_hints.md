# task26 kafka_hello
- @EmbeddedKafka (быстро) ИЛИ Testcontainers-Kafka (ближе к прод). send → приём асинхронный.
- Awaitility: await().atMost(5s).until(() -> "hi".equals(hello.lastReceived())).
- Понять: приём НЕ мгновенный (consumer poll) — нельзя assert сразу после send.

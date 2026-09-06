# Подсказки: Starter Conditional Beans
## Обязательно
- Kafka on classpath → KafkaAuditSink. No Kafka → FileAuditSink (default).
- User defines own @Bean AuditSink → auto-config skipped (@ConditionalOnMissingBean).
- audit.enabled=false → NoopAuditSink.

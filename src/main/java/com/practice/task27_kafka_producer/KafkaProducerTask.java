package com.practice.task27_kafka_producer;
/**
 * Задача 78 — Kafka Producer: KafkaTemplate, partitioning, idempotence.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>KafkaTemplate.send(topic, key, value): key-based partitioning</li>
 *   <li>JsonSerializer: сериализация DTO в JSON</li>
 *   <li>Idempotent producer: enable.idempotence=true (exactly-once на partition)</li>
 *   <li>Transactional producer: KafkaTransactionManager</li>
 *   <li>ProducerListener: onSuccess/onError callbacks</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Partitioning: hash(key) % partitions. Ordering гарантирован ВНУТРИ partition.
 * Idempotence: producer ID + sequence number → broker deduplicates.
 *
 * Сложность: Medium
 */
public class KafkaProducerTask {
    // TODO: OrderEventProducer с KafkaTemplate
    // TODO: ProducerConfig: serializers, idempotence, acks=all
}

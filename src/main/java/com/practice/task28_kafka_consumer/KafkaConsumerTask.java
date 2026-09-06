package com.practice.task28_kafka_consumer;
/**
 * Задача 79 — Kafka Consumer: @KafkaListener, consumer groups, offset management.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@KafkaListener(topics = "orders", groupId = "order-processor")</li>
 *   <li>Consumer groups: 3 partitions + 3 consumers → 1 partition per consumer</li>
 *   <li>Offset commit: auto (default) vs manual (Acknowledgment.acknowledge())</li>
 *   <li>Error handling: CommonErrorHandler, DeadLetterPublishingRecoverer → DLT topic</li>
 *   <li>Batch listener: @KafkaListener(batch = "true") для throughput</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Consumer group: partitions распределяются между consumers. Rebalance при add/remove.
 * Offset: позиция чтения per partition. Commit = "я обработал до этого offset".
 * At-least-once: commit после обработки. At-most-once: commit до обработки.
 *
 * Сложность: Hard
 */
public class KafkaConsumerTask {
    // TODO: OrderEventConsumer с @KafkaListener
    // TODO: Manual offset commit
    // TODO: DLT (Dead Letter Topic) через DeadLetterPublishingRecoverer
}

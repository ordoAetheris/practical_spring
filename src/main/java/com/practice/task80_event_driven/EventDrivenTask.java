package com.practice.task80_event_driven;
/**
 * Задача 80 — Event-Driven Architecture: Transactional Outbox + Saga.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Transactional Outbox: @TransactionalEventListener → save event to outbox table</li>
 *   <li>Outbox poller: scheduled job читает outbox → publish to Kafka/Rabbit</li>
 *   <li>Idempotent consumer: deduplication by eventId</li>
 *   <li>Saga orchestration: OrderSaga с шагами (reserve → charge → ship)</li>
 *   <li>Compensation: если charge failed → rollback reserve</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Dual write problem: save to DB + send to Kafka не атомарно. Outbox решает:
 * save entity + save event → одна транзакция. Poller отправляет event → at-least-once.
 * CDC (Debezium): читает WAL базы → отправляет events. Нет поллера.
 *
 * <h2>Почему это Staff-level</h2>
 * На собесе: "Как гарантировать что event отправлен после DB commit?"
 * Неправильный ответ: "отправлю в @Transactional" (dual write, event может потеряться).
 * Правильный: Transactional Outbox или CDC.
 *
 * Сложность: Hard (capstone для messaging)
 */
public class EventDrivenTask {
    // TODO: OutboxEvent entity (id, eventType, payload, createdAt, published)
    // TODO: OutboxRepository
    // TODO: @TransactionalEventListener → save to outbox
    // TODO: OutboxPoller: @Scheduled → read unpublished → publish → mark published
    // TODO: Saga: OrderSagaOrchestrator с compensation
}

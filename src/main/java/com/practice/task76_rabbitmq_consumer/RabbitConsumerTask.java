package com.practice.task76_rabbitmq_consumer;
/**
 * Задача 76 — RabbitMQ Consumer: @RabbitListener, ack/nack, DLQ.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@RabbitListener(queues = "orders"): автоматический consumer</li>
 *   <li>Manual ack: Channel.basicAck(deliveryTag, false) после обработки</li>
 *   <li>Nack + requeue: temporaryError → requeue. PermanentError → DLQ</li>
 *   <li>Dead Letter Queue: x-dead-letter-exchange, x-dead-letter-routing-key</li>
 *   <li>Retry с backoff: SimpleRetryPolicy + ExponentialBackOff</li>
 * </ol>
 *
 * Сложность: Medium
 */
public class RabbitConsumerTask {
    // TODO: OrderEventListener с @RabbitListener
    // TODO: Manual acknowledgement mode
    // TODO: DLQ configuration
}

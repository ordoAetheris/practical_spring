package com.practice.task29_rabbitmq_producer;
/**
 * Задача 75 — RabbitMQ Producer: RabbitTemplate, exchange, routing.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>RabbitTemplate.convertAndSend(exchange, routingKey, message)</li>
 *   <li>Jackson2JsonMessageConverter: сериализация в JSON</li>
 *   <li>Exchange/Queue/Binding конфигурация через @Bean</li>
 *   <li>Correlation ID для request-reply трейсинга</li>
 *   <li>Publisher confirms: ack/nack от RabbitMQ</li>
 * </ol>
 *
 * Сложность: Medium
 */
public class RabbitProducerTask {
    // TODO: OrderEventPublisher с RabbitTemplate
    // TODO: RabbitConfig: DirectExchange + Queue + Binding
    // TODO: JSON converter
}

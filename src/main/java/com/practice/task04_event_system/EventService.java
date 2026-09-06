package com.practice.task04_event_system;

/**
 * Задача 04 — Spring Event System: publish + listen + async.
 *
 * <h2>Что такое Spring Events</h2>
 * Loose coupling паттерн: publisher не знает о listeners. Через
 * {@code ApplicationEventPublisher.publishEvent(event)}. Listeners через
 * {@code @EventListener} или {@code ApplicationListener<T>}.
 *
 * <h2>Задание</h2>
 * Создай в этом пакете:
 * <ol>
 *   <li>{@code OrderCreatedEvent} — record(String orderId, double amount, Instant timestamp)</li>
 *   <li>{@code OrderPaidEvent} — record(String orderId, double amount)</li>
 *   <li>{@code OrderService} — inject ApplicationEventPublisher, методы createOrder/payOrder публикуют events</li>
 *   <li>{@code AuditEventListener} — @EventListener + @Order(1), логирует ВСЕ events в List</li>
 *   <li>{@code NotificationListener} — @EventListener + @Async + @Order(2), "отправляет" email</li>
 *   <li>{@code VipListener} — @EventListener(condition = "#event.amount > 1000"), только дорогие заказы</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * {@code @EventListener} обрабатывается через {@code EventListenerMethodProcessor} (BPP).
 * Async через {@code @Async} + {@code @EnableAsync} — исполнение в отдельном потоке.
 * Ordering через {@code @Order} на listener.
 *
 * <h2>Требования</h2>
 * <ul>
 *   <li>Events — immutable records</li>
 *   <li>Async listener не блокирует publisher</li>
 *   <li>Ordering: audit ПЕРЕД notification</li>
 *   <li>Conditional: VipListener только для amount > 1000</li>
 *   <li>AuditEventListener.getLog() — список всех events для тестирования</li>
 * </ul>
 *
 * Сложность: Medium
 */
public class EventService {
    // Это файл-описание задачи.
    // Студент создаёт отдельные классы в этом пакете.
}

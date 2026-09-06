package com.practice.task12_websocket;

/**
 * Задача 35 — WebSocket: real-time notifications.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>STOMP over WebSocket: /ws endpoint</li>
 *   <li>Subscribe: /topic/notifications (broadcast)</li>
 *   <li>Send: /app/notify → broadcast to all subscribers</li>
 *   <li>User-specific: /user/queue/personal → только конкретному user</li>
 *   <li>NotificationService: sendToAll(msg), sendToUser(userId, msg)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * @EnableWebSocketMessageBroker → SimpleBrokerMessageHandler (in-memory).
 * STOMP: текстовый протокол поверх WebSocket (SUBSCRIBE, SEND, MESSAGE frames).
 * SimpMessagingTemplate: программная отправка.
 *
 * Сложность: Medium
 */
public class WebSocketConfig {
    // TODO: @EnableWebSocketMessageBroker configuration
    // TODO: NotificationController с @MessageMapping
    // TODO: NotificationService с SimpMessagingTemplate
}

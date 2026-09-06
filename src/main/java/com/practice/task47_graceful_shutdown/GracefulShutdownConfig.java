package com.practice.task47_graceful_shutdown;

/**
 * Задача 47 — Graceful Shutdown: завершение in-flight запросов.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>server.shutdown=graceful в application.properties</li>
 *   <li>spring.lifecycle.timeout-per-shutdown-phase=30s</li>
 *   <li>SmartLifecycle: остановка background задач в правильном порядке</li>
 *   <li>@PreDestroy: cleanup ресурсов (connections, caches)</li>
 *   <li>Тест: отправить long request → SIGTERM → request завершается корректно</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Graceful: Tomcat перестаёт принимать новые connections, ждёт завершения текущих.
 * Timeout: если не завершились за timeout → force close.
 * K8s: preStop hook → SIGTERM → graceful period → SIGKILL.
 *
 * Сложность: Medium
 */
public class GracefulShutdownConfig {
    // TODO: application.properties с graceful shutdown
    // TODO: LongRunningService с SmartLifecycle
    // TODO: ShutdownEventListener для логирования
}

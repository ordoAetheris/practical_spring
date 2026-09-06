package com.practice.task67_starter_endpoint;
/**
 * Задача 69 — Starter with Custom Actuator Endpoint.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@Endpoint(id="audit") → /actuator/audit</li>
 *   <li>@ReadOperation: GET /actuator/audit → последние N audit events</li>
 *   <li>@WriteOperation: POST /actuator/audit → clear audit log</li>
 *   <li>@DeleteOperation: DELETE → disable auditing</li>
 *   <li>Автоматически регистрируется через starter</li>
 * </ol>
 *
 * Сложность: Medium
 */
public class AuditEndpoint {
    // TODO: @Endpoint(id = "audit") class
    // TODO: @ReadOperation, @WriteOperation, @DeleteOperation
    // TODO: Expose в application.yml: management.endpoints.web.exposure.include=audit
}

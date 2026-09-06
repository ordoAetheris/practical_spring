package com.practice.task29_role_hierarchy;

/**
 * Задача 29 — Role Hierarchy: ADMIN > MANAGER > USER.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>RoleHierarchy bean: "ADMIN > MANAGER > USER"</li>
 *   <li>ADMIN автоматически имеет все права MANAGER и USER</li>
 *   <li>@PreAuthorize("hasRole('MANAGER')") пропускает ADMIN без явного указания</li>
 *   <li>Custom Permission model: Resource + Action + Role mapping</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * RoleHierarchyImpl парсит строку и строит transitive closure.
 * DefaultWebSecurityExpressionHandler использует RoleHierarchy при hasRole() evaluation.
 *
 * Сложность: Easy
 */
public class RoleHierarchyConfig {
    // TODO: @Bean RoleHierarchy
    // TODO: SecurityConfig с roleHierarchy
    // TODO: DemoController с @PreAuthorize для тестирования
}

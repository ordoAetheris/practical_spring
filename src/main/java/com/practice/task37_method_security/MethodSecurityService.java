package com.practice.task37_method_security;

/**
 * Задача 23 — Method Security: @PreAuthorize + @PostAuthorize + кастомные выражения.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@PreAuthorize("hasRole('ADMIN')"): только admin</li>
 *   <li>@PreAuthorize("#userId == authentication.principal.id"): только свой профиль</li>
 *   <li>@PostAuthorize("returnObject.owner == authentication.name"): фильтр по результату</li>
 *   <li>Custom PermissionEvaluator: @PreAuthorize("hasPermission(#doc, 'write')")</li>
 *   <li>@EnableMethodSecurity(prePostEnabled = true)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Method security через AOP proxy. MethodSecurityInterceptor перехватывает вызов,
 * evaluates SpEL expression через SecurityExpressionHandler.
 * Self-invocation: this.method() → bypass security (как @Transactional).
 *
 * Сложность: Medium
 */
public class MethodSecurityService {
    // TODO: DocumentService с @PreAuthorize/@PostAuthorize
    // TODO: Custom PermissionEvaluator implementation
    // TODO: @EnableMethodSecurity configuration
}

package com.practice.task30_security_testing;

/**
 * Задача 30 — Security Testing: @WithMockUser + SecurityContext + MockMvc.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@WithMockUser(roles="ADMIN") — мок аутентификации в тестах</li>
 *   <li>@WithUserDetails("john") — загрузка реального UserDetails</li>
 *   <li>Custom @WithMockUser: @WithMockAdmin, @WithMockApiClient (meta-annotation)</li>
 *   <li>MockMvc: .with(csrf()), .with(jwt()), .with(httpBasic())</li>
 *   <li>SecurityMockMvcRequestPostProcessors для кастомных auth scenarios</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * @WithMockUser устанавливает SecurityContext через WithMockUserSecurityContextFactory.
 * MockMvc Security: SecurityMockMvcConfigurer добавляет CSRF token и auth.
 *
 * Сложность: Easy
 */
public class SecurityTestExamples {
    // TODO: SecuredController с endpoints разных уровней доступа
    // TODO: Тесты — основной контент задачи (необычно: тут тесты = решение)
}

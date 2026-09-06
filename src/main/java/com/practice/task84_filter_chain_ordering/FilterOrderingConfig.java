package com.practice.task84_filter_chain_ordering;

/**
 * Задача 58 — Filter Chain Ordering: 3+ фильтра с @Order.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>CorsFilter (@Order(1)) → AuthFilter (@Order(2)) → LoggingFilter (@Order(3))</li>
 *   <li>Каждый фильтр логирует вход/выход для отладки порядка</li>
 *   <li>FilterRegistrationBean для точного контроля URL patterns + order</li>
 *   <li>Security Filter Chain: где наш фильтр относительно Spring Security фильтров?</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Servlet container вызывает фильтры в порядке регистрации.
 * Spring Boot: @Order на @Component или FilterRegistrationBean.setOrder().
 * Spring Security: DelegatingFilterProxy → FilterChainProxy → chain of security filters.
 * Наш фильтр может быть ДО или ПОСЛЕ Security (зависит от order).
 *
 * Сложность: Medium
 */
public class FilterOrderingConfig {
    // TODO: 3 фильтра с @Order
    // TODO: FilterRegistrationBean конфигурация
    // TODO: Тест: проверить порядок через captured log
}

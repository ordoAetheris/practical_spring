package com.practice.task33_security_basics;

import org.springframework.context.annotation.Configuration;

/**
 * SECURITY — БАЗА (basic/form auth + in-memory пользователь)
 *
 * <p><b>Проблема / что даёт Spring Security:</b> не пишешь фильтры аутентификации руками —
 * объявляешь SecurityFilterChain (какие пути защищены, каким способом входят) и источник пользователей.
 * Это фундамент, поверх которого потом JWT/OAuth2 (следующие задачи блока).</p>
 *
 * <p><b>Реализуй:</b> бин SecurityFilterChain: публичный /public/**, остальное — authenticated;
 * httpBasic ИЛИ formLogin; InMemoryUserDetailsManager с 1-2 юзерами (user/admin) и ролями;
 * PasswordEncoder (BCrypt). (Типы Spring Security добавишь при реализации — здесь каркас на @Configuration.)</p>
 *
 * <p><b>Как протестить:</b> spring-security-test: mockMvc с @WithMockUser / httpBasic("user","pass") —
 * защищённый путь без аутентификации → 401/403, с валидным юзером → 200; публичный → 200 без входа.</p>
 */
@Configuration
public class SecurityBasicsConfig {

    // TODO: @Bean SecurityFilterChain (защита путей + httpBasic/formLogin)
    // TODO: @Bean UserDetailsService (InMemoryUserDetailsManager: user/admin + роли)
    // TODO: @Bean PasswordEncoder (BCryptPasswordEncoder)

    public void configure() {
        throw new UnsupportedOperationException("TODO: SecurityFilterChain + in-memory users + encoder");
    }
}

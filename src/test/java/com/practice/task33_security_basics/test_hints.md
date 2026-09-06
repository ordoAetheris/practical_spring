# task33 security_basics
- spring-security-test: @WithMockUser или .with(httpBasic(...)).
- Защищённый путь без auth → 401 (basic) / redirect на login (form); с валидным → 200; публичный → 200.
- Роли: admin-путь под user → 403. PasswordEncoder — BCrypt (не хранить пароли в открытую).

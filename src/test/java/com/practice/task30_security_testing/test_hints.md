# Подсказки: Security Testing
## Обязательно
- @WithMockUser(roles="ADMIN"): admin endpoint → 200.
- @WithMockUser(roles="USER"): admin endpoint → 403.
- Без auth: protected endpoint → 401.
- .with(csrf()): POST с CSRF → 200.
## Продвинутые
- Custom @WithMockAdmin meta-annotation.
- @WithUserDetails с реальным UserDetailsService.

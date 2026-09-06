# Подсказки: Method Security
## Обязательно
- hasRole('ADMIN'): admin → ok, user → AccessDeniedException.
- #userId == principal.id: свой профиль → ok, чужой → denied.
- @PostAuthorize: возвращает объект если owner match, иначе denied.
- hasPermission: custom evaluator вызывается.
## Продвинутые
- Self-invocation: this.securedMethod() → security bypass (AOP proxy!).

# Подсказки: Request Validation
## Обязательно
- @NotBlank на пустом → 400 + field error. Валидный → 200.
- @UniqueEmail: дубликат → 400. Уникальный → ok.
- @PasswordsMatch: match → ok, mismatch → class-level error.
- Validation groups: OnCreate requires @NotNull id=null, OnUpdate requires @NotNull id.

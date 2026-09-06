# Подсказки: Custom @Conditional
## Обязательно
- @ConditionalOnEnv("prod"): APP_ENV=prod → bean exists. APP_ENV=dev → NoSuchBean.
- @ConditionalOnFeatureFlag: property true → bean exists. Missing/false → not exists.
## Как тестировать
- ApplicationContextRunner: .withPropertyValues("features.x=true").run(ctx -> assertThat(ctx).hasSingleBean(...))

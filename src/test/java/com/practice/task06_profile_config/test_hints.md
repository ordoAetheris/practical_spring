# Подсказки: Profile-based Configuration

## Обязательно протестировать
- @ActiveProfiles("dev") → H2 DataSource бин
- @ActiveProfiles("prod") → PostgreSQL DataSource бин (или mock)
- DataSourceInfo возвращает правильный профиль и URL
- Бин другого профиля НЕ создаётся (NoSuchBeanDefinitionException)

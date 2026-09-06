# Подсказки: Batch Insert
## Обязательно
- 10K записей сохранены корректно.
- Benchmark: JdbcTemplate быстрее saveAll (на порядок).
## Продвинутые
- IDENTITY vs SEQUENCE: с IDENTITY batch невозможен → saveAll делает N INSERT.
- batch_size=50: hibernate группирует INSERT в пакеты.
- Проверить через hibernate.show_sql / p6spy что batch реально работает.

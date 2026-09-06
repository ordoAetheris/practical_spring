# Подсказки: AOP Logging + Metrics

## Обязательно протестировать
- @Loggable метод: вход/выход залогирован (проверить через captured log или mock logger)
- @Timed метод: stats содержат count=1, totalTime > 0 после вызова
- Exception: лог содержит exception message, exception пробрасывается дальше
- Метод БЕЗ @Loggable: НЕ залогирован

## Продвинутые кейсы
- Self-invocation: this.method() с @Loggable внутри @Service — advice НЕ сработает (proxy bypass). Это классическая ловушка Spring AOP.
- @SpringBootTest + @EnableAspectJAutoProxy для интеграции
- TimingAspect stats после N вызовов: avgTime = totalTime / count

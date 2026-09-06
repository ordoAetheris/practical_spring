# Подсказки: Custom BeanPostProcessor

## Обязательно протестировать
- before → after: время записано для бина
- thresholdMs: медленный бин залогирован, быстрый — нет
- getStats(): totalBeans, slowestBeanName корректны
- getInitTimeMs(): -1 для несуществующего бина

## Продвинутые кейсы
- Интеграционный тест: поднять ApplicationContext с BPP, проверить что stats непустые
- BPP не ломает бины: bean возвращается тот же (не null, не подменённый)
- Thread-safety: concurrent getStats() во время инициализации

## Как тестировать BPP
- Можно тестировать unit: вызвать postProcessBefore/After вручную с mock бином
- Можно интеграционно: @SpringBootTest, inject BPP, проверить stats

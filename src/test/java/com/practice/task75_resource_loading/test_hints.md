# Подсказки: Resource Loading

## Обязательно протестировать
- classpath resource: loadAsString возвращает содержимое
- Несуществующий resource: exists → false, load → IOException
- Pattern matching: findAll("classpath:test-data/*.txt") → список файлов
- @TempDir для filesystem ресурсов в тестах

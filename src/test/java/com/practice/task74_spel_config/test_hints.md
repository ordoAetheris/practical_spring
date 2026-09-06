# Подсказки: SpEL Configuration

## Обязательно протестировать
- @Value с SpEL: значение инжектировано корректно
- evaluate(): "1 + 2" → 3, "T(Math).max(1, 5)" → 5
- Ссылка на бин: "#{@myBean.name}" → значение из бина
- Невалидное выражение → SpelParseException

# Как получить ревью Spring-кода

## Шаг 1. Тесты проходят

```bash
TASK=task01_bean_post_processor
mvn test -Dtest="com.practice.$TASK.*"
```

## Шаг 2. Собери код

```bash
TASK=task01_bean_post_processor

echo "=== ЗАДАНИЕ ==="
cat src/main/java/com/practice/$TASK/*.java

echo "=== РЕШЕНИЕ (если дополнительные файлы) ==="
find src/main/java/com/practice/$TASK/ -name "*.java" -exec echo "--- {} ---" \; -exec cat {} \;

echo "=== ТЕСТЫ ==="
cat src/test/java/com/practice/$TASK/*Test.java

echo "=== КОНФИГУРАЦИЯ ==="
cat src/main/resources/application*.yml 2>/dev/null
cat src/test/resources/application-test*.yml 2>/dev/null

echo "=== ЗАМЕТКИ ==="
grep -rn "// NOTE:" src/main/java/com/practice/$TASK/
```

## Шаг 3. Промпт из REVIEW_PROMPT.md + код → нейросеть

**Совет:** перед ревью пройди `CHECKLIST.md`.

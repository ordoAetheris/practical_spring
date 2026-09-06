# Подсказки: GraalVM Native
## Обязательно
- mvn -Pnative native:compile → binary exists, starts in <100ms.
- RuntimeHints: reflection-heavy code registered.
- Native test: mvn -PnativeTest test → green.
## Gotcha
- Missing reflection hints → runtime exception (ClassNotFoundException / NoSuchMethodException).

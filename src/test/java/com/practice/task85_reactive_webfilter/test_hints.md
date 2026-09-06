# Подсказки: Reactive WebFilter
## Обязательно
- Request ID в Reactor Context (НЕ MDC).
- Downstream handler может прочитать requestId через deferContextual.
## Gotcha
- MDC + WebFlux → BROKEN (разные threads). Context → правильно.

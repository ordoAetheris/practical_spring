# Подсказки: Circuit Breaker
## Обязательно
- N failures → state OPEN → fallback вызван. Wait → HALF_OPEN → success → CLOSED.
- Metrics: failureRate, numberOfCalls доступны через registry.
## Как тестировать
- Mock external service: first N calls → exception, then → success. Verify state transitions.

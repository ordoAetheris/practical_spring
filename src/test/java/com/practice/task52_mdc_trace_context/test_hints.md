# Подсказки: MDC + Trace Context
## Обязательно
- Log output contains traceId. Same traceId across all logs of one request.
- @Async: MDC propagated via TaskDecorator (not empty in async thread).

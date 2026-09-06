# Подсказки: Request Logging + MDC
## Обязательно
- Каждый request → log с method, URI, status, duration.
- MDC: requestId в log pattern (проверить через captured log).
- Body logging: request body в log (до 1KB).
- Exclude: /actuator → не логируется.
## Продвинутые
- MDC cleanup: после request MDC.get("requestId") == null (ThreadLocal leak prevention).

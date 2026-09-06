# Подсказки: Request ID Filter
## Обязательно
- Response содержит X-Request-Id header.
- Если client прислал X-Request-Id → тот же ID в response (correlation).
- MDC: requestId в log output (captured log assertion).
## Продвинутые
- MDC cleanup: после request MDC.get("requestId") == null.

# Подсказки: @Retry через BPP (КЛЮЧЕВАЯ ЗАДАЧА)
## Обязательно
- @Retry(times=3): 1st fail, 2nd fail, 3rd success → result returned. Method called 3 times.
- All retries fail → last exception thrown.
- Method WITHOUT @Retry → no proxy, no retry.
- Delay: verify через timing (3 retries × 1000ms delay ≈ 2000ms total).
## Продвинутые
- Self-invocation: this.retryMethod() внутри того же бина → retry НЕ работает (proxy bypass!).
- Это РОВНО та же проблема что у @Transactional/@Cacheable/@Async.

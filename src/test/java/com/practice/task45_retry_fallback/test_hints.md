# Подсказки: Retry + Fallback
## Обязательно
- 1st call fails, 2nd fails, 3rd succeeds → result from 3rd. Retry count = 3.
- All retries exhausted → @Recover fallback вызван.
- Non-retryable exception → no retry, immediate propagation.
## Стресс
- Backoff: verify delay between retries (exponential).

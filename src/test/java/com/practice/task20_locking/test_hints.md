# Подсказки: Pessimistic vs Optimistic Locking
## Обязательно
- Optimistic: concurrent update → OptimisticLockException у одного из двух.
- Pessimistic: concurrent update → второй ЖДЁТ (не exception).
- transfer: баланс сходится после 10 concurrent transfers.
## Стресс
- **Lost update** — без locking: два потока читают balance=100, оба пишут balance=90 (вместо 80). С locking → корректно.
- **Deadlock** — pessimistic: transfer(A→B) + transfer(B→A). Lock ordering решает.

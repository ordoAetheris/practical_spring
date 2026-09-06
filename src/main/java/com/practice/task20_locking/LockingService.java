package com.practice.task20_locking;

/**
 * Задача 17 — Pessimistic vs Optimistic Locking.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Entity: Account(id, balance, version)</li>
 *   <li>Optimistic: @Version → OptimisticLockException при concurrent update</li>
 *   <li>Pessimistic: @Lock(PESSIMISTIC_WRITE) → SELECT ... FOR UPDATE</li>
 *   <li>transfer(fromId, toId, amount): корректный перевод при concurrent доступе</li>
 *   <li>Тест: 10 потоков переводят деньги одновременно → баланс сходится</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Optimistic: version column. UPDATE SET balance=?, version=version+1 WHERE id=? AND version=?.
 * Если version не совпал → OptimisticLockException → retry на уровне приложения.
 * Pessimistic: SELECT FOR UPDATE → row-level lock в БД. Другие транзакции ждут.
 *
 * Сложность: Hard
 */
public class LockingService {
    // TODO: Account entity с @Version
    // TODO: AccountRepository с @Lock(PESSIMISTIC_WRITE) findById
    // TODO: transferOptimistic(fromId, toId, amount) — с retry при OptimisticLockException
    // TODO: transferPessimistic(fromId, toId, amount) — с SELECT FOR UPDATE
}

package com.practice.task06_exception_handler;

/**
 * Задача 31 — Global Exception Handler: @ControllerAdvice + Problem Details (RFC 7807).
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@ControllerAdvice: централизованная обработка исключений</li>
 *   <li>RFC 7807 Problem Details: type, title, status, detail, instance</li>
 *   <li>Маппинг: NotFoundException → 404, ValidationException → 400, BusinessException → 409</li>
 *   <li>Обработка MethodArgumentNotValidException → список field errors</li>
 *   <li>Логирование: 4xx → WARN, 5xx → ERROR</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Spring 6+ нативная поддержка RFC 7807 через ProblemDetail class.
 * @ControllerAdvice обрабатывается через ExceptionHandlerExceptionResolver.
 * Порядок: specific exception → parent exception → default handler.
 *
 * Сложность: Medium
 */
public class GlobalExceptionHandler {
    // TODO: @ControllerAdvice class
    // TODO: @ExceptionHandler(NotFoundException.class) → ProblemDetail 404
    // TODO: @ExceptionHandler(MethodArgumentNotValidException.class) → 400 + field errors
    // TODO: Custom exception classes в этом пакете
}

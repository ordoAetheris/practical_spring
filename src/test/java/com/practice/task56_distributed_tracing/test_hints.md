# Подсказки: Distributed Tracing
## Обязательно
- Service A → Service B: один traceId в обоих.
- Custom span: появляется в trace.
- MDC: traceId в log output.
## Как тестировать
- @SpringBootTest + MockRestServiceServer. Verify propagation headers.

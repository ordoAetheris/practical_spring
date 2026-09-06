# Подсказки: HandlerInterceptor
## Обязательно
- AuthInterceptor: valid key → 200. Invalid → 401, handler НЕ вызван.
- MetricsInterceptor: duration recorded after request.
- Порядок: Auth preHandle → Metrics preHandle → handler → Metrics after → Auth after.
## Продвинутые
- Interceptor vs Filter: interceptor знает handler method (можно читать аннотации).

# Подсказки: Complete http-metrics-starter (CAPSTONE)
## Обязательно
- Add starter dependency → all @RestController methods timed automatically.
- /actuator/prometheus: http_server_duration{method, uri, status} present.
- /actuator/http-metrics: top-10 slowest endpoints.
- http-metrics.enabled=false → no instrumentation.
- User's own @Bean → overrides auto-config.

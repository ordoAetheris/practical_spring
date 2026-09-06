# Подсказки: Service Discovery
## Обязательно
- DiscoveryClient.getInstances("my-service") → non-empty.
- @LoadBalanced: request к http://my-service/api → resolved to real host.

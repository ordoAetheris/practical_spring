# Подсказки: gRPC Streaming
## Обязательно
- Server stream: subscribe → receive N events. Client cancel → stream stops.
- Client stream: send N chunks → receive aggregated result.
- Bidi: send message → receive response, interleaved.

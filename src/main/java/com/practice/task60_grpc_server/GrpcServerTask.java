package com.practice.task60_grpc_server;
/**
 * Задача 71 — gRPC Server: определение proto, codegen, реализация.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>user_service.proto: GetUser, CreateUser, ListUsers RPCs</li>
 *   <li>protobuf-maven-plugin: codegen из .proto → Java classes</li>
 *   <li>UserServiceImpl extends UserServiceGrpc.UserServiceImplBase</li>
 *   <li>ServerInterceptor: логирование всех RPC calls</li>
 *   <li>Error handling: StatusException с metadata</li>
 * </ol>
 *
 * Сложность: Hard
 */
public class GrpcServerTask {
    // TODO: src/main/proto/user_service.proto
    // TODO: UserServiceImpl
    // TODO: LoggingServerInterceptor
}

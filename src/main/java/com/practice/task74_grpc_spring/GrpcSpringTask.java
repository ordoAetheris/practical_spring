package com.practice.task74_grpc_spring;
/**
 * Задача 74 — gRPC + Spring Boot: grpc-spring-boot-starter.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>net.devh:grpc-spring-boot-starter</li>
 *   <li>@GrpcService: auto-registered gRPC service</li>
 *   <li>@GrpcClient("user-service"): auto-configured stub</li>
 *   <li>Health check: grpc.health.v1.Health</li>
 *   <li>Integration test: @SpringBootTest + in-process gRPC server</li>
 * </ol>
 *
 * Сложность: Medium
 */
public class GrpcSpringTask {
    // TODO: @GrpcService UserServiceImpl
    // TODO: @GrpcClient consumer
    // TODO: application.yml: grpc.server.port, grpc.client.*.address
}

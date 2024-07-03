package com.prodonik.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.grpc.Server;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SpringBootApplication
@ComponentScan(basePackages = "com.prodonik")
@EnableJpaRepositories(basePackages = "com.prodonik.users.repositories")
public class GRPCServerApplication {

    private final GrpcServerConfig service;
    private Server server;

    public GRPCServerApplication(GrpcServerConfig userService) {
        this.service = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(GRPCServerApplication.class, args);
    }

    @PostConstruct
    public void startServer() {
        try {
            server = service.grpcServer();
            server.start();
            System.out.printf("Server has started on port %d%n", server.getPort());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void stopServer() {
        if (server != null) {
            server.shutdown();
        }
    }
}

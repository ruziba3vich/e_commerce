package com.prodonik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.prodonik.users.services.UserService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SpringBootApplication
@ComponentScan(basePackages = "com.prodonik")
@EnableJpaRepositories(basePackages = "com.prodonik.users.repositories")
public class GRPCServerApplication {

    private final UserService userService;
    private Server server;

    public GRPCServerApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(GRPCServerApplication.class, args);
    }

    @PostConstruct
    public void startServer() {
        try {
            server = ServerBuilder.forPort(7777).addService(userService).build();
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

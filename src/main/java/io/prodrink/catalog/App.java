package io.prodrink.catalog;

import io.grpc.Server;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        Server server = context.getBean(Server.class);
        server.start();
        log.info("Server started, listening on {}", server.getPort());
        server.awaitTermination();
    }
}

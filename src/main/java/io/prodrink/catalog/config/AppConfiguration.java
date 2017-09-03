package io.prodrink.catalog.config;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.prodrink.catalog.service.CatalogServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@Configuration
public class AppConfiguration {
    @Value("${server.grpc.port}")
    private Integer port;

    @Bean(destroyMethod = "shutdown")
    public Server server(CatalogServiceImpl catalogService) {
        return ServerBuilder.forPort(port)
                .addService(catalogService)
                .build();
    }

    @Bean
    public ScheduledExecutorService scheduledExecutorService() {
        return Executors.newScheduledThreadPool(1);
    }
}

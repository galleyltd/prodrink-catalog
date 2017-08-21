package io.prodrink.catalog.config;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.prodrink.catalog.service.AdminCatalogServiceImpl;
import io.prodrink.catalog.service.CatalogServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Value("${server.grpc.port}")
    private Integer port;

    @Bean(destroyMethod = "shutdown")
    public Server server(AdminCatalogServiceImpl adminCatalogService, CatalogServiceImpl catalogService) {
        return ServerBuilder.forPort(port)
                .addService(adminCatalogService)
                .addService(catalogService)
                .build();
    }
}

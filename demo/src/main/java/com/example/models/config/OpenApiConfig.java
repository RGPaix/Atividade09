package com.example.models.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi publicApiOpenApi() {
        return GroupedOpenApi.builder()
                .group("public-v1")
                .packagesToScan("com.example.models")  // Pacote onde estão os controladores
                .build();
    }
}

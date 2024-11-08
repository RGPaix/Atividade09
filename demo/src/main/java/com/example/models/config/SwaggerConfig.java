package com.example.models.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApiSwagger() {
        return GroupedOpenApi.builder()
                .group("public-v2")
                .packagesToScan("com.example.models")  // Pacote onde estão seus controladores
                .build();
    }
}
package com.study.course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info().title("Course Management API").version("0.0.1")
                .description(
                        "API desenvolvida para estudo do spring boot 4 com java pelo Prof. Nelio Alves")
                .contact(new Contact().name("Edgar Lima").email("blackstv11@gmail.com")));
    }

}

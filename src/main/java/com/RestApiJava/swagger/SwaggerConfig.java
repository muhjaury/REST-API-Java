package com.RestApiJava.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }


    private ApiInfo apiInfo(){
        ApiInfo apiInfo = new ApiInfo(
                "Perpustakaan API",
                "Ini adalah dokumentasi API dengan Springboot untuk kasus perpustakaan",
                "v1.0",
                "Term of Service",
                new Contact("Muhammad Jaury", "github.com/muhjaury","muhjaury@gmail.com"),
                "Apache Lisense",
                "www.apache.com",
                Collections.emptyList()
        );
        return apiInfo;
    }
}

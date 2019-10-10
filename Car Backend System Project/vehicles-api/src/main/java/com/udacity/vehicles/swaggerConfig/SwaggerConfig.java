package com.udacity.vehicles.swaggerConfig;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@RestController
@ApiResponses(value = {
        @ApiResponse(code = 400, message = "bad request"),
        /*@ApiResponse(code = 401, message = "access request not authorized"),*/
        @ApiResponse(code = 404, message = "Car not found"),
        @ApiResponse(code = 500, message = "server down")
})
@Configuration
@EnableSwagger2

public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Car Backend System API",
                "POST, PUT, DELETE, and GET list of Cars, or a Car by its ID",
                "1.0",
                "http://www.udacity.com/tos",
                new Contact("Udacity Student", "www.udacity.com", "justin@milushev.com"),
                "License of API",
                "http://www.udacity.com/license",
                Collections.emptyList()
        );
    }
}


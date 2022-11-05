package com.felipeguimaraes.contracts.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.ArrayList;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.felipeguimaraes.contracts.api"))
                .paths(regex("/contracts.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo(){

        var apiInfo = new ApiInfo(
                "COMMERCIALIZATION CONTRACTS",
                "API Rest de dados de custeio de município e produto",
                "1.0",
                "Terms of service",
                new Contact("Felipe da Silva Guimarães",
                        "https://github.ibm.com/felipe-guimaraes/Project",
                        "felipe.guimaraes@ibm.com"),
                "Apache License Version 2.0",
                "http://www.apache.org/license.html",
                new ArrayList<VendorExtension>()
        );
        return apiInfo;
    }

}

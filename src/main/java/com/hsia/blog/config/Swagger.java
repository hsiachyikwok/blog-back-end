package com.hsia.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger {

    private static final String title = "online doc";
    private static final String description = "blog system";
    private static final String termsOfServiceUrl = "http://www.xiaqiguo.com";
    private static final String name = "hsiachyikwok";
    private static final String url = "http://www.xiaqiguo.com";
    private static final String email = "hsiachyikwok@gmail.com";
    private static final String version = "1.0";

    @Bean
    public Contact createContact(){
        return new Contact(name,url,email);
    }

    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .termsOfServiceUrl(termsOfServiceUrl)
                .contact(createContact())
                .license("MIT")
                .licenseUrl(url)
                .version(version)
                .build();
    }

    @Bean
    public Docket controllerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("Login")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hsia.blog.controller"))
                .paths(PathSelectors.any())
                .build();
    }


}

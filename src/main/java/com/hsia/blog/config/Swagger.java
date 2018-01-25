package com.hsia.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.not;
import static com.sun.tools.doclint.Entity.or;
import static springfox.documentation.builders.PathSelectors.regex;
import static springfox.documentation.builders.RequestHandlerSelectors.withClassAnnotation;

@Configuration
@EnableSwagger2
public class Swagger {

    private static final String title = "swagger在线文档";
    private static final String description = "blog system";
    private static final String termsOfServiceUrl = "www.xiaqiguo.com";
    private static final String contact = "xiaqiguo";
    private static final String version = "1.0";

    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .version("1.0")
                .build();
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hsia.blog"))
                .paths(PathSelectors.any())
                .build();
    }


}

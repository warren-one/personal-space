package com.warren.space.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author hzh
 * @Description 接口文档配置
 * @ClassName SwaggerConfig
 * @Date 2018/12/14
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){

        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("个人空间API文档")
                .description("个人空间，API Description。")
                .version("1.0")
                .build();

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.warren.space.controller")) //以扫描包的方式
                .paths(PathSelectors.any())
                .build();

        return docket;

    }

}

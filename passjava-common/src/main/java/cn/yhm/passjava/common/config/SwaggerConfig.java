package cn.yhm.passjava.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger配置类
 * <p>
 * swagger接口访问地址：http://localhost:port/swagger-ui/index.html
 * swagger JOSN访问地址：http://localhost:port/v3/api-docs
 *
 * @author victor2015yhm@gmail.com
 * @date 2022-02-13 13:39:17
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("WebApi")
                .apiInfo(this.apiInfo())
                .select()
                //.apis(RequestHandlerSelectors.basePackage("cn.e8net.swagger.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("PassJava项目Swagger生成API文档")
                .description("本文档描述了PassJava项目接口定义")
                .contact(new Contact("尹华明", "http://www.passjava.e8.cn", "victor2015yhm@gmai;.com"))
                .version("1.0")
                .build();
    }
}

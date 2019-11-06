package com.nissandigital.salesforcepoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket myswagger() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.nissandigital.salesforcepoc.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(myApiInfo());
		
		
		
	}
	
	public ApiInfo myApiInfo()
	{
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title("Salesforce POC")
                .description(" REST API for Salesforce POC")
                .contact(new springfox.documentation.service.Contact("Nissan Salesforce POC", "www.nissan.in", "mohdizhar.rahmani@nissanmotor.com"))
               .version("Apache License Version 2.0")
                .termsOfServiceUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .build();
		return apiInfo;
	}

}
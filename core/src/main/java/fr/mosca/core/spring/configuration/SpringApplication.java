package fr.mosca.core.spring.configuration;

import fr.mosca.service.annotations.DomainService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = {"fr.mosca.controller.controller", "fr.mosca.service"},
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {DomainService.class}))
public class SpringApplication {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
    }
}

package demos.core.spring;

import demos.service.annotations.DomainService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@ComponentScan(basePackages = {"demos.controller", "demos.service"},
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {DomainService.class}))
public class SpringBootApplicationLauncher {

    public static void main(String[] args) {
        run(SpringBootApplicationLauncher.class, args);
    }
}

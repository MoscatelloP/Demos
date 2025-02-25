package demos.core.spring;

import demos.repository.annotations.RepositoryService;
import demos.service.annotations.DomainService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@ComponentScan(basePackages = {"demos.controller", "demos.service", "demos.repository"},
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {DomainService.class, RepositoryService.class}))
public class SpringBootApplicationLauncher {

    public static void main(String[] args) {
        run(SpringBootApplicationLauncher.class, args);
    }
}

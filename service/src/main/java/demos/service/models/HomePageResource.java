package demos.service.models;

import demos.service.annotations.DomainService;
import demos.service.api.HomePageResources;

@DomainService
public class HomePageResource implements HomePageResources {

    @Override
    public String hello() {
        return "hello !";
    }
}

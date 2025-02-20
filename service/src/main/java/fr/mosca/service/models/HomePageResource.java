package fr.mosca.service.models;

import fr.mosca.service.annotations.DomainService;
import fr.mosca.service.controller.HomePageResources;

@DomainService
public class HomePageResource implements HomePageResources {

    @Override
    public String hello() {
        return "hello !";
    }
}

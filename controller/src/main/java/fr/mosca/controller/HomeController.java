package fr.mosca.controller;

import fr.mosca.service.controller.HomePageResources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final HomePageResources homePageResources;

    public HomeController(HomePageResources homePageResources){
        this.homePageResources = homePageResources;
    }

    @GetMapping
    public ResponseEntity<String> hello() throws URISyntaxException {
        String hello = this.homePageResources.hello();
        return ResponseEntity.created(new URI("")).body(hello);
    }
}

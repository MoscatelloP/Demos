package demos.controller;

import demos.service.api.IFleetService;
import demos.service.models.Fleet;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Controller responsible for holding the endpoints associated with the managment of a fleet such as its creation
 * assigning orders, updating its equipment and so on
 */
@RestController
@RequestMapping("fleet")
public class FleetController {

    private final IFleetService IFleetService;

    public FleetController(IFleetService IFleetService) {
        this.IFleetService = IFleetService;
    }

    /**
     * @return all the existing fleets
     */
    @GetMapping("/")
    public ResponseEntity<List<Fleet>> getAllFleet() throws URISyntaxException {
        List<Fleet> fleets = this.IFleetService.getAllFleets();
        return ResponseEntity.created(new URI("")).contentType(MediaType.APPLICATION_JSON).body(fleets);
    }
}

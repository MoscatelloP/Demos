package demos.controller;

import demos.service.api.IShipService;
import demos.service.models.Ship;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Controller responsible for holding the endpoints associated with the managment of a ship such as its creation
 * assigning orders, updating its equipment and so on
 */
@RestController
@RequestMapping("ship")
public class ShipController {

    private final IShipService shipService;

    public ShipController(IShipService shipService) {
        this.shipService = shipService;
    }

    /**
     * @return all the existing fleets
     */
    @GetMapping("/")
    public ResponseEntity<List<Ship>> getAllShips() throws URISyntaxException {
        List<Ship> ships = this.shipService.getAllShips();
        return ResponseEntity.created(new URI("")).contentType(MediaType.APPLICATION_JSON).body(ships);
    }
}

package demos.service.api;

import demos.service.models.Ship;

import java.util.List;

public interface IShipService {

    List<Ship> getAllShips();
    Ship getShipById(String id);
}

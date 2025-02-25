package demos.service.spi;

import demos.service.models.Ship;

import java.util.List;

public interface IShipRespository {

    List<Ship> getAllShips();
    Ship getShipById(String id);
}

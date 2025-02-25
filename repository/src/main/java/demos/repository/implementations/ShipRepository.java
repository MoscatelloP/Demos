package demos.repository.implementations;

import demos.repository.annotations.RepositoryService;
import demos.service.models.Ship;
import demos.service.spi.IShipRespository;

import java.util.List;

@RepositoryService
public class ShipRepository implements IShipRespository {

    //placeholder
    private final List<Ship> shipList = List.of(new Ship("1", "ship 1"), new Ship("2", "ship 2"));

    @Override
    public List<Ship> getAllShips() {
        return this.shipList;
    }

    @Override
    public Ship getShipById(String id) {
        return this.shipList.stream().filter(ship -> ship.id().equals(id)).findAny().orElse(null);
    }
}

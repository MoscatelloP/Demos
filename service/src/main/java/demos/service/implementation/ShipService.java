package demos.service.implementation;

import demos.service.annotations.DomainService;
import demos.service.api.IShipService;
import demos.service.models.Ship;
import demos.service.spi.IShipRespository;

import java.util.List;

@DomainService
public class ShipService implements IShipService {

    private final IShipRespository shipRepository;

    public ShipService(IShipRespository shipRepository) {
        this.shipRepository = shipRepository;
    }

    @Override
    public List<Ship> getAllShips() {
        return this.shipRepository.getAllShips();
    }

    @Override
    public Ship getShipById(String id) {
        return this.shipRepository.getShipById(id);
    }
}

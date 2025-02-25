package demos.repository.implementations;

import demos.repository.annotations.RepositoryService;
import demos.service.models.Fleet;
import demos.service.models.Ship;
import demos.service.spi.IFleetRepository;

import java.util.List;

@RepositoryService
public class FleetRepository implements IFleetRepository {

    //placeholder
    private final List<Fleet> fleetList = List.of(new Fleet("1", List.of(new Ship("1", "ship 1"), new Ship("2", "ship 2"))));

    @Override
    public List<Fleet> getAllFleets() {
        return this.fleetList;
    }
}

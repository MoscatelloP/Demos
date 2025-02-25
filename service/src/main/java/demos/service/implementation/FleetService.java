package demos.service.implementation;

import demos.service.annotations.DomainService;
import demos.service.api.IFleetService;
import demos.service.models.Fleet;
import demos.service.spi.IFleetRepository;

import java.util.List;

@DomainService
public class FleetService implements IFleetService {

    private final IFleetRepository fleetRepository;

    public FleetService(IFleetRepository fleetRepository) {
        this.fleetRepository = fleetRepository;
    }

    @Override
    public List<Fleet> getAllFleets() {
        //PlaceHolder
        return this.fleetRepository.getAllFleets();
    }
}

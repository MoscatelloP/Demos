package demos.service.spi;

import demos.service.models.Fleet;

import java.util.List;

public interface IFleetRepository {

    List<Fleet> getAllFleets();
}

package warehousemanager.persistence;

import org.springframework.data.repository.CrudRepository;
import warehousemanager.domain.Warehouse;

public interface WarehouseRepository extends CrudRepository<Warehouse, Long> {

}

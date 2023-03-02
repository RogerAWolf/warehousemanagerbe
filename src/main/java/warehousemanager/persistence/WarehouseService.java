package warehousemanager.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import warehousemanager.domain.Warehouse;

@Service
public class WarehouseService {

    @Autowired
    WarehouseRepository wr;

    public Iterable<Warehouse> returnAllWarehouses(){
        return wr.findAll();
    }

    public void saveWarehouse(Warehouse warehouse){
        wr.save(warehouse);
    }

    public void deleteWarehouse(long id){
        wr.deleteById(id);
    }
}

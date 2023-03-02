package warehousemanager.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warehousemanager.domain.Warehouse;
import warehousemanager.persistence.WarehouseService;

@RestController
public class WarehouseEndpoint {

    @Autowired
    WarehouseService ws;

    @PostMapping("/warehouse/addWarehouse")
    public void addWarehouse(@RequestBody Warehouse warehouse){
        System.out.println("create");
        ws.saveWarehouse(warehouse);
    }
}

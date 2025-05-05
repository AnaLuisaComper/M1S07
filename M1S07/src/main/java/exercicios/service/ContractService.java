package exercicios.service;

import exercicios.model.ContractModel;
import exercicios.model.RouteModel;
import exercicios.model.CollectorModel;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;

@Service
public class ContractService {

    @Autowired
    private RouteService routeService;

    @Autowired
    private CollectorService collectorService;

    public ContractModel create(ContractModel contractModel) {
        CollectorModel collector = collectorService.findById(contractModel.getCollector().getId());
        if (collector == null) { return null; }
        else { contractModel.setCollector(collector);}

        List<RouteModel> routeModel = new ArrayList<>();
        for (RouteModel route : contractModel.getRoutes()) {
            RouteModel foundRoute = routeService.findById(route.getId());
            if (foundRoute == null) { return null; }
                routeModel.add(foundRoute);}
        contractModel.setRoutes(routeModel);

        return ContractModel.addContract(contractModel);
    }

    public List<ContractModel> findAll() {
        return ContractModel.getContracts();
    }

}

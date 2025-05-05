package exercicios.service;

import exercicios.model.RouteModel;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RouteService {

    public RouteModel create(RouteModel routeModel){
        return RouteModel.addRoute(routeModel);
    }

    public List<RouteModel> findAll(){
        return RouteModel.getRoutes();
    }

    public RouteModel findById(Long id){
      for (RouteModel route : RouteModel.getRoutes()) {
            if (route.getId().equals(id)) {
                return route;
            }
        }
        return null;
    }





}

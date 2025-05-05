package exercicios.controller;

import exercicios.model.RouteModel;
import exercicios.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("routes")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @GetMapping
    public List<RouteModel> get() {
        return routeService.findAll();
    }

    @PostMapping
    public RouteModel post(@RequestBody RouteModel route) {
        return routeService.create(route);
    }


}

package exercicios.controller;

import exercicios.model.CollectorModel;
import exercicios.service.CollectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("collectors")
public class CollectorController {

    @Autowired
    private CollectorService collectorService;

    @GetMapping
    public List<CollectorModel> get() {
        return collectorService.findAll();
    }

    @PostMapping
    public CollectorModel post(@RequestBody CollectorModel collector) {
        return collectorService.create(collector);
    }





}

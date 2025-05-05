package exercicios.controller;

import exercicios.model.ContractModel;
import exercicios.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("contracts")
public class ContractController {

    @Autowired
    private ContractService contractService;

    @GetMapping
    public List<ContractModel> get() {
        return contractService.findAll();
    }

    @PostMapping
    public ContractModel post(@RequestBody ContractModel contract) {
        return contractService.create(contract);
    }
}

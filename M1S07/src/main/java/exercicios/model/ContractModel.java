package exercicios.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ContractModel {

    @Getter
    private static final List<ContractModel> contracts = new ArrayList<>();
    private static Long sequence = 1L;

    @Setter(AccessLevel.NONE)
    private CollectorModel collector;
    private List<RouteModel> routes = new ArrayList<>();
    private Long id;

    public ContractModel () {
        this.id = sequence++;
    }

    public static ContractModel addContract (ContractModel contractModel) {
        contracts.add(contractModel);
        return contractModel;
    }


    public void setCollector(CollectorModel collector) {

    }
}

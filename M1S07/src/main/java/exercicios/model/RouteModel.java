package exercicios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class RouteModel {

    @Getter
    private static final List<RouteModel> routes = new ArrayList<>();
    private static Long sequence = 1L;

    @Setter(AccessLevel.NONE)
    private String description;
    private String coverageArea;
    private BigDecimal efficiencyPercentage;

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    public RouteModel () {
        this.id = sequence++;
    }

    public static RouteModel addRoute (RouteModel routeModel) {
        routes.add(routeModel);
        return routeModel;
    }



}

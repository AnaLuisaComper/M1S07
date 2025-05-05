package exercicios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CollectorModel {

    @Getter

    private static final List<CollectorModel> collectors = new ArrayList<>();
    private static Long sequence = 1L;

    @Setter(AccessLevel.NONE)
    private Long id;
    private String name;
    private String description;

    public CollectorModel () {
        this.id = sequence++;
    }

    public static CollectorModel addCollector (CollectorModel collectorModel) {
        collectors.add(collectorModel);
        return collectorModel;
    }








}

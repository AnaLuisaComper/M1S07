package exercicios.service;

import exercicios.model.CollectorModel;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CollectorService {

    public CollectorModel create(CollectorModel collectorModel){
        return CollectorModel.addCollector(collectorModel);
    }

    public List<CollectorModel> findAll(){
        return CollectorModel.getCollectors();
    }

    public CollectorModel findById(Long id){
        for (CollectorModel collector : CollectorModel.getCollectors()) {
            if (collector.getId().equals(id)) {
                return collector;
            }
        }
        return null;
    }

}

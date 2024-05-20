package src.repository;
import src.models.Hospitalization;
import java.util.ArrayList;
import java.util.List;

public class HospitalizacionRepository {
    private List<Hospitalization> hospitalization;

    public HospitalizacionRepository() {
        this.hospitalization = new ArrayList<>();
    }

    public void add(Hospitalization hospitalizacion) {
        hospitalization.add(hospitalizacion);
    }

    public List<Hospitalization> getAll() {
        return new ArrayList<>(hospitalization);
    }
}


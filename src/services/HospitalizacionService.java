package src.services;
import src.models.Hospitalization;
import src.repository.HospitalizacionRepository;
import java.util.List;

public class HospitalizacionService {
    private HospitalizacionRepository HospitalizacionRepository;

    public HospitalizacionService(){
        this.HospitalizacionRepository = new HospitalizacionRepository();
    }
    public void addHospitalization(Hospitalization hospitalization){
        this.HospitalizacionRepository.add(hospitalization);
    }
    public List<Hospitalization> getAllHospitalizations() {
        return HospitalizacionRepository.getAll();
    }
}


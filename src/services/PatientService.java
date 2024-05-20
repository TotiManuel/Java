package src.services;
import src.models.Patient;
import src.repository.PatientRepository;
import java.util.List;

public class PatientService {
    private PatientRepository patientRepository;

    public PatientService() {
        this.patientRepository = new PatientRepository();
    }

    public void addPatient(Patient patient) {
        patientRepository.add(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.getAll();
    }
}



package src.repository;
import src.models.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientRepository {
    private List<Patient> patients;

    public PatientRepository() {
        this.patients = new ArrayList<>();
    }

    public void add(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getAll() {
        return new ArrayList<>(patients);
    }
}

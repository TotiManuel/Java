package src.repository;
import src.models.Doctor;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepository {
    private List<Doctor> doctors;

    public DoctorRepository() {
        this.doctors = new ArrayList<>();
    }

    public void add(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Doctor> getAll() {
        return new ArrayList<>(doctors);
    }
}


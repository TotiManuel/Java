package src.services;
import src.models.Doctor;
import src.repository.DoctorRepository;
import java.util.List;

public class DoctorService {
    private DoctorRepository doctorRepository;

    public DoctorService() {
        this.doctorRepository = new DoctorRepository();
    }

    public void addDoctor(Doctor doctor) {
        doctorRepository.add(doctor);
    }

    public List<Doctor> getAllDoctor() {
        return doctorRepository.getAll();
    }
}
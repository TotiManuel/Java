package src.services;
import src.models.Appointment;
import src.repository.AppointmentRepository;
import java.util.List;

public class AppointmentService {
    private AppointmentRepository appointmentRepository;

    public AppointmentService() {
        this.appointmentRepository = new AppointmentRepository();
    }

    public void addAppointment(Appointment appointment) {
        appointmentRepository.add(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.getAll();
    }
}


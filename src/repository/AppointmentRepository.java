package src.repository;
import src.models.Appointment;
import java.util.ArrayList;
import java.util.List;

public class AppointmentRepository {
    private List<Appointment> appointments;

    public AppointmentRepository() {
        this.appointments = new ArrayList<>();
    }

    public void add(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> getAll() {
        return new ArrayList<>(appointments);
    }
}


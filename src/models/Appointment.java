package src.models;
import java.time.LocalDate;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private LocalDate appointmentDate;
    //Constructor
    public Appointment(Patient patient, Doctor doctor, LocalDate appointmentDate){
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }
    //SettersAndGetters
    public String getPatient(){
        return this.patient.getName();
    }
    public String getDoctor(){
        return this.doctor.getName();
    }
    public LocalDate getDate(){
        return this.appointmentDate;
    }
    public void setPatient(Patient newPatient){
        this.patient = newPatient;
    }
    public void setDoctor(Doctor newDoctor){
        this.doctor = newDoctor;
    }
    public void setDate(LocalDate newAppointmentDate){
        this.appointmentDate = newAppointmentDate;
    }
    public String toString(){
        return ("Turno dado: \nPaciente: " + this.getPatient() + "\nDoctor: " + this.getDoctor() + "\nDia: " + this.getDate());
    }
}

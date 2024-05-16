package src.models;
import java.util.Date;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private Date appointmentDate;
    //Constructor
    public Appointment(Patient patient, Doctor doctor, Date appointmentDate){
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }
    //SettersAndGetters
    public Patient getPatient(){
        return this.patient;
    }
    public Doctor getDoctor(){
        return this.doctor;
    }
    public Date getDate(){
        return this.appointmentDate;
    }
    public void setPatient(Patient newPatient){
        this.patient = newPatient;
    }
    public void setDoctor(Doctor newDoctor){
        this.doctor = newDoctor;
    }
    public void setDate(Date newAppointmentDate){
        this.appointmentDate = newAppointmentDate;
    }
}

package src.models;
import java.time.LocalDate;

public class Hospitalization {
    private Patient patient;
    private LocalDate startDate;
    private LocalDate endDate;
    //Constructor
    public Hospitalization(Patient patient, LocalDate startDate, LocalDate endDate){
        this.patient = patient;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    //SettersAndGetters
    public Patient getPatient(){
        return this.patient;
    }
    public LocalDate getStartDate(){
        return this.startDate;
    }
    public LocalDate getEndDate(){
        return this.endDate;
    }
    public void setPatient(Patient newPatient){
        this.patient = newPatient;
    }
    public void setStartDate(LocalDate newStartDate){
        this.startDate = newStartDate;
    }
    public void setEndDate(LocalDate newEndDate){
        this.endDate = newEndDate;
    }
    public String toString(){
        return "Peciente: " + this.getPatient().getName() + " " + this.getPatient().getLastname() + " con DNI: " + this.getPatient().getDni() +  " esta internado desde el " + this.getStartDate();
    }
}

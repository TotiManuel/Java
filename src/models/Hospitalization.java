package src.models;
import java.util.Date;

public class Hospitalization {
    private Patient patient;
    private Date startDate;
    private Date endDate;
    //Constructor
    public Hospitalization(Patient patient, Date startDate, Date endDate){
        this.patient = patient;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    //SettersAndGetters
    public Patient getPatient(){
        return this.patient;
    }
    public Date getStartDate(){
        return this.startDate;
    }
    public Date getEndDate(){
        return this.endDate;
    }
    public void setPatient(Patient newPatient){
        this.patient = newPatient;
    }
    public void setStartDate(Date newStartDate){
        this.startDate = newStartDate;
    }
    public void setEndDate(Date newEndDate){
        this.endDate = newEndDate;
    }
}

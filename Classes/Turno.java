package Classes;
import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
    //#region Variables
    /**
     * Estas son las variables que se van a usar
     */
    private String Paciente;
    private String Medico;
    private LocalDate DiaTurno;
    private LocalTime HoraTurno;
    private String Consultorio;
    //#endregion
    //#region Constructor
    /*
     * Este es el constructor de la clase Turno
     */
    public Turno(String Paciente, String Medico, LocalDate DiaTurno, LocalTime HoraTurno, String Consultorio){
        this.Paciente = Paciente;
        this.Medico = Medico;
        this.DiaTurno = DiaTurno;
        this.HoraTurno = HoraTurno;
        this.Consultorio = Consultorio;
    }
    //#endregion
    //#region SettersAndGetters
    /* 
     * Estas son los setters y los getters de todas las variable.
     * Primero aparecen los getters en el orden que fueron pasadas al constructor
     * y despues aparecen los setters en el mismo orden que los getter
    */
    public String getPaciente(){
        return this.Paciente;
    }
    public String getMedico(){
        return this.Medico ;
    }
    public LocalDate getDiaTurno(){
        return this.DiaTurno ;
    }
    public LocalTime getHoraTurno(){
        return this.HoraTurno ;
    }
    public String getConsultorio(){
        return this.Consultorio ;
    }
    public void setPaciente(String newPaciente){
        this.Paciente = newPaciente;
    }
    public void setMedico(String newMedico){
        this.Medico = newMedico;
    }
    public void setDiaTurno(LocalDate newDiaTurno){
        this.DiaTurno = newDiaTurno;
    }
    public void setHoraTurno(LocalTime newHoraTurno){
        this.HoraTurno = newHoraTurno;
    }
    public void setConsultorio(String newConsultorio){
        this.Consultorio = newConsultorio;
    }
    //#endregion
    //#region Metodos
    /* 
     * Aca estan todos los metodos de la clase.
    */
    public void addTurno(){
        System.out.println("Turno dado");
    }
    public void modifyTurno(){
        System.out.println("Turno Modificado");
    }
    public void removeTurno(){
        System.out.println("Turno Eliminado");
    }
    //#endregion
}

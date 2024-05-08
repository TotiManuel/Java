package Classes;
import java.time.LocalTime;

public class Medico {
    private String Nombre;
    private String Apellido;
    private String Especialidad;
    private String NumTelefono;
    private LocalTime HorarioInicio;
    private LocalTime HorarioFin;

    //#region Constructor
    public Medico(String Nombre, String Apellido, String Especialidad, String NumTelefono, LocalTime HorarioInicio, LocalTime HorarioFin){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Especialidad = Especialidad;
        this.NumTelefono = NumTelefono;
        this.HorarioInicio = HorarioInicio;
        this.HorarioFin = HorarioFin;
    }
    //#endregion
    //#region Setter y Getters
    public String getNombreString(){
        return this.Nombre;
    }
    public String getApellidoString(){
        return this.Apellido;
    }
    public String getEspecialidadString(){
        return this.Especialidad;
    }
    public String getNumTelefonoString(){
        return this.NumTelefono;
    }
    public LocalTime getHorarioInicioString(){
        return this.HorarioInicio;
    }
    public LocalTime getHorarioFinString(){
        return this.HorarioFin;
    }
    public void setNombreString(String newNombreString){
        this.Nombre = newNombreString;
    }
    public void setApellidoString(String newApellidoString){
        this.Apellido = newApellidoString;
    }
    public void setEspecialidadString(String newEspecialidad){
        this.Especialidad = newEspecialidad;
    }
    public void setNumTelefonoString(String newNumTelefonoString){
        this.NumTelefono = newNumTelefonoString;
    }
    public void setHorarioInicioString(LocalTime newHorarioInicio){
        this.HorarioInicio = newHorarioInicio;
    }
    public void setHorarioFinString(LocalTime newHorarioFin){
        this.HorarioFin = newHorarioFin;
    }
    //#endregion
    //#region Metodos
    public String toString(){
        return "Nombre: " + this.getNombreString() + "\nApellido: " + this.getApellidoString() + "\nEspecialidad: " + this.getEspecialidadString() + "\nNumero de Telefono: " + this.getNumTelefonoString() + "\nHorario de Inicio: " + this.getHorarioInicioString() + "\nHorario de Fin: " + this.getHorarioFinString();
    }
    //#endregion
}
/*
   - Métodos:
     - Método para listar las citas programadas para el médico
 */
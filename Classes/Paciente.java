package Classes;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Paciente {
    private String Nombre;
    private String Apellido;
    private String DNI;
    private String Direccion;
    private String NumTelefono;
    private LocalDate FechaNacimiento;
    private String Alergias;
    private String CondicionesMedicasPreexistentes;

    //#region Constructor
    public Paciente(String Nombre, String Apellido, String DNI, String Direccion, String NumTelefono, LocalDate FechaNacimiento, String Alergias, String CondicionesMedicasPreexistentes){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Direccion = Direccion;
        this.NumTelefono = NumTelefono;
        this.FechaNacimiento = FechaNacimiento;
        this.Alergias = Alergias;
        this.CondicionesMedicasPreexistentes = CondicionesMedicasPreexistentes;
    }
    //#endregion
    //#region Getters y Setters
    public String getNombreString(){
        return this.Nombre;
    }
    public String getApellidoString(){
        return this.Apellido;
    }
    public String getDNIString(){
        return this.DNI;
    }
    public String getDireccionString(){
        return this.Direccion;
    }
    public String getNumTelefonoString(){
        return this.NumTelefono;
    }
    public LocalDate getFechaNacimientoString(){
        return this.FechaNacimiento;
    }
    public String getAlergiasString(){
        return this.Alergias;
    }
    public String getCondicionesMedicasPreexistentesString(){
        return this.CondicionesMedicasPreexistentes;
    }
    public void setNombreString(String newNombre){
        this.Nombre = newNombre;
    }
    public void setApellidoString(String newApellido){
        this.Apellido = newApellido;
    }
    public void setDNIString(String newDNI){
        this.DNI = newDNI;
    }
    public void setDireccionString(String newDireccion){
        this.Direccion = newDireccion;
    }
    public void setNumTelefonoString(String newNumTelefono){
        this.NumTelefono = newNumTelefono;
    }
    public void setFechaNacimientoString(LocalDate newFechaNacimiento){
        this.FechaNacimiento = newFechaNacimiento;
    }
    public void setAlergiasString(String newAlergias){
        this.Alergias = newAlergias;
    }
    public void setCondicionesMedicasPreexistentesString(String newCondicionesMedicasPreexistentes){
        this.CondicionesMedicasPreexistentes = newCondicionesMedicasPreexistentes;
    }
    //#endregion
    //#region Metodos
    public int CalcularEdad(){
        LocalDate fechaActual = LocalDate.now();
        return Period.between(this.getFechaNacimientoString(), fechaActual).getYears();
    }
    public void programarCita(LocalDateTime fechaCita, String medicoAsignado, String motivo) {
        // Aquí puedes implementar la lógica para programar la cita
        System.out.println("Cita programada para " + this.Nombre + " " + this.Apellido + " el " + fechaCita + " con el médico " + medicoAsignado + ". Motivo: " + motivo);
        // Puedes almacenar la cita en una lista, base de datos, etc.
    }
    public String toString(){
        return "Nombre: " + this.Nombre + "\nApellido: " + this.Apellido + "\nDNI: " + this.DNI + "\nDireccion: " + this.Direccion + "\nNumero de Telefono: " + this.NumTelefono + "\nFecha de Nacimiento: " + this.FechaNacimiento + "\nAlergias: " + this.Alergias + "\nCondiciones Medicas Preexistentes: " + this.CondicionesMedicasPreexistentes;
    }
    //#endregion
}
/* 
     - Método para programar una cita
    */
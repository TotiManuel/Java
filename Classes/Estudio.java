package Classes;

public class Estudio {
    private String Nombre;
    private String Paciente;
    private String Medico;
    private String Servicio;
    private String Resultados;
    public Estudio(String Nombre, String Paciente, String Medico, String Servicio, String Resultados){
        this.Nombre = Nombre;
        this.Paciente = Paciente;
        this.Medico = Medico;
        this.Servicio = Servicio;
        this.Resultados = Resultados;
    }
    public String getNombreString(){
        return this.Nombre;
    }
    public String getPaciente(){
        return this.Paciente;
    }
    public String getMedico(){
        return this.Medico;
    }
    public String getServicio(){
        return this.Servicio;
    }
    public String getResultados(){
        return this.Resultados;
    }
    public void setNombre(String newNombre){
        this.Nombre = newNombre;
    }
    public void setPaciente(String newPaciente){
        this.Paciente = newPaciente;
    }
    public void setMedico(String newMedico){
        this.Medico = newMedico;
    }
    public void setServicio(String newServicio){
        this.Servicio = newServicio;
    }
    public void setResultados(String newResultados){
        this.Resultados = newResultados;
    }
}

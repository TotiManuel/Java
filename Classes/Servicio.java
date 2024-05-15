package Classes;

public class Servicio {
    private String TipoServicio;
    private String Estudios;
    private String Medicos;
    public Servicio(String TipoServicio, String Estudios, String Medicos){
        this.TipoServicio = TipoServicio;
        this.Estudios = Estudios;
        this.Medicos = Medicos;
    }
    public void addServicio(){
        System.out.println("Servicio Agregado");
    }
    public void modifyServicio(){
        System.out.println("Servicio Modificado");
    }
    public void removeServicio(){
        System.out.println("Servicio Eliminado");
    }
    public String getTipoServicioString(){
        return this.TipoServicio;
    }
    public String getEstudio(){
        return this.Estudios;
    }
    public String getMedicos(){
        return this.Medicos;
    }
    public void setTipoServicio(String newTipoServicio){
        this.TipoServicio = newTipoServicio;
    }
    public void setEstudios(String newEstudioString){
        this.Estudios = newEstudioString;
    }
    public void setMedico(String newMedico){
        this.Medicos = newMedico;
    }
    public String toString(){
        return "Esta es la clase Servicio";
    }
}
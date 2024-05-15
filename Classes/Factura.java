package Classes;

public class Factura {
    private String Paciente;
    private double GastosAdministrativos;
    private double GastosMedicos;
    private double GastosEstudios;
    private double GastosEstadia;
    private double GastosTotales;
    
    public Factura(String Paciente, double GastosAdministrativos, double GastosMedicos,double GastosEstudios, double GastosEstadia){
        this.Paciente = Paciente;
        this.GastosAdministrativos = GastosAdministrativos;
        this.GastosMedicos = GastosMedicos;
        this.GastosEstudios = GastosEstudios;
        this.GastosEstadia = GastosEstadia;
        this.GastosTotales = GastosAdministrativos + GastosEstadia + GastosEstudios + GastosMedicos;
    }

    //#region GettersAndSetters
    public String getPaciente(){
        return this.Paciente;
    }
    public double getGastosAdministrativos(){
        return this.GastosAdministrativos;
    }
    public double getGastosMedicos(){
        return this.GastosMedicos;
    }
    public double getGastosEstudios(){
        return this.GastosEstudios;
    }
    public double getGastosEstadia(){
        return this.GastosEstadia;
    }
    public double getGastosTotales(){
        return this.GastosTotales;
    }
    public void setPaciente(String newPaciente){
        this.Paciente = newPaciente;
    }
    public void setGastosAdministrativos(double newGastosAdministrativos){
        this.GastosAdministrativos = newGastosAdministrativos;
    }
    public void setGastosMedicos(double newGastosMedicos){
        this.GastosMedicos = newGastosMedicos;
    }
    public void setGastosEstudios(double newGastosEstudios){
        this.GastosEstudios = newGastosEstudios;
    }
    public void setGastosEstadia(double newGastosEstadia){
        this.GastosEstadia = newGastosEstadia;
    }
    public void setGastosTotales(double newGastosTotales){
        this.GastosTotales = newGastosTotales;
    }
    //#endregion
    public void addGastoAdministrativo(String Gasto, double newMonto){
        this.GastosAdministrativos = this.GastosAdministrativos + newMonto;
        System.out.println("De " + Gasto + " el gasto es de: " + this.GastosAdministrativos);
    }
    public void addGastoMedico(String Medico, double newMonto){
        this.GastosMedicos = this.GastosMedicos + newMonto;
        System.out.println("De " + Medico + " el gasto es de: " + this.GastosMedicos);
    }
    public void addGastoEstudio(String Estudio, double newMonto){
        this.GastosEstudios = this.GastosEstudios + newMonto;
        System.out.println("De " + Estudio + " el gasto es de: " + this.GastosEstudios);
    }
    public void addGastoEstadia(String Habitacion, double newMonto){
        this.GastosEstadia = this.GastosEstadia + newMonto;
        System.out.println("De " + Habitacion + " el gasto es de: " + this.GastosEstadia);
    }
    public void addGastosTotales(){
        this.GastosTotales = this.GastosTotales + this.GastosAdministrativos + this.GastosMedicos + this.GastosEstudios + this.GastosEstadia;
    }
    public void restGastoAdministrativo(String Gasto, double newMonto){
        this.GastosAdministrativos = this.GastosAdministrativos - newMonto;
        System.out.println("De " + Gasto + " el gasto es de: " + this.GastosAdministrativos);
    }
}

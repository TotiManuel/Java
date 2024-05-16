package src.models;

public class Doctor {
    private String name;
    private String lastname;
    private String specialty;
    private int matricula;
    //Constructor
    public Doctor(String name, String lastname, String specialty, int matricula){
        this.name = name;
        this.lastname = lastname;
        this.specialty = specialty;
        this.matricula = matricula;
    }
    //SettersAndGetters
    public String getName(){
        return this.name;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getSpecialty(){
        return this.specialty;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setLastname(String newLastname){
        this.lastname = newLastname;
    }
    public void setSpecialty(String newSpecialty){
        this.specialty = newSpecialty;
    }
    public void setMatricula(int newMatricula){
        this.matricula = newMatricula;
    }
}

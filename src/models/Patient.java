package src.models;

public class Patient {
    private String dni;
    private String name;
    private String lastname;
    private String address;
    private int age;
    //Constructor
    public Patient(String dni, String name, String lastname, String address, int age){
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.age = age;
    }
    //SettersAndGetters
    public String getDni(){
        return this.dni;
    }
    public String getName(){
        return this.name;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getAdress(){
        return this.address;
    }
    public int getAge(){
        return this.age;
    }
    public void setDni (String newDni){
        this.dni = newDni;
    }
    public void setName (String newName){
        this.name = newName;
    }
    public void setLastname (String newLastname){
        this.lastname = newLastname;
    }
    public void setAdress (String newAdress){
        this.address = newAdress;
    }
    public void setAge (int newAge){
        this.age = newAge;
    }
}

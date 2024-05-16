package src.main;
import java.util.Scanner;
import src.models.Patient;
import src.services.PatientService;

public class Navigation {
    private PatientService patientService;

    public Navigation(){
        //Constructor
        patientService = new PatientService();
    }
    public void addPatient(){
        Patient patient1 = new Patient("41323167", "John", "Doe", "123 Main St", 25);
        patientService.addPatient(patient1);
    }
    public void toListPatient(){
        patientService.getAllPatients().forEach(patient -> {
        System.out.println("Patient: " + patient.getName());
        });
    }
    public void display_menu(){
        System.out.println("Bienvenido! ");
        Scanner scan = new Scanner(System.in);
        boolean funcionamiento = true;
        while (funcionamiento == true) {
            System.out.println("Menu");
            System.out.println("1) Dar Turno");
            System.out.println("2) Modificar Turno");
            System.out.println("3) Eliminar Turno");
            System.out.println("4) Listar Turno");
            System.out.println("5) Agregar Internacion");
            System.out.println("6) Modificar Internacion");
            System.out.println("7) Eliminar Internacion");
            System.out.println("8) Listar Internaciones");
            System.out.println("9) Listar Ganancias Turno");
            System.out.println("10) Listar Ganancias Internacion");
            System.out.println("11) Agregar Paciente");
            System.out.println("12) Listar Pacientes");
            System.out.println("0) Salir");
            System.out.println(" ");

            int option = scan.nextInt();

            switch (option) {
                case 0:
                    scan.close();
                    funcionamiento = false;
                case 11:
                    addPatient();
                    continue;
                case 12:
                    toListPatient();
                    continue;
                default:
                    break;
            }
        }
    }
}

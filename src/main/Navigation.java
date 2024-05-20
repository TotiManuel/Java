package src.main;
import java.time.LocalDate;
import java.util.Scanner;
import src.models.*;
import src.services.*;

public class Navigation {
    private PatientService patientService;
    private DoctorService doctorService;
    private HospitalizacionService hospitalizacionService;
    private AppointmentService appointmentService;
    private Scanner scan;

    public Navigation(){
        //Constructor
        patientService = new PatientService();
        doctorService = new DoctorService();
        hospitalizacionService = new HospitalizacionService();
        appointmentService = new AppointmentService();
        scan = new Scanner(System.in);
    }
    
    public void addAppointment(){

        System.out.print("Ingrese la fecha (YYYY-MM-DD): "); // Temporal
        String birthDateString = scan.nextLine(); // Temporal
        LocalDate birthDate = LocalDate.parse(birthDateString);

        Patient patient1 = new Patient("41323167", "John", "Doe", "123 Main St", 25); // Temporal
        Doctor doctor = new Doctor("Doctor name", "Doctor Lastname", "Cardiology", 36061); //Temporal
        Appointment appointment = new Appointment(patient1, doctor, birthDate);
        appointmentService.addAppointment(appointment);
    }
    public void toListAppointment(){
        appointmentService.getAllAppointments().forEach(Appointment -> {
            System.out.println("Turno: " + Appointment.toString());
        });
    }
    
    public void addHospitalizacion(){
        Patient patient1 = new Patient("41323167", "John", "Doe", "123 Main St", 25);//Datos Temporales
        LocalDate startDate = LocalDate.parse("2024-06-16");
        LocalDate endDate = LocalDate.parse("2024-05-16");
        String habitacion = ("Habitacion 1");
        Hospitalization hospitalization = new Hospitalization(patient1, startDate, endDate, habitacion);
        hospitalizacionService.addHospitalization(hospitalization);
    }
    public void toListHospitalizacion(){
        hospitalizacionService.getAllHospitalizations().forEach(Hospitalization -> {
        System.out.println("Internacion: " + Hospitalization.toString());
        });
    }
    
    public void addPatient(){
        Patient patient1 = new Patient("41323167", "John", "Doe", "123 Main St", 25);//Datos Temporales
        patientService.addPatient(patient1);
    }
    public void toListPatient(){
        patientService.getAllPatients().forEach(patient -> {
        System.out.println("Patient: " + patient.getName());
        });
    }
    
    public void addDoctor(){
        Doctor doctor = new Doctor("Dr. Raul", "null", "Cardiologia", 0);
        doctorService.addDoctor(doctor);
    }
    public void toListDoctors(){
        doctorService.getAllDoctor().forEach(doctorService -> {
            System.out.println("Doctor: " + doctorService.getName());
        });
    }

    public void display_menu(){
        System.out.println("Bienvenido! ");
        Scanner scan = new Scanner(System.in);
        boolean funcionamiento = true;
        while (funcionamiento == true) {
            System.out.println("Menu");
            System.out.println("1) Dar Turno(avance 1)");
            System.out.println("2) Modificar Turno");
            System.out.println("3) Eliminar Turno");
            System.out.println("4) Listar Turno");
            System.out.println("5) Agregar Internacion(avance 1)");
            System.out.println("6) listar Internacion");
            System.out.println("7) Eliminar Internacion");
            System.out.println("8) Listar Internaciones");
            System.out.println("9) Listar Ganancias Turno");
            System.out.println("10) Listar Ganancias Internacion");
            System.out.println("11) Agregar Paciente(avance 1)");
            System.out.println("12) Listar Pacientes(avance 1)");
            System.out.println("0) Salir");
            System.out.println(" ");

            int option = scan.nextInt();

            switch (option) {
                case 0:
                    funcionamiento = false;
                    continue;
                case 1:
                    addAppointment();
                    continue;
                case 5:
                    addHospitalizacion();
                    continue;
                case 6:
                    toListHospitalizacion();
                    continue;
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
        scan.close();
    }
}

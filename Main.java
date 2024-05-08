import java.time.LocalDate;
import java.time.LocalDateTime;

import Classes.Paciente;

public class Main {
    public Paciente CrearPaciente(String Nombre, String Apellido, String DNI, String Direccion, String NumTelefono, LocalDate FechaNacimiento, String Alergias, String CondicionesMedicasPreexistentes){
        Paciente prueba = new Paciente(Nombre, Apellido, DNI, Direccion, NumTelefono, FechaNacimiento, Alergias, CondicionesMedicasPreexistentes);
        System.out.println(prueba.toString());
        return prueba;
    }
    public void ProgramarCita(Paciente prueba){
        LocalDateTime fechaCita = LocalDateTime.of(2024, 5, 15, 10, 0);
        prueba.programarCita(fechaCita, "Dr. García", "Control médico");
    }
    public static void main(String[] args) {
        //#region prueba
        String Nombre = "Julian Manuel";
        String Apellido = "Mandaio";
        String DNI = "41.323.167";
        String Direccion = "Marcos Juarez 775";
        String NumTelefono = "353-5654443";
        LocalDate FechaNacimiento = LocalDate.of(1998, 8, 29);
        String Alergias = "No";
        String CondicionesMedicasPreexistentes = "No";
        //#endregion
        Main main = new Main();
        Paciente prueba = main.CrearPaciente(Nombre, Apellido, DNI, Direccion, NumTelefono, FechaNacimiento, Alergias, CondicionesMedicasPreexistentes);
        main.ProgramarCita(prueba);
    }
}

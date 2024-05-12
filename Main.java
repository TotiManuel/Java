import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import Classes.Paciente;
import Classes.Medico;
import Classes.Turno;

public class Main {
    public static Paciente CrearPaciente(String Nombre, String Apellido, String DNI, String Direccion, String NumTelefono, LocalDate FechaNacimiento, String Alergias, String CondicionesMedicasPreexistentes){
        Paciente prueba = new Paciente(Nombre, Apellido, DNI, Direccion, NumTelefono, FechaNacimiento, Alergias, CondicionesMedicasPreexistentes);
        System.out.println(prueba.toString());
        return prueba;
    }
    public static void ProgramarCita(Paciente prueba){
        LocalDateTime fechaCita = LocalDateTime.of(2024, 5, 15, 10, 0);
        prueba.programarCita(fechaCita, "Dr. García", "Control médico");
    }
    public static Medico CrearMedico(String Nombre, String Apellido, String Especialidad, String NumTelefono, LocalTime HorarioInicio, LocalTime HorarioFin){
        return new Medico(Nombre, Apellido, Especialidad, NumTelefono, HorarioInicio, HorarioFin);
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
        String Especialidad = "Cardiologia";
        LocalTime HorarioInicio = LocalTime.of(8, 30);
        LocalTime HorarioFin = LocalTime.of(12, 15);
        //#endregion
        //#region pruebaFunciones
        System.out.println("PACIENTE -----------------------");
        Paciente prueba = CrearPaciente(Nombre, Apellido, DNI, Direccion, NumTelefono, FechaNacimiento, Alergias, CondicionesMedicasPreexistentes);
        System.out.println("PROGRAMAR CITA -----------------------");
        ProgramarCita(prueba);
        System.out.println("MEDICO -----------------------");
        Medico medPrueba = CrearMedico(Nombre, Apellido, Especialidad, NumTelefono, HorarioInicio, HorarioFin);
        System.out.println(medPrueba.toString());
        //#endregion
    }
}

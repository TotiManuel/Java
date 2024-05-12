package Classes;
import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
    /**
     * 
     */
    private String Paciente;
    private String Medico;
    private LocalDate DiaTurno;
    private LocalTime HoraTurno;
    public Turno(){
        System.out.println(Paciente + Medico + DiaTurno + HoraTurno);
    }
}

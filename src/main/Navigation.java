package src.main;
import java.util.Scanner;
public class Navigation {
    public Navigation(){
        System.out.println("ok"); //Constructor
    }
    public void display_menu(){
        System.out.println("Bienvenido! ");
        while (true) {
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
            System.out.println("0) Salir");
            System.out.println(" ");

            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();
            scan.close();

            if (option == 0) {
                break;
            }else if(option == 1){
                System.out.println("1");
            }
        }
    }
}

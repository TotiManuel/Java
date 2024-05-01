import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        //#region Nombrarvariables
        int variable = 3;

        String unString = new String("Este es un String");

        String otroString = new String(unString);

        String tercerString = "hola";
        //#endregion
        //#region ImprimirenPantalla
        System.out.println("El valor de la variable es: " + variable);

        System.out.println("El valor de la variable es: " + unString);

        System.out.println("El valor de la variable es: " + otroString);
        
        System.out.println("El valor de la variable es: " + tercerString);
        //#endregion
        //#region LeerVariables
        System.out.println("Dime un numero >> ");
        try (Scanner scanner = new Scanner(System.in)) {
            int numero = scanner.nextInt();
            System.out.println("El numero es el " + numero);
        }
        //#endregion
        //#region ManejarClases
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.titular = "Juan";
        cuentaBancaria.tipoDeCuenta = "Nomina";
        cuentaBancaria.saldo = 23_500;
        System.out.println("Saldo de Juan = " + cuentaBancaria.saldo);
        //#endregion
    }
}
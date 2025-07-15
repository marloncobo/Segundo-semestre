package EjerciciosSeguimiento1.Pago;

import java.util.Scanner;

public class PrincipalNomina {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        nomina.nombre = sc.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        nomina.numeroHoras = sc.nextInt();
        System.out.println("Total a pagar:" + nomina.calcularTotalNomina());
    }
}

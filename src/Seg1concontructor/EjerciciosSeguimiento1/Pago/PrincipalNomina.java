package Seg1concontructor.EjerciciosSeguimiento1.Pago;

import java.util.Scanner;

public class PrincipalNomina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        int numeroHoras = sc.nextInt();

        Nomina nomina = new Nomina(nombre, numeroHoras);
        System.out.println("Total a pagar:" + nomina.preciototal);
    }
}

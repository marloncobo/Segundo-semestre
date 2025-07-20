package Seg1concontructor.EjerciciosSeguimiento1.Lavadora;

import java.util.Scanner;

public class Mainlavadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de lavadora (1/2)");
        int tipo = sc.nextInt();
        System.out.println("Ingrese la cantidad de lavadoras");
        int cantidad = sc.nextInt();

        Lavadora lavadora = new Lavadora(tipo, cantidad);
        System.out.println("El precio a pagar es: " + lavadora.precio());
    }
}

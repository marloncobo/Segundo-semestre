package EjerciciosSeguimiento1.Lavadora;

import java.util.Scanner;

public class Mainlavadora {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de lavadora (1/2)");
        lavadora.tipo = sc.nextInt();
        if (lavadora.tipo < 1 || lavadora.tipo > 2) {
            System.out.println("Ese no es un tipo de lavadora");
            return;
        }
        System.out.println("Ingrese la cantidad de lavadoras");
        lavadora.cantidad = sc.nextInt();
        System.out.println("El precio a pagar es: " + lavadora.precio());
    }
}

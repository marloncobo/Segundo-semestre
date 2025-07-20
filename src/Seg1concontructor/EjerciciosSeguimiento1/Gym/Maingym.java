package Seg1concontructor.EjerciciosSeguimiento1.Gym;

import java.util.Scanner;

public class Maingym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de dias (15, 30, 90)");
        int dias = sc.nextInt();
        Gym gym = new Gym(dias);
        System.out.println("El precio a pagar es de: " + gym.precio + "$");
    }
}

package EjerciciosSeguimiento1.Gym;

import java.util.Scanner;

public class Maingym {
    public static void main(String[] args) {
        Gym gym = new Gym();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de dias (15, 30, 90)");
        gym.dias = sc.nextInt();
        if (gym.precio() == 0){
            System.out.println("Ingrese una cantidad valida");
            return;
        }
        System.out.println("El precio a pagar es de: " + gym.precio() + "$");
    }
}

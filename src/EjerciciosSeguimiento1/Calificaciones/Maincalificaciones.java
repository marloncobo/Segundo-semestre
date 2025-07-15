package EjerciciosSeguimiento1.Calificaciones;

import java.util.Scanner;

public class Maincalificaciones {
    public static void main(String[] args) {
        Calificaciones calificaciones = new Calificaciones();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota de Física");
        calificaciones.fisica = sc.nextInt();
        System.out.println("Ingrese la nota de Biología");
        calificaciones.biologia = sc.nextInt();
        System.out.println("Ingrese la nota de Química");
        calificaciones.quimica = sc.nextInt();
        System.out.println("Ingrese la nota de Matematicas");
        calificaciones.matematicas = sc.nextInt();
        System.out.println("Ingrese la nota de Informatica");
        calificaciones.informatica = sc.nextInt();

        if (calificaciones.verificar()){
            if (calificaciones.promedio() >= 0 && calificaciones.promedio() < 6) {
                System.out.println("Tienes un promedio malo: " + calificaciones.promedio());
            } else if (calificaciones.promedio() >= 6 && calificaciones.promedio() <= 8) {
                System.out.println("Tienes un promedio bueno: " + calificaciones.promedio());
            } else if (calificaciones.promedio() > 8 && calificaciones.promedio() <= 10) {
                System.out.println("Tienes un promedio muy bueno: " + calificaciones.promedio());
            }
        }else {
            System.out.println("Ingrese un número entre el 0 y 10");
        }
    }
}

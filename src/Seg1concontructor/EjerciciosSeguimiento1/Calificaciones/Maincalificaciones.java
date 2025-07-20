package Seg1concontructor.EjerciciosSeguimiento1.Calificaciones;

import java.util.Scanner;

public class Maincalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota de Física");
        int fisica = sc.nextInt();
        System.out.println("Ingrese la nota de Biología");
        int biologia = sc.nextInt();
        System.out.println("Ingrese la nota de Química");
        int quimica = sc.nextInt();
        System.out.println("Ingrese la nota de Matematicas");
        int matematicas = sc.nextInt();
        System.out.println("Ingrese la nota de Informatica");
        int informatica = sc.nextInt();
        Calificaciones calificaciones = new Calificaciones(fisica,biologia,quimica,matematicas,informatica);

        if (calificaciones.promedio >= 0 && calificaciones.promedio < 6) {
            System.out.println("Tienes un promedio malo: " + calificaciones.promedio());
        } else if (calificaciones.promedio() >= 6 && calificaciones.promedio() <= 8) {
            System.out.println("Tienes un promedio bueno: " + calificaciones.promedio());
        } else if (calificaciones.promedio() > 8 && calificaciones.promedio() <= 10) {
            System.out.println("Tienes un promedio muy bueno: " + calificaciones.promedio());
        }

    }
}

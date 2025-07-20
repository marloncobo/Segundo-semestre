package Seg1concontructor.EjerciciosSeguimiento1.Triangulo;

import java.util.Scanner;

public class Maintriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer angulo");
        int ang1 = Integer.parseInt(sc.next());
        System.out.println("Ingrese el segundo angulo");
        int ang2 = Integer.parseInt(sc.next());
        System.out.println("Ingrese el tercer angulo");
        int ang3 = Integer.parseInt(sc.next());

        Triangulo triangulo = new Triangulo(ang1,  ang2, ang3);
        if (triangulo.esvalido) {
            System.out.println("El triangulo es valido");
        }else {
            System.out.println("El triangulo no es valido");
        }
    }
}

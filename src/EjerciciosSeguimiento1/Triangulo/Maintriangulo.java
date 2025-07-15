package EjerciciosSeguimiento1.Triangulo;

import java.util.Scanner;

public class Maintriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        System.out.println("Ingrese el primer angulo");
        triangulo.ang1 = Integer.parseInt(sc.next());
        System.out.println("Ingrese el segundo angulo");
        triangulo.ang2 = Integer.parseInt(sc.next());
        System.out.println("Ingrese el tercer angulo");
        triangulo.ang3 = Integer.parseInt(sc.next());
        if (triangulo.verificar()) {
            System.out.println("El triangulo es valido");
        }else {
            System.out.println("El triangulo no es valido");
        }
    }
}

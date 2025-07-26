package clase;

import java.util.Scanner;

public class Principalinmoviliaria {
    public static void main(String[] args) {
        Inmoviliaria inmoviliaria = new Inmoviliaria("c", "calle 10 - propiedades");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la inmoviliaria: ");
        inmoviliaria.setNombreinmoviliaria(sc.nextLine());
    }
}

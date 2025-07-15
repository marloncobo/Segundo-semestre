package EjerciciosSeguimiento1.SandwichOrder;

import java.util.Objects;
import java.util.Scanner;

public class Mainsandwichorder {
    public static void main(String[] args) {
        Sandwichorder sandwichorder = new Sandwichorder();
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que tamaño desea? (grande/pequeño)");
        sandwichorder.tipo = sc.next();
        System.out.println("¿Desea agreger una jalapeño? (s/n)");
        sc.next();
        System.out.println("¿Desea agreger una tocina? (s/n)");
        if (Objects.equals(sc.next(), "n")){
            sandwichorder.tocineta = 0;
        }
        System.out.println("¿Desea agreger una pavo? (s/n)");
        if (Objects.equals(sc.next(), "n")){
            sandwichorder.pavo = 0;
        }
        System.out.println("¿Desea agreger una queso? (s/n)");
        if (Objects.equals(sc.next(), "n")){
            sandwichorder.queso = 0;
        }
        System.out.println("El total a pagar es: " + sandwichorder.precio());
    }
}

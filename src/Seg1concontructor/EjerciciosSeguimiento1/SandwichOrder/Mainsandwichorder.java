package Seg1concontructor.EjerciciosSeguimiento1.SandwichOrder;

import java.util.Objects;
import java.util.Scanner;

public class Mainsandwichorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tocineta, pavo, queso;

        System.out.println("¿Que tamaño desea? (grande/pequeño)");
        String tipo = sc.next();
        System.out.println("¿Desea agreger una jalapeño? (s/n)");
        sc.next();
        System.out.println("¿Desea agreger una tocina? (s/n)");
        if (Objects.equals(sc.next(), "n")){
            tocineta = 0;
        }else{ tocineta = 3000;}
        System.out.println("¿Desea agreger una pavo? (s/n)");
        if (Objects.equals(sc.next(), "n")){
            pavo = 0;
        }else{ pavo = 3000;}
        System.out.println("¿Desea agreger una queso? (s/n)");
        if (Objects.equals(sc.next(), "n")){
            queso = 0;
        }else{ queso = 2500;}
        Sandwichorder sandwichorder = new Sandwichorder(tipo, tocineta, pavo, queso);
        System.out.println("El total a pagar es: " + sandwichorder.precio());
    }
}

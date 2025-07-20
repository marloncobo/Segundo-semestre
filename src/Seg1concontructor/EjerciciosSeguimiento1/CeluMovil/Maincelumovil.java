package Seg1concontructor.EjerciciosSeguimiento1.CeluMovil;

import java.util.Scanner;

public class Maincelumovil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el operador movil");
        String operador = sc.next();
        System.out.println("Ingrese los minutos consumidos");
        int cantidad = Integer.parseInt(sc.next());
        System.out.println("¿Quieres paquetes de datos? (s/n)");
        String verificar = sc.next();
        boolean quieredatos = verificar.equals("s");
        Celumovil celumovil = new Celumovil(operador, cantidad, quieredatos);

        System.out.println("Total a pagar: " + celumovil.precio());
    }
}

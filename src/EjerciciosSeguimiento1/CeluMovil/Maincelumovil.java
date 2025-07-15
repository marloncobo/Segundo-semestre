package EjerciciosSeguimiento1.CeluMovil;

import java.util.Scanner;

public class Maincelumovil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Celumovil celumovil = new Celumovil();
        System.out.println("Ingrese el operador movil");
        celumovil.operador = sc.next();
        System.out.println("Ingrese los minutos consumidos");
        celumovil.minutos = Integer.parseInt(sc.next());
        System.out.println("¿Quieres paquetes de datos? (s/n)");
        String verificar = sc.next();
        switch (verificar){
            case "s":
                celumovil.verificar();
                break;
            case "n":
                celumovil.verificar();
                celumovil.paquetes = 0;
                break;
        }
        System.out.println("Total a pagar: " + celumovil.precio());
    }
}

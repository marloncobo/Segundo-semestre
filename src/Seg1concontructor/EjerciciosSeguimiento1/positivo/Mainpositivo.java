package Seg1concontructor.EjerciciosSeguimiento1.positivo;

import javax.swing.*;

public class Mainpositivo {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));

        Positivo positivo = new Positivo(numero);
        if(positivo.espositivo){
            System.out.println("Es positivo");
        }else {
            System.out.println("Es negativo");
        }
    }
}

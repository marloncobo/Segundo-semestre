package Seg1concontructor.EjerciciosSeguimiento1.AyudaAlcaldia;

import javax.swing.*;

public class MainAyuda {
    public static void main(String[] args) {
        String genero = JOptionPane.showInputDialog("Ingrese su genero");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        AyudaAlcaldia ayudaAlcaldia = new AyudaAlcaldia(genero, edad);
        System.out.println("El valor del recibo mensual es de: " + ayudaAlcaldia.ayuda + "$");
    }
}

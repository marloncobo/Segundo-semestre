package EjerciciosSeguimiento1.AyudaAlcaldia;

import javax.swing.*;

public class MainAyuda {
    public static void main(String[] args) {
        AyudaAlcaldia ayudaAlcaldia = new AyudaAlcaldia();
        ayudaAlcaldia.genero = JOptionPane.showInputDialog("Ingrese su genero");
        ayudaAlcaldia.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        System.out.println("El valor del recibo mensual es de: " + ayudaAlcaldia.verificar() + "$");
    }
}

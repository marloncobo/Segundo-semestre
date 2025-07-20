package Seg1concontructor.EjerciciosSeguimiento1.Fotocopias;

import javax.swing.*;

public class MainFotocopias {
    public static void main(String[] args) {
        int copias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de copias"));

        Fotocopias fotocopias = new Fotocopias(copias);
        System.out.println("La cantidad de copias es: " + fotocopias.copias + " - costo por unidad: " + fotocopias.preciocopia + "\nEl precio total a pagar es de: " + fotocopias.precio());
    }
}

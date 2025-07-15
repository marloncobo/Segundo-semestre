package EjerciciosSeguimiento1.Fotocopias;

import javax.swing.*;

public class MainFotocopias {
    public static void main(String[] args) {
        Fotocopias fotocopias = new Fotocopias();
        fotocopias.copias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de copias"));
        if (fotocopias.verificar() == 0){
            System.out.println("Ingrese una cantidad valida");
            return;
        }
        System.out.println("La cantidad de copias es: " + fotocopias.copias + " - costo por unidad: " + fotocopias.verificar() + " - El precio total a pagar es de: " + fotocopias.precio());
    }
}

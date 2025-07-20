package Seg1concontructor.EjerciciosSeguimiento1.ModeloCarro;

import javax.swing.*;

public class Mainmodelocarro {
    public static void main(String[] args) {
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de modelo"));
        Modelocarro modelocarro = new Modelocarro(modelo);
    }
}

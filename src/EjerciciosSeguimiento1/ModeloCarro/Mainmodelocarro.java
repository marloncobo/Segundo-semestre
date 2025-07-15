package EjerciciosSeguimiento1.ModeloCarro;

import javax.swing.*;

public class Mainmodelocarro {
    public static void main(String[] args) {
        Modelocarro modelocarro = new Modelocarro();
        modelocarro.modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de modelo"));
        System.out.println(modelocarro.verificar());
    }
}

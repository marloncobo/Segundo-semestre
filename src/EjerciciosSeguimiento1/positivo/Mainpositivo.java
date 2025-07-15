package EjerciciosSeguimiento1.positivo;

import javax.swing.*;

public class Mainpositivo {
    public static void main(String[] args) {
        Positivo positivo = new Positivo();
        positivo.numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        if(positivo.positivoNegativo()){
            System.out.println("Es positivo");
        }else {
            System.out.println("Es negativo");
        }
    }
}

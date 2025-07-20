package Seg1concontructor.EjerciciosSeguimiento1.NumMayor;

import javax.swing.*;

public class MainMayor {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer número"));

        Mayor mayor = new Mayor(num1,num2,num3);
        System.out.println("El número mayor es: " + mayor.mayor);
    }
}

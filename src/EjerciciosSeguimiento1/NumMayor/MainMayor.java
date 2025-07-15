package EjerciciosSeguimiento1.NumMayor;

import javax.swing.*;

public class MainMayor {
    public static void main(String[] args) {
        Mayor mayor = new Mayor();
        mayor.num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
        mayor.num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));
        mayor.num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer número"));
        System.out.println("El número mayor es: " + mayor.mayor());
    }
}

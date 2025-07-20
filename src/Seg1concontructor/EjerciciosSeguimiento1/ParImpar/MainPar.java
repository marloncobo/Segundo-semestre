package Seg1concontructor.EjerciciosSeguimiento1.ParImpar;

import javax.swing.*;

public class MainPar {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        Espar par = new Espar(num);
        if(par.espar){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
    }
}

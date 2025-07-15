package EjerciciosSeguimiento1.ParImpar;

import javax.swing.*;

public class MainPar {
    public static void main(String[] args) {
        Espar par = new Espar();
        par.num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if(par.Par()){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
    }
}

package Seg1concontructor.EjerciciosSeguimiento1.DiagnosticoComputadora;

import javax.swing.*;

public class Maindiagnostico {
    public static void main(String[] args) {
        boolean pitido;
        boolean disco;
        
        String option = JOptionPane.showInputDialog("¿Su computadora emite un pitido? (s/n)");
        String option2 = JOptionPane.showInputDialog("¿El disco duro gira? (s/n)");
        switch (option){
            case "s":
                pitido = true;
                break;
            case "n":
                pitido = false;
                break;
            default:
                throw new IllegalArgumentException("Opción no valida");
        }
        switch (option2){
            case "s":
                disco = true;
                break;
            case "n":
                disco = false;
                break;
            default:
                throw new IllegalArgumentException("Opción no valida");
        }
        Diagnostico diagnostico = new Diagnostico(pitido, disco);
        System.out.println(diagnostico.verificar());
    }
}

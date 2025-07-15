package EjerciciosSeguimiento1.DiagnosticoComputadora;

import javax.swing.*;

public class Maindiagnostico {
    public static void main(String[] args) {
        Diagnostico diagnostico = new Diagnostico();
        String option = JOptionPane.showInputDialog("¿Su computadora emite un pitido? (s/n)");
        String option2 = JOptionPane.showInputDialog("¿El disco duro gira? (s/n)");
        switch (option){
            case "s":
                diagnostico.pitido = true;
                break;
            case "n":
                diagnostico.pitido = false;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        switch (option2){
            case "s":
                diagnostico.disco = true;
                System.out.println(diagnostico.verificar());
                break;
            case "n":
                diagnostico.disco = false;
                System.out.println(diagnostico.verificar());
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}

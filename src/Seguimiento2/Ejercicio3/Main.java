package Seguimiento2.Ejercicio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cuentabancaria cuentaPrincipal = new Cuentabancaria("Pepito Pérez", "190-892", 3000000);
        Cuentabancaria cuentaDestino = new Cuentabancaria("Pablo Clavitos", "937-764", 100000);

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Consultar Saldo\n2. Realizar un Depósito (Consignación)\n3. Realizar un Retiro\n4. Realizar una Transferiencia a otra cuenta\n5. Salir"));
            switch (opcion) {
                case 1:
                    double consultasaldo = cuentaPrincipal.getSaldo();
                    JOptionPane.showMessageDialog(null, "Tu saldo actual es: " + consultasaldo, "Saldo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    String depositar = JOptionPane.showInputDialog("Ingrese la cantidad a depositar");
                    cuentaPrincipal.depositar(Double.parseDouble(depositar));
                    JOptionPane.showMessageDialog(null, "Se ha depositado exitosamente tu saldo actual es: " + cuentaPrincipal.getSaldo(), "Saldo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar"));
                    if(cuentaPrincipal.retirar(monto)){
                        JOptionPane.showMessageDialog(null, "Retiro exitoso tu saldo actual es: " + cuentaPrincipal.getSaldo(), "Saldo", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Saldo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 4:
                    double transferir = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a transferir"));
                    if(cuentaPrincipal.getSaldo() >= transferir){
                        cuentaPrincipal.transferencia(cuentaDestino, transferir);
                        JOptionPane.showMessageDialog(null, "La transferencia fue exitosa", "Saldo", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Saldo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo...", "Cerrando programa", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                    break;
            }
        }
    }
}

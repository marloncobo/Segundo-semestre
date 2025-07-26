package Seguimiento2.Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
        cliente.setTelefono(JOptionPane.showInputDialog("Ingrese su telefono"));

        Reserva reserva = new Reserva();
        reserva.setNumerohabitacion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de habitacion")));
        reserva.setCantidadnoches(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de noches")));
        reserva.setCliente(cliente);

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setText(
                "Resumen Final\n\n" +
                "Nombre: " + reserva.getCliente().getNombre() + " - " + "Telefono: " + reserva.getCliente().getTelefono() + "\n"
                + "Numero de habitacion: " + reserva.getNumerohabitacion() + " - " + "Cantidadnoches: " + reserva.getCantidadnoches() + "\n"
        );
        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new java.awt.Dimension(400, 400));
        JOptionPane.showMessageDialog(null, scroll, "Resumen Final", JOptionPane.INFORMATION_MESSAGE);

    }
}

package Seguimiento2.Ejercicio1;

import javax.swing.*;

public class Mainejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 monitor1 = new Ejercicio1("Ana Pérez", "101", "Feria Universitaria - Unicentro");
        Ejercicio1 monitor2 = new Ejercicio1("Carlos Rojas", "102", "Visita Colegio San Luis Rey");
        Ejercicio1 monitor3 = new Ejercicio1("Pepito Morales", "103", "ExpoU");
        Ejercicio1 monitor4 = new Ejercicio1("Roberto Gomez", "104", "Visita a centro de rehabilitacion");
        Ejercicio1 monitor5 = new Ejercicio1("Julano Fino", "105", "Visita al coliceo");
        while(true){
            int pregunta =  Integer.parseInt(JOptionPane.showInputDialog("1. Registrar Horas de un Monitor \n2. Ver Estado de Todos los Monitores \n3. Salir del Sistema"));
                switch (pregunta){
                    case 1:
                        int horas = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el monitor\n1. Ana Pérez\n2. Carlos Rojas\n3. Pepito Morales\n4. Roberto Gomez\n5. Julano Fino\n6. Salir del Sistema"));
                        int agregarhoras = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas registradas"));

                        switch(horas){
                            case 1:
                                monitor1.registrarhoras(agregarhoras);
                                System.out.println("El monitor " + monitor1.getNombre() + " Lleva un total de " + monitor1.getHorasacumuladas() + " horas");
                                break;
                            case 2:
                                monitor2.registrarhoras(agregarhoras);
                                System.out.println("El monitor " + monitor2.getNombre() + " Lleva un total de " + monitor2.getHorasacumuladas() + " horas");
                                break;
                            case 3:
                                monitor3.registrarhoras(agregarhoras);
                                System.out.println("El monitor " + monitor3.getNombre() + " Lleva un total de " + monitor3.getHorasacumuladas() + " horas");
                                break;
                            case 4:
                                monitor4.registrarhoras(agregarhoras);
                                System.out.println("El monitor " + monitor4.getNombre() + " Lleva un total de " + monitor4.getHorasacumuladas() + " horas");
                                break;
                            case 5:
                                monitor5.registrarhoras(agregarhoras);
                                System.out.println("El monitor " + monitor5.getNombre() + " Lleva un total de " + monitor5.getHorasacumuladas() + " horas");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                        break;
                    case 2:
                        JTextArea textArea = new JTextArea();
                        textArea.setEditable(false);
                        textArea.setText(
                                "Estado de los monitores:\n\n" +
                                        monitor1.getNombre() + " - " + monitor1.getEventoasignado() + "\nHoras: " + monitor1.getHorasacumuladas() + " - Estado: " + monitor1.verificarestado() + "\n\n" +
                                        monitor2.getNombre() + " - " + monitor2.getEventoasignado() + "\nHoras: " + monitor2.getHorasacumuladas() + " - Estado: " + monitor2.verificarestado() + "\n\n" +
                                        monitor3.getNombre() + " - " + monitor3.getEventoasignado() + "\nHoras: " + monitor3.getHorasacumuladas() + " - Estado: " + monitor3.verificarestado() + "\n\n" +
                                        monitor4.getNombre() + " - " + monitor4.getEventoasignado() + "\nHoras: " + monitor4.getHorasacumuladas() + " - Estado: " + monitor4.verificarestado() + "\n\n" +
                                        monitor5.getNombre() + " - " + monitor5.getEventoasignado() + "\nHoras: " + monitor5.getHorasacumuladas() + " - Estado: " + monitor5.verificarestado()
                        );
                        JScrollPane scrollPane = new JScrollPane(textArea);
                        scrollPane.setPreferredSize(new java.awt.Dimension(500, 300)); // Tamaño del cuadro

                        JOptionPane.showMessageDialog(null, scrollPane, "Estado de Monitores", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no valida");
                }
        }
    }
}

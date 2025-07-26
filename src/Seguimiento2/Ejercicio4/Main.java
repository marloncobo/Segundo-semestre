package Seguimiento2.Ejercicio4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Partido partido = new Partido("Nacional", "Las Americas", "Lunes, 28 de Julio, 2025");
        int dinerorecaudado = 0;
        int disponiblesNorte = 100;
        int disponiblesSur = 100;
        int disponiblesVIP = 20;
        int precioNorte = 50000;
        int precioSur = 50000;
        int precioVIP = 200000;

        while (true){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n1. Comprar Boleta \n2. Consultar Disponibilidad\n3. Ver Dinero Recaudado \n4. Salir del Sistema \n"));

            switch (opcion){
                case 1:
                    Comprador comprador = new Comprador(JOptionPane.showInputDialog("Ingrese su nombre"), JOptionPane.showInputDialog("Ingrese su documento"));
                    int localidadint = Integer.parseInt(JOptionPane.showInputDialog("Localidad\n1.Norte\n2.Sur\n3.VIP"));
                    String localidad;
                    int boletas =  Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas boletas desea comprar?"));
                    int costoTotal;

                    JTextArea area = new JTextArea();
                    area.setEditable(false);
                    switch (localidadint){
                        case 1:
                            localidad = "Norte";
                            if (boletas > disponiblesNorte || disponiblesNorte == 0){
                                JOptionPane.showMessageDialog(null, "No hay boletas disponibles en esta localidad");
                            }else{
                                costoTotal = precioNorte*boletas;
                                dinerorecaudado += costoTotal;
                                disponiblesNorte -= boletas;
                                area.setText("Nombre: " + comprador.getNombre() + "\n"
                                        + "Documento: " + comprador.getDocumento() + "\n"
                                        + "Localidad: " + localidad + "\n"
                                        + "Cantidad de boletas: " + boletas + "\n"
                                        + "Total a pagar" + costoTotal);
                                JOptionPane.showMessageDialog(null, area, "Recibo", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;
                        case 2:
                            localidad = "Sur";
                            if (boletas > disponiblesSur || disponiblesSur == 0){
                                JOptionPane.showMessageDialog(null, "No hay boletas disponibles en esta localidad");
                            }else{
                                costoTotal = precioSur*boletas;
                                dinerorecaudado += costoTotal;
                                disponiblesSur -= boletas;
                                area.setText("Nombre: " + comprador.getNombre() + "\n"
                                        + "Documento: " + comprador.getDocumento() + "\n"
                                        + "Localidad: " + localidad + "\n"
                                        + "Cantidad de boletas: " + boletas + "\n"
                                        + "Total a pagar" + costoTotal);
                                JOptionPane.showMessageDialog(null, area, "Recibo", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;
                        case 3:
                            localidad = "VIP";
                            if (boletas > disponiblesVIP || disponiblesVIP == 0){
                                JOptionPane.showMessageDialog(null, "No hay boletas disponibles en esta localidad");
                            }else{
                                costoTotal = precioVIP*boletas;
                                dinerorecaudado += costoTotal;
                                disponiblesVIP -= boletas;
                                area.setText("Nombre: " + comprador.getNombre() + "\n"
                                        + "Documento: " + comprador.getDocumento() + "\n"
                                        + "Localidad: " + localidad + "\n"
                                        + "Cantidad de boletas: " + boletas + "\n"
                                        + "Total a pagar" + costoTotal);
                                JOptionPane.showMessageDialog(null, area, "Recibo", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no valida");
                    }

                    break;
                case 2:
                    int totalboletas = disponiblesNorte + disponiblesSur + disponiblesVIP;
                    JTextArea area2 = new JTextArea();
                    area2.setText("Total de boletas disponibles: " + totalboletas + "\n"
                    + "Localidad Norte: " + disponiblesNorte + "\n"
                    + "Localidad Sur: " + disponiblesSur + "\n"
                    + "Localidad VIP: " + disponiblesVIP);

                    area2.setEditable(false);
                    JOptionPane.showMessageDialog(null, area2, "Disponibilidad de boletos", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Dinero recaudado: " + dinerorecaudado, "Dinero Total Recaudado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null ,"Opción no valida");
            }
        }

    }
}

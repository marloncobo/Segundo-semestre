package Seguimiento2.Ejercicio1;

public class Ejercicio1 {
    private String nombre;
    private String codigoestudiante;
    private String eventoasignado;
    private double horasacumuladas = 0;

    public Ejercicio1(String nombre, String codigoestudiante, String eventoasignado) {
        this.nombre = nombre;
        this.codigoestudiante = codigoestudiante;
        this.eventoasignado = eventoasignado;
    }

    void registrarhoras(double horas){
        horasacumuladas += horas;
    }

    String verificarestado(){
        if(horasacumuladas >= 8){
            return "Horas completadas";
        }
        if (horasacumuladas < 8){
            return "Horas pendientes";
        }
        return "Horas fallido";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoestudiante() {
        return codigoestudiante;
    }

    public void setCodigoestudiante(String codigoestudiante) {
        this.codigoestudiante = codigoestudiante;
    }

    public String getEventoasignado() {
        return eventoasignado;
    }

    public void setEventoasignado(String eventoasignado) {
        this.eventoasignado = eventoasignado;
    }

    public double getHorasacumuladas() {
        return horasacumuladas;
    }

    public void setHorasacumuladas(double horasacumuladas) {
        this.horasacumuladas = horasacumuladas;
    }
}
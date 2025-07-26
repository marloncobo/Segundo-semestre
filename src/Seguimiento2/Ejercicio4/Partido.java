package Seguimiento2.Ejercicio4;

public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private String fecha;

    public Partido(String equipoLocal, String equipoVisitante, String fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public String getFecha() {
        return fecha;
    }
}

package Seguimiento2.Ejercicio4;

public class Comprador {
    private String nombre;
    private String documento;

    Comprador(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDocumento() {
        return documento;
    }
}

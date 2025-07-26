package clase;

public class Inmoviliaria {
    private String nombreinmoviliaria;
    private String descripcioninmoviliaria;

    public Inmoviliaria(String descripcioninmoviliaria, String nombreinmoviliaria) {
        this.descripcioninmoviliaria = descripcioninmoviliaria;
        this.nombreinmoviliaria = nombreinmoviliaria;
    }

    public String getNombreinmoviliaria() {
        return nombreinmoviliaria;
    }

    public void setNombreinmoviliaria(String nombreinmoviliaria) {
        this.nombreinmoviliaria = nombreinmoviliaria;
    }
    //public-private-protected
    //Singleton
    //protected pueden ingresar los hijos a esta clase
    //para acceder a una propiedad privada se necesita un metodo publico
}

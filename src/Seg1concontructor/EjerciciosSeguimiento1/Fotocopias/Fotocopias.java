package Seg1concontructor.EjerciciosSeguimiento1.Fotocopias;

public class Fotocopias {
    public int copias;
    public int preciocopia;
    Fotocopias(int copias){
        this.copias = copias;
        if (copias > 0 && copias < 500){
            preciocopia = 120;
        } else if (copias >= 500 && copias < 750) {
            preciocopia = 100;
        } else if (copias >= 750 && copias < 1000) {
            preciocopia = 80;
        } else if (copias >= 1000) {
            preciocopia = 50;
        }else {
            throw new IllegalArgumentException("Cantidad no valida");
        }
    }

    public int precio(){
        return preciocopia*copias;
    }
}

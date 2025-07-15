package EjerciciosSeguimiento1.Fotocopias;

public class Fotocopias {
    public int copias;
    public int verificar(){
        if (copias > 0 && copias < 500){
            return 120;
        } else if (copias >= 500 && copias < 750) {
            return 100;
        } else if (copias >= 750 && copias < 1000) {
            return 80;
        } else if (copias >= 1000) {
            return 50;
        }
        return 0;
    }
    public int precio(){
        return verificar()*copias;
    }
}

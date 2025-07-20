package Seg1concontructor.EjerciciosSeguimiento1.Gym;

public class Gym {
    public int dias;
    public int precio;
    Gym (int dias){
        this.dias = dias;
        switch (dias){
            case 15:
                precio = 18000;
                break;
            case 30:
                precio = 35000;
                break;
            case 90:
                precio = 86000;
                break;
            default:
                throw new IllegalArgumentException("Opción no valida");
        }
    }
}

package EjerciciosSeguimiento1.Triangulo;

public class Triangulo {
    public int ang1, ang2, ang3;
    public boolean verificar(){
        int suma = ang1 + ang2 + ang3;
        if (suma == 180){
            return true;
        }
        return false;
    }
}

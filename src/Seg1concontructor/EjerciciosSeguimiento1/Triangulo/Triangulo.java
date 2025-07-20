package Seg1concontructor.EjerciciosSeguimiento1.Triangulo;

public class Triangulo {
    public int ang1, ang2, ang3;
    public boolean esvalido;

    Triangulo(int ang1, int ang2, int ang3){
        this.ang1 = ang1;
        this.ang2 = ang2;
        this.ang3 = ang3;
        int suma = ang1 + ang2 + ang3;

        if (suma == 180){
            this.esvalido = true;
        }else {
            this.esvalido = false;
        }
    }
}

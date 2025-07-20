package Seg1concontructor.EjerciciosSeguimiento1.ParImpar;

public class Espar {
    public int num;
    public boolean espar;
    Espar (int num){
        this.num = num;
        this.espar = this.num % 2 == 0;
    }
}

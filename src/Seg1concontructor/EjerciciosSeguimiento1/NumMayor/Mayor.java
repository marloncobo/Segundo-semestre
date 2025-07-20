package Seg1concontructor.EjerciciosSeguimiento1.NumMayor;

public class Mayor {
    public int num1,num2,num3,mayor;

    Mayor(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        if (num1 > num2 && num1 > num3) {
            this.mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            this.mayor = num2;
        }else {
            this.mayor = num3;
        }
    }
}

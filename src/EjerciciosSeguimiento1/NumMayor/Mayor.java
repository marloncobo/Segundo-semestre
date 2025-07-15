package EjerciciosSeguimiento1.NumMayor;

public class Mayor {
    public int num1,num2,num3;

    public int mayor(){
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        }else {
            return num3;
        }
    }
}

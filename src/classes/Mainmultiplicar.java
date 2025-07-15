package classes;

public class Mainmultiplicar {
    public static void main(String[] args) {
        Multiplicar multiplicar = new Multiplicar();
        multiplicar.num1 = 10;
        multiplicar.num2 = 30;
        System.out.printf("La multiplicación es: " + multiplicar.multiplicar());
    }
}

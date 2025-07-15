package classes;

public class Mainsuma {
    public static void main(String[] args) {
        Sumar suma = new Sumar();
        suma.num1 = 10;
        suma.num2 = 20;

        System.out.println("La suma es: " + suma.sumar());
    }
}

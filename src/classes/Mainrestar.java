package classes;

public class Mainrestar {
    public static void main(String[] args) {
        Restar restar = new Restar();
        restar.num1 = 10;
        restar.num2 = 30;
        System.out.printf("La resta es: " + restar.restar());
    }
}

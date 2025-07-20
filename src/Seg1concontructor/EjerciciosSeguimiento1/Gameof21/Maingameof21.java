package Seg1concontructor.EjerciciosSeguimiento1.Gameof21;


import java.util.Scanner;

public class Maingameof21 {
    public static void main(String[] args) {
        Gameof21 game = new Gameof21();
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres jugar? (s/n)");
        String opcion1 = sc.next();
        switch (opcion1){
            case "s":
                game.sumatorias(0);
                game.pedir();
                String opcion2 = sc.next();
                switch (opcion2) {
                    case "s":
                        game.sumatorias(1);
                        game.pedir();
                        String opcion3 = sc.next();
                        switch (opcion3){
                            case "s":
                                game.sumatorias(2);
                                System.out.println("Llevas: " + game.sumatoriaJ + "\nLa maquina lleva: " + game.sumatoriaM);
                                System.out.println(game.ganador());
                                break;
                            case "n":
                                System.out.println(game.ganador());
                                break;
                        }
                        break;
                    case "n":
                        System.out.println(game.ganador());
                        break;
                }
                break;
            case "n":
                break;
        }
    }
}
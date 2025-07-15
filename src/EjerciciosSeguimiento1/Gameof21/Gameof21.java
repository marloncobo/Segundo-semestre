package EjerciciosSeguimiento1.Gameof21;

public class Gameof21 {
    public int [] jugador = new int[3];
    public int [] maquina = new int[3];
    public int sumatoriaJ = 0;
    public int sumatoriaM = 0;

    public int obtenercarta(){
        return (int)(Math.random() * 10) + 1;
    }

    public String ganador(){
        if (sumatoriaM > 21){
            return "Has ganado";
        } else if (sumatoriaJ > 21) {
            return "La maquina ha ganado";
        }
        if (sumatoriaJ > sumatoriaM){
            return "Has ganado";
        } else if (sumatoriaM > sumatoriaJ) {
            return "La maquina ha ganado";
        } else if (sumatoriaJ == sumatoriaM) {
            return "Empate";
        }else {
            return "";
        }
    }

    public void sumatorias(int i){
            sumatoriaJ += jugador[i];
            sumatoriaM += maquina[i];
    }
    public void pedir(){
        System.out.println("¿Quieres sacar otra carta? (s/n)");
        System.out.println("Llevas: " + sumatoriaJ + "\nLa maquina lleva: " + sumatoriaM);
    }
}

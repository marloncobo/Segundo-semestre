package EjerciciosSeguimiento1.SandwichOrder;

public class Sandwichorder {
    public String tipo;
    public int tocineta = 3000;
    public int pavo = 3000;
    public int queso = 2500;
    public int verificar (){
        switch (tipo){
            case "pequeño":
                return 6000;
            case "grande":
                return 12000;
            default:
                return 0;
        }
    }
    public int precio(){
        return verificar() + tocineta + pavo + queso;
    }
}

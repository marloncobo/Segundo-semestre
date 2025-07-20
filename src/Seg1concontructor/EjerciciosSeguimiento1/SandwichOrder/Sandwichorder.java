package Seg1concontructor.EjerciciosSeguimiento1.SandwichOrder;

public class Sandwichorder {
    public String tipo;
    public int tamano, tocineta, pavo, queso;

    Sandwichorder (String tipo, int tocineta, int pavo, int queso) {
        this.tipo = tipo;
        this.tocineta = tocineta;
        this.pavo = pavo;
        this.queso = queso;

        switch (tipo){
            case "pequeño":
                this.tamano = 6000;
                break;
            case "grande":
                this.tamano = 12000;
                break;
            default:
                throw new IllegalArgumentException("Tipo no valido");
        }
    }

    public int precio(){
        return this.tamano + tocineta + pavo + queso;
    }
}

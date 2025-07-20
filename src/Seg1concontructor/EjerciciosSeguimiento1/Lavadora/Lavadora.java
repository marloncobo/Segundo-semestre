package Seg1concontructor.EjerciciosSeguimiento1.Lavadora;

public class Lavadora {
    public int tipo;
    public int cantidad;


    Lavadora (int tipo, int cantidad){
        this.cantidad = cantidad;
        if (tipo == 1){
            this.tipo = 40000;
        }else if (tipo == 2) {
            this.tipo = 30000;
        }
    }

    public double descuento(){
        if(this.cantidad >= 3){
            return 0.03;
        }
        return 1;
    }

    public double precio(){
        if(descuento() == 1){
            return this.cantidad*this.tipo;
        }
        double total = this.cantidad*this.tipo;
        return total*(1 - this.descuento());
    }
}

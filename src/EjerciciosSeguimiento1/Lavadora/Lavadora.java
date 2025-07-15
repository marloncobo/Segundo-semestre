package EjerciciosSeguimiento1.Lavadora;

public class Lavadora {
    public int tipo;
    public int cantidad;
    public int tipolavadora(){
        if(this.tipo == 1){
            return 40000;
        } else if (tipo == 2) {
            return 30000;
        }
        return 0;
    }

    public double descuento(){
        if(this.cantidad >= 3){
            return 0.03;
        }
        return 1;
    }

    public double precio(){
        if(descuento() == 1){
            return this.cantidad*this.tipolavadora();
        }
        double total = this.cantidad*this.tipolavadora();
        return total*(1 - this.descuento());
    }
}

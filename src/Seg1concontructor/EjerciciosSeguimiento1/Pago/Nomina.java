package Seg1concontructor.EjerciciosSeguimiento1.Pago;

public class Nomina {
    public String nombre;
    public int numeroHoras, preciohora, preciototal;

    Nomina(String nombre, int numeroHoras) {
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
        if (numeroHoras > 0) {
            if (this.numeroHoras > 1 && this.numeroHoras < 10){
                this.preciohora = 30000;
            }else {
                this.preciohora = 33000;
            }
            this.preciototal = this.numeroHoras * this.preciohora;
        }else {
            throw new IllegalArgumentException("Ingrese una cantidad valida");
        }
    }
}

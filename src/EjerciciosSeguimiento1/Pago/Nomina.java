package EjerciciosSeguimiento1.Pago;

public class Nomina {
    public String nombre;
    public int numeroHoras;

    public int calcularPrecioHora(){
        if (this.numeroHoras > 1 && this.numeroHoras < 10){
            return 30000;
        }
        return 33000;
    }
    public int calcularTotalNomina(){
        return this.numeroHoras * this.calcularPrecioHora();
    }
}

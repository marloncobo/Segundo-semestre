package Seguimiento2.Ejercicio2;

public class Reserva {
    private int numerohabitacion;
    private int cantidadnoches;
    private Cliente cliente;

    public int getNumerohabitacion() {
        return numerohabitacion;
    }

    public void setNumerohabitacion(int numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }

    public int getCantidadnoches() {
        return cantidadnoches;
    }

    public void setCantidadnoches(int cantidadnoches) {
        this.cantidadnoches = cantidadnoches;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

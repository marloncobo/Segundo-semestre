package Seg1concontructor.EjerciciosSeguimiento1.CeluMovil;

public class Celumovil {
    public String operador;
    public int cargofijo;
    public int costominutos;
    public int paquetes;
    public int cantidad;

    Celumovil(String operador, int cantidad, boolean quierepaquetes){
        this.operador = operador;
        this.cantidad = cantidad;

        switch (operador.toLowerCase()){
            case "tigo":
                cargofijo = 45000;
                costominutos = 200;
                paquetes = 12000;
                break;
            case "claro":
                cargofijo = 30000;
                costominutos = 100;
                paquetes = 18000;
                break;
            case "movistar":
                cargofijo = 40000;
                costominutos = 250;
                paquetes = 8000;
                break;
            default:
                throw new IllegalArgumentException("Operador no valido");
        }
        if(!quierepaquetes){
            paquetes = 0;
        }
    }
    public int precio(){
        return cargofijo + costominutos*cantidad + paquetes;
    }
}

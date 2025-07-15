package EjerciciosSeguimiento1.CeluMovil;

public class Celumovil {
    public String operador;
    public int cargofijo;
    public int minutos;
    public int paquetes;
    public int cantidad;

    public int verificar (){
        switch (operador){
            case "Tigo":
                cargofijo = 45000;
                minutos = 200;
                paquetes = 12000;
                break;
            case "Claro":
                cargofijo = 30000;
                minutos = 100;
                paquetes = 18000;
                break;
            case "Movistar":
                cargofijo = 40000;
                minutos = 250;
                paquetes = 8000;
                break;
        }
        return 0;
    }
    public int precio(){
        return cargofijo + minutos*cantidad + paquetes;
    }
}

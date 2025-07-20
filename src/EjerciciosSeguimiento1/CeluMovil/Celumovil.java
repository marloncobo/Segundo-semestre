package EjerciciosSeguimiento1.CeluMovil;

public class Celumovil {
    public String operador;
    public int cargofijo;
    public int minutos;
    public int paquetes;
    public int cantidad;

    public int verificar (){
        switch (operador.toLowerCase()){
            case "tigo":
                cargofijo = 45000;
                minutos = 200;
                paquetes = 12000;
                break;
            case "claro":
                cargofijo = 30000;
                minutos = 100;
                paquetes = 18000;
                break;
            case "movistar":
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

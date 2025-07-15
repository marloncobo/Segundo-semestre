package EjerciciosSeguimiento1.Gym;

public class Gym {
    public int dias;
    public int precio(){
        switch (dias){
            case 15:
                return 18000;
            case 30:
                return 35000;
            case 90:
                return 86000;
        }
        return 0;
    }
}

package EjerciciosSeguimiento1.AyudaAlcaldia;

import java.util.Objects;

public class AyudaAlcaldia {
    public String genero;
    public int edad;
    public int verificar() {
        switch (genero) {
            case "femenino":
                if (edad >= 30 && edad <= 50) {
                    return 100000;
                }
                if (edad > 50) {
                    return 120000;
                }
                break;
            case "masculino":
                return 40000;
            default:
                return 0;
        }
        return 0;
    }
}

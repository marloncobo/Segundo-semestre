package Seg1concontructor.EjerciciosSeguimiento1.AyudaAlcaldia;

public class AyudaAlcaldia {
    public String genero;
    public int edad;
    public int ayuda = 0;
    AyudaAlcaldia(String genero, int edad) {
            this.genero = genero.toLowerCase();
            this.edad = edad;
            switch (this.genero) {
                case "femenino":
                    if (edad >= 30 && edad <= 50) {
                        ayuda = 100000;
                    }
                    if (edad > 50) {
                        ayuda = 120000;
                    }
                    break;
                case "masculino":
                    ayuda = 40000;
                    break;
                default:
                    throw new IllegalArgumentException("Genero no valido");
            }
    }
}

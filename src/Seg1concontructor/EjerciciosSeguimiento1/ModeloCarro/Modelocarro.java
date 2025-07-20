package Seg1concontructor.EjerciciosSeguimiento1.ModeloCarro;

public class Modelocarro {
    public int modelo;

    Modelocarro(int modelo){
        if (modelo != 119 && modelo != 179 && modelo != 189 && modelo != 195 && modelo != 221 && modelo != 780){
            System.out.println("Su automóvil no está defectuoso");
        }else {
            this.modelo = modelo;
            System.out.println("el automóvil esta defectuoso, llevar a garantía");
        }
    }
}

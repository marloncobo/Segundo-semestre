package EjerciciosSeguimiento1.ModeloCarro;

import java.lang.reflect.Array;

public class Modelocarro {
    public int modelo;
    public String verificar(){
        if (modelo != 119 && modelo != 179 && modelo != 189 && modelo != 195 && modelo != 221 && modelo != 780){
            return "Su automóvil no está defectuoso";
        }else {
            return "el automóvil esta defectuoso, llevar a garantía";
        }
    }
}

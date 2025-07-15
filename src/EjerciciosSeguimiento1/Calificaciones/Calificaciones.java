package EjerciciosSeguimiento1.Calificaciones;

public class Calificaciones {
    public int fisica,biologia,quimica,matematicas,informatica;

    public boolean verificar(){
        if (this.fisica < 0 || this.fisica > 10 ||
        this.biologia < 0 || this.biologia > 10 ||
        this.quimica < 0 || this.quimica > 10 ||
        this.matematicas < 0 || this.matematicas > 10 ||
        this.informatica < 0 || this.informatica > 10) {
            return false;
        }
        return true;
    }
    public int promedio (){
        return (fisica+biologia+quimica+matematicas+informatica)/5;
    }
}

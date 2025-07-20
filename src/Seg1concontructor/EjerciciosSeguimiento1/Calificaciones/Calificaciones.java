package Seg1concontructor.EjerciciosSeguimiento1.Calificaciones;

public class Calificaciones {
    public int fisica,biologia,quimica,matematicas,informatica;
    public int promedio;
    Calificaciones(int fisica, int biologia,int quimica, int matematicas, int informatica){
        if (fisica < 0 || fisica > 10 ||
                biologia < 0 || biologia > 10 ||
                quimica < 0 || quimica > 10 ||
                matematicas < 0 || matematicas > 10 ||
                informatica < 0 || informatica > 10) {
            throw new IllegalArgumentException("Ingrese un número valido entre 0-10");
        }
        this.fisica = fisica;
        this.biologia = biologia;
        this.informatica = informatica;
        this.matematicas = matematicas;
        this.quimica = quimica;
        promedio = promedio();
    }

    public int promedio (){
        return (fisica+biologia+quimica+matematicas+informatica)/5;
    }
}

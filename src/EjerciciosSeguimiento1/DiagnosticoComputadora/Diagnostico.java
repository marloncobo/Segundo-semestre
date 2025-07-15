package EjerciciosSeguimiento1.DiagnosticoComputadora;

public class Diagnostico {
    public boolean pitido;
    public boolean disco;

    public String verificar(){
        if (pitido && disco){
            return "Póngase en contacto con el técnico apoyo";
        } else if (pitido && !disco) {
            return "Verificar contactos de la unidad";
        } else if (!pitido && disco) {
            return "Compruebe las conexiones de altavoces";
        } else if (!pitido && !disco) {
            return "Traiga la computadora para repararla en la central";
        }
        return "Opcion no valida";
    }
}

package EjercicioOcho;

public class Nodo {

    private Persona persona;

    private Nodo nodoSiguiente;

    private Nodo nodoAnterio;

    public Nodo(Persona persona) {
        this.persona=persona;
        this.nodoSiguiente = null;
        this.nodoAnterio = null;

    }




    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public Nodo getNodoAnterio() {
        return nodoAnterio;
    }

    public void setNodoAnterio(Nodo nodoAnterio) {
        this.nodoAnterio = nodoAnterio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}

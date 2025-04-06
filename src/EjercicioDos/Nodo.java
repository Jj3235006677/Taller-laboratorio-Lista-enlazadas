package EjercicioDos;

public class Nodo {

    private Persona persona;
    private Nodo nodo;

    public Nodo(Persona persona) {
        this.persona = persona;
        this.nodo = null;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
}

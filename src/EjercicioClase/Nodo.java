package EjercicioClase;

public class Nodo <T>{

    private T valor;
    private Nodo nodo;

    public Nodo(T valor) {
        this.valor = valor;
        this.nodo=null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
}

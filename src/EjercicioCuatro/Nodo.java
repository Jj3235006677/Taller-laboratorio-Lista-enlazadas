package EjercicioCuatro;

public class Nodo {
    private int valor;
    private Nodo nodo;

    public Nodo(int valor) {
        this.valor = valor;
        this.nodo=null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "valor=" + valor +
                '}';
    }
}

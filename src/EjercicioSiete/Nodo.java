package EjercicioSiete;

public class Nodo {
    private int valor;
    private Nodo nodoSiguiente;
    private Nodo nodoAnterior;


    public Nodo(int valor ) {
        this.valor = valor;
        this.nodoSiguiente = null;
        this.nodoAnterior = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public Nodo getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(Nodo nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "valor=" + valor +
                '}';
    }
}

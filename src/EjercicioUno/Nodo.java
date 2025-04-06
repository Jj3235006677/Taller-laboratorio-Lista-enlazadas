package EjercicioUno;

public class Nodo {
    int valor;
    Nodo nodo;

    public Nodo(int valore) {
        this.valor = valore;
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
}

package EjercicioOnce;

public class Nodo {
    private int termino;
    private int exponente;
    private Nodo nodo;

    public Nodo(int termino, int exponente) {
        this.termino = termino;
        this.exponente = exponente;
        this.nodo=null;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

    public int getTermino() {
        return termino;
    }

    public void setTermino(int termino) {
        this.termino = termino;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "termino=" + termino +
                ", exponente=" + exponente +
                '}';
    }
}

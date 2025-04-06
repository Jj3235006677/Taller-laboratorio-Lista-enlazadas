package EjercicioClase;

public class Cola <T>{
    private int tamaño;
    private Nodo<T> frente;
    private Nodo<T> fin;


    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    public void agregar(T valor){
        Nodo nodoNuevo=new Nodo<>(valor);
        if(tamaño==0){
            frente=nodoNuevo;
            fin=nodoNuevo;
            tamaño++;
        }else{
            fin.setNodo(nodoNuevo);
            fin=nodoNuevo;
            tamaño++;
        }
    }

    public Cola<T> clonarCola(){
        Cola<T> colaClonada=new Cola<>();
        Nodo nodoArrnaque=frente;

        while (nodoArrnaque!=null){
            T valor= (T) nodoArrnaque.getValor();
            colaClonada.agregar(valor);
        }
        return colaClonada;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public T desencolar(){
        if(tamaño==0){
            throw new RuntimeException("error cola vacia");
        }else{
            Nodo nodoRecuperado=frente;
            frente=frente.getNodo();
            if(frente==null){
                fin=null;
            }
            tamaño--;
            return (T) nodoRecuperado.getValor();
        }
    }

    public void imiprimirCola(){
        Nodo nodoArranque=frente;
        while (nodoArranque!=null){
            System.out.println(nodoArranque.getValor());
            nodoArranque=nodoArranque.getNodo();
        }
    }

    public Nodo<T> getFrente() {
        return frente;
    }

    public void setFrente(Nodo<T> frente) {
        this.frente = frente;
    }

    public Nodo<T> getFin() {
        return fin;
    }

    public void setFin(Nodo<T> fin) {
        this.fin = fin;
    }
}

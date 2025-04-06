package EjercicioSiete;

import java.util.Iterator;

public class ListaEnlazada implements Iterable<Nodo> {

    private int tamaño;
    private Nodo nodoPrimero;


    @Override
    public Iterator<Nodo> iterator() {
        return new IteradorListaDobleEnlazada(this);
    }

    public void agregar(int valor){
        Nodo nodoNuevo=new Nodo(valor);
        if(tamaño==0){
            nodoPrimero=nodoNuevo;
        }else{
            Nodo nodoArranque=nodoPrimero;
            while (nodoArranque.getNodoSiguiente()!=null){
                nodoArranque=nodoArranque.getNodoSiguiente();
            }
            nodoArranque.setNodoSiguiente(nodoNuevo);
            nodoNuevo.setNodoAnterior(nodoArranque);
        }
        tamaño++;
    }

    public ListaEnlazada() {
        this.tamaño = 0;
        this.nodoPrimero=null;
    }



    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Nodo getNodoPrimero() {
        return nodoPrimero;
    }

    public void setNodoPrimero(Nodo nodoPrimero) {
        this.nodoPrimero = nodoPrimero;
    }


}

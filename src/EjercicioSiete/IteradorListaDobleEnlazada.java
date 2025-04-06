package EjercicioSiete;

import java.util.Iterator;

public class IteradorListaDobleEnlazada implements Iterator<Nodo> {
    private int indice;
    private Nodo nodoInicio;

    public IteradorListaDobleEnlazada(ListaEnlazada lista) {
        this.indice = 0;
        this.nodoInicio = lista.getNodoPrimero();
    }

    @Override
    public boolean hasNext() {
        return nodoInicio!=null;
    }

    @Override
    public Nodo next() {
      if(!hasNext()){
          throw new RuntimeException("Fin de la lista");
      }
      Nodo nodoRecuperado=nodoInicio;
      nodoInicio=nodoInicio.getNodoSiguiente();
      indice++;
      return nodoRecuperado;

    }
}

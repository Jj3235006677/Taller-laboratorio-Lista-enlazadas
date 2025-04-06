package EjercicioDiez;


public class UnionLIsta {

    public UnionLIsta() {
    }

    public ListaEnlazada unirListas(ListaEnlazada listaUno, ListaEnlazada listaDos){

       ListaEnlazada listaNueva=new ListaEnlazada();

       listaNueva.setNodoPrimero(listaUno.getNodoPrimero());

       Nodo nodoArranque=listaNueva.getNodoPrimero();

       while (nodoArranque.getNodo()!=null){

           nodoArranque=nodoArranque.getNodo();
       }
       nodoArranque.setNodo(listaDos.getNodoPrimero());

       return listaNueva;
    }
}

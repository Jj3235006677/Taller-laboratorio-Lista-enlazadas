package EjercicioSeis;

public class ListaEnlazada {
    private int tamaño;
    private Nodo nodoPrimero;

    public ListaEnlazada() {
        this.tamaño = 0;
        this.nodoPrimero = null;
    }

    public void agregar(int valor){
        Nodo nodoNuevo=new Nodo(valor);
        if(tamaño==0){
            nodoPrimero=nodoNuevo;

            tamaño++;
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

    public void imprimirListaInversa(){
        Nodo nodoArranque=nodoPrimero;
        Nodo nodoReferencia=null;

        System.out.println("Lista impresa inversamente");

        while (nodoArranque!=null){
            if(nodoArranque.getNodoSiguiente()==null){
                nodoReferencia=nodoArranque;
            }
            nodoArranque=nodoArranque.getNodoSiguiente();
        }

        while (nodoReferencia!=null){
            System.out.println(nodoReferencia.getValor());
            nodoReferencia=nodoReferencia.getNodoAnterior();
        }
    }

    public void imprimirLista(){
        Nodo nodoArranque=nodoPrimero;
        System.out.println("Lista impresa normal");
        while (nodoArranque!=null){
            System.out.println(nodoArranque.getValor());
            nodoArranque=nodoArranque.getNodoSiguiente();
        }
    }
}

package EjerciciCinco;

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
            while (nodoArranque.getNodo()!=null){
                nodoArranque=nodoArranque.getNodo();
            }
            nodoArranque.setNodo(nodoNuevo);
            tamaño++;
        }
    }

    public int cantidadRepetidos(int valorBuscar){
        Nodo nodoArranque=nodoPrimero;
        int contador=0;

        while (nodoArranque!=null){
            if(nodoArranque.getValor()==valorBuscar){
                contador++;

            }
            nodoArranque=nodoArranque.getNodo();
        }
        System.out.println("Numero de veces que se repite el numero es =");
        return contador;
    }

    public void imprimirLista(){
        Nodo nodoArranque=nodoPrimero;
        System.out.println("lista impresa");
        while (nodoArranque!=null){
            System.out.println(nodoArranque.getValor());
            nodoArranque=nodoArranque.getNodo();
        }
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


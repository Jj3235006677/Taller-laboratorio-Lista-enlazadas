package EjercicioTres;

public class ListaEnlazada {

    private int tamaño;
    private Nodo nodoPrimero;

    public ListaEnlazada( ) {
        this.tamaño = 0;
        this.nodoPrimero =null;
    }

    public void agregarNumero(int valor){

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
    public void eliminarPares() {
        while (nodoPrimero != null && nodoPrimero.getValor() % 2 == 0) {
            nodoPrimero = nodoPrimero.getNodo();
            tamaño--;
        }

        if (nodoPrimero == null) {
            return;
        }

        Nodo nodoArranque = nodoPrimero;

        while (nodoArranque != null && nodoArranque.getNodo() != null) {
            if (nodoArranque.getNodo().getValor() % 2 == 0) {
                nodoArranque.setNodo(nodoArranque.getNodo().getNodo());
                tamaño--;
            } else {
                nodoArranque = nodoArranque.getNodo();
            }
        }
    }


    public void imprimirLista(){
        Nodo arranque=nodoPrimero;

        while (arranque!=null){
            System.out.println(arranque.getValor());
            arranque=arranque.getNodo();

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

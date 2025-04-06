package EjercicioUno;

public class ListaEnlazadaSimple {

    private int tamaño;
    private Nodo nodoPrimero;

    public ListaEnlazadaSimple() {

        this.tamaño =0;
    }

    public void agregarNumero(int numero){
        Nodo nodoNuevo=new Nodo(numero);


        if(tamaño==0){
            nodoPrimero=nodoNuevo;
        }else{
            Nodo nodoArranque=nodoPrimero;
            while (nodoArranque.getNodo()!=null){
                nodoArranque=nodoArranque.getNodo();
            }
            nodoArranque.setNodo(nodoNuevo);

        }
        tamaño++;

    }

    public void obtenerNumeroPosicionPares(){
        int indice =0;

        Nodo nodoArranque=nodoPrimero;
        while (nodoArranque!=null){

            if(indice%2 != 0){
                System.out.println("valor "+nodoArranque.getValor());
                System.out.println("indice "+ indice);
                System.out.println("-------------------------------------------------------------------------------");
            }
            indice++;
            nodoArranque=nodoArranque.getNodo();


        }


    }
}

package EjercicioCuatro;

public class ListaEnlazada {

    private int tamaño;
    private Nodo nodoPrimero;

    public ListaEnlazada() {
        this.tamaño = 0;
        this.nodoPrimero =null;
    }

    public void agregarElemento(int elemento){

        Nodo nodoNuevo=new Nodo(elemento);

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

        public ListaEnlazada valoresImpares(){

            Nodo nodoArranque=nodoPrimero;

            ListaEnlazada valoresImpares=new ListaEnlazada();

            while (nodoArranque!=null){

                if(nodoArranque.getValor()%2!=0){

                    valoresImpares.agregarElemento(nodoArranque.getValor());
                }

                nodoArranque=nodoArranque.getNodo();
            }
            return valoresImpares;
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

    public void imprimirlista(Nodo nodoInicio){
        while (nodoInicio!=null){

            System.out.println(nodoInicio.getValor());
            nodoInicio=nodoInicio.getNodo();
        }
        }


}


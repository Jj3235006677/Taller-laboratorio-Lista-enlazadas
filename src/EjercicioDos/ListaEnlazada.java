package EjercicioDos;

public class ListaEnlazada {

    private int tamaño;
    private Nodo nodoPrimero;

    public ListaEnlazada() {
        this.tamaño = 0;
        this.nodoPrimero = null;
    }

    public void agregarPersona(Persona persona){
        Nodo nodoNuevo=new Nodo(persona);
        if(tamaño==0){
            tamaño++;
            nodoPrimero=nodoNuevo;
        }else{
            Nodo nodoArranque=nodoPrimero;

            while (nodoArranque.getNodo()!=null){

                nodoArranque=nodoArranque.getNodo();

            }
            nodoArranque.setNodo(nodoNuevo);
            tamaño++;
        }
    }

    public ListaEnlazada cedulaNumerosPares(){


        Nodo nodoArranque=nodoPrimero;
        ListaEnlazada listaPar=new ListaEnlazada();

        while (nodoArranque!=null){

            if(calcularCifras(nodoArranque.getPersona().getCedula()) %2==0){
                listaPar.agregarPersona(nodoArranque.getPersona());

            }
            nodoArranque=nodoArranque.getNodo();

        }
        return listaPar;
    }



    public int calcularCifras(int valor){
        int numDigitos=0;

        if(valor==0){
            return 1;
        }

        int numeroModificado=valor;

        while (numeroModificado>0){
              numeroModificado= numeroModificado/10 ;
              numDigitos++;
        }
        return numDigitos;

    }

    public void imprimirLista(Nodo nodoInicio){
        Nodo nodoArranque=nodoInicio;

        while (nodoArranque!=null){
            System.out.println(nodoArranque.getPersona());
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

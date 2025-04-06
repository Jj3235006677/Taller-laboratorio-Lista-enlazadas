package EjercicioOcho;

public class ListaEnlazada {

    private int tamaño;
    private Nodo nodoPrimero;

    public ListaEnlazada() {
        this.tamaño = tamaño;
        this.nodoPrimero=null;
    }

    public void agregar(Persona persona){
        Nodo nodoNuevo=new Nodo(persona);

        if(tamaño==0){
            nodoPrimero=nodoNuevo;
        }else {
            Nodo nodoArranque=nodoPrimero;
            while (nodoArranque.getNodoSiguiente()!=null){
                nodoArranque=nodoArranque.getNodoSiguiente();
            }
            nodoArranque.setNodoSiguiente(nodoNuevo);
            nodoNuevo.setNodoAnterio(nodoArranque);
        }
        tamaño++;
    }

    public ListaEnlazada listaCedulaPar(){

        Nodo nodoArraque=nodoPrimero;
        ListaEnlazada listaNuevaPar=new ListaEnlazada();

        while (nodoArraque!=null){
            if(cantidadDigitos(nodoArraque.getPersona().getCedula())%2==0){
                listaNuevaPar.agregar(nodoArraque.getPersona());
            }
            nodoArraque=nodoArraque.getNodoSiguiente();

        }
        return listaNuevaPar;
    }

    public int cantidadDigitos(int valor){


        int contador=0;

        if(valor==0){
            return 1;
        }else{
        int valorRecuperado=valor;

        while (valorRecuperado>0) {
            valorRecuperado = valorRecuperado / 10;
            contador++;
        }
        }
        return contador;
    }
    public void imprimirLista(){
        Nodo nodoArranque=nodoPrimero;
        while (nodoArranque!=null){
            System.out.println(nodoArranque.getPersona());
            nodoArranque=nodoArranque.getNodoSiguiente();
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

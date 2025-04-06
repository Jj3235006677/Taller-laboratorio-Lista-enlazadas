package EjercicioNueve;

public class ListaEnlazada {
    private int tamaño;
    private Nodo nodoPrimero;
    private Nodo nodoUltimo;


    public ListaEnlazada() {
        this.tamaño = tamaño;
        this.nodoPrimero=null;
        this.nodoUltimo=null;
    }

    public void agregar(Persona persona){
        Nodo nodoNuevo=new Nodo(persona);
        if(tamaño==0){
            nodoPrimero=nodoNuevo;
            nodoUltimo=nodoNuevo;
            tamaño++;
        }else{
            nodoUltimo.setNodo(nodoNuevo);
            nodoUltimo=nodoNuevo;
            tamaño++;
    }
    }

    public Persona buscar(String valorCedula) {
        Nodo nodoArranque = nodoPrimero;

        Persona personaRecuperada = null;

        if (nodoPrimero == null) {
            return null;
        }

        if (nodoArranque.getPersona().getCedula().equals(valorCedula)) {
            return nodoArranque.getPersona();
        }

        nodoArranque = nodoArranque.getNodo();

        while (nodoArranque != null ) {
            if (nodoArranque.getPersona().getCedula().equals(valorCedula)) {
                personaRecuperada = nodoArranque.getPersona();
                return personaRecuperada;
            }
            nodoArranque = nodoArranque.getNodo();
        }

        return personaRecuperada;
    }

    public void imprimirLista(){
        Nodo nodoArranque=nodoPrimero;
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

    public Nodo getNodoUltimo() {
        return nodoUltimo;
    }

    public void setNodoUltimo(Nodo nodoUltimo) {
        this.nodoUltimo = nodoUltimo;
    }
}

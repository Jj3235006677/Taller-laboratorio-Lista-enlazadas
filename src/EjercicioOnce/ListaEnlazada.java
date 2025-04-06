package EjercicioOnce;

public class ListaEnlazada {
    private int tamaño;
    private Nodo nodoPrimero;

    public ListaEnlazada() {
        this.tamaño = 0;
        this.nodoPrimero = null;
    }

    public void agregarTermino(int termino,int exponente){
        Nodo nodoNuevo=new Nodo(termino,exponente);

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

    public float valorX(float valorX){
        float contador=0;
        Nodo nodoArranque=nodoPrimero;

        while (nodoArranque!=null){
            contador+=nodoArranque.getTermino()*(potencia(valorX,nodoArranque.getExponente()));
            nodoArranque=nodoArranque.getNodo();

        }
        return contador;
    }

    public float potencia(float valor, int exponente){
        float contador=1;
        for(int i=0;i<exponente;i++){
            contador=contador*valor;
        }
        return contador;
    }

    public void imprimirLista(){
        Nodo nodoArranque=nodoPrimero;
        while (nodoArranque!=null){
            System.out.println(nodoArranque);
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

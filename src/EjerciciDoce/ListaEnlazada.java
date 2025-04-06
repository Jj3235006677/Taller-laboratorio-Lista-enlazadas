package EjerciciDoce;

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

    public float calcularMedia(){

        if(tamaño==0){
            return 0;
        }
        Nodo nodoArranque=nodoPrimero;

        float contador=0;

        while (nodoArranque!=null){

            contador+=nodoArranque.getValor();

            nodoArranque=nodoArranque.getNodo();
        }
        return contador/tamaño;
    }

    public void imprimirlista(){
        Nodo nodoArranque=nodoPrimero;
        while (nodoArranque!=null){
            System.out.println(nodoArranque.getValor());
            nodoArranque=nodoArranque.getNodo();
        }
    }




    public double calcularDesviacionEstandar(){

        float media=calcularMedia();

        double contador=0;

        Nodo nodoArranque=nodoPrimero;

        while (nodoArranque!=null){

            contador+=(nodoArranque.getValor()-media)*(nodoArranque.getValor()-media);

            nodoArranque=nodoArranque.getNodo();
        }


        double resultado=contador/(tamaño-1);

        resultado=Math.sqrt(resultado);

        return resultado;
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

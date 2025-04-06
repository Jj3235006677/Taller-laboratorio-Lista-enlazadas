package EjercicioTrece;



public class Lista {
     NodoLista inicio;



    public Lista() {
        this.inicio = null;
    }

    public void agregar(int valor){
        NodoLista nodoNuevo=new NodoLista(valor,null);

        if(inicio==null){
            inicio=nodoNuevo;
        }else{
            NodoLista nodoArranque=inicio;
            while (nodoArranque.sig !=null){
                nodoArranque=nodoArranque.sig;
            }
            nodoArranque.sig=nodoNuevo;
        }
    }

    public int valorMaximo(int x){
        NodoLista nodoRecuperado=inicio;
        return calcularValor(nodoRecuperado, x, 0,0);
    }



    public void imprimirLista() {
        NodoLista nodoArranque = inicio;
        while (nodoArranque != null) {
            System.out.println(nodoArranque.dato);
            nodoArranque = nodoArranque.sig;
        }
    }



    public int calcularValor(NodoLista nodoLista, int x, int distancia, int distanciaMaxima) {
        if (nodoLista == null) {
            return distanciaMaxima;
        }

        if (nodoLista.dato == x) {
            if (distancia > distanciaMaxima) {
                distanciaMaxima = distancia;
            }
            distancia = 1;
        } else if(distancia>0) {
            distancia++;
        }

        return calcularValor(nodoLista.sig, x, distancia, distanciaMaxima);
    }







}

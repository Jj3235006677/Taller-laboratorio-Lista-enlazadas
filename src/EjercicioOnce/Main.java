package EjercicioOnce;

public class Main {
    public static void main(String[] args) {

        //12.Un polinomio se puede representar como una lista enlazada. El primer nodo de la lista representa el primer
        // término del polinomio, el segundo nodo al segundo término del polinomio y así sucesivamente.
        // Cada nodo tiene como campo dato el coeficiente del término y el exponente.



        ListaEnlazada lista=new ListaEnlazada();
        lista.agregarTermino(3,4);
        lista.agregarTermino(-4,2);
        lista.agregarTermino(11,0);


        lista.imprimirLista();

        System.out.println("El resultado de la formula es "+lista.valorX(0.5f));


    }
}
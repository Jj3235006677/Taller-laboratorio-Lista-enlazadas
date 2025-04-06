package EjercicioSiete;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        //7.Escribir el Iterador para una lista doblemente enlazada.

        ListaEnlazada lista=new ListaEnlazada();
        lista.agregar(5);
        lista.agregar(12);
        lista.agregar(8);
        lista.agregar(20);
        lista.agregar(3);
        lista.agregar(15);
        lista.agregar(9);
        lista.agregar(30);
        lista.agregar(6);
        lista.agregar(18);

        Iterator<Nodo> iterator=lista.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
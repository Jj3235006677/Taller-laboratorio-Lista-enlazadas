package EjerciciCinco;

public class Main {
    public static void main(String[] args) {

        //5. Escribir un método que retorne la cantidad de veces que se repite un valor en una lista enlazada.

        ListaEnlazada lista=new ListaEnlazada();
        lista.agregar(9);
        lista.agregar(4);
        lista.agregar(74);
        lista.agregar(43);
        lista.agregar(6);
        lista.agregar(12);
        lista.agregar(27);
        lista.agregar(9);
        lista.agregar(55);
        lista.agregar(18);

        lista.imprimirLista();

        System.out.println("---------------------------------------------");
        System.out.println("Cantidad veces que se repite un nuemro es ");

        System.out.println(lista.cantidadRepetidos(9));




    }
}
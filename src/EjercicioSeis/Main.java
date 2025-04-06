package EjercicioSeis;

public class Main {
    public static void main(String[] args) {

        //Escribir el método imprimirHaciaAtras() de una lista doblemente enlazada.

        ListaEnlazada lista=new ListaEnlazada();
        lista.agregar(3);
        lista.agregar(15);
        lista.agregar(8);
        lista.agregar(42);
        lista.agregar(23);
        lista.agregar(9);
        lista.agregar(31);
        lista.agregar(5);
        lista.agregar(77);
        lista.agregar(12);
        lista.imprimirLista();
        System.out.println("-------------------------------------------------");
        lista.imprimirListaInversa();

    }
}
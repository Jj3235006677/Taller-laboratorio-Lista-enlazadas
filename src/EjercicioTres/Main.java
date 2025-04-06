package EjercicioTres;

public class Main {
    public static void main(String[] args) {

        //3. Eliminar los números pares de una lista enlazada simple

        ListaEnlazada lista=new ListaEnlazada();
        lista.agregarNumero(1);
        lista.agregarNumero(2);
        lista.agregarNumero(3);
        lista.agregarNumero(4);
        lista.agregarNumero(5);
        lista.agregarNumero(6);
        lista.agregarNumero(7);
        lista.agregarNumero(8);
        lista.agregarNumero(9);
        lista.agregarNumero(10);
        System.out.println("Lista impresa original");
        lista.imprimirLista();

        System.out.println("Lista impresa con los numeros pares eliminados");


        lista.eliminarPares();
        lista.imprimirLista();


    }
}
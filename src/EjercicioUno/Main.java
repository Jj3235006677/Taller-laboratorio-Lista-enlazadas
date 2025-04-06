package EjercicioUno;

public class Main {
    public static void main(String[] args) {

        //1. Obtener los números de las posiciones impares de una lista enlazada simple de números



        ListaEnlazadaSimple lista=new ListaEnlazadaSimple();

        lista.agregarNumero(1);
        lista.agregarNumero(2);
        lista.agregarNumero(3);
        lista.agregarNumero(4);
        lista.agregarNumero(5);
        lista.agregarNumero(6);

        lista.obtenerNumeroPosicionPares();

    }
}
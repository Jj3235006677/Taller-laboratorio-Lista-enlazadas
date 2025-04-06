package EjercicioCuatro;

public class Main {
    public static void main(String[] args) {

        //Escribir un método que devuelva una lista enlazada con los valores
        // impares de una lista de números.
        ListaEnlazada lista=new ListaEnlazada();

        lista.agregarElemento(4);
        lista.agregarElemento(5);
        lista.agregarElemento(60);
        lista.agregarElemento(7);
        lista.agregarElemento(5);


        lista.imprimirlista(lista.getNodoPrimero());
        System.out.println("Lista impresa normal");



        System.out.println("---------------------------------------");
        System.out.println("Lista nueva con numeros impares");
        ListaEnlazada listaIimpares=lista.valoresImpares();
        lista.imprimirlista(listaIimpares.getNodoPrimero());

    }
}
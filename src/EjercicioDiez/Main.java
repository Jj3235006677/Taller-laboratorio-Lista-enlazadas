package EjercicioDiez;

public class Main {
    public static void main(String[] args) {

        //10.Escribir un método que permita “concatenar” dos listas enlazadas simples, el método debe recibir
        // como parámetro dos objetos de tipo Lista, unirlas y retornar una lista que contenga a ambas.

        ListaEnlazada listaUno=new ListaEnlazada();
        listaUno.agregar(1);
        listaUno.agregar(2);
        listaUno.agregar(3);
        listaUno.agregar(4);
        listaUno.agregar(5);
        System.out.println("lista uno Impresa");
        listaUno.imprimirLista();

        System.out.println("lista Dos Impresa");


        ListaEnlazada listaDos=new ListaEnlazada();
        listaDos.agregar(11);
        listaDos.agregar(12);
        listaDos.agregar(13);
        listaDos.agregar(14);
        listaDos.agregar(15);
        listaDos.imprimirLista();

        UnionLIsta union=new UnionLIsta();

        System.out.println("lista unida");

        ListaEnlazada listaUnida=union.unirListas(listaUno,listaDos);

        listaUnida.imprimirLista();



    }


}
package EjercicioOcho;

public class Main {
    public static void main(String[] args) {

        //8.Obtener la lista de personas tengan cédula con cantidad de elementos par de una
        // lista enlazada doble de personas.

        ListaEnlazada listaNormal=new ListaEnlazada();

        Persona persona1 = new Persona("Juan", 109);
        Persona persona7 = new Persona("Pedro", 109777);
        Persona persona2 = new Persona("Maria", 1092);
        Persona persona3 = new Persona("Carlos", 10933);
        Persona persona4 = new Persona("Ana", 10944);
        Persona persona5 = new Persona("Luis", 109555);
        Persona persona6 = new Persona("Elena", 10966);
        Persona persona8 = new Persona("Sofia", 1098888);
        Persona persona9 = new Persona("Miguel", 109999);
        Persona persona10 = new Persona("Laura", 110000);

        listaNormal.agregar(persona1);
        listaNormal.agregar(persona2);
        listaNormal.agregar(persona3);
        listaNormal.agregar(persona4);
        listaNormal.agregar(persona5);
        listaNormal.agregar(persona6);
        listaNormal.agregar(persona7);
        listaNormal.agregar(persona8);
        listaNormal.agregar(persona9);
        listaNormal.agregar(persona10);

        ListaEnlazada listaPar=listaNormal.listaCedulaPar();
        System.out.println("Lista normal");
        listaNormal.imprimirLista();
        System.out.println("------------------------------------------------------------------------");

        System.out.println("Lista con numeros cedulas impares");

        listaPar.imprimirLista();



    }
}
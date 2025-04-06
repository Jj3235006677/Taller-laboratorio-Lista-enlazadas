package EjercicioNueve;



public class Main {
    public static void main(String[] args) {
        //9. Escribir el método insertar y buscar de una lista circular.

        ListaEnlazada lista=new ListaEnlazada();
        System.out.println("elementos agregados");

        lista.imprimirLista();

        lista.agregar(new Persona("Juan", "1094883247"));
        lista.agregar(new Persona("Ana", "1023456789"));
        lista.agregar(new Persona("Carlos", "1034567890"));
        lista.agregar(new Persona("Luisa", "1045678901"));
        lista.agregar(new Persona("Pedro", "1056789012"));
        lista.agregar(new Persona("Sofía", "1067890123"));
        lista.agregar(new Persona("Andrés", "1078901234"));
        lista.agregar(new Persona("María", "1089012345"));
        lista.agregar(new Persona("Diego", "1100123456"));
        lista.agregar(new Persona("Valentina", "1111234567"));

        System.out.println("----------------------------------------------------");

        String valorBuscado="1089012344";
        System.out.println("Persona buscada con el numero de cedula "+valorBuscado);

        System.out.println("elementos buscado es "+lista.buscar(valorBuscado));










    }
}
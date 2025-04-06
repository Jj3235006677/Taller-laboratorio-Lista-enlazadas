package EjercicioDos;

public class Main {
    public static void main(String[] args) {

        //2. Obtener la lista de personas tengan cédula con cantidad de números par de
        // una lista enlazada simple de personas.

        ListaEnlazada lista=new ListaEnlazada();
        Persona persona1=new Persona("juan",12043);
        Persona persona2=new Persona("laura",1234546363);
        Persona persona3=new Persona("juanes",12345);
        Persona persona4=new Persona("lukas",123543);
        Persona persona5=new Persona("jose",12354356);

        lista.agregarPersona(persona1);
        lista.agregarPersona(persona2);
        lista.agregarPersona(persona3);
        lista.agregarPersona(persona4);
        lista.agregarPersona(persona5);


        lista.imprimirLista(lista.cedulaNumerosPares().getNodoPrimero());

    }
}
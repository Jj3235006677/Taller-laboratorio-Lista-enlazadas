package EjercicioTrece;

public class Main {
    public static void main(String[] args) {



        Lista lista=new Lista();

        lista.agregar(9);
        lista.agregar(4);
        lista.agregar(6);
        lista.agregar(8);
        lista.agregar(4);
        lista.agregar(5);
        lista.agregar(4);
        lista.agregar(4);

        lista.imprimirLista();
        int valorX=4;

        int resultado= lista.valorMaximo(valorX);

        System.out.println("La distancia maxima de x= "+valorX+" es "+ resultado);


    }
}
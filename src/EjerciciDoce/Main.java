package EjerciciDoce;

public class Main {
    public static void main(String[] args) {

        //Escriba un programa que calcule la media y la desviación estándar de un conjunto de N números reales.
        // Tenga en cuenta que:
        //Implementar una lista enlazada propia
        //Debe leer los n números reales de un archivo
        //Debe almacenar los N números reales en una lista enlazada para realizar los cálculos.

        ListaEnlazada lista=new ListaEnlazada();

        System.out.println("lista impresa");


        lista.agregar(50);
        lista.agregar(80);
        lista.agregar(3);
        lista.agregar(2);
        lista.agregar(4);




        lista.imprimirlista();


        float resultadoPromedio=lista.calcularMedia();
        double resultadoDesviacion=lista.calcularDesviacionEstandar();

        System.out.println("el resultado del promedio de la lista es de "+resultadoPromedio);
        System.out.println("El resultado de la desviacion estandar es igual a "+resultadoDesviacion);


    }
}
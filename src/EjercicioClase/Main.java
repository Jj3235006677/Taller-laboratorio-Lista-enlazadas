package EjercicioClase;

public class Main {
    public static void main(String[] args) {

        Cola cola=new Cola<>();
    }

    public static void imiprimir(Cola<String> cola) {
        Cola<String> colaCopia=cola;
     for(int i=0;i<colaCopia.getTamaño()-1;i++){

         String  nombre=colaCopia.desencolar();
         System.out.println(nombre);
         i--;
     }
    }


}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Ejemplos validos
        String nombre;
        int $edad;
        int primer_promedio;

        //Ejemplos no validos
        //int 1erpromedio;
        //int primer promedio;
        //int primer-promedio;

        //Estructuras de datos
        //listas
        //array / vector
        //set
        //mapas

        int arreglo[] = new int[10];

        String arregloNombres[] = new String[3];
        System.out.println(arregloNombres[0]);

        int[] arreglo3 = new int[10];
        System.out.println(arreglo3);

        //Asignacion de valores enteros a las pociciones del array
        arreglo3[0] = 32;

        for (int e : arreglo3) {
            System.out.println(e);
        }

        //uso de listas
        //declaracion de una lista de strings
        List<String> materias;
        //inicializacion
        materias = new ArrayList<>();

        //inicializacion doubles
        List<Double> calificaciones = new ArrayList<>();

        materias.add("Matematicas");
        materias.add("Literatura");

        calificaciones.add(2.3);
        calificaciones.add(6.3);
        calificaciones.add(3.4);
        calificaciones.add(12.45);

        for (Double e: calificaciones) {
            System.out.println(e);
        }
    }
}
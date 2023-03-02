import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        //Solicita 10 calificaiones para N  Alumnos (pedir al usuario el valor de N)
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos alumnos: ");
        int alumnosCant = sc.nextInt();

        List<List<Double>> alumnos = new ArrayList<>();
        List<Double> promedios = new ArrayList<>();
        for (int j = 0; j < alumnosCant; j++) {
            List<Double> calificaciones = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                calificaciones.add(Math.round((Math.random() * 10 + 1) * 10.0) / 10.0);
            }
            alumnos.add(calificaciones);
        }
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("Alumno: ");
            System.out.println(alumnos.get(i));
        }

        //1.- mostrar el promedio de cada alumno
        for (int i = 0; i < alumnosCant; i++) {
            Double promedioAlumno = promedio(alumnos.get(i));
            promedios.add(promedioAlumno);
            System.out.println("Promedio del alumno "+promedioAlumno);
        }

        //2.- mostrar el promedio grupal
        Double promedioGrupal = 0.0;
        for (int i = 0; i < alumnosCant; i++) {
            promedioGrupal += promedio(alumnos.get(i));
        }
        System.out.println("El promedio grupal es: "+(promedioGrupal/alumnosCant));

        /////////Operaciones para determinar si es correcto
        int aprobados = 0;
        int reprobados = 0;
        for (int i = 0; i < alumnosCant; i++) {
            Boolean verdad = aprobado(promedios.get(i));
            if(verdad){
                aprobados ++;
            }else{
                reprobados ++;
            }
        }


        //3.- mostrar el numero de alumnos aprobados
        System.out.println("Aprobados "+aprobados);
        //4.- mostrar el  numero de alumnos reprobados
        System.out.println("Reprobados "+reprobados);
    }


    static public double promedio(List<Double> calificaciones) {
        double promedio = 0;

        for (int i = 0; i < calificaciones.size(); i++) {
            promedio += calificaciones.get(i);
        }
        return promedio / calificaciones.size();
    }
    static public boolean aprobado(double promedio) {
        if (promedio >= 6) {
            return true;
        } else {
            return false;
        }
    }
}

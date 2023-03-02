import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        //Solicita 10 calificaiones para N  Alumnos (pedir al usuario el valor de N)
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos alumnos: ");
        int alumnosCant = sc.nextInt();

        double alumnos[][] = new double[alumnosCant][10];
        double promedios[] = new double[alumnosCant];

        for (int j = 0; j < alumnosCant; j++) {
            for (int i = 0; i < 10; i++) {
                alumnos[j][i] = Math.round((Math.random() * 10 + 1) * 10.0) / 10.0;
            }
        }

        for (int i = 0; i < alumnosCant; i++) {
            System.out.println("Calificaciones del alumno "+(i+1) +" son ");
            for (int j = 0; j < 10; j++) {
                System.out.print(alumnos[i][j]+", ");
            }
            System.out.println();
        }

        //Una vez capturado las 10 calificaciones de cada alumno llamar a las funciones
        //previamente creadas para

        //1.- mostrar el promedio de cada alumno
        for (int i = 0; i < alumnosCant; i++) {
            promedios[i] = promedio(alumnos[i]);
            System.out.println("Promedio del alumno "+(i+1)+" "+promedios[i]);
        }
        //2.- mostrar el promedio grupal
        double promedioGrupal = 0;
        for (int i = 0; i < alumnosCant; i++) {
            promedioGrupal += promedio(alumnos[i]);
        }
        System.out.println("El promedio grupal es: "+(promedioGrupal/alumnosCant));
        /////////Operaciones para determinar si es correcto
        int aprobados = 0;
        int reprobados = 0;
        for (int i = 0; i < alumnosCant; i++) {
            if(aprobado(promedios[i])){
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

    //Funcion que recibe como argumento un arreglo
    //de calificaciones y regresa como resultado el promedio
    //de las calificaciones
    static public double promedio(double calificaciones[]) {
        double promedio = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            promedio += calificaciones[i];
        }
        return promedio / calificaciones.length;
    }

    //Funcion que recibe como argumento el promedio
    //de un alumno y regresa un true cuando el promedio
    //sea aprobatorio y false cuando el promedio sea reprobatorio
    static public boolean aprobado(double promedio) {
        if (promedio >= 6) {
            return true;
        } else {
            return false;
        }
    }
}

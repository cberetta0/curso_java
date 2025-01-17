import java.util.Scanner;

public class KEjemploArregloNotasAlumnos {
    public static void main(String[] args) { //en la terminal ingresar los numeros con coma, no punto

        //calcular promedio de notas de 3 clases distintas para 7 alumnos

        double[] claseMatematica, clasHistoria, claseLenguaje;
        double sumNotasMatematica = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematica = new double[7];
        clasHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para matematicas:");
        for (int i = 0; i < claseMatematica.length; i++) {
            claseMatematica[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia:");
        for (int i = 0; i < clasHistoria.length; i++) {
            clasHistoria[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje:");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = scanner.nextDouble();
        }

        //calcular el promedio
        for (int i = 0; i < 7; i++) {
            sumNotasMatematica += claseMatematica[i];
            sumNotasHistoria += clasHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematica = sumNotasMatematica/claseMatematica.length;
        double promedioHistoria = sumNotasHistoria/clasHistoria.length;
        double promedioLenguaje = sumNotasLenguaje/claseLenguaje.length;

        System.out.println("Promedio clase matematicas: " + promedioMatematica);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);
        System.out.println("Promedio total del curso: " + (promedioMatematica + promedioHistoria + promedioLenguaje)/3);

        System.out.println("Ingrese el identificador del alumno (0-6):");

        int id = scanner.nextInt();
        double promedioAlumno = (claseMatematica[id] + clasHistoria[id] + claseLenguaje[id])/3;

        System.out.println("Promedio alumno nro " + id + ": " + promedioAlumno);
    }
}

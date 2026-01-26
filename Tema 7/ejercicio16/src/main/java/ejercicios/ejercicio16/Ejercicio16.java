/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio16;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Física"};
        double[][] notas = new double[6][4];

        int opcion;
        do {
        mostrarMenu();
        opcion = entrada.nextInt();

        switch (opcion) {
        case 1:
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Introduce las notas de " + alumnos[i] + ":");
            for (int j = 0; j < asignaturas.length; j++) {
            System.out.print(asignaturas[j] + ": ");
            notas[i][j] = entrada.nextDouble();
            }
        }
        break;
        case 2:
        mostrarNotas(notas);
        break;
        case 3:
        mostrarMejorAlumno(notas);
        break;
        case 4:
        mostrarAlumnoSuspensos(notas);
        break;
        case 5:
        mostrarAsignaturaMasDificil(notas);
        break;
        case 6:
        System.out.println("Saliendo del programa...");
        break;
        default:
        System.out.println("Opción no válida.");
        }

    } while (opcion != 6);
}

    //Método que muestra el menú
    public static void mostrarMenu() {
        System.out.println("--- MENÚ DE NOTAS ---");
        System.out.println("1. Rellenar notas de los alumnos");    
        System.out.println("2. Mostrar todas las notas");    
        System.out.println("3. Mostrar la media");    
        System.out.println("4. Mostrar el alumno con más suspensos");    
        System.out.println("5. Mostrar la asignatura más difícil (media más baja)");    
        System.out.println("6. Salir");
}

    //Método que muestra las notas
    public static void mostrarNotas(double[][] notas ) {
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Física"};;
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};;
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Notas de " + alumnos[i] + ":");
            for (int j = 0; j < asignaturas.length; j++) {
                double redondeada = Math.round(notas[i][j] * 100.0) / 100.0;
                System.out.println("  " + asignaturas[j] + ": " + redondeada);
            }
        }
    }

    //Método que muestra el mejor alumno sumando las notas y dividiendolas entre las asigntauras
    public static void mostrarMejorAlumno(double[][] notas) {
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        double mejorMedia = -1;
        int indiceMejor = -1;

        for (int i = 0; i < alumnos.length; i++) {
            double suma = 0;
            for (double nota : notas[i]) {
                suma += nota;
            }
            double media = suma / notas[i].length;
            if (media > mejorMedia) {
                mejorMedia = media;
                indiceMejor = i;
            }
        }double redondeada = Math.round(mejorMedia);
        System.out.println("El mejor alumno es " + alumnos[indiceMejor] + " con una media de " + redondeada);
    }

    //Método que cuenta el número de notas por debajo de 5
    public static void mostrarAlumnoSuspensos(double[][] notas) {
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        int maxSuspensos = -1;
        int indice = -1;

        for (int i = 0; i < alumnos.length; i++) {
            int suspensos = 0;
            for (double nota : notas[i]) {
                if (nota < 5) {
                    suspensos++;
                }
            }
            if (suspensos > maxSuspensos) {
                maxSuspensos = suspensos;
                indice = i;
            }
        }

        System.out.println("El alumno con más suspensos es " + alumnos[indice] + " (" + maxSuspensos + " suspensos)");
    }
    //Métodoc que calcula la media de cada asignatura sumando las notas de todos los alumnos
    public static void mostrarAsignaturaMasDificil(double[][] notas) {
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Física"};
        double[] medias = new double[asignaturas.length];

        for (int j = 0; j < asignaturas.length; j++) {
            double suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            medias[j] = suma / notas.length;
        }
        int indiceMin = 0;
        for (int j = 1; j < medias.length; j++) {
            if (medias[j] < medias[indiceMin]) {
                indiceMin = j;
            }
        }

        double redondeada = Math.round(medias[indiceMin]);
        System.out.println("La asignatura más difícil es " + asignaturas[indiceMin] + " con una media de " + redondeada);
    }
}


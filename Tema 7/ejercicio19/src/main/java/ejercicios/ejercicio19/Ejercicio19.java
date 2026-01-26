/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio19;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {
    
    //Método que rellena el array
    public static void rellenarArray(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 71) + 10;
        }
    }
    
    //Método que muestra el Array
    public static void mostrarArray(int[] vector) {
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //Método que obtiene el numero mayor
    public static int obtenerMayor(int[] vector) {
        int mayor = vector[0];
        for (int num : vector) {
            if (num > mayor) mayor = num;
        }
        return mayor;
    }

    //Método que obtiene el número menor
    public static int obtenerMenor(int[] vector) {
        int menor = vector[0];
        for (int num : vector) {
            if (num < menor) menor = num;
        }
        return menor;
    }

    //Método que obtiene la media
    public static double obtenerMedia(int[] vector) {
        int suma = 0;
        for (int num : vector) {
            suma += num;
        }
        return (double)suma / vector.length;
    }

    //Método que obtiene el número más repetido
    public static int obtenerMasRepetido(int[] vector) {
        int[] frecuencia = new int[81]; // índice 10 a 80
        for (int num : vector) {
            frecuencia[num]++;
        }

        int maxRepeticiones = 0;
        int valorMasRepetido = 0;
        for (int i = 10; i <= 80; i++) {
            if (frecuencia[i] > maxRepeticiones) {
                maxRepeticiones = frecuencia[i];
                valorMasRepetido = i;
            }
        }
        return valorMasRepetido;
    }

    public static void main(String[] args) {
        int[] vector = new int[100];
        rellenarArray(vector);

        System.out.println("Vector generado:");
        mostrarArray(vector);

        System.out.println("Mayor: " + obtenerMayor(vector));
        System.out.println("Menor: " + obtenerMenor(vector));
        System.out.println("Media: " + obtenerMedia(vector));
        System.out.println("Valor que más se repite: " + obtenerMasRepetido(vector));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio1;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        int[] misNumeros = pedirNumeros();  // Captura los números
        mostrarPares(misNumeros);           // Muestra los pares
    }
    
    // Método que pide 10 números enteros al usuario y los guarda en un array
    public static int[] pedirNumeros() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        return numeros;
    }

    //Método que muestra solo los números pares del array
    public static void mostrarPares(int[] array) {
        System.out.println("\nNúmeros pares en el array:");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}


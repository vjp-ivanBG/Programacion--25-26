/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio2;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        int[] misNumeros = introducirDatos();    
        System.out.println("\nArray original:");
        mostrarDatos(misNumeros);                

        intercambiarDatos(misNumeros);           
        System.out.println("\nArray modificado:");
        mostrarDatos(misNumeros);                 
    }
    
    //Método que introduce 7 números enteros en un array
    public static int[] introducirDatos() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];

        System.out.println("Introduce 7 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        return numeros;
    }

    //Método que muestra los datos del array
    public static void mostrarDatos(int[] array) {
        System.out.print("[ ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    //Método que intercambia los valores
    public static void intercambiarDatos(int[] array) {
        int temp = array[1];
        array[1] = array[3];
        array[3] = temp;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio8;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio8 {
    //Método que pide 5 números al usuario
    public static void rellenarArray(int vector[]) {
        Scanner entrada = new Scanner (System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce un número de 5 cifras:");
            vector[i] = entrada.nextInt();
        }
    }
    //Método que muestra el número pero invertido
    public static void mostrarInvertido(int vector[]) {
        System.out.println("El número al revés es: ");
        for (int i = vector.length -1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
    //Método main que llama los métodos rellenar y mostrar
    public static void main (String[] args) {
        int vector[] = new int [5];
        rellenarArray(vector);
        mostrarInvertido(vector);
    }
}
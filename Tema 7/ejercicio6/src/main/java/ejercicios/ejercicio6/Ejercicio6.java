/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio6;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    //Método que muestra los elementos del array en una línea
    public static void mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + i + "] → " + numeros[i] + "; ");
        }
        System.out.println();
    }

    //Método que comprueba si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Método que rellena el array con los primeros 80 números primos
    public static void rellenar(int[] primos) {
        int contador = 0;
        int numero = 1;
        while (contador < primos.length) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }
    }

    public static void main(String[] args) {
        int[] primos = new int[80];
        rellenar(primos);

        System.out.println("80 posiciones con números primos:");
        mostrar(primos);
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio17;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {
    
    //Método que rellena el array con números aleatorios del 1 al 9
    public static void rellenarArray (int vector[]) {
        int i;
        for ( i = 0; i < 9; i++) {
            vector[i] = (int) (Math.random() * (9) + 1);
        }
    }
    
    //Método que muestra el array pero de forma desordenada
    public static void mostrarArray (int vector[]) {
        int i;
        for ( i = 0; i < 9; i++) {
            System.out.println(vector[i]);
        }
    }
    
    //Método que ordena el array de mayor a menor con ayuda de un auxiliar
    public static void ordenarArray(int matriz[]) {
    
        int aux;
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length - 1 - i; j++) {
                if (matriz[j] < matriz[j + 1]) {
                    aux = matriz[j];
                    matriz[j] = matriz[j + 1];
                    matriz[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
        System.out.println(matriz[i]);
        }
    }

    
    //Método main que llama a los demás métodos
    public static void main(String[] args) {
        int[] array = new int[9];
        rellenarArray(array);
        mostrarArray(array);
        System.out.println("------DE MAYOR A MENOR-----");
        ordenarArray(array);
    }
}

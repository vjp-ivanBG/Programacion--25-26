/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio17;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {
    
    
    public static void rellenarArray (int vector[]) {
        int i;
        for ( i = 0; i < 9; i++) {
            vector[i] = (int) (Math.random() * (9) + 1);
        }
    }
    
    public static void mostrarArray (int vector[]) {
        int i;
        for ( i = 0; i < 9; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void ordenarArray (int matriz[]) {
        int j;
        int i;
        int aux = 0;
        for ( i = 0; i < matriz.length; i++) {
            for ( j = 0; j < matriz.length; j++) {
                if (matriz[j] > matriz[j + 1]) {
                aux = matriz[j];
                matriz[j] = matriz[j + 1];
                matriz[j + 1] = aux;
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        int[] array = new int[9];
        rellenarArray(array);
        mostrarArray(array);
        System.out.println("------DE MAYOR A MENOR-----");
        ordenarArray(array);
    }
}

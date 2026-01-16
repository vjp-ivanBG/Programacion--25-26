/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio4;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    public static void rellenarArray(int array[][]) {
        int i,j;
        System.out.println("numeros aleatorios que salieron: ");
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 3; j++) {
                array[i][j] = (int) (Math.random() * (200 - 100 + 1)) + 100;            
            }
        }
    }
    
    public static void mostrarArray(int array[][]) {
        int i,j;
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.println("    ["+i+j+"]-->"+array[i][j]);
            }
            System.out.println("\n");
        }
    }
    
    public static void mostrarPares(int pares[][]) {
        int i,j;
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 3; j++) {
                if (pares[i][j] % 2 == 0) {
                    System.out.println("    ["+i+j+"]-->"+pares[i][j]);
                }
            }
            System.out.println("\n");
        }
    }
 
    
    
    
    public static void main(String[] args) {
        int[][] array = new int [4][3];
        rellenarArray(array);
        mostrarArray(array);
        System.out.println("-------MOSTRAR SOLO LOS PARES-------");
        mostrarPares(array);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio5;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio5 {
    
    public static void rellenarArray(int array[][]) {
        Scanner entrada = new Scanner(System.in);
        int i,j;
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 2; j++) {
                System.out.println("Introduce un valor para la posicion ["+i+j+"]  :  ");
                array[i][j] = entrada.nextInt();
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] array = new int [4][2];
        rellenarArray(array);
    }
}

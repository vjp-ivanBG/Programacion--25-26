/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio3;

/**
 *
 * @author alumno
 */
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce una cadena de carácteres:");
        String pedirCadena = entrada.next();
        
        
        char[] cadena = pedirCadena.toCharArray();
        System.out.println(Arrays.toString(cadena));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio5;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String diaSemana = entrada.next();
        
        
        String[] n = diaSemana.split("Lunes");
        System.out.println(Arrays.toString(n));
    }
}

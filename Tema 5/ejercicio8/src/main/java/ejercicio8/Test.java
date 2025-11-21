/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Test {
  

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Pedimos el número al usuario
    System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();

    //Creamos el objeto con ese número
    Numero miNumero = new Numero(num);

    //Llamamos al método para ver si es par o impar
    miNumero.mostrarParidad();

        
    }
}



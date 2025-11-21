/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Test {
    Numero n1 = new Numero();
    Numero n2 = new Numero();

    // Método que pide valores al usuario
    public void pedirValores() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        n1.setValor(sc.nextInt());
        System.out.print("Introduce el segundo número: ");
        n2.setValor(sc.nextInt());
    }

    // Método para sumar
    public int sumar() {
        return n1.getValor() + n2.getValor();
    }

    // Método para multiplicar
    public int multiplicar() {
        return n1.getValor() * n2.getValor();
    }

    // Método principal para ejecutar
    public void ejecutar() {
        pedirValores();

        if (n1.getValor() > 10) {
            int resultado = multiplicar();
            System.out.println("Como el primer número es mayor que 10, se multiplican:");
            System.out.println(n1.getValor() + " * " + n2.getValor() + " = " + resultado);
        } else {
            int resultado = sumar();
            System.out.println("Como el primer número NO es mayor que 10, se suman:");
            System.out.println(n1.getValor() + " + " + n2.getValor() + " = " + resultado);
        }
    }

    // Método main para lanzar el programa
    public static void main(String[] args) {
        Test programa = new Test();
        programa.ejecutar();
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        introducirValores(numeros);
        mostrarLista(numeros);

        System.out.println("Mayor: " + calculaMayor(numeros));
        System.out.println("Menor: " + calculaMenor(numeros));
        System.out.println("Suma: " + calculaSuma(numeros));
    }

    //Método que introduce valores hasta que se salga uno negativo
    public static void introducirValores(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Introduce un número positivo (negativo para terminar): ");
            valor = entrada.nextInt();
            if (valor >= 0) {
                lista.add(valor);
            }
        } while (valor >= 0);
    }

    //Método que muestra los elementos de la lista
    public static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("Elementos de la lista:");
        for (int numero : lista) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    //Método que calcula el mayor
    public static int calculaMayor(ArrayList<Integer> lista) {
        int mayor = lista.get(0);
        for (int numero : lista) {
            if (numero > mayor) mayor = numero;
        }
        return mayor;
    }

    //Método que calcula el menor
    public static int calculaMenor(ArrayList<Integer> lista) {
        int menor = lista.get(0);
        for (int n : lista) {
            if (n < menor) menor = n;
        }
        return menor;
    }

    //Método que calcula la suma
    public static int calculaSuma(ArrayList<Integer> lista) {
        int suma = 0;
        for (int numero : lista) {
            suma += numero;
        }
        return suma;
    }
}


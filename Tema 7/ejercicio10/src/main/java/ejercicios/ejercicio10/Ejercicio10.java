/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio10;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {
    
    
//Método que rellena el array con numeros aleatorios del 1 al 8
public static void rellenar(int[] array) {
    int i;
        for ( i = 0; i < array.length; i++) {
        array[i] = (int)(Math.random() * 8) + 1;
        
    }
}
//Método que muestra los elementos del array en una linea
public static void mostrar(int[] numeros) {
    for (int i = 0; i < numeros.length; i++) {
        System.out.print(numeros[i] + " ");
    }
        System.out.println();
}

//Método que sustituye por 0 los valores
public static void eliminarRepetidos(int[] cifras) {
    int num = 0;
    
    while (num < cifras.length) {
    int valorActual = cifras[num];
        if (valorActual != 0) {
            int j = num + 1;
            boolean repetido = false;
        
        while (j < cifras.length) {
            if (cifras[j] == valorActual) {
                repetido = true;
                cifras[j] = 0;
            }j++;
        }
            
            if (repetido) {
            cifras[num] = 0;
            }
        }num++;
    }
}

    public static void main(String[] args) {
    int[] numeros = new int[10];
    rellenar(numeros);
    
    System.out.println("Se han generado los siguientes numeros:");
    mostrar(numeros);
    eliminarRepetidos(numeros);
    
    System.out.println("Sustituimos los elementos repetidos por un 0:");
    mostrar(numeros);
    }
}
  
   


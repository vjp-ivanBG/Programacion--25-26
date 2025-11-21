/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */
public class Pajaritos {
    static int numPajaritos;

    //Método que devuelve el número
    static int muestraPajaros() {
        return numPajaritos;
    }

    //Método que muestra el numero
    static void establecerLongitudBandada(String col, int num) {
        System.out.println("La cantidad de pajaritos en la " + col + " es: " + num);
    }

    //Métodp que imprimer la cantidad de objetos
    static void muestraPajaros(String col) {
        System.out.println("La cantidad de objetos creados de la " + col + " es: " + numPajaritos);
    }
}



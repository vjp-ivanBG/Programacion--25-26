/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */
public class Test {
    public static void main(String[] args) {
        //Le damos valor al número de pajaritos
        Pajaritos.numPajaritos = 5;

        //Mostramos el número usando el método que ahora devuelve
        System.out.println(Pajaritos.muestraPajaros());

        //Mostramos el número con texto usando el otro método
        Pajaritos.establecerLongitudBandada("bandada", Pajaritos.numPajaritos);

        //Y mostramos el número con el método que lleva el nombre de la colección
        Pajaritos.muestraPajaros("bandada");
    }
}



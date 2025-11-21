/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author alumno
 */
public class Numero {
    private int valor;

    //Constructor que recibe el número
    public Numero(int valor) {
        this.valor = valor;
    }

    // Método que dice si el número es par o impar
    public void mostrarParidad() {
        if (valor % 2 == 0) {
            System.out.println("El número " + valor + " es PAR.");
        } else {
            System.out.println("El número " + valor + " es IMPAR.");
        }
    }
}



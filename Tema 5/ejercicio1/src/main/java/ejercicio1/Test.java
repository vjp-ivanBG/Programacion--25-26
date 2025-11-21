/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Test {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        // Establezco los atributos
        miCoche.establecerMarca("Toyota");
        miCoche.establecerModelo("Citroen");
        miCoche.establecerColor("Rojo");

        cochePadre.establecerMarca("Ford");
        cochePadre.establecerModelo("Focus");
        cochePadre.establecerColor("Azul");

        // Arranca los coches
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();

        // acelera y frena
        for (int i = 0; i < 5; i++) miCoche.acelerarCoche();
        for (int i = 0; i < 2; i++) miCoche.frenarCoche();

        // Acelerar cochePadre
        for (int i = 0; i < 3; i++) cochePadre.acelerarCoche();

        // Apagar cochePadre
        cochePadre.apagarCoche();

        // Mostrar estado de ambos coches
        System.out.println("Estado de Mi coche:");
        miCoche.obtenerEstado();

        System.out.println("Estado del Coche Padre:");
        cochePadre.obtenerEstado();
    }
}


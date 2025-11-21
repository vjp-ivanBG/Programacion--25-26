/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public class Test {
    public static void main(String[] args) {
       
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();

        
        rueda1.establecerMaterial("Aluminio");
        rueda1.establecerPulgadas(17);

        rueda2.establecerMaterial("Acero");
        rueda2.establecerPulgadas(15);

        
        System.out.println("Rueda 1: " + rueda1.obtenerMaterial() + ", " + rueda1.obtenerPulgadas() + " pulgadas");
        System.out.println("Rueda 2: " + rueda2.obtenerMaterial() + ", " + rueda2.obtenerPulgadas() + " pulgadas");

        
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();

        
        coche1.establecerMarca("Toyota");
        coche1.establecerModelo("Yaris");

        coche2.establecerMarca("Ford");
        coche2.establecerModelo("Focus");

        coche3.establecerMarca("Seat");
        coche3.establecerModelo("Ibiza");

        
        coche1.establecerRueda(rueda1);
        coche2.establecerRueda(rueda2);
        coche3.establecerRueda(rueda1); // Reutilizamos la rueda1

       
        System.out.println("Datos de los coches:");
        System.out.println("Coche 1: " + coche1.obtenerMarca() + " " + coche1.obtenerModelo());
        System.out.println("Coche 2: " + coche2.obtenerMarca() + " " + coche2.obtenerModelo());
        System.out.println("Coche 3: " + coche3.obtenerMarca() + " " + coche3.obtenerModelo());

        
        System.out.println("Datos completos:");
        System.out.println("Coche 1: " + coche1.obtenerMarca() + " " + coche1.obtenerModelo() +
                ", Rueda: " + coche1.obtenerRueda().obtenerMaterial() + ", " 
                + coche1.obtenerRueda().obtenerPulgadas() + " pulgadas");

        System.out.println("Coche 2: " + coche2.obtenerMarca() + " " + coche2.obtenerModelo() +
                ", Rueda: " + coche2.obtenerRueda().obtenerMaterial() 
                + ", " + coche2.obtenerRueda().obtenerPulgadas() 
                + " pulgadas");

        System.out.println("Coche 3: " + coche3.obtenerMarca() + " " + coche3.obtenerModelo() +
                ", Rueda: " + coche3.obtenerRueda().obtenerMaterial() 
                + ", " + coche3.obtenerRueda().obtenerPulgadas() + " pulgadas");
    }
}



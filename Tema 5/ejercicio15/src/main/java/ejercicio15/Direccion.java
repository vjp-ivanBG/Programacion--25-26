/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author bueso
 */
public class Direccion {
    String calle;
    int numero;
    String puerta;
    String ciudad;

    //Constructor
    public Direccion(String calle, int numero, String puerta, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.puerta = puerta;
        this.ciudad = ciudad;
    }
    
    //Método que muestra la dirección
    public String mostrarDireccion() {
        return "    Calle: " + calle + "\n" +
               "    Número: " + numero + "\n" +
               "    Puerta: " + puerta + "\n" +
               "    Ciudad: " + ciudad;
    }
}



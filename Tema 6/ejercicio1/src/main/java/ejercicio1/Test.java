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
        
        Suma sumando = new Suma (5, 10);
        Multiplicacion multiplicador = new Multiplicacion (5, 10);
        Potencia exponente = new Potencia (5, 3);
        
        System.out.println("La calculadora realizó las siguientes operaciones: ");
        
        System.out.println("Suma: ");
        System.out.println(sumando.getNumero() + "+" + sumando.getSumando() + "=" + sumando.realizarOperacion());
        
        System.out.println("Multiplicacion: ");
        System.out.println(multiplicador.getNumero() + "*" + multiplicador.getMultiplicacion() + "=" + multiplicador.realizarOperacion());
        
        System.out.println("Potencia: ");
        System.out.println(exponente.getNumero() + exponente.getExponente() + "=" + exponente.realizarOperacion() );
        
        System.out.println("=======POLIMORFISMO=======");
         System.out.println("La calculadora realizó las siguientes operaciones: ");
        Calculadora operacion;
        operacion = new Suma (5, 10);
        System.out.println("Suma: ");
        System.out.println(operacion.realizarOperacion());
        
        operacion = new Multiplicacion (5, 10);
        System.out.println("Multiplicacion: ");
        System.out.println(operacion.realizarOperacion());
        
        operacion = new Potencia (5, 3);
        System.out.println("Potencia: ");
        System.out.println(operacion.realizarOperacion() );
        
    }
}

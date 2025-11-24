/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio20;

/**
 *
 * @author alumno
 */
public class Cuenta {
    private float saldo;

    //Constructor sin saldo inicial
    public Cuenta() {
        this.saldo = 0;
    }

    //Constructor con saldo inicial
    public Cuenta(float saldoInicial) {
        this.saldo = Math.max(saldoInicial, 0); // Evitamos saldos negativos
    }

    //Método que ingresa dinero
    public void ingresar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    //Método que extraer dinero (sin permitir lo del saldo negativo)
    public void extraer(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("No se puede extraer esa cantidad. Saldo insuficiente.");
        }
    }

    // Método para consultar el saldo
    public float getSaldo() {
        return saldo;
    }
}

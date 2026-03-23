/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio6;

/**
 *
 * @author alumno
 */
import java.util.ArrayList;
import java.util.Collections;

public class Campania {
    private String nombre;
    private ArrayList<Donacion> donaciones;

    public Campania(String nombre) {
        this.nombre = nombre;
        this.donaciones = new ArrayList<>();
    }

    public void agregarDonacion(Donacion d) {
        donaciones.add(d);
    }

    public void mostrarDonaciones() {
        if (donaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas.");
            return;
        }
        for (Donacion d : donaciones) {
            System.out.println(d);
        }
    }

    public void mostrarPorNombre(String nombre) {
        boolean encontrado = false;
        for (Donacion d : donaciones) {
            if (d.getNombreDonante().equalsIgnoreCase(nombre)) {
                System.out.println(d);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay donaciones de ese nombre.");
        }
    }

    public int numeroDonaciones() {
        return donaciones.size();
    }

    public double totalRecaudado() {
        double total = 0;
        for (Donacion d : donaciones) {
            total += d.getCantidad();
        }
        return total;
    }

    public void ordenarDonaciones() {
        Collections.sort(donaciones, (a, b) -> Double.compare(b.getCantidad(), a.getCantidad()));
    }
}


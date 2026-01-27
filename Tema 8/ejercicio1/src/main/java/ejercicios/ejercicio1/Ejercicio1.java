/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio1;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Asignatura[] asignaturas = new Asignatura[6];
        
        
        Asignatura Programación = new Asignatura("Programación", 5.5f);
        asignaturas[1] = Programación;
        Asignatura LenguajedeMarcas = new Asignatura("Lenguaje de Marcas", 5.0f);
        asignaturas[2] = LenguajedeMarcas;
        Asignatura BasesdeDatos = new Asignatura("Bases de Datos", 5.0f);
        asignaturas[3] = BasesdeDatos;
        Asignatura EntornosdeDesarrollo = new Asignatura("Entornos de Desarrollo", 5.0f);
        asignaturas[4] = EntornosdeDesarrollo;
        Asignatura SistemasInformaticos = new Asignatura("Sistemas Informáticos", 5.0f);
        asignaturas[5] = SistemasInformaticos;
        Asignatura FOL = new Asignatura("FOL", 5.0f);
        asignaturas[6] = FOL;
        
        mostrarArray(asignaturas);
    }
    
    
    public static void mostrarArray(Asignatura[] asignaturas) {
        for(int i = 0; i < asignaturas.length; i++) {
            System.out.println(asignaturas[i]);
        }
    }
}

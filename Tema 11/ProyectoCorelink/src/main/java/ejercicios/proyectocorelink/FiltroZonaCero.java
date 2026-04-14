/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.proyectocorelink;

/**
 *
 * @author alumno
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class FiltroZonaCero {
    
    final static String origen = "datos_empleados.txt;";
    final static String destino = "sospechosos_datos_empleados";
    public static void main(String[] args) {
        try {
            leeryescribirFichero("datos_empleados.txt", "sospechosos_zona_cero.txt");
            
        } catch(IOException e) {
            System.out.println("ERROR: Ha ocurrido un error en la escritura o lectura del fichero.");
        }
        
    }
    
    public static void leeryescribirFichero (String origen, String destino) throws IOException {
        
        System.out.println("Leyendo fichero");
        
        int contador = 0;
        
        try(
           BufferedReader br = new BufferedReader(new FileReader(origen));
           BufferedWriter bw = new BufferedWriter(new FileWriter(destino));
           
           ) {
            
            String linea = br.readLine();
            
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                
                if (partes.length >= 3 && partes[2].trim().equalsIgnoreCase("Zona Cero")) {
                    bw.write(linea);
                    bw.newLine();
                    contador++;
                }
            }
           br.close();
           bw.close();
           
           System.out.println("Empleados escritos en el fichero: " + contador);
           
       }
    }
}

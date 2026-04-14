/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.proyectocorelink;

/**
 *
 * @author alumno
 */
import static ejercicios.proyectocorelink.FiltroZonaCero.leeryescribirFichero;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class BuscarClaves {
    
    public static void main(String[] args) {
        try {
            buscarClaves("04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt", "Claves.txt");
            
        } catch(IOException e) {
            System.out.println("ERROR: Ha ocurrido un error en la escritura o lectura del fichero.");
        }
        
    }
    
    public static void buscarClaves (String origen, String destino) throws IOException {
        
        System.out.println("Leyendo fichero");
        
        int contador = 0;
        
        try(
           BufferedReader br = new BufferedReader(new FileReader(origen));
           BufferedWriter bw = new BufferedWriter(new FileWriter(destino));
           
           ) {
            
            String linea; 
            while ((linea = br.readLine()) != null && contador < 3) {
            StringBuilder numero = new StringBuilder();
            }

            for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            
            if(Character.isDigit(c)) {
                contador++;
            }
            
            
            
            
            }
        }
    }
}

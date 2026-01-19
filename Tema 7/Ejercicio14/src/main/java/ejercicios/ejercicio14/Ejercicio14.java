/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio14;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio14 {

    public static void rellenarArray (int vector[][]) {
        Scanner entrada = new Scanner (System.in);
        int i,j,d;
        String[] dias= {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for ( d = 0; d < 7; d++) {
            System.out.println(dias[d] + "-");
        }
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 7; j++) {
                System.out.println("Introduce las temperaturas de cada día: ");
                vector[i][j] = entrada.nextInt();
            }
        }
    }
    
    public static void mostrarArray (int vector[][]) {
        int i,j;
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 7; j++) {
                System.out.println("DÍA: " + j + " ");
                System.out.println("TEMPERATURA: " + vector[i][j]);
                
                    System.out.println("");
            }
            System.out.println("");
        }
    }
    
    //Método que busca la temperatura media del mes con un bucle que busca el numero más repetido
    public static void temperaturaMedia (int media[][]) {
        int i,j;
        int numero = 0;
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 7; j++) {
                numero = numero + media[i][j];
            }
        }numero = numero / 28;
        System.out.println("la temperatura media del mes es: " + numero);
    }
        
    
    
    public static void temperaturaCalurosa (int [][] matriz) {
        int mayor = matriz [0][0];
        int i,j;
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 7; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        System.out.println("El día más caluroso fue:" + mayor);
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int[][] array = new int [4][7];
        int opcion;
        try {
            do{
                System.out.println("Elige una opción: ");
                System.out.println("1. Introducir la temperatura");
                System.out.println("2. Mostrar la temperatura");
                System.out.println("3. Ver temperatura media del mes");
                System.out.println("4. Ver día o días más calurosos");
                System.out.println("5. Salir del programa");
                opcion = entrada.nextInt();
                switch(opcion) {
                    case 1 : rellenarArray(array);
                    case 2 : mostrarArray(array);
                    case 3 : temperaturaMedia(array);
                    case 4 : temperaturaCalurosa(array);
                    case 5 : break;
                    default : System.out.println("Elige una de las 5 opciones");
                }
            }while(opcion != 5);
        }catch (InputMismatchException e){
            System.out.println("Elige un numero, no una letra");
        }
    }
}

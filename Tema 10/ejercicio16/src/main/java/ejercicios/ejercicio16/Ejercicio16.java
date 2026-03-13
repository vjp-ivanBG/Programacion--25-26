/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio16;

/**
 *
 * @author alumno
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio16 {
    
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Producto> productos = new ArrayList<>();

    //Método main
    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Menú de administración");
            System.out.println("2. Menú de compra");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> menuAdministracion();
                case 2 -> menuCompra();
                case 3 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 3);
    }

    // Método que hace el menú de administración
    public static void menuAdministracion() {
        int opcion;

        do {
            System.out.println("--- MENÚ DE ADMINISTRACIÓN ---");
            System.out.println("1. Introducir producto");
            System.out.println("2. Ver lista de productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Volver");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> introducirProducto();
                case 2 -> mostrarProductos();
                case 3 -> eliminarProducto();
                case 4 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 4);
    }

    //Método que introduce un producto
    public static void introducirProducto() {
        System.out.print("Nombre del producto: ");
        String nombre = entrada.nextLine();

        System.out.print("Precio: ");
        float precio = entrada.nextFloat();

        System.out.print("Stock: ");
        int stock = entrada.nextInt();

        productos.add(new Producto(nombre, precio, stock));
        System.out.println("Producto añadido correctamente.");
    }

    //Método que muestra los productos
    public static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
            return;
        }

        System.out.println("--- LISTA DE PRODUCTOS ---");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i));
        }
    }

    //Método que elimina un producto
    public static void eliminarProducto() {
        System.out.print("Introduce el nombre del producto a eliminar: ");
        String nombre = entrada.nextLine();

        boolean eliminado = productos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));

        if (eliminado) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("No se encontró el producto.");
        }
    }
    
    //Método que hace el menú de compra
    public static void menuCompra() {
        int opcion;

        do {
            System.out.println("--- MENÚ DE COMPRA ---");
            System.out.println("1. Comprar productos");
            System.out.println("2. Volver");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> comprarProductos();
                case 2 -> System.out.println("Volviendo al menú principal");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 2);
    }

    //Menú que compra algún producto
    public static void comprarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles.");
            return;
        }

        float total = 0;
        boolean seguirComprando = true;

        do {
            mostrarProductos();
            System.out.print("Elige el número del producto: ");
            int index = entrada.nextInt() - 1;

            if (index < 0 || index >= productos.size()) {
                System.out.println("Producto no válido.");
                continue;
            }

            Producto p = productos.get(index);

            System.out.print("¿Cuántas unidades deseas?: ");
            int cantidad = entrada.nextInt();

            if (cantidad > p.getStock()) {
                System.out.println("No hay suficiente stock. Quedan: " + p.getStock());
            } else {
                p.setStock(p.getStock() - cantidad);
                total += p.getPrecio() * cantidad;
                System.out.println("Producto añadido a la compra.");
            }

            System.out.print("¿Deseas comprar otro producto? (true/false): ");
            seguirComprando = entrada.nextBoolean();

        } while (seguirComprando);

        System.out.println("Importe total de la compra: " + total + "€");
    }
}



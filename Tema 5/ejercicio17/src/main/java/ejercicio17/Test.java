/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author bueso
 */
public class Test {
    public static void main(String[] args) {
        Enunciado p1 = new Enunciado("¿Cuál es la capital de España?", "Madrid");
        Enunciado p2 = new Enunciado("¿Quién descubrió América?", "Cristóbal Colón");
        Enunciado p3 = new Enunciado("¿Cuántos continentes hay?", "6");
        Enunciado p4 = new Enunciado("¿Cuál es el planeta más cercano al Sol?", "Mercurio");

        //Respuestas del usuario
        String[] respuestasUsuario = {
            "Madrid",         
            "colón",            
            "7",               
            "Venus"             
        };

     
        Enunciado[] preguntas = {p1, p2, p3, p4};

        double nota = 0;

        //Comprueba respuestas
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("\nPregunta: " + preguntas[i].pregunta);
            System.out.println("Tu respuesta: " + respuestasUsuario[i]);

            if (preguntas[i].esCorrecta(respuestasUsuario[i])) {
                System.out.println("✅ ¡Correcto!");
                nota += 2.5;
            } else {
                System.out.println("❌ Incorrecto. La respuesta correcta es: " + preguntas[i].respuesta);
            }
        }

        //Muestra la nota final
        System.out.println("\nTu nota final es: " + nota + " sobre 10");
    }
}



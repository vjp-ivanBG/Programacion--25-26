/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author bueso
 */
public class Enunciado {
    String pregunta;  // Texto de la pregunta
    String respuesta; // Respuesta correcta

    //Constructor
    public Enunciado(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    //Método que comprueba si la respuesta del usuario es correcta
    public boolean esCorrecta(String respuestaUsuario) {
        return respuestaUsuario.equalsIgnoreCase(respuesta); // Ignora mayúsculas/minúsculas
    }
}



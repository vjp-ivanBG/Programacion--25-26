/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio1;

/**
 *
 * @author alumno
 */
    public class Asignatura {
    //Atributos
        private String nombre;
        private float nota;
        
    //Constructores
    public Asignatura() {
        this.nombre = "";
        this.nota = 0.0f;
    }
        
        
    public Asignatura(String nombre, float nota) {
        this.nombre = "";
        this.nota = 0.0f;
    }
    //Getters y Setters

        public String getNombre() {
            return nombre;
        }

        public float getNota() {
            return nota;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setNota(float nota) {
            this.nota = nota;
        }

        @Override
        public String toString() {
            return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
        }
    }


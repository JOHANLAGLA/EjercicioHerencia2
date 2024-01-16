/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema;



/**
 *
 * @author HP
 */
public class Estudiante extends Persona {
    int nivel;
    String carrera;

    public Estudiante(String carrera, int nivel, int edad,String nombre,String email) {
        super(nombre, edad, email);
        this.nivel = nivel;
        this.carrera = carrera;
    }
    public void mostrar_la_Informacion() {
        System.out.println("Estudiante {Nombre: " + nombre + "; Email: " +
                (email != null ? email : "El email no fue  proporcionado") +
                "; Edad: " + (edad != -1 ? edad : "No  definida") +
                "; Nivel: " + nivel +
                "; Carrera: \"" + carrera + "\"}");
    }
           
            
}

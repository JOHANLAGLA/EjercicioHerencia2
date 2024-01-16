/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema;

/**
 *
 * @author HP
 */
public class Problema {

    public static void main(String[] args) {
      Estudiante Estudiante1 = new Estudiante("Juan", 16, 1, "Software", null);
        Estudiante Estudiante2 = new Estudiante("Martha", 19, 5, "Mecanica", "martha@espe.edu.ec");
        Estudiante Estudiante3 = new Estudiante("Carlos", 17, 3, "Electronica", null);
        Estudiante Estudiante4 = new Estudiante("Patricia", 20, 8, "Petroquimica", "patty@espe.edu.ec");

        Estudiante1.mostrar_la_Informacion();
        Estudiante2.mostrar_la_Informacion();
        Estudiante3.mostrar_la_Informacion();
        Estudiante4.mostrar_la_Informacion();
    }
}

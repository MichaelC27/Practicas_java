/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema14;

import java.util.Scanner;

/**
 *
 * @author dbpan
 */
public class Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String titulo, director; 
        int duracion;
        Scanner lector = new Scanner (System.in);
        
        
        System.out.println("Introdusca el título de la película: ");
            titulo = lector.nextLine();
        System.out.println("Introdusca el nombre del director : ");
            director = lector.nextLine();
        System.out.println("Introdusca la duración: ");
            duracion = lector.nextInt();
        Pelicula obj_pelicula = new Pelicula(titulo,director,duracion );
        
         obj_pelicula.MostrarDatosP(titulo,director,duracion);
    }
    
}

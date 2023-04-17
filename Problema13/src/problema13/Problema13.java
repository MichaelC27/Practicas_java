/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema13;

import java.util.Scanner;

/**
 *
 * @author dbpan
 */
public class Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           String nombre, descripcion; 
           double precio;
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdusca el nombre del articulo: ");
            nombre = lector.nextLine();
        System.out.println("Introdusca la descripción del articulo: ");
            descripcion = lector.nextLine();
        System.out.println("Introdusca el precio del articulo: ");
            precio = lector.nextInt();
        Articulo obj_articulo = new Articulo(nombre,descripcion,precio );
        
         obj_articulo.MostrarDatosA(nombre,descripcion,precio);
    
    
    }
    
}

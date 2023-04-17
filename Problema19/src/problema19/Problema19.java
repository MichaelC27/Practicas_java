/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema19;

import java.util.Scanner;

/**
 *
 * @author dbpan
 */
public class Problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String descripcion;
        double precio;
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdusca la descripción del articulo: ");
            descripcion = lector.nextLine();
        System.out.println("Introdusca el precio del artículo ");
            precio = lector.nextDouble();
            
        Descuento obj_desc = new Descuento (descripcion, precio);
        System.out.println("Valor del descuento aplicado al artículo: $" + obj_desc.Descuento_A());
        System.out.println("Con la descripcion:  "+ obj_desc.Descripcion());
        System.out.println("El precio del articulo es de: " + obj_desc.Precio());
    }
    
    
}

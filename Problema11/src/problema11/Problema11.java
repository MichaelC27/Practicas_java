/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema11;

import java.util.Scanner;

/**
 *
 * @author dbpan
 */
public class Problema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String marca, modelo; 
         double precio;
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdusca la marca del ordenador: ");
            marca = lector.nextLine();
        System.out.println("Introdusca el modelo del ordenador: ");
            modelo = lector.nextLine();
        System.out.println("Introdusca el precio del ordenador: ");
            precio= lector.nextDouble();
        Ordenador obj_animal = new Ordenador(marca,modelo,precio );
        
         obj_animal.MostrarInformacion(marca,modelo,precio);
    
    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema12;

import java.util.Scanner;

/**
 *
 * @author dbpan
 */
public class Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           String marca ,modelo; 
           double T_pantalla;
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdusca la marca del celular: ");
            marca = lector.nextLine();
        System.out.println("Introdusca el modelo del celular: ");
            modelo = lector.nextLine();
        System.out.println("Introdusca el tamaño de la panralla del celular: ");
            T_pantalla = lector.nextInt();
        Telefono obj_telefono = new Telefono(marca ,modelo,T_pantalla );
        
         obj_telefono.MostrarDatosT(marca ,modelo,T_pantalla);
    
    }
    
    
}

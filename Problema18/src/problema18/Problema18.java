/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema18;

import java.util.Scanner;

/**
 *
 * @author dbpan
 */
public class Problema18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre,  raza; 
        int edad;
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdusca el nombre de su mascota: ");
            nombre = lector.nextLine();
        System.out.println("Introdusca la raza: ");
            raza = lector.nextLine();
        System.out.println("Introdusca la edad de su mascota: ");
            edad = lector.nextInt();
        Mascota obj_masc = new Mascota(nombre,raza,edad );
        
         obj_masc.MostrarDatosM(nombre, edad, raza);
    }
    
}

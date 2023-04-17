/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema15;

import java.util.Scanner;

/**
 *
 * @author dbpan
 */
public class Problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre,  direccion, T_comida;
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdusca el nombre del restaurante: ");
            nombre = lector.nextLine();
        System.out.println("Introdusca la dirección del restaurante: ");
            direccion = lector.nextLine();
        System.out.println("Introdusca el tipo de comida: ");
            T_comida = lector.nextLine();
        Restaurante obj_res = new Restaurante(nombre,direccion,T_comida );
        
         obj_res.MostrarDatosR(nombre,direccion,T_comida);
    }
    
}

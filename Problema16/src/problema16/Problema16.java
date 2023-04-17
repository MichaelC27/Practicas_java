/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema16;

import java.util.Scanner;

/**
 *
 * @author dbpan
 */
public class Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre , direccion; 
        int nHabitaciones;
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdusca el nombre del hotel: ");
            nombre = lector.nextLine();
        System.out.println("Introdusca la dirección: ");
            direccion = lector.nextLine();
        System.out.println("Cual es la cantidad de habitaciones: ");
            nHabitaciones = lector.nextInt();
        Hotel obj_hotel = new Hotel(nombre,direccion,nHabitaciones );
        
         obj_hotel.MostrarDatosH(nombre, direccion, nHabitaciones);
    }
    
}

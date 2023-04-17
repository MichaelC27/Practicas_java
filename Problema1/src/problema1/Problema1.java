/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

/**
 *
 * @author dbpan
 */
import java.util.Scanner;
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, dni;
        int edad;
        Scanner lector = new Scanner (System.in); 
        
        
        System.out.println("Introdusca su nombre: ");
        nombre = lector.nextLine();
        
        System.out.println("Introdusca la edad: ");
        edad = lector.nextInt();
        lector.nextLine();
        
        System.out.println("Introdusca su dni: ");
        dni = lector.nextLine();
        
        Persona obj_persona = new Persona (nombre, edad, dni);
        obj_persona.Mostrar();
        System.out.println("La persona es mayor de edad: " + obj_persona.esMayorDeEdad());
    }
    
} 

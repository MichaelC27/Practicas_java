/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema10;
import java.util.Scanner;
/**
 *
 * @author dbpan
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String especie, color;
        int edad;
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdusca la especie del anima: ");
            especie = lector.nextLine();
        System.out.println("Introdusca el color del animal: ");
            color = lector.nextLine();
        System.out.println("Introdusca la edad del animal: ");
            edad = lector.nextInt();
        Animal obj_animal = new Animal(especie,edad,color );
        
         obj_animal.MostrarDatosA(especie, edad, color);
    
    }
    
}

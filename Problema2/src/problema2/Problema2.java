/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author dbpan
 */
import java.util.Scanner;
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int dia;
         Scanner lector = new Scanner (System.in); 
         
         System.out.println("Introdusca un numero del 1 al 7: ");
         dia = lector.nextInt();
         
         
         Dias obj_dia = new Dias(dia);
         obj_dia.diaSemana();
    }
    
}

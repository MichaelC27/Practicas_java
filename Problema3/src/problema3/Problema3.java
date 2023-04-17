/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;
import java.util.Scanner;
/**
 *
 * @author dbpan
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int radio;
       String color = null;
       Scanner lector = new Scanner (System.in);
       
       System.out.println("Introdusca el radio: ");
        radio = lector.nextInt();
        lector.nextLine();
       System.out.println("Introdusca el Color del circulo: ");
        color = lector.nextLine();
       
               
       Circulo obj_circulo = new Circulo(radio,color);
       
       obj_circulo.mostrarCirculo();
       
    }
    
}

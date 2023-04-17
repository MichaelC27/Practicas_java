/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;
import java.util.Scanner;
/**
 *
 * @author dbpan
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base,altura;
       Scanner lector = new Scanner (System.in);
        System.out.println("Introdusca la base: ");
        base = lector.nextInt();
        System.out.println("Introdusca el la altura: ");
        altura = lector.nextInt();
        
        Triangulo obj_Tri = new Triangulo(base,altura);
        obj_Tri.mostrarTriangulo();
    }
    
}

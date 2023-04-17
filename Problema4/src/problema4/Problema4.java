/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Scanner;

/**
 *
 * @author dbpan
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ancho,alto;
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdusca el ancho: ");
        ancho = lector.nextInt();
        System.out.println("Introdusca el alto: ");
        alto = lector.nextInt();
        
        Rectangulo obj_rectan = new Rectangulo(alto,ancho);
        obj_rectan.mostrarRectangulo();
    }
    
}

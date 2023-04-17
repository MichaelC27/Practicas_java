/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema8;
import java.util.Scanner;
/**
 *
 * @author dbpan
 */
public class Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String titulo,  autor; 
        int Npaginas;
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdusca el título del libro: ");
            titulo = lector.nextLine();
        System.out.println("Introdusca el autor del libro: ");
            autor = lector.nextLine();
        System.out.println("Introdusca el numero de página del libro: ");
            Npaginas = lector.nextInt();
        Libro obj_libro = new Libro(titulo, autor, Npaginas);
        
        obj_libro.MostrarDatos(titulo,autor,Npaginas);
    }
    
}

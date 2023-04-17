/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema17;
import java.util.Scanner;
/**
 *
 * @author dbpan
 */
public class Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String destino,fechaSalida; 
        double precio;
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduca el destino del paquete: ");
            destino = lector.nextLine();
        System.out.println("Introdusca la fecha de salida: ");
            fechaSalida= lector.nextLine();
        System.out.println("Introduca el precio del paquete: ");
            precio = lector.nextDouble();
        PaqueteTuristico obj_paquete = new PaqueteTuristico(destino,fechaSalida,precio );
        
         obj_paquete.MostrarDatosP(destino,fechaSalida,precio);
    }
    
}

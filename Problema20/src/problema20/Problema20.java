/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema20;
import java.util.Scanner;
/**
 *
 * @author dbpan
 */
public class Problema20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese las horas trabajadas: ");
        double horasTrab = scanner.nextDouble();
        System.out.print("Ingrese el pago por hora: ");
        double pagoHora = scanner.nextDouble();

        Trabajador trabajador = new Trabajador(nombre, horasTrab, pagoHora);
        double sueldoSemanal = trabajador. SueldoSem();
        System.out.println("El sueldo semanal de " + trabajador.getNombre() + " es: $" + sueldoSemanal);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema7;
import java.util.Scanner;
/**
 *
 * @author dbpan
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia,year,mes, num;
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Ingrese le Día: ");
        dia = lector.nextInt();
        System.out.println("Ingrese el mes ´Numeo´: ");
        mes = lector.nextInt();
        System.out.println("Ingrese el año: ");
        year = lector.nextInt();
        Fecha obj_Fecha = new Fecha(dia,year,mes);
        System.out.println("En que formato desea visualizar la fecha");
        System.out.println("1.formato corto (MM/DD/AA)");
        System.out.println("2.formato largo (DD de “MES EN PALABRAS” del AÑO");
        System.out.println("3.formato mediano (MM-DD-AAAA)");
        num = lector.nextInt();
        switch (num) {
                case 1:
                    System.out.println(obj_Fecha.formatoCorto(dia,year,mes));
                    break;
                case 2:
                   System.out.println(obj_Fecha.formatoLargo(dia,year,mes));
                    break;
                case 3:
                    System.out.println(obj_Fecha.formatoMediano(dia,year,mes));
                    break;
                default:
                    System.out.println("Opción inválida, fuera del rango");
                    break;
            }
        
        
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema9;
import java.util.Scanner;
/**
 *
 * @author dbpan
 */
public class Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String marca,  modelo;
          int velocidad,num;
          Scanner lector = new Scanner (System.in);
          System.out.println("Introdusca la marca del coche: ");
            marca = lector.nextLine();
          System.out.println("Introdusca el modelo: ");
            modelo = lector.nextLine();
          System.out.println("Introdusca la velocidad del coche: ");
            velocidad = lector.nextInt();
            
            Coche obj_coche = new Coche(marca,modelo,velocidad);   
          do{
        System.out.println("El coche marca " + obj_coche.Marca()+", Modelo " + obj_coche.Modelo());
        System.out.println("Tiene una velocidad de  " + obj_coche.Velocidad() + "\n" );
        System.out.println("1. Desea acelerar el coche ");
        System.out.println("2. Dease fechar el coche ");
        System.out.println("0. salir ");
        System.out.println("seleccione una opción: ");
             num = lector.nextInt();
       
        switch (num) {
                case 1:
                    System.out.println("Ingrese cuanto desea acelerar ");
                    int incremento = lector.nextInt();
                    obj_coche.acelerar( incremento);
                    break;
                case 2:
                    System.out.println("Ingrese cuanto desea frenar ");
                    int decremento = lector.nextInt();
                    obj_coche.frenar( decremento);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, fuera del rango");
                    break;
            }
        System.out.println("\nEl coche marca " + obj_coche.Marca()+", Modelo " + obj_coche.Modelo());
        System.out.println("Tiene una velocidad de  " + obj_coche.Velocidad()+"\n" );
        }while (num != 0);
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema6;
import java.util.Scanner;
/**
 *
 * @author dbpan
 */

public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //double saldo;
        String nombre;
        int N_cuenta, num;
        int montoD,montoR;
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdusca su nombre: ");
            nombre = lector.nextLine();
        System.out.println("Introdusca su numero de cuenta: ");
            N_cuenta = lector.nextInt();
        Cuenta_Bancaria obj_cuenta = new Cuenta_Bancaria(N_cuenta,nombre);
        
        
        do{
        System.out.println("1. Depositar ");
        System.out.println("2. Retirar ");
        System.out.println("3. Ver saldo ");
        System.out.println("0. Salir ");
        System.out.println("seleccione una opción: ");
             num = lector.nextInt();
       
        switch (num) {
                case 1:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    double deposito = lector.nextDouble();
                    obj_cuenta.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double retiro = lector.nextDouble();
                    obj_cuenta.retirar(retiro);
                    break;
                case 3:
                    System.out.println("Saldo actual: " + obj_cuenta.mostrar_saldo());
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, fuera del rango");
                    break;
            }
        
        }while (num != 0);
    }
    
}

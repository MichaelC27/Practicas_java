/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema6;
import java.util.Scanner;
/**
 *
 * @author dbpan
 */
public class Cuenta_Bancaria {
    private int N_cuenta;
    private double saldo;
    private String nombre;
    
    public Cuenta_Bancaria(){}
    public Cuenta_Bancaria (int N_cuenta, String nombre){
        this.N_cuenta = N_cuenta;
        this.nombre = nombre;
        this.saldo = 100;
    }
    Scanner lector = new Scanner (System.in);
    public int getN_cuenta() {
        return this.N_cuenta;
    }

    public void setN_cuenta(int N_cuenta) {
        this.N_cuenta = N_cuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void depositar(double montoD) {
        this.saldo += montoD;
    }
    public void retirar(double montoR) {
        if (saldo >= montoR) {
           saldo -= montoR;
        } else {
          System.out.println("No hay suficiente saldo disponible.");
        }
    }
       public double mostrar_saldo (){
        return saldo;   
    }
  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema12;

/**
 *
 * @author dbpan
 */
public class Telefono {
     private String marca;
    private String modelo;
    private double T_pantalla;
    
    public Telefono(){}
    public Telefono(String marca, String modelo, double T_pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.T_pantalla = T_pantalla;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getT_pantalla() {
        return this.T_pantalla;
    }

    public void setT_pantalla(double T_pantalla) {
        this.T_pantalla = T_pantalla;
    }
    public void MostrarDatosT(String marca ,String modelo,double T_pantalla){
        System.out.println("La marca del telefono es: "+ marca);
        System.out.println("El modelo del telefono es : "+ modelo);
        System.out.println("El tamaño de la pantalla es : "+ T_pantalla);
    }
}

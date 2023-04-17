/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema11;

/**
 *
 * @author dbpan
 */
public class Ordenador {
    private String marca;
    private String modelo;
    private double precio;

    public Ordenador(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
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

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void MostrarInformacion(String marca,String modelo,double precio){
        System.out.println("La marca del ordenador es: "+ marca);
        System.out.println("El modelo del ordenador es: "+ modelo);
        System.out.println("El precio del ordenador es : "+ precio);
    }
}

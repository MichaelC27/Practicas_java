/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema19;

/**
 *
 * @author dbpan
 */
public class Descuento {
    private String descripcion;
    private double precio;
    private double Vdescuento;
    
    
    public Descuento(){}
    public Descuento(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
        
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double Descuento_A() {
        double descuento = 0;
        if (precio >= 200) {
            descuento = precio * 0.15;
        } else if (precio > 100) {
            descuento = precio * 0.12;
        } else {
            descuento = precio * 0.1;
        }
        return descuento;
    }
    
    public String Descripcion() {
        return descripcion;
    }
    public double Precio() {
        return precio;
    }
    
}


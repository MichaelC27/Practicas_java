/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema13;

/**
 *
 * @author dbpan
 */
public class Articulo {
    private String nombre;
    private String descripcion;
    private double precio;
    
    public Articulo(){}
    public Articulo(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public void MostrarDatosA (String nombre,String descripcion,double precio){
        System.out.println("El nombre del articulo es : "+ nombre);
        System.out.println("La decripción del articulo es : "+ descripcion);
        System.out.println("El precio del articulo es : "+ precio);
    }
}

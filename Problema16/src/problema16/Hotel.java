/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema16;

/**
 *
 * @author dbpan
 */
public class Hotel {
    private String nombre;
    private String direccion;
    private int nHabitaciones;
    
    public Hotel(){}
    public Hotel(String nombre, String direccion, int nHabitaciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nHabitaciones = nHabitaciones;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getnHabitaciones() {
        return this.nHabitaciones;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }
    
     public void MostrarDatosH (String nombre, String direccion, int nHabitaciones){
        System.out.println("El nombre del hotel es: "+ nombre);
        System.out.println("La dirección : "+ direccion);
        System.out.println("La cantidad de habitaciones: "+ nHabitaciones);
    }
}

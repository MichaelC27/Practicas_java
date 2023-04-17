/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author dbpan
 */
public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    
    public Persona(){}
    public Persona(String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad =  edad;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void Mostrar(){
        System.out.println("Nombre: " + this.nombre + "\nEdad:" + this.edad + "\nDNI: " + this.dni);
    }
    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
   
}

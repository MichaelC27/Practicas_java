/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema18;

/**
 *
 * @author dbpan
 */
public class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    
    public Mascota(){}
    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     public void MostrarDatosM (String nombre, int edad, String raza){
        System.out.println("El nombre es: "+ nombre);
        System.out.println("La edad: "+ edad);
        System.out.println("La raza  de la mascota  es: "+ raza);
    }
}

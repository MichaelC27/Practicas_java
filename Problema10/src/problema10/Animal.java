/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema10;

/**
 *
 * @author dbpan
 */
public class Animal {
    private String especie;
    private int edad;
    private String color;

    public Animal(String especie, int edad, String color) {
        this.especie = especie;
        this.edad = edad;
        this.color = color;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void MostrarDatosA (String especie, int edad, String color){
        System.out.println("La especie del animal es: "+ especie);
        System.out.println("La edad del animal es: "+ edad);
        System.out.println("El coloe del animal es: "+ color);
    }
    
}

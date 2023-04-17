/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema15;

/**
 *
 * @author dbpan
 */
public class Restaurante {
    private String nombre;
    private String direccion;
    private String T_comida;
    
    public Restaurante(){}
    public Restaurante(String nombre, String direccion, String T_comida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.T_comida = T_comida;
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

    public String getT_comida() {
        return this.T_comida;
    }

    public void setT_comida(String T_comida) {
        this.T_comida = T_comida;
    }
    
    
    public void MostrarDatosR(String nombre,String direccion,String T_comida){
        System.out.println("EL nombre del restaurante es: "+ nombre);
        System.out.println("La dirección es: "+ direccion);
        System.out.println("El tipo de comida es: "+ T_comida);
    }
    
}

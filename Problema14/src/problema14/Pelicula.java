/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema14;

/**
 *
 * @author dbpan
 */
public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;
    
    public Pelicula(){}
    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void MostrarDatosP(String titulo,String director,double duracion){
        System.out.println("EL título de la película es: "+ titulo);
        System.out.println("El director es : "+ director);
        System.out.println("La duración de la película es: "+ duracion);
    }
}

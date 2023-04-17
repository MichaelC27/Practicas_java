/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema8;

/**
 *
 * @author dbpan
 */
public class Libro {
    private String titulo;
    private String autor;
    private int Npaginas;

    public Libro(){}
    public Libro(String titulo, String autor, int Npaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.Npaginas = Npaginas;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpaginas() {
        return this.Npaginas;
    }

    public void setNpaginas(int Npaginas) {
        this.Npaginas = Npaginas;
    }
    public void MostrarDatos(String titulo,String autor,int Npaginas){
        System.out.println("El tirulo del  libro: "+ titulo);
        System.out.println("El autor del libro: "+ autor);
        System.out.println("El  libro contiene  "+ Npaginas+ " Páginss");
    }
}

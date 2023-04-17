/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author dbpan
 */
public class Rectangulo {
    private int ancho;
    private int alto;
    
    public Rectangulo (){}
    public Rectangulo(int alto, int ancho){
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAncho() {
        return this.ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return this.alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public double calculoArea (){
        double area ;
        area = this.ancho * this.alto;
        return area;
    }
    public double calculoPerime (){
        double perimetro;
        perimetro = 2*(this.ancho + this.alto);
        return perimetro;
    }
    
    public void mostrarRectangulo (){
        double area = calculoArea();
        double perimetro = calculoPerime();        
        System.out.println("El area del Rectángulo es: "+ area);
        System.out.println("El perimetro del Rectángulo es: "+ perimetro);
    }
}

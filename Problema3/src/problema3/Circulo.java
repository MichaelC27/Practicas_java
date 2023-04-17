/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author dbpan
 */
public class Circulo {
    private int radio;
    private String color;

    public Circulo(){}
    public Circulo(int radio, String color){
        this.radio = radio;
        this.color = color;
    }
    
    public int getRadio() {
        return this.radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double calculoArea (){
        double area ;
        area = 3.1416 * Math.pow(this.radio,2);
        return area;
    }
    public double calculoPerime (){
        double perimetro;
        perimetro = 2*3.1416*this.radio;
        return perimetro;
    }
       
    public void mostrarCirculo (){
        double area = calculoArea();
        double perimetro = calculoPerime();        
        System.out.println("El area del circulo es: "+ area);
        System.out.println("El perimetro del circulo es: "+ perimetro);
        System.out.println("El color del circulo es: "+ this.color);
    }

}

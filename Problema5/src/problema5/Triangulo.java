/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema5;

/**
 *
 * @author dbpan
 */
public class Triangulo {
    private int base;
    private int altura;
    
    public Triangulo(){}
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
     public double calculoArea (){
        double area ;
        area = this.base * this.altura;
        return area;
    }
    public double calculoPerime (){
        double hipotenusa,perimetro;
         hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)); 
         perimetro = base + altura + hipotenusa;
         return perimetro;
    }
    
     public void mostrarTriangulo (){
        double area = calculoArea();
        double perimetro = calculoPerime();        
        System.out.println("El area del Triángulo es: "+ area);
        System.out.println("El perimetro del Triángulo es: "+ perimetro);
    }
}

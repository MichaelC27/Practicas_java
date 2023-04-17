/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author dbpan
 */
public class Dias {
    private int dia;
    
    public Dias(){}
    
    public Dias(int dia){
        this.dia=dia;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public void diaSemana(){
        switch (this.dia){
            case 1:
                System.out.println("El dia es Lunes");
                break;
            case 2:
                System.out.println("El dia es Martes");
                break;
            case 3:
                System.out.println("El dia es Miercoles");
                break;
            case 4:
                System.out.println("El dia es Jueves");
                break;
            case 5:
                System.out.println("El dia es Viernes");
                break;
            case 6:
                System.out.println("El dia es Sabado");
                
            case 7:
                System.out.println("El dia es Domingo");
                break;
            default:
                System.out.println("Numero invalido");
        }
    }
}

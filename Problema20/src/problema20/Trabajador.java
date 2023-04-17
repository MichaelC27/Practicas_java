/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema20;

/**
 *
 * @author dbpan
 */
public class Trabajador {
    private String nombre;
    private double horasTrab;
    private double pagoHora;
    public Trabajador(){}
    public Trabajador(String nombre, double horasTrab, double pagoHora) {
        this.nombre = nombre;
        this.horasTrab = horasTrab;
        this.pagoHora = pagoHora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHorasTrab() {
        return this.horasTrab;
    }

    public void setHorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }

    public double getPagoHora() {
        return this.pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }
    
    public double SueldoSem() {
        double sueldoSemanal = 0;
        if (horasTrab <= 40) {
            sueldoSemanal = horasTrab * pagoHora;
        } else {
            sueldoSemanal = 40 * pagoHora + (horasTrab - 40) * pagoHora * 2;
        }
        return sueldoSemanal;
    }
    
}

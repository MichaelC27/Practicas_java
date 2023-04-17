/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema17;

/**
 *
 * @author dbpan
 */
public class PaqueteTuristico {
    private String destino;
    private String fechaSalida;
    private double precio;
    
    public PaqueteTuristico(){}
    public PaqueteTuristico(String destino, String fechaSalida, double precio) {
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaSalida() {
        return this.fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
     public void MostrarDatosP (String destino, String fechasalida, double precio){
        System.out.println("El destino del paquete es: "+ destino);
        System.out.println("La fecha de salida: " + fechasalida );
        System.out.println("El precio del paquete es: "+ precio);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema7;

/**
 *
 * @author dbpan
 */
public class Fecha {
    private int dia,year,mes;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public Fecha(){}
     public Fecha(int dia, int mes, int year) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String[] getMeses() {
        return this.meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }
    public String formatoCorto(int dia,int year,int mes) {
        return String.format("%02d/%02d/%02d", mes, dia, year % 100);
    }

    public String formatoLargo(int dia,int year,int mes) {
        return String.format("%d de %s del %d", dia, meses[mes - 1], year);
    }

    public String formatoMediano(int dia,int year,int mes) {
        return String.format("%02d-%02d-%04d", mes, dia, year);
    }
     
}

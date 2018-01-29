/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.ejercicio1;

/**
 *
 * @author vergo_000
 */
public class Moneda {
    private double denominacion;
    private int cantidad;

    public Moneda() {
    }

    public Moneda( int cantidad,double denominacion) {
        this.denominacion = denominacion;
        this.cantidad = cantidad;
    }

    public double getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(int denominacion) {
        this.denominacion = denominacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}

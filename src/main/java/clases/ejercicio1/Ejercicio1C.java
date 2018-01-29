/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.ejercicio1;

import java.util.*;


/**
 *
 * @author vergo_000
 */
public class Ejercicio1C {

    List<Moneda> objMone;

    public Ejercicio1C() {
        this.objMone = new ArrayList<>();
    }

    public void agregar(int cant, double deno) {
      
        this.objMone.add(new Moneda(cant, deno));
    }

    public double calcular() {
        double resp = 0;
        try {
            for (Moneda cont : this.objMone) {
                resp += (cont.getCantidad() * cont.getDenominacion());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resp;
    }
    public void limpiar()
    {
        this.objMone.clear();
    }
}

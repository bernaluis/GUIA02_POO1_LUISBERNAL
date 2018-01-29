/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.ejercicio5;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author vergo_000
 */
public class CrudNotas {
 int index = 0;
    public List<Notas> not;

    public CrudNotas() {
        this.not = new ArrayList<>();
    }

    public void agregar(String nota) {
        this.not.add(new Notas(nota));

    }

    public void eliminarmodificar() {
       
        this.not.clear();
        
        
    }

   
    

    public ArrayList<String> consultar() {
        ArrayList<String> consulta = new ArrayList<>();
        for (Notas n : this.not) {
            consulta.add(n.getNota());
        }
        return consulta;
    }

}

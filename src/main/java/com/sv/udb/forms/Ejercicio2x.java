/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.forms;

/**
 *
 * @author vergo_000
 */
public class Ejercicio2x {

    public Ejercicio2x() {
    }

    public void figuras() {
        System.out.println("Figura 1");
        for (int i = 0; i < 8; i++) {

            if (i % 2 == 0) {
                System.out.println("   ***   ***   ***   ***   ***   ***   ***   ***\n   ***   ***   ***   ***   ***   ***   ***   ***\n   ***   ***   ***   ***   ***   ***   ***   ***");

            } else if (i % 2 == 1) {
                System.out.println("***   ***   ***   ***   ***   ***   ***   ***   \n***   ***   ***   ***   ***   ***   ***   ***   \n***   ***   ***   ***   ***   ***   ***   ***   ");
            }

        }
        System.out.println("Figura 2");
        int altura = 1;
        int i = 0;
        int espacios = 9 - 1;

        while (altura <= 9) {

      
            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            
            for (i = 1; i < altura; i++) {
                System.out.print(i);
            }

            for (i = altura; i > 0; i--) {
                System.out.print(i);
            }

            System.out.println();

            altura++;
            espacios--;
        } 
        System.out.println("Figura 3");
        for (int i3 = 0; i3 < 8; i3++) {

            if (i3 % 2 == 0) {
                System.out.println(" * * * * * * * *");
            } else if (i3 % 2 == 1) {
                System.out.println("* * * * * * * * ");
            }

        }
    }
}

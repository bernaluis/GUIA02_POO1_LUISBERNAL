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
public class FormularioP extends javax.swing.JFrame {

    /**
     * Creates new form FormularioP
     */
    public FormularioP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        btnEj1 = new javax.swing.JButton();
        btnEj2 = new javax.swing.JButton();
        btnEj3 = new javax.swing.JButton();
        btnEj5 = new javax.swing.JButton();
        btnEj4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setName("frmMenu"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenu.setText("Menu de ejercicios");
        getContentPane().add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 28, -1, -1));

        btnEj1.setText("Ejercicio1");
        btnEj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 77, -1, -1));

        btnEj2.setText("Ejercicio2");
        btnEj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 77, -1, -1));

        btnEj3.setText("Ejercicio 3");
        btnEj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        btnEj5.setText("Ejercicio 5");
        btnEj5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEj5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        btnEj4.setText("Ejercicio 4");
        btnEj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj1ActionPerformed
        // TODO add your handling code here:
        Ejercicio1 ej1 = new Ejercicio1();
        ej1.show();
    }//GEN-LAST:event_btnEj1ActionPerformed

    private void btnEj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj3ActionPerformed
        // TODO add your handling code here:
        Ejercicio3 ej3 = new Ejercicio3();
        ej3.show();
    }//GEN-LAST:event_btnEj3ActionPerformed

    private void btnEj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj4ActionPerformed
        // TODO add your handling code here:
        Ejercicio4 ej4 = new Ejercicio4();
        ej4.show();
    }//GEN-LAST:event_btnEj4ActionPerformed

    private void btnEj5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj5ActionPerformed
        // TODO add your handling code here:
        Ejercicio5 ej5 = new Ejercicio5();
        ej5.show();
    }//GEN-LAST:event_btnEj5ActionPerformed

    private void btnEj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj2ActionPerformed
        // TODO add your handling code here:
        Ejercicio2x ej2 = new Ejercicio2x();
        ej2.figuras();
    }//GEN-LAST:event_btnEj2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEj1;
    private javax.swing.JButton btnEj2;
    private javax.swing.JButton btnEj3;
    private javax.swing.JButton btnEj4;
    private javax.swing.JButton btnEj5;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.forms;

import javax.swing.JOptionPane;

/**
 *
 * @author vergo_000
 */
public class Ejercicio4 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio4
     */
    double valorm=0,valor1=0,valor2=0;
    public Ejercicio4() {
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

        btnMemoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        btnC = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnMem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMemoria.setText("Guardar");
        btnMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 84, -1, -1));

        jLabel1.setText("Resultado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setText("Ingresa un valor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorKeyPressed(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, -1));

        txtResultado.setEditable(false);
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 70, -1));

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        btnSuma.setText("Sumar");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 128, -1, -1));

        btnRestar.setText("Restar");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 172, -1, -1));

        btnDividir.setText("Dividir");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        getContentPane().add(btnDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        getContentPane().add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        btnMem.setText("Memoria");
        btnMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemActionPerformed(evt);
            }
        });
        getContentPane().add(btnMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyPressed
        // TODO add your handling code here:
      String numeros="1234567890-";
      if(numeros.contains(evt.getKeyChar()+""))
      {
      }
      else
      {
          txtValor.setText("");
      }
      
    }//GEN-LAST:event_txtValorKeyPressed

    private void btnMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoriaActionPerformed
        // TODO add your handling code here:
        try
        {
            valorm=Double.parseDouble(txtValor.getText());
            JOptionPane.showMessageDialog(rootPane, "Valor añadido en memoria");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
            txtValor.setText("");
        }
        
    }//GEN-LAST:event_btnMemoriaActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        valorm=valorm*0;
    }//GEN-LAST:event_btnCActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
                try
        {
            valor1=Double.parseDouble(txtValor.getText());
            txtResultado.setText(String.valueOf(valor2+valor1));
            valor2=valor2+valor1;
            JOptionPane.showMessageDialog(rootPane, "Valor sumado");
            txtValor.setText("");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
            txtValor.setText("");
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        // TODO add your handling code here:
                        try
        {
            valor1=Double.parseDouble(txtValor.getText());
            txtResultado.setText(String.valueOf(valor2-valor1));
            valor2=valor2-valor1;
            JOptionPane.showMessageDialog(rootPane, "Valor restado");
            txtValor.setText("");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
            txtValor.setText("");
        }
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        // TODO add your handling code here:
                        try
        {
            valor1=Double.parseDouble(txtValor.getText());
            txtResultado.setText(String.valueOf(valor2*valor1));
            valor2=valor2*valor1;
            JOptionPane.showMessageDialog(rootPane, "Valor multiplicado");
            txtValor.setText("");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
            txtValor.setText("");
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        // TODO add your handling code here:
                        try
        {
            valor1=Double.parseDouble(txtValor.getText());
            txtResultado.setText(String.valueOf(valor2/valor1));
            valor2=valor2/valor1;
            JOptionPane.showMessageDialog(rootPane, "Valor dividido");
            txtValor.setText("");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
            txtValor.setText("");
        }
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(String.valueOf(valor2));
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemActionPerformed
        // TODO add your handling code here:
        txtValor.setText(String.valueOf(valorm));
    }//GEN-LAST:event_btnMemActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMem;
    private javax.swing.JButton btnMemoria;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

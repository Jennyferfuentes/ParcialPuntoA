/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class cuadrado extends javax.swing.JFrame {

    /**
     * Creates new form cuadrado
     */
    public cuadrado() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtlado = new javax.swing.JTextField();
        btncalcular = new javax.swing.JButton();
        txtresultado = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 340));
        setMinimumSize(new java.awt.Dimension(400, 340));
        setPreferredSize(new java.awt.Dimension(400, 340));
        getContentPane().setLayout(null);

        jLabel1.setText("     AREA DEL CUADRADO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 50, 140, 30);

        jLabel2.setText("   DIGITE EL LADO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 110, 110, 20);

        txtlado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtladoActionPerformed(evt);
            }
        });
        getContentPane().add(txtlado);
        txtlado.setBounds(200, 110, 130, 20);

        btncalcular.setText("CALCULAR");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btncalcular);
        btncalcular.setBounds(80, 160, 100, 23);
        getContentPane().add(txtresultado);
        txtresultado.setBounds(200, 160, 130, 20);

        btnlimpiar.setText("LIMPIAR");
        getContentPane().add(btnlimpiar);
        btnlimpiar.setBounds(260, 260, 120, 23);

        jLabel4.setMaximumSize(new java.awt.Dimension(400, 400));
        jLabel4.setMinimumSize(new java.awt.Dimension(400, 400));
        jLabel4.setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 420, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtladoActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
  try {

            double area;
            double lado = Double.parseDouble(txtlado.getText());
            jf lol = new jf();
            area = lol.Area_cuadrado(lado);
            txtresultado.setText(String.valueOf(area));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido.", "///ERROR///", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btncalcularActionPerformed

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
            java.util.logging.Logger.getLogger(cuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuadrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtlado;
    private javax.swing.JTextField txtresultado;
    // End of variables declaration//GEN-END:variables
}

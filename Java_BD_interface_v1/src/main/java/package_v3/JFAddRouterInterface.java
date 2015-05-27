/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_v3;

import java.awt.Color;

/**
 *
 * @author Alexandra
 */
public class JFAddRouterInterface extends javax.swing.JFrame {

    // Attributs
    private String intercoDevName;
    /**
     * Creates new form JFAddRouterInterface
     */
    public JFAddRouterInterface(String intercoDevName) {
        initComponents();
        this.jLerr.setVisible(false);
        this.jLerr.setForeground(Color.red);
        this.intercoDevName=intercoDevName;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLinfo = new javax.swing.JLabel();
        jLfa0 = new javax.swing.JLabel();
        jLfa1 = new javax.swing.JLabel();
        jLser0 = new javax.swing.JLabel();
        jLser1 = new javax.swing.JLabel();
        jTfa0 = new javax.swing.JTextField();
        jTfa1 = new javax.swing.JTextField();
        jTser0 = new javax.swing.JTextField();
        jTser1 = new javax.swing.JTextField();
        jBOk = new javax.swing.JButton();
        jLerr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLinfo.setText("Configuration des interfaces du routeur");

        jLfa0.setText("Adresse Ip de l'interface fa0/0 : ");

        jLfa1.setText("Adresse Ip de l'interface fa0/1 :");

        jLser0.setText("Adresse Ip de l'interface Serial0/0/0 : ");

        jLser1.setText("Adresse Ip de l'interface Serial0/1/0 : ");

        jBOk.setText("Valider");
        jBOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOkActionPerformed(evt);
            }
        });

        jLerr.setText("Text d'erreur");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLfa0)
                                    .addComponent(jLfa1)
                                    .addComponent(jLser0)
                                    .addComponent(jLser1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTser1)
                                    .addComponent(jTser0)
                                    .addComponent(jTfa1)
                                    .addComponent(jTfa0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBOk)
                                .addGap(47, 47, 47))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLinfo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLerr)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLinfo)
                .addGap(18, 18, 18)
                .addComponent(jLerr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLfa0)
                                    .addComponent(jTfa0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLfa1))
                            .addComponent(jTfa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLser0))
                    .addComponent(jTser0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLser1)
                    .addComponent(jTser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jBOk)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOkActionPerformed
        // TODO add your handling code here:
        String ipAddrFa0 = this.jTfa0.getText();
        String ipAddrFa1 = this.jTfa1.getText();
        String ipAddrSer0 = this.jTser0.getText();
        String ipAddrSer1 = this.jTser1.getText();
        if(("".equals(ipAddrFa0)) || ("".equals(ipAddrFa1)) || ("".equals(ipAddrSer0)) || ("".equals(ipAddrSer1))){
            this.jLerr.setText("Vous avez oublié de remplir un champs");
            this.jLerr.setVisible(true);
        }
        else{
            Interface fa0 = new Interface("fa0/0", intercoDevName, ipAddrFa0);
            DBMana.UpdateDBInterface(fa0);
            Interface fa1 = new Interface("fa0/1", intercoDevName, ipAddrFa1);
            DBMana.UpdateDBInterface(fa1);
            Interface ser0 = new Interface("serial0/0/0", intercoDevName, ipAddrSer0);
            DBMana.UpdateDBInterface(ser0);
            Interface ser1 = new Interface("serial0/1/0", intercoDevName, ipAddrSer1);
            DBMana.UpdateDBInterface(ser1);
            JFAddOk addOk = new JFAddOk("routeur", "ajouté");
            addOk.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBOkActionPerformed

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
            java.util.logging.Logger.getLogger(JFAddRouterInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAddRouterInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAddRouterInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAddRouterInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAddRouterInterface("intercoDevName").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBOk;
    private javax.swing.JLabel jLerr;
    private javax.swing.JLabel jLfa0;
    private javax.swing.JLabel jLfa1;
    private javax.swing.JLabel jLinfo;
    private javax.swing.JLabel jLser0;
    private javax.swing.JLabel jLser1;
    private javax.swing.JTextField jTfa0;
    private javax.swing.JTextField jTfa1;
    private javax.swing.JTextField jTser0;
    private javax.swing.JTextField jTser1;
    // End of variables declaration//GEN-END:variables
}

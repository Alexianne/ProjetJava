package package_v3;


import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import static java.time.Clock.system;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandra
 */
public class JFAuthentication extends javax.swing.JFrame {

    /**
     * Creates new form JFrameUser
     */
    public JFAuthentication() {
        initComponents();
        this.jLerr.setVisible(false);
        this.jLerr.setForeground(Color.red);
    }
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelWelcom = new javax.swing.JLabel();
        jLIdentification = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();
        jLPwd = new javax.swing.JLabel();
        jTId = new javax.swing.JTextField();
        jBOK = new javax.swing.JButton();
        jLerr = new javax.swing.JLabel();
        jBQuit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTPwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelWelcom.setText("Bienvenue sur NetManag, le nouvel outil de gestion de réseau");

        jLIdentification.setText("Veuillez vous identifier : ");

        jLId.setText("Identifiant : ");

        jLPwd.setText("Mot de passe :");

        jBOK.setText("Valider");
        jBOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOKActionPerformed(evt);
            }
        });

        jLerr.setText("Texte d'erreur");

        jBQuit.setText("Quitter");
        jBQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQuitActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLIdentification)
                            .addComponent(jLabelWelcom)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLerr)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLPwd)
                                            .addComponent(jLId))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTId, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                            .addComponent(jTPwd)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBOK)
                .addGap(27, 27, 27)
                .addComponent(jBQuit)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelWelcom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLerr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLIdentification)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId)
                    .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPwd)
                    .addComponent(jTPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBOK)
                    .addComponent(jBQuit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOKActionPerformed
        // TODO add your handling code here:
        if (("".equals(this.jTId.getText()))||("".equals(this.jTPwd.getText()))){
            this.jLerr.setText("Vous avez oublié de remplir un champs");
            this.jLerr.setVisible(true);
        }
        else{
            this.jLerr.setText("autre erreur");
            this.jLerr.setVisible(true);
        }
        
        
        String idOK = jTId.getText();
        String pwdOK = jTPwd.getText();
        
        try {
            if(DBMana.checkID(idOK, pwdOK)){
                System.out.println("ID CHECK ");
                JFChoiceViewManag frameChoice = new JFChoiceViewManag();
                frameChoice.setVisible(true);
                this.setVisible(false);
                //Boss.closeWin()
            }
            else{
                System.out.println(idOK);
                System.out.println(pwdOK);
                System.out.println("erreur identification");
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFAuthentication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBOKActionPerformed

    private void jBQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQuitActionPerformed
  
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous quitter NetManag ?", "Arrêt en cours", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(option != JOptionPane.NO_OPTION && 
            option != JOptionPane.CANCEL_OPTION && 
            option != JOptionPane.CLOSED_OPTION){
            System.exit(0);
        }
        
        
    }//GEN-LAST:event_jBQuitActionPerformed

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
            java.util.logging.Logger.getLogger(JFAuthentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAuthentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAuthentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAuthentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAuthentication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBOK;
    private javax.swing.JButton jBQuit;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLIdentification;
    private javax.swing.JLabel jLPwd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelWelcom;
    private javax.swing.JLabel jLerr;
    private javax.swing.JTextField jTId;
    private javax.swing.JPasswordField jTPwd;
    // End of variables declaration//GEN-END:variables
}
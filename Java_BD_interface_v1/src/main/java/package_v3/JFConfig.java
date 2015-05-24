/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_v3;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Alexandra
 */
public class JFConfig extends javax.swing.JFrame {

    /**
     * Creates new form JFConfig
     */
    public JFConfig() {
        initComponents();
        this.setResizable(false);
        DefaultComboBoxModel listSite = new DefaultComboBoxModel();
        listSite=DBMana.selectDBSite(listSite);
        DefaultComboBoxModel listSite_2 = new DefaultComboBoxModel();
        listSite_2=DBMana.selectDBSite(listSite_2);
        DefaultComboBoxModel listSite_3 = new DefaultComboBoxModel();
        listSite_3=DBMana.selectDBSite(listSite_3);
        DefaultComboBoxModel listSite_4 = new DefaultComboBoxModel();
        listSite_4=DBMana.selectDBSite(listSite_4);
        DefaultComboBoxModel listSite_5 = new DefaultComboBoxModel();
        listSite_5=DBMana.selectDBSite(listSite_5);
        selectSite1.setModel(listSite);
        selectSite2.setModel(listSite_2);
        selectSite3.setModel(listSite_3);
        selectSite4.setModel(listSite_4);
        selectSite5.setModel(listSite_5);
        String siteName = (String)this.selectSite2.getSelectedItem();
        DefaultComboBoxModel listSite2 = new DefaultComboBoxModel();
        listSite2=DBMana.selectDBRoom(listSite2, siteName);
        String siteName2 = (String)this.selectSite3.getSelectedItem();
        DefaultComboBoxModel listSite3 = new DefaultComboBoxModel();
        listSite3=DBMana.selectDBRoom(listSite3, siteName2);
        String siteName3 = (String)this.selectSite4.getSelectedItem();
        DefaultComboBoxModel listSite4 = new DefaultComboBoxModel();
        listSite4=DBMana.selectDBRoom(listSite4, siteName3);
        String siteName4 = (String)this.selectSite5.getSelectedItem();
        DefaultComboBoxModel listSite5 = new DefaultComboBoxModel();
        listSite5=DBMana.selectDBRoom(listSite5, siteName4);
        selectRoom2.setModel(listSite2);
        selectRoom3.setModel(listSite3);
        selectRoom4.setModel(listSite4);
        selectRoom5.setModel(listSite5);
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
        jLConf = new javax.swing.JLabel();
        jImgSite = new javax.swing.JLabel();
        jImgRoom = new javax.swing.JLabel();
        jImgDev = new javax.swing.JLabel();
        jImgPc = new javax.swing.JLabel();
        jImgNetCard = new javax.swing.JLabel();
        jBAddSite = new javax.swing.JButton();
        jBAddRoom = new javax.swing.JButton();
        jBAddDev = new javax.swing.JButton();
        jBAddPc = new javax.swing.JButton();
        jBAddNetCard = new javax.swing.JButton();
        selectSite1 = new javax.swing.JComboBox();
        jBSupprSite = new javax.swing.JButton();
        selectSite2 = new javax.swing.JComboBox();
        selectRoom2 = new javax.swing.JComboBox();
        jBSupprRoom = new javax.swing.JButton();
        selectSite3 = new javax.swing.JComboBox();
        selectRoom3 = new javax.swing.JComboBox();
        selectDev3 = new javax.swing.JComboBox();
        jBSupprDev = new javax.swing.JButton();
        selectSite4 = new javax.swing.JComboBox();
        selectRoom4 = new javax.swing.JComboBox();
        selectPc4 = new javax.swing.JComboBox();
        jBSupprPc = new javax.swing.JButton();
        selectSite5 = new javax.swing.JComboBox();
        selectRoom5 = new javax.swing.JComboBox();
        selectPc5 = new javax.swing.JComboBox();
        selectNetCard5 = new javax.swing.JComboBox();
        jBSupprCard = new javax.swing.JButton();

        jLabel3.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLConf.setText("Configuration");

        jImgSite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/site.png"))); // NOI18N

        jImgRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/room.png"))); // NOI18N

        jImgDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devInterco.png"))); // NOI18N

        jImgPc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devices.png"))); // NOI18N

        jImgNetCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/card.png"))); // NOI18N

        jBAddSite.setText("Ajout Local");
        jBAddSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddSiteActionPerformed(evt);
            }
        });

        jBAddRoom.setText("Ajout Salle");
        jBAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddRoomActionPerformed(evt);
            }
        });

        jBAddDev.setText("Ajout Equipement d'interco");

        jBAddPc.setText("Ajout Equipement");

        jBAddNetCard.setText("Ajout Carte");

        jBSupprSite.setText("Supprimer Local");

        selectSite2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSite2ActionPerformed(evt);
            }
        });

        jBSupprRoom.setText("Supprimer Salle");

        selectSite3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSite3ActionPerformed(evt);
            }
        });

        jBSupprDev.setText("Supprimer Equipement d'interco");

        selectSite4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSite4ActionPerformed(evt);
            }
        });

        jBSupprPc.setText("Supprimer Equipement");

        selectSite5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSite5ActionPerformed(evt);
            }
        });

        jBSupprCard.setText("Supprimer Carte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jImgSite, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAddSite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSupprSite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectSite1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jImgRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBAddRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectSite2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectRoom2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSupprRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBSupprDev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectDev3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectRoom3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectSite3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBAddDev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jImgDev, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBSupprPc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectPc4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectRoom4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectSite4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAddPc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jImgPc)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectNetCard5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSupprCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectSite5, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectRoom5, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectPc5, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAddNetCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jImgNetCard)
                        .addGap(19, 19, 19)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLConf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jImgRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jImgSite, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jImgNetCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLConf, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jImgPc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jImgDev, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAddNetCard)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBAddDev)
                                .addComponent(jBAddPc))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBAddRoom)
                                .addComponent(jBAddSite)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(selectNetCard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jBSupprCard))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(selectSite2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectSite3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectSite5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectSite4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectSite1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(selectRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectRoom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(selectDev3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectPc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectPc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBSupprDev)
                                    .addComponent(jBSupprRoom)
                                    .addComponent(jBSupprPc)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSupprSite)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAddSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddSiteActionPerformed
        // TODO add your handling code here:
        JFAddSite frameAddSite = new JFAddSite();
        this.setVisible(false);
        frameAddSite.setVisible(true);
    }//GEN-LAST:event_jBAddSiteActionPerformed

    private void jBAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddRoomActionPerformed
        // TODO add your handling code here:
        JFAddRoom frameAddRoom = new JFAddRoom();
        this.setVisible(false);
        frameAddRoom.setVisible(true);
    }//GEN-LAST:event_jBAddRoomActionPerformed

    private void selectSite2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSite2ActionPerformed
        // TODO add your handling code here:
        String siteName = (String)this.selectSite2.getSelectedItem();
        DefaultComboBoxModel listSite = new DefaultComboBoxModel();
        listSite=DBMana.selectDBRoom(listSite, siteName);
        selectRoom2.setModel(listSite);
    }//GEN-LAST:event_selectSite2ActionPerformed

    private void selectSite3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSite3ActionPerformed
        // TODO add your handling code here:
        String siteName = (String)this.selectSite3.getSelectedItem();
        DefaultComboBoxModel listSite = new DefaultComboBoxModel();
        listSite=DBMana.selectDBRoom(listSite, siteName);
        selectRoom3.setModel(listSite);
    }//GEN-LAST:event_selectSite3ActionPerformed

    private void selectSite4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSite4ActionPerformed
        // TODO add your handling code here:
        String siteName = (String)this.selectSite4.getSelectedItem();
        DefaultComboBoxModel listSite = new DefaultComboBoxModel();
        listSite=DBMana.selectDBRoom(listSite, siteName);
        selectRoom4.setModel(listSite);
    }//GEN-LAST:event_selectSite4ActionPerformed

    private void selectSite5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSite5ActionPerformed
        // TODO add your handling code here:
        String siteName = (String)this.selectSite5.getSelectedItem();
        DefaultComboBoxModel listSite = new DefaultComboBoxModel();
        listSite=DBMana.selectDBRoom(listSite, siteName);
        selectRoom5.setModel(listSite);
    }//GEN-LAST:event_selectSite5ActionPerformed

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
            java.util.logging.Logger.getLogger(JFConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddDev;
    private javax.swing.JButton jBAddNetCard;
    private javax.swing.JButton jBAddPc;
    private javax.swing.JButton jBAddRoom;
    private javax.swing.JButton jBAddSite;
    private javax.swing.JButton jBSupprCard;
    private javax.swing.JButton jBSupprDev;
    private javax.swing.JButton jBSupprPc;
    private javax.swing.JButton jBSupprRoom;
    private javax.swing.JButton jBSupprSite;
    private javax.swing.JLabel jImgDev;
    private javax.swing.JLabel jImgNetCard;
    private javax.swing.JLabel jImgPc;
    private javax.swing.JLabel jImgRoom;
    private javax.swing.JLabel jImgSite;
    private javax.swing.JLabel jLConf;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox selectDev3;
    private javax.swing.JComboBox selectNetCard5;
    private javax.swing.JComboBox selectPc4;
    private javax.swing.JComboBox selectPc5;
    private javax.swing.JComboBox selectRoom2;
    private javax.swing.JComboBox selectRoom3;
    private javax.swing.JComboBox selectRoom4;
    private javax.swing.JComboBox selectRoom5;
    private javax.swing.JComboBox selectSite1;
    private javax.swing.JComboBox selectSite2;
    private javax.swing.JComboBox selectSite3;
    private javax.swing.JComboBox selectSite4;
    private javax.swing.JComboBox selectSite5;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_v3;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Alexandra
 */
public class JFAddNetworkCard1 extends javax.swing.JFrame {

    // Attributs
    private String devName;
    
    /**
     * Creates new form JFAddNetworkCard
     */
    public JFAddNetworkCard1(String devName) {
        initComponents();
        this.jLerr.setVisible(false);
        this.jLerr.setForeground(Color.red);
        this.devName=devName;
        DefaultComboBoxModel listConstr = new DefaultComboBoxModel();
        listConstr=DBMana.selectDBConstr(listConstr);
        selectConstr.setModel(listConstr);
        DefaultComboBoxModel listIntercoDev = new DefaultComboBoxModel();
        listIntercoDev=DBMana.selectDBIntercoDev(listIntercoDev);
        selectIntercoDev.setModel(listIntercoDev);
        String intercoDev = (String)this.selectIntercoDev.getSelectedItem();
        DefaultComboBoxModel listInt = new DefaultComboBoxModel();
        listInt=DBMana.selectDBInt(listInt, intercoDev);
        selectInt.setModel(listInt);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLAddNC = new javax.swing.JLabel();
        jLerr = new javax.swing.JLabel();
        selectIntercoDev = new javax.swing.JComboBox();
        selectInt = new javax.swing.JComboBox();
        jLIntercoDev = new javax.swing.JLabel();
        jLInt = new javax.swing.JLabel();
        selectConstr = new javax.swing.JComboBox();
        jLConstr = new javax.swing.JLabel();
        jTFinMac = new javax.swing.JTextField();
        jLFinMac = new javax.swing.JLabel();
        jBOk = new javax.swing.JButton();
        jImgAddNC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLAddNC.setText("Ajout d'une carte réseau");

        jLerr.setText("Texte d'erreur");

        selectIntercoDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectIntercoDevActionPerformed(evt);
            }
        });

        jLIntercoDev.setText("Equipement d'interconnexion :");

        jLInt.setText("Interface : ");

        jLConstr.setText("Constructeur : ");

        jLFinMac.setText("3 derniers octets @MAC : ");

        jBOk.setText("Valider");
        jBOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOkActionPerformed(evt);
            }
        });

        jImgAddNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addCard.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLIntercoDev)
                            .addComponent(jLInt)
                            .addComponent(jLConstr)
                            .addComponent(jLFinMac))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFinMac)
                            .addComponent(selectConstr, javax.swing.GroupLayout.Alignment.LEADING, 0, 80, Short.MAX_VALUE)
                            .addComponent(selectInt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectIntercoDev, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBOk)))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLAddNC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jImgAddNC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLerr)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLAddNC)
                .addGap(18, 18, 18)
                .addComponent(jImgAddNC)
                .addGap(39, 39, 39)
                .addComponent(jLerr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectIntercoDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIntercoDev))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLInt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectConstr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLConstr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFinMac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFinMac))
                .addGap(18, 18, 18)
                .addComponent(jBOk)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOkActionPerformed
        // TODO add your handling code here:
        String constr = (String)selectConstr.getSelectedItem();
        String debutMac = DBMana.getDBDebutMac(constr);
        String finMac = jTFinMac.getText();
        String addrMac = debutMac+finMac;
        String intercoDev = (String)selectIntercoDev.getSelectedItem();
        String interf = (String)selectInt.getSelectedItem();
        String ipAddress = "0.0.0.0";
        if(("".equals(finMac))){
            this.jLerr.setText("Vous avez oublié de remplir un champs");
            this.jLerr.setVisible(true);
        }
        else{
            //test nom equipement d'interco non existant
            boolean exist = DBMana.intercoDevExist(addrMac);
            if(!exist){
                this.jLerr.setText("La carte réseau "+addrMac+" existe déjà");
                this.jLerr.setVisible(true);
            }
            else{
                ipAddress = DBMana.setDBIPDevice(intercoDev, devName, interf);
                NetworkCard nc = new NetworkCard(devName, interf, intercoDev, addrMac, ipAddress);
                DBMana.AddDBNC(nc);
                String ip = DBMana.selectDBIpAddr(interf, intercoDev);
                Interface intCo = new Interface(interf, intercoDev, ip, "up");
                DBMana.UpdateDBInterface(intCo);
                JFAddOk addOk = new JFAddOk("équipement", "ajouté");
                addOk.setVisible(true);
                this.setVisible(false);
            }
        }
        
    }//GEN-LAST:event_jBOkActionPerformed

    private void selectIntercoDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectIntercoDevActionPerformed
        // TODO add your handling code here:
        String intercoDev = (String)this.selectIntercoDev.getSelectedItem();
        DefaultComboBoxModel listInt = new DefaultComboBoxModel();
        listInt=DBMana.selectDBInt(listInt, intercoDev);
        selectInt.setModel(listInt);
    }//GEN-LAST:event_selectIntercoDevActionPerformed

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
            java.util.logging.Logger.getLogger(JFAddNetworkCard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAddNetworkCard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAddNetworkCard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAddNetworkCard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAddNetworkCard1("devName").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBOk;
    private javax.swing.JLabel jImgAddNC;
    private javax.swing.JLabel jLAddNC;
    private javax.swing.JLabel jLConstr;
    private javax.swing.JLabel jLFinMac;
    private javax.swing.JLabel jLInt;
    private javax.swing.JLabel jLIntercoDev;
    private javax.swing.JLabel jLerr;
    private javax.swing.JTextField jTFinMac;
    private javax.swing.JComboBox selectConstr;
    private javax.swing.JComboBox selectInt;
    private javax.swing.JComboBox selectIntercoDev;
    // End of variables declaration//GEN-END:variables
}

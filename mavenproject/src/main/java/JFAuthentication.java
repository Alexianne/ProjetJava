/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import java.sql.*;

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabelWelcom = new javax.swing.JLabel();
        jLIdentification = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();
        jLPwd = new javax.swing.JLabel();
        jTId = new javax.swing.JTextField();
        jTPwd = new javax.swing.JTextField();
        jBOK = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLIdentification)
                    .addComponent(jLabelWelcom)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPwd)
                            .addComponent(jLId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTId)
                            .addComponent(jTPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBOK)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelWelcom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLIdentification)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId)
                    .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLPwd)
                    .addComponent(jTPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBOK)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jBOKActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        String id = "Test";
        String pwd = "pass";
        String idOK = jTId.getText();
        String pwdOK = jTPwd.getText();
        if(idOK.equals(id)){
            System.out.println("ok id");
            if(pwdOK.equals(pwd)){
                System.out.println("ok pwd");
                JFChoiceViewManag frameChoice = new JFChoiceViewManag();
                frameChoice.setVisible(true);
                this.setVisible(false);
                //Boss.closeWin();
            }
            else{
                System.out.println("erreur pwd");
            }
        }
        else{
            System.out.println("erreur id");
        }
    }                                    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jBOK;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLIdentification;
    private javax.swing.JLabel jLPwd;
    private javax.swing.JLabel jLabelWelcom;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTPwd;
    // End of variables declaration                   
}

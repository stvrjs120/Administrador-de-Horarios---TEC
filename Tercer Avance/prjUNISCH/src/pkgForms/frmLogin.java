/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgForms;

import pkgClasses.*;
import pkgMetods.clsMetods;

/**
 *
 * @author Familia
 */
public class frmLogin extends javax.swing.JFrame {

    clsMetods myMetods;
    clsTeacher UserTeacher;
    clsStudent UserStudent;
    clsCoordinator UserCoordinator;
    /**
     * Creates new form frmLogin
     */
    public frmLogin(clsMetods pMyMetods) {
        myMetods = pMyMetods;
        initComponents();
        lblError.show(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblUseID = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        lblUserPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNISCH - Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("UNISCH - Login");

        lblUseID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUseID.setText("UserID");
        lblUseID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblUseIDFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblUseIDFocusGained(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setText("Error:");

        lblUserPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUserPass.setText("Password");
        lblUserPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblUserPassFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblUserPassFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblUseID, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblError)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUserPass)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUseID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        clsUser User = myMetods.login(lblUseID.getText(), lblUserPass.getText());
        if (User == null) {
            lblError.setText("The user doesn't exist!");
            lblError.show(true);
        } else {
            if (User.getClass() == clsTeacher.class) {
                UserTeacher = (clsTeacher)User;
                this.show(false);
                new frmTeacherIni(myMetods, UserTeacher).show();
            }
            else if (User.getClass() == clsStudent.class) {
                UserStudent = (clsStudent)User;
                this.show(false);
                new frmStudentIni(myMetods, UserStudent).show();
            }
            else if (User.getClass() == clsCoordinator.class) {
                UserCoordinator = (clsCoordinator)User;
                this.show(false);
                new frmCoordinator(myMetods, UserCoordinator).show();
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblUseIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblUseIDFocusGained
        // TODO add your handling code here:
        if(lblUseID.getText().equals("UserID"))
            lblUseID.setText("");
    }//GEN-LAST:event_lblUseIDFocusGained

    private void lblUseIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblUseIDFocusLost
        // TODO add your handling code here:
        if(lblUseID.getText().equals(""))
            lblUseID.setText("UserID");
    }//GEN-LAST:event_lblUseIDFocusLost

    private void lblUserPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblUserPassFocusGained
        // TODO add your handling code here:
        if(lblUserPass.getText().equals("Password"))
            lblUserPass.setText("");
    }//GEN-LAST:event_lblUserPassFocusGained

    private void lblUserPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblUserPassFocusLost
        // TODO add your handling code here:
        if(lblUserPass.getText().equals(""))
            lblUserPass.setText("Password");
    }//GEN-LAST:event_lblUserPassFocusLost

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextField lblUseID;
    private javax.swing.JPasswordField lblUserPass;
    // End of variables declaration//GEN-END:variables
}
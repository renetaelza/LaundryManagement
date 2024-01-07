package com.itenas.oop.view.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.itenas.oop.uas.pojo.Admin;
import com.itenas.oop.uas.service.AdminService;
import com.itenas.oop.uas.serviceimpl.AdminServiceImpl;
import static com.itenas.oop.uas.view.LoginAdminViewDemo.login;

public class HomePage extends javax.swing.JFrame {
    AdminService adminService = new AdminServiceImpl();
    Dashboard dashboard;
    Admin admin;
    boolean login = false;
    
    public HomePage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void showPassword(){
        if(cbShowPass.isSelected()){
            txtPassword.setEchoChar((char)0);
            cbShowPass.setText("Hide Password");
        } else {
            txtPassword.setEchoChar('*');
            cbShowPass.setText("Show Password");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        Welcome = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        btnLinkRegister = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Welcome1 = new javax.swing.JLabel();
        cbShowPass = new javax.swing.JCheckBox();
        btnRegister = new com.itenas.oop.view.swing.Rounded();
        btnTextRegister = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\OneDrive\\Documents\\OOP\\KULIAH\\Images\\welcome3.png")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\OneDrive\\Documents\\OOP\\KULIAH\\Images\\welcome3.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\rsz_12screenshot_2023-12-27_105656.png")); // NOI18N
        jLabel3.setText("Laundry Dee Kilos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\renet\\Downloads\\foto\\rsz_13.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(54, 1, 151));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        Welcome.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText("Welcome Back");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Don't Have An Account? Click");

        btnLinkRegister.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnLinkRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnLinkRegister.setText("here");
        btnLinkRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLinkRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLinkRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLinkRegisterMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Username");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password");

        Welcome1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Welcome1.setForeground(new java.awt.Color(255, 255, 255));
        Welcome1.setText("Hello,");

        cbShowPass.setBackground(new java.awt.Color(54, 1, 151));
        cbShowPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbShowPass.setForeground(new java.awt.Color(255, 255, 255));
        cbShowPass.setText("Show Password");
        cbShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPassActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(255, 255, 51));
        btnRegister.setRoundBottomLeft(25);
        btnRegister.setRoundBottomRight(25);
        btnRegister.setRoundTopLeft(25);
        btnRegister.setRoundTopRight(25);
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
        });

        btnTextRegister.setBackground(new java.awt.Color(0, 0, 0));
        btnTextRegister.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnTextRegister.setText("LOGIN");
        btnTextRegister.setToolTipText("");
        btnTextRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTextRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegisterLayout = new javax.swing.GroupLayout(btnRegister);
        btnRegister.setLayout(btnRegisterLayout);
        btnRegisterLayout.setHorizontalGroup(
            btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegisterLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnTextRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRegisterLayout.setVerticalGroup(
            btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTextRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLinkRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(50, 50, 50)))
                        .addComponent(jLabel5))
                    .addComponent(jLabel9)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(Welcome)
                    .addComponent(Welcome1)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Welcome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Welcome)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(8, 8, 8)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(cbShowPass)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(btnLinkRegister))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void cbShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPassActionPerformed
        // TODO add your handling code here:
        showPassword();
    }//GEN-LAST:event_cbShowPassActionPerformed

    private void btnLinkRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLinkRegisterMouseClicked
        // TODO add your handling code here:
        btnLinkRegister.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                dispose();
                new RegisterForm().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnLinkRegisterMouseClicked

    private void btnLinkRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLinkRegisterMouseEntered
        // TODO add your handling code here:
        underlineText(true);
    }//GEN-LAST:event_btnLinkRegisterMouseEntered

    private void btnLinkRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLinkRegisterMouseExited
        // TODO add your handling code here:
        underlineText(false);
    }//GEN-LAST:event_btnLinkRegisterMouseExited

    private void btnTextRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTextRegisterMouseClicked
        // TODO add your handling code here:
        String username, password;
        username = txtUsername.getText();
        password = String.valueOf(txtPassword.getPassword());

        admin = adminService.login(username, password);

        if(admin != null){
            login = true;
            admin.setLoginStatus(login);
            JOptionPane.showMessageDialog(null, "Login berhasil!");
            dashboard = new Dashboard(admin);
            dashboard.setExtendedState(JFrame.MAXIMIZED_BOTH);

            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            this.dispose();

            dashboard.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Username dan password salah!");
        }
    }//GEN-LAST:event_btnTextRegisterMouseClicked

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        // TODO add your handling code here:
        String username, password;
        username = txtUsername.getText();
        password = String.valueOf(txtPassword.getPassword());

        admin = adminService.login(username, password);

        if(admin != null){
            login = true;
            admin.setLoginStatus(login);
            JOptionPane.showMessageDialog(null, "Login berhasil!");
            dashboard = new Dashboard(admin);
            dashboard.setExtendedState(JFrame.MAXIMIZED_BOTH);

            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            this.dispose();

            dashboard.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Username dan password salah!");
        }
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        // TODO add your handling code here:
        btnRegister.setBackground(new Color(255,255,153));
        btnTextRegister.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        // TODO add your handling code here:
        btnRegister.setBackground(new Color(255,255,51));
        btnTextRegister.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnRegisterMouseExited

    private void underlineText(boolean underline) {
        String labelText = btnLinkRegister.getText();
        if (underline) {
            labelText = "<html><u>" + labelText + "</u></html>";
        } else {
            labelText = labelText.replaceAll("<html><u>", "").replaceAll("</u></html>", "");
        }
        btnLinkRegister.setText(labelText);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel Welcome1;
    private javax.swing.JLabel btnLinkRegister;
    private com.itenas.oop.view.swing.Rounded btnRegister;
    private javax.swing.JLabel btnTextRegister;
    private javax.swing.JCheckBox cbShowPass;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}

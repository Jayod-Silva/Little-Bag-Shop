
package com.mycompany.littlebagshopgui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class CreateNewUserFrame extends javax.swing.JFrame {

    
    public CreateNewUserFrame() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        btnAddNewUser = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(216, 231, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Add New User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 175, 236)));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 200, 33));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 68, 20));

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 175, 236)));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 200, 33));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Role");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 37, -1));

        cmbRole.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Cashier" }));
        cmbRole.setBorder(null);
        cmbRole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cmbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 287, -1, 30));

        btnAddNewUser.setBackground(new java.awt.Color(0, 102, 102));
        btnAddNewUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddNewUser.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNewUser.setText("Add");
        btnAddNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 80, 40));

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 80, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login shop icon.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 46, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot_2024-08-22_at_14-13-50_Vector_Illustration_woman_holding_shopping_bags_Premium_AI-generated_vector-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 290, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewUserActionPerformed
        boolean isValid = true;

          File userFile = new File("D:\\data\\user.txt");
          
          
          if(txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty())
          
        {
            JOptionPane.showMessageDialog(rootPane,"Fields cant be blank!!","Create User Form", JOptionPane.ERROR_MESSAGE);
            isValid=false;
        }
          

         if (isValid) {
               JOptionPane.showMessageDialog(rootPane, "Create New User: " + cmbRole.getSelectedItem().toString());

           String username = txtUsername.getText();
           String password = txtPassword.getText();
           String role = (String) cmbRole.getSelectedItem();

           String record = String.join(",",username, password, role);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userFile, true))) {
             bufferedWriter.write(record);
             bufferedWriter.newLine();
              JOptionPane.showMessageDialog(rootPane, "Successfully saved!", "Saved File", JOptionPane.INFORMATION_MESSAGE);
         } catch (IOException e) {
              System.out.println("Save error! Unable to store the values" + e);
         }
    }

    
    
    }//GEN-LAST:event_btnAddNewUserActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new ManagerFrame().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(CreateNewUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CreateNewUserFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewUser;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}


package com.mycompany.littlebagshopgui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;



public class CashierFrame extends javax.swing.JFrame {
    
    File myfile;

    public CashierFrame() {
        initComponents();
        
        try
        {
            myfile = new File("D:\\data\\bags.txt");
            if(myfile.createNewFile())
            {
                System.out.println("file created" + myfile.getName());
            }
            else
            {
                System.out.println("File Already Exists");
            }
        }
        catch(IOException ex)
        {
            System.out.println("Ann Error Occured"+ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSearchBag = new javax.swing.JButton();
        txtSearchBag = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(216, 231, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 0));
        btnBack.setText("Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 423, 80, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID                 :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name           :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Category     :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Price            :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, -1));

        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 175, 236)));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 160, 30));

        txtCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 175, 236)));
        jPanel1.add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 160, 30));

        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 175, 236)));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 160, 30));

        txtName.setToolTipText("");
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 175, 236)));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 160, 30));

        btnSave.setBackground(new java.awt.Color(0, 102, 102));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(242, 242, 242));
        btnSave.setText("Add New Bag");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, 30));

        btnView.setBackground(new java.awt.Color(204, 204, 204));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnView.setText("View Bags");
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 100, 30));

        jLabel6.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel6.setText("Welcome..!");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("View Bags & Add New Bags");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        btnSearchBag.setBackground(new java.awt.Color(0, 102, 102));
        btnSearchBag.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearchBag.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchBag.setText("Search");
        btnSearchBag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchBag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBagActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchBag, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, 30));

        txtSearchBag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 175, 236)));
        jPanel1.add(txtSearchBag, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 160, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Search Bags");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimal-modern-character-woman-shopping-flat-vector-illustration-design-ai-generative_1002555-7747-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 470, 320));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login shop icon.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        String Line,Lines = "";
        try
        {
            FileReader fileReader = new FileReader(myfile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((Line = bufferedReader.readLine()) != null)
            {

                System.out.println(Line);
                Lines=Lines+Line + "\n";
            }
            JOptionPane.showMessageDialog(rootPane, Lines);
        }
        catch (IOException ex)
        {
            System.out.println("An error occurred display values!!"+ex);
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String ID = txtId.getText();
        String BagName = txtName.getText();
        String Category = txtCategory.getText();
        String Price = txtPrice.getText();
        
        
        if (ID.isEmpty() || BagName.isEmpty() || Category.isEmpty() || Price.isEmpty()) {
          
        
           JOptionPane.showMessageDialog(rootPane, "Fields cannot be left blank!!", "Input Error", JOptionPane.ERROR_MESSAGE);
           
           return; 
        }
        

        String record =ID+" , "+BagName+" , "+Category+" , "+Price;

        try{
            try (FileWriter fileWriter = new FileWriter(myfile,true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                bufferedWriter.write(record);
                bufferedWriter.newLine();
            }

            JOptionPane.showMessageDialog(rootPane, "Successfully Added to the System!!");

        }
        catch(IOException ex)
        {
            System.out.println("An Error Occured"+ ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchBagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBagActionPerformed
        try
        {
            boolean found = true;
            String[] BagData = null;

            FileReader fileReader = new FileReader(myfile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String FindLine;
            String SearchCategory = txtSearchBag.getText();

            outerLoop:
            while((FindLine = bufferedReader.readLine()) !=null)
            {
                BagData = FindLine.split(" , ");

                for (String records : BagData)
                {
                    if (records.equalsIgnoreCase(SearchCategory))
                    {
                        found = true;
                        System.out.println(FindLine);

                        break outerLoop;
                    }
                    else
                    {
                        found=false;
                    }
                }
            }
            if(found)
            {
                String message = "Result found :\n" + FindLine;
                JOptionPane.showMessageDialog(rootPane,message,"Recorded Successfully!!",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "No Matching Category Found !!","Input Error",JOptionPane.ERROR_MESSAGE);
            }

        }
        catch(IOException ex){

            JOptionPane.showMessageDialog(rootPane, "Än Error Occurred Seraching!!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchBagActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    
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
            java.util.logging.Logger.getLogger(CashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CashierFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchBag;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearchBag;
    // End of variables declaration//GEN-END:variables
}

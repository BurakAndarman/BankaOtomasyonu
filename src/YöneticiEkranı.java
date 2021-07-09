
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itopya
 */
public class YöneticiEkranı extends javax.swing.JFrame {

    public static String Password,ID;
    
    public YöneticiEkranı() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        adminInterfaceName = new javax.swing.JLabel();
        adminInterfaceSurname = new javax.swing.JLabel();
        staffIDTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        staffNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        staffSurnameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        displayStaffAccountButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        determinedSalaryTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        determineSalaryButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        staffIDTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        closeStaffAccountButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        payStaffSalaryButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        customerIDTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        closeCustomerAccountButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        customerIDTextField1 = new javax.swing.JTextField();
        displayCustomerAccountButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        displayAllCustomersButton = new javax.swing.JButton();
        displayAllStaffButton = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Hoşgeldiniz");

        adminInterfaceName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adminInterfaceName.setText("jLabel2");

        adminInterfaceSurname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adminInterfaceSurname.setText("jLabel3");

        staffIDTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffIDTextField1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Personel Maaşı Belirle");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Personel Bilgisi Görüntüle");

        staffNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffNameTextFieldKeyTyped(evt);
            }
        });

        jLabel6.setText("Personelin Adı");

        staffSurnameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffSurnameTextFieldKeyTyped(evt);
            }
        });

        jLabel7.setText("Personelin Soyadı");

        displayStaffAccountButton.setText("Görüntüle");
        displayStaffAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayStaffAccountButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Personelin ID'si");

        determinedSalaryTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                determinedSalaryTextFieldKeyTyped(evt);
            }
        });

        jLabel9.setText("Personelin Alacağı Maaş");

        determineSalaryButton.setText("Onayla");
        determineSalaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                determineSalaryButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Personelin Kaydını Sil");

        staffIDTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffIDTextField2KeyTyped(evt);
            }
        });

        jLabel11.setText("Personel ID'si");

        closeStaffAccountButton.setText("Kaydı Sil");
        closeStaffAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeStaffAccountButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Personel Maaşları Öde");

        payStaffSalaryButton.setText("Ödemeyi Yap");
        payStaffSalaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payStaffSalaryButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Müşteri Hesabını Kapat");

        customerIDTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                customerIDTextField2KeyTyped(evt);
            }
        });

        jLabel14.setText("Müşteri ID'si");

        closeCustomerAccountButton.setText("Onayla");
        closeCustomerAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeCustomerAccountButtonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Müşteri Bilgisi Görüntüle");

        customerIDTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                customerIDTextField1KeyTyped(evt);
            }
        });

        displayCustomerAccountButton.setText("Görüntüle");
        displayCustomerAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCustomerAccountButtonActionPerformed(evt);
            }
        });

        jLabel16.setText("Müşteri ID'si");

        jButton1.setText("Giriş Ekranına Dön");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        displayAllCustomersButton.setText("Tüm Müşterileri Görüntüle");
        displayAllCustomersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllCustomersButtonActionPerformed(evt);
            }
        });

        displayAllStaffButton.setText("Tüm Personelleri Görüntüle");
        displayAllStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllStaffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(staffIDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(payStaffSalaryButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(determinedSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(staffSurnameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(staffNameTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)))
                                    .addComponent(displayStaffAccountButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(customerIDTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(closeCustomerAccountButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(determineSalaryButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(customerIDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(displayCustomerAccountButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(staffIDTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayAllCustomersButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminInterfaceName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminInterfaceSurname)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeStaffAccountButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayAllStaffButton)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(adminInterfaceName)
                    .addComponent(adminInterfaceSurname))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffIDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(payStaffSalaryButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(determinedSalaryTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(determineSalaryButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerIDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayCustomerAccountButton)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(customerIDTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(closeCustomerAccountButton))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(staffNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(staffSurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(displayStaffAccountButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(staffIDTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayAllCustomersButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(closeStaffAccountButton)
                            .addComponent(displayAllStaffButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void payStaffSalaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payStaffSalaryButtonActionPerformed
        BankaYöneticisi y=new BankaYöneticisi();
        y.personelMaaşÖde();
    }//GEN-LAST:event_payStaffSalaryButtonActionPerformed

    private void customerIDTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerIDTextField1KeyTyped
        PersonelArayüzü.onlyDigit(evt);
    }//GEN-LAST:event_customerIDTextField1KeyTyped

    private void displayCustomerAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCustomerAccountButtonActionPerformed
        if(customerIDTextField1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(displayCustomerAccountButton, "Lütfen bir ID girin.");
        }
        else{
        BankaYöneticisi y=new BankaYöneticisi();
        y.müşteriBilgisiGörüntüle(customerIDTextField1.getText());
        }
    }//GEN-LAST:event_displayCustomerAccountButtonActionPerformed

    private void customerIDTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerIDTextField2KeyTyped
        PersonelArayüzü.onlyDigit(evt);
    }//GEN-LAST:event_customerIDTextField2KeyTyped

    private void closeCustomerAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCustomerAccountButtonActionPerformed
        if(customerIDTextField2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(closeCustomerAccountButton, "Lütfen bir ID girin.");
        }
        else{
        BankaYöneticisi y=new BankaYöneticisi();
        y.müşteriHesabınıKapat(customerIDTextField2.getText());
        }
    }//GEN-LAST:event_closeCustomerAccountButtonActionPerformed

    private void staffIDTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffIDTextField1KeyTyped
        PersonelArayüzü.onlyDigit(evt);
    }//GEN-LAST:event_staffIDTextField1KeyTyped

    private void determinedSalaryTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_determinedSalaryTextFieldKeyTyped
        PersonelArayüzü.onlyDigit(evt);
    }//GEN-LAST:event_determinedSalaryTextFieldKeyTyped

    private void determineSalaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_determineSalaryButtonActionPerformed
        if(staffIDTextField1.getText().trim().isEmpty() || determinedSalaryTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(determineSalaryButton, "Lütfen boş alanları doldurun");
        }
        else{
        BankaYöneticisi y=new BankaYöneticisi();
        y.personelMaaşBelirle(staffIDTextField1.getText(), determinedSalaryTextField.getText());
        }
    }//GEN-LAST:event_determineSalaryButtonActionPerformed

    private void staffNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffNameTextFieldKeyTyped
        YöneticiEkranı.onlyCharacter(evt);
    }//GEN-LAST:event_staffNameTextFieldKeyTyped

    private void staffSurnameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffSurnameTextFieldKeyTyped
        YöneticiEkranı.onlyCharacter(evt);
    }//GEN-LAST:event_staffSurnameTextFieldKeyTyped

    private void displayStaffAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayStaffAccountButtonActionPerformed
        if(staffNameTextField.getText().trim().isEmpty() || staffSurnameTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(displayStaffAccountButton, "Lütfen boş alanları doldurun");
        }
        else{
        BankaYöneticisi y=new BankaYöneticisi();
        y.personelBilgisiGörüntüle(staffNameTextField.getText().toLowerCase(), staffSurnameTextField.getText().toLowerCase());
        }
    }//GEN-LAST:event_displayStaffAccountButtonActionPerformed

    private void staffIDTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffIDTextField2KeyTyped
        PersonelArayüzü.onlyDigit(evt);
    }//GEN-LAST:event_staffIDTextField2KeyTyped

    private void closeStaffAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeStaffAccountButtonActionPerformed
        if(staffIDTextField2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(closeCustomerAccountButton, "Lütfen bir ID girin.");
        }
        else{
        BankaYöneticisi y=new BankaYöneticisi();
        y.personelKaydıSil(staffIDTextField2.getText());
        }
    }//GEN-LAST:event_closeStaffAccountButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main.loginAc();
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void displayAllCustomersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllCustomersButtonActionPerformed
        BankaYöneticisi.tümünüGörüntüle(new Müşteri());
    }//GEN-LAST:event_displayAllCustomersButtonActionPerformed

    private void displayAllStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllStaffButtonActionPerformed
        BankaYöneticisi.tümünüGörüntüle(new BankaPersoneli());
    }//GEN-LAST:event_displayAllStaffButtonActionPerformed

    public static void onlyCharacter(java.awt.event.KeyEvent evt){
        char TestChar=evt.getKeyChar();
        if(!(Character.isAlphabetic(TestChar)))
            evt.consume();
    }
    
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
            java.util.logging.Logger.getLogger(YöneticiEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YöneticiEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YöneticiEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YöneticiEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YöneticiEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel adminInterfaceName;
    public static javax.swing.JLabel adminInterfaceSurname;
    private javax.swing.JButton closeCustomerAccountButton;
    private javax.swing.JButton closeStaffAccountButton;
    private javax.swing.JTextField customerIDTextField1;
    private javax.swing.JTextField customerIDTextField2;
    private javax.swing.JButton determineSalaryButton;
    private javax.swing.JTextField determinedSalaryTextField;
    private javax.swing.JButton displayAllCustomersButton;
    private javax.swing.JButton displayAllStaffButton;
    private javax.swing.JButton displayCustomerAccountButton;
    private javax.swing.JButton displayStaffAccountButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton payStaffSalaryButton;
    private javax.swing.JTextField staffIDTextField1;
    private javax.swing.JTextField staffIDTextField2;
    private javax.swing.JTextField staffNameTextField;
    private javax.swing.JTextField staffSurnameTextField;
    // End of variables declaration//GEN-END:variables
}


import java.io.*;
import static java.lang.Boolean.TRUE;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Kaydolma extends javax.swing.JFrame {

    public Kaydolma() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        createAccount = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        accountSurname = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        accountPassword = new javax.swing.JPasswordField();
        accountPasswordAgain = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        togglePassword = new javax.swing.JCheckBox();
        getPassToLoginScreen = new javax.swing.JButton();
        userTypeRadioButton = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        accountName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Adınızı girin");

        jLabel2.setText("Soyadınız girin");

        createAccount.setText("Kaydol");
        createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountActionPerformed(evt);
            }
        });

        jLabel3.setText("Banka Hesabı Oluştur");

        accountSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountSurnameActionPerformed(evt);
            }
        });
        accountSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountSurnameKeyTyped(evt);
            }
        });

        jLabel7.setText("Şifrenizi belirleyin");

        accountPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountPasswordActionPerformed(evt);
            }
        });

        accountPasswordAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountPasswordAgainActionPerformed(evt);
            }
        });

        jLabel8.setText("Şifrenizi tekrar yazın");

        togglePassword.setText("Şifreyi Göster");
        togglePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglePasswordActionPerformed(evt);
            }
        });

        getPassToLoginScreen.setText("Giriş Ekranına Geç");
        getPassToLoginScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPassToLoginScreenActionPerformed(evt);
            }
        });

        userTypeRadioButton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Müşteri hesabı", "Çalışan hesabı", "Yönetici hesabı" }));
        userTypeRadioButton.setToolTipText("");
        userTypeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeRadioButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Hesabınız varsa");

        accountName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNameActionPerformed(evt);
            }
        });
        accountName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountNameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountPassword)
                    .addComponent(accountPasswordAgain, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(accountSurname)
                    .addComponent(accountName))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(56, 56, 56)
                        .addComponent(togglePassword))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)))
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createAccount)
                        .addGap(149, 149, 149)
                        .addComponent(getPassToLoginScreen)
                        .addGap(110, 110, 110))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userTypeRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(userTypeRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(accountName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(accountPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togglePassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountPasswordAgain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getPassToLoginScreen)
                    .addComponent(createAccount))
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountActionPerformed
        if(accountName.getText().trim().isEmpty() || accountSurname.getText().trim().isEmpty() || accountPassword.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(createAccount, "Lütfen boş alanları doldurun.");
        }
        else if(!accountPassword.getText().equals(accountPasswordAgain.getText())){
            JOptionPane.showMessageDialog(createAccount, "İkinci alana girdiğiniz şifre ilkiyle aynı olmalı.Lütfen tekrar deneyin.");
        }
        
        else{
            if(userTypeRadioButton.getSelectedIndex()==0){
                
                 Müşteri müşteri =new Müşteri(accountName.getText().toLowerCase(), accountSurname.getText().toLowerCase(), accountPassword.getText());
                 müşteri.kayıtİşlemleri();
                
            }
            else if(userTypeRadioButton.getSelectedIndex()==1){
                 BankaPersoneli bankapersoneli =new BankaPersoneli(accountName.getText().toLowerCase(), accountSurname.getText().toLowerCase(), accountPassword.getText());
                 bankapersoneli.kayıtİşlemleri();
                
            }
            else {
                BankaYöneticisi bankayöneticisi =new BankaYöneticisi(accountName.getText().toLowerCase(), accountSurname.getText().toLowerCase(), accountPassword.getText());
                 bankayöneticisi.kayıtİşlemleri();
            }
          this.setVisible(false);
          dispose();
        }
    }//GEN-LAST:event_createAccountActionPerformed

    private void accountSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountSurnameActionPerformed

    private void accountSurnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountSurnameKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isAlphabetic(TestChar)))
            evt.consume(); 
    }//GEN-LAST:event_accountSurnameKeyTyped

    private void accountPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountPasswordActionPerformed

    private void accountPasswordAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountPasswordAgainActionPerformed
        
    }//GEN-LAST:event_accountPasswordAgainActionPerformed

    private void togglePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglePasswordActionPerformed
        if(togglePassword.isSelected()){
            accountPassword.setEchoChar((char)0);
        }
        else{
            accountPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_togglePasswordActionPerformed

    private void userTypeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTypeRadioButtonActionPerformed

    private void accountNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNameActionPerformed

    private void accountNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountNameKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isAlphabetic(TestChar)))
            evt.consume();
    }//GEN-LAST:event_accountNameKeyTyped

    private void getPassToLoginScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPassToLoginScreenActionPerformed
        Main.loginAc();
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_getPassToLoginScreenActionPerformed

    
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
            java.util.logging.Logger.getLogger(Kaydolma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kaydolma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kaydolma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kaydolma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Kaydolma().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountName;
    private javax.swing.JPasswordField accountPassword;
    private javax.swing.JPasswordField accountPasswordAgain;
    private javax.swing.JFormattedTextField accountSurname;
    private javax.swing.JButton createAccount;
    private javax.swing.JButton getPassToLoginScreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JCheckBox togglePassword;
    private javax.swing.JComboBox<String> userTypeRadioButton;
    // End of variables declaration//GEN-END:variables
}

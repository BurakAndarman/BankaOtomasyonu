
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        accountName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        accountSurname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        getPassToFunctionalScreen = new javax.swing.JButton();
        getBackToRegisterScreen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        userTypeRadioButton = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        changePassword = new javax.swing.JButton();
        accountPassword = new javax.swing.JPasswordField();
        accountID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Andarman Bank'a Hoşgeldiniz");

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

        jLabel2.setText("Ad");

        accountSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountSurnameKeyTyped(evt);
            }
        });

        jLabel3.setText("Soyad");

        jLabel4.setText("Şifre");

        getPassToFunctionalScreen.setText("Giriş");
        getPassToFunctionalScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPassToFunctionalScreenActionPerformed(evt);
            }
        });

        getBackToRegisterScreen.setText("Hesap Oluştur");
        getBackToRegisterScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBackToRegisterScreenActionPerformed(evt);
            }
        });

        jLabel5.setText("Hesabınız yoksa");

        userTypeRadioButton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Müşteriyim", "Çalışanım", "Yöneticiyim" }));

        changePassword.setText("Şifre Değiştir");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });

        accountPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountPasswordActionPerformed(evt);
            }
        });

        accountID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountIDActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(accountName)
                            .addComponent(accountPassword)
                            .addComponent(accountSurname)
                            .addComponent(accountID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel5)
                        .addGap(95, 95, 95)
                        .addComponent(getPassToFunctionalScreen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(getBackToRegisterScreen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userTypeRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changePassword))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(userTypeRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(accountName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(getPassToFunctionalScreen)
                        .addGap(19, 19, 19)
                        .addComponent(getBackToRegisterScreen)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changePassword)
                        .addGap(31, 31, 31))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void accountNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNameActionPerformed
       
    }//GEN-LAST:event_accountNameActionPerformed

    private void getBackToRegisterScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBackToRegisterScreenActionPerformed
        Kaydolma kaydol=new Kaydolma();
        kaydol.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_getBackToRegisterScreenActionPerformed

    private void getPassToFunctionalScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPassToFunctionalScreenActionPerformed
        if(accountName.getText().trim().isEmpty() || accountSurname.getText().trim().isEmpty() || accountPassword.getText().trim().isEmpty() ||accountID.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(getPassToFunctionalScreen, "Lütfen boş alanları doldurun.");
        }
        else{
            if(userTypeRadioButton.getSelectedIndex()==0){
                Müşteri müşteri=new Müşteri(accountName.getText().toLowerCase(),accountSurname.getText().toLowerCase(),accountPassword.getText(),accountID.getText());
                müşteri.giriş();
                
            }
            else if(userTypeRadioButton.getSelectedIndex()==1){
                BankaPersoneli personel=new BankaPersoneli(accountName.getText().toLowerCase(),accountSurname.getText().toLowerCase(),accountPassword.getText(),accountID.getText());
                personel.giriş();
            }
            else{
                BankaYöneticisi yönetici=new BankaYöneticisi(accountName.getText().toLowerCase(),accountSurname.getText().toLowerCase(),accountPassword.getText(),accountID.getText());
                yönetici.giriş();
            }
            this.setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_getPassToFunctionalScreenActionPerformed

    private void accountNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountNameKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isAlphabetic(TestChar)))
            evt.consume();
    }//GEN-LAST:event_accountNameKeyTyped

    private void accountSurnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountSurnameKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isAlphabetic(TestChar)))
            evt.consume();
    }//GEN-LAST:event_accountSurnameKeyTyped

    private void accountPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountPasswordActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        ŞifreDeğiştirmeEkranı ekran=new ŞifreDeğiştirmeEkranı();
        ekran.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_changePasswordActionPerformed

    private void accountIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountIDActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField accountID;
    public static javax.swing.JTextField accountName;
    public static javax.swing.JPasswordField accountPassword;
    public static javax.swing.JTextField accountSurname;
    private javax.swing.JButton changePassword;
    private javax.swing.JButton getBackToRegisterScreen;
    private javax.swing.JButton getPassToFunctionalScreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> userTypeRadioButton;
    // End of variables declaration//GEN-END:variables
}

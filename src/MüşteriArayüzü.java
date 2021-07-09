
import javax.swing.JOptionPane;


public class MüşteriArayüzü extends javax.swing.JFrame {

    public static String ID,Password;

    public MüşteriArayüzü() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        customerInterfaceSurname = new javax.swing.JLabel();
        customerInterfaceName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        paraYatırmaTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        paraYatırButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        paraÇekmeTextField = new javax.swing.JTextField();
        paraÇekButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bakiyeGör = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        paraTransferiIDTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        toplamBorçGör = new javax.swing.JButton();
        krediÇekButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        paraTransferiButton = new javax.swing.JButton();
        krediÇekTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        krediBorçÖdemeTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        krediBorçÖdemeButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        krediKartıBorçÖdemeTextField = new javax.swing.JTextField();
        krediBorcuGör = new javax.swing.JButton();
        krediKartıBorcuGörButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        krediKartıBorçÖdemeButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        kullanılabilirLimitGörTextField = new javax.swing.JButton();
        krediKartındanParaÇekmeTextField = new javax.swing.JTextField();
        krediKartındanParaÇek = new javax.swing.JButton();
        paratTransferiTutarTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Hoşgeldiniz");

        customerInterfaceSurname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        customerInterfaceSurname.setText("jLabel3");

        customerInterfaceName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        customerInterfaceName.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Para Yatır");

        paraYatırmaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatırmaTextFieldActionPerformed(evt);
            }
        });
        paraYatırmaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paraYatırmaTextFieldKeyTyped(evt);
            }
        });

        jLabel3.setText("Tutar");

        paraYatırButton.setText("Yatır");
        paraYatırButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatırButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Tutar");

        paraÇekmeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paraÇekmeTextFieldKeyTyped(evt);
            }
        });

        paraÇekButton.setText("Çek");
        paraÇekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraÇekButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Para Çek");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Bakiye ");

        bakiyeGör.setText("Bakiye'yi gör");
        bakiyeGör.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bakiyeGörActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Para Transferi");

        jLabel8.setText("Tutar");

        paraTransferiIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraTransferiIDTextFieldActionPerformed(evt);
            }
        });
        paraTransferiIDTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paraTransferiIDTextFieldKeyTyped(evt);
            }
        });

        jLabel9.setText("Gönderilecek Hesabın ID'si");

        toplamBorçGör.setText("Toplam Borç Miktarı");
        toplamBorçGör.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplamBorçGörActionPerformed(evt);
            }
        });

        krediÇekButton.setText("Onayla");
        krediÇekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediÇekButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Kredi Çek");

        paraTransferiButton.setText("Gönder");
        paraTransferiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraTransferiButtonActionPerformed(evt);
            }
        });

        krediÇekTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                krediÇekTextFieldKeyTyped(evt);
            }
        });

        jLabel11.setText("Kredi Miktarı");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Kredi Borcu Ödeme");

        krediBorçÖdemeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                krediBorçÖdemeTextFieldKeyTyped(evt);
            }
        });

        jLabel13.setText("Ödenecek Tutar");

        krediBorçÖdemeButton.setText("Onayla");
        krediBorçÖdemeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediBorçÖdemeButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Kredi Kartı Borcu Ödeme");

        krediKartıBorçÖdemeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                krediKartıBorçÖdemeTextFieldKeyTyped(evt);
            }
        });

        krediBorcuGör.setText("Borcu Gör");
        krediBorcuGör.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediBorcuGörActionPerformed(evt);
            }
        });

        krediKartıBorcuGörButton.setText("Borcu Gör");
        krediKartıBorcuGörButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediKartıBorcuGörButtonActionPerformed(evt);
            }
        });

        jLabel15.setText("Ödenecek Tutar");

        krediKartıBorçÖdemeButton.setText("Onayla");
        krediKartıBorçÖdemeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediKartıBorçÖdemeButtonActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Kredi Kartından para çekme");

        kullanılabilirLimitGörTextField.setText("Kullanılabilir Limiti gör");
        kullanılabilirLimitGörTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanılabilirLimitGörTextFieldActionPerformed(evt);
            }
        });

        krediKartındanParaÇekmeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediKartındanParaÇekmeTextFieldActionPerformed(evt);
            }
        });
        krediKartındanParaÇekmeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                krediKartındanParaÇekmeTextFieldKeyTyped(evt);
            }
        });

        krediKartındanParaÇek.setText("Onayla");
        krediKartındanParaÇek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediKartındanParaÇekActionPerformed(evt);
            }
        });

        paratTransferiTutarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paratTransferiTutarTextFieldActionPerformed(evt);
            }
        });
        paratTransferiTutarTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paratTransferiTutarTextFieldKeyTyped(evt);
            }
        });

        jLabel17.setText("Tutar");

        jButton1.setText("Giriş Ekranına Dön");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(krediKartındanParaÇekmeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(322, 322, 322))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(paraTransferiIDTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(krediÇekTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(67, 67, 67))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(paratTransferiTutarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8)))
                                        .addGap(122, 122, 122)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(krediBorçÖdemeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel13)))
                                    .addGap(50, 50, 50)))
                            .addComponent(krediBorcuGör)
                            .addComponent(krediBorçÖdemeButton)
                            .addComponent(paraTransferiButton)
                            .addComponent(jLabel10)
                            .addComponent(krediÇekButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(237, 237, 237)
                                        .addComponent(krediKartıBorçÖdemeButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(147, 147, 147)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(krediKartıBorcuGörButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(paraYatırButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(paraÇekmeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(paraÇekButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(paraYatırmaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(kullanılabilirLimitGörTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(krediKartındanParaÇek, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(krediKartıBorçÖdemeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerInterfaceName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerInterfaceSurname))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(toplamBorçGör)
                        .addGap(31, 31, 31)
                        .addComponent(bakiyeGör)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerInterfaceSurname)
                    .addComponent(customerInterfaceName)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bakiyeGör, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toplamBorçGör))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paratTransferiTutarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paraTransferiIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paraTransferiButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paraYatırmaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(paraYatırButton)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paraÇekmeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paraÇekButton)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(krediÇekTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(krediÇekButton)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(krediBorcuGör))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullanılabilirLimitGörTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(krediKartındanParaÇekmeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(krediKartındanParaÇek)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(krediBorçÖdemeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(krediBorçÖdemeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(krediKartıBorcuGörButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(krediKartıBorçÖdemeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(krediKartıBorçÖdemeButton)
                            .addComponent(jButton1))))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void paraYatırmaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatırmaTextFieldActionPerformed
       
    }//GEN-LAST:event_paraYatırmaTextFieldActionPerformed

    private void paraTransferiIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraTransferiIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paraTransferiIDTextFieldActionPerformed

    private void paraYatırmaTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paraYatırmaTextFieldKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isDigit(TestChar)))
            evt.consume(); 
    }//GEN-LAST:event_paraYatırmaTextFieldKeyTyped

    private void paraYatırButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatırButtonActionPerformed
        if(paraYatırmaTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(paraYatırButton, "Lütfen bir tutar girin.");
        }
        else{
            Müşteri a=new Müşteri(Password);
            a.paraYatırma(paraYatırmaTextField.getText());
        }
    }//GEN-LAST:event_paraYatırButtonActionPerformed

    private void krediKartındanParaÇekmeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krediKartındanParaÇekmeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_krediKartındanParaÇekmeTextFieldActionPerformed

    private void paratTransferiTutarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paratTransferiTutarTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paratTransferiTutarTextFieldActionPerformed

    private void toplamBorçGörActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplamBorçGörActionPerformed
        Müşteri a=new Müşteri(Password);
        a.toplamBorçKontrol();
    }//GEN-LAST:event_toplamBorçGörActionPerformed

    private void bakiyeGörActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bakiyeGörActionPerformed
        Müşteri a=new Müşteri(Password);
        a.bakiyeKontrol();
    }//GEN-LAST:event_bakiyeGörActionPerformed

    private void paraÇekmeTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paraÇekmeTextFieldKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isDigit(TestChar)))
            evt.consume(); 
    }//GEN-LAST:event_paraÇekmeTextFieldKeyTyped

    private void paraÇekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraÇekButtonActionPerformed
        if(paraÇekmeTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(paraÇekButton, "Lütfen bir tutar girin.");
        }
        else{
            Müşteri a=new Müşteri(Password);
            a.paraÇekme(paraÇekmeTextField.getText());
        }
    }//GEN-LAST:event_paraÇekButtonActionPerformed

    private void kullanılabilirLimitGörTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanılabilirLimitGörTextFieldActionPerformed
        Müşteri a=new Müşteri(Password);
        a.limitKontrol();
    }//GEN-LAST:event_kullanılabilirLimitGörTextFieldActionPerformed

    private void krediKartındanParaÇekmeTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_krediKartındanParaÇekmeTextFieldKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isDigit(TestChar)))
            evt.consume(); 
    }//GEN-LAST:event_krediKartındanParaÇekmeTextFieldKeyTyped

    private void krediKartındanParaÇekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krediKartındanParaÇekActionPerformed
        if(krediKartındanParaÇekmeTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(krediKartındanParaÇek, "Lütfen bir tutar girin.");
        }
        else{
            Müşteri a=new Müşteri(Password);
            a.krediKartıParaÇekme(krediKartındanParaÇekmeTextField.getText());
        }
    }//GEN-LAST:event_krediKartındanParaÇekActionPerformed

    private void krediKartıBorcuGörButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krediKartıBorcuGörButtonActionPerformed
        Müşteri a=new Müşteri(Password);
        a.krediKartıBorçKontrol();
    }//GEN-LAST:event_krediKartıBorcuGörButtonActionPerformed

    private void krediKartıBorçÖdemeTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_krediKartıBorçÖdemeTextFieldKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isDigit(TestChar)))
            evt.consume(); 
    }//GEN-LAST:event_krediKartıBorçÖdemeTextFieldKeyTyped

    private void krediKartıBorçÖdemeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krediKartıBorçÖdemeButtonActionPerformed
        if(krediKartıBorçÖdemeTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(krediKartıBorçÖdemeButton, "Lütfen bir tutar girin.");
        }
        else{
            Müşteri a=new Müşteri(Password);
            a.krediKartıBorçÖdeme(krediKartıBorçÖdemeTextField.getText());
        }
    }//GEN-LAST:event_krediKartıBorçÖdemeButtonActionPerformed

    private void paratTransferiTutarTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paratTransferiTutarTextFieldKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isDigit(TestChar)))
            evt.consume(); 
    }//GEN-LAST:event_paratTransferiTutarTextFieldKeyTyped

    private void paraTransferiIDTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paraTransferiIDTextFieldKeyTyped
       char TestChar=evt.getKeyChar();
        if(!(Character.isDigit(TestChar)))
            evt.consume(); 
    }//GEN-LAST:event_paraTransferiIDTextFieldKeyTyped

    private void paraTransferiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraTransferiButtonActionPerformed
        if(paratTransferiTutarTextField.getText().trim().isEmpty() || paraTransferiIDTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(paraTransferiButton, "Lütfen boş alanları doldurun.");
        }
        else{
            Müşteri a=new Müşteri(Password);
            a.paraTransferi(paratTransferiTutarTextField.getText(), paraTransferiIDTextField.getText());
        }
    }//GEN-LAST:event_paraTransferiButtonActionPerformed

    private void krediÇekTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_krediÇekTextFieldKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isDigit(TestChar)))
            evt.consume(); 
    }//GEN-LAST:event_krediÇekTextFieldKeyTyped

    private void krediÇekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krediÇekButtonActionPerformed
        if(krediÇekTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(krediÇekButton, "Lütfen bir tutar girin.");
        }
        else{
            Müşteri a=new Müşteri(Password);
            a.krediÇekme(krediÇekTextField.getText());
        }
    }//GEN-LAST:event_krediÇekButtonActionPerformed

    private void krediBorcuGörActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krediBorcuGörActionPerformed
        Müşteri a=new Müşteri(Password);
        a.krediBorçKontrol();
    }//GEN-LAST:event_krediBorcuGörActionPerformed

    private void krediBorçÖdemeTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_krediBorçÖdemeTextFieldKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isDigit(TestChar)))
            evt.consume();
    }//GEN-LAST:event_krediBorçÖdemeTextFieldKeyTyped

    private void krediBorçÖdemeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krediBorçÖdemeButtonActionPerformed
        if(krediBorçÖdemeTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(krediÇekButton, "Lütfen bir tutar girin.");
        }
        else{
            Müşteri a=new Müşteri(Password);
            a.krediBorçÖdeme(krediBorçÖdemeTextField.getText());
        }
    }//GEN-LAST:event_krediBorçÖdemeButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main.loginAc();
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MüşteriArayüzü.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MüşteriArayüzü.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MüşteriArayüzü.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MüşteriArayüzü.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MüşteriArayüzü().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bakiyeGör;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.JLabel customerInterfaceName;
    public static javax.swing.JLabel customerInterfaceSurname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton krediBorcuGör;
    private javax.swing.JButton krediBorçÖdemeButton;
    private javax.swing.JTextField krediBorçÖdemeTextField;
    private javax.swing.JButton krediKartıBorcuGörButton;
    private javax.swing.JButton krediKartıBorçÖdemeButton;
    private javax.swing.JTextField krediKartıBorçÖdemeTextField;
    private javax.swing.JButton krediKartındanParaÇek;
    private javax.swing.JTextField krediKartındanParaÇekmeTextField;
    private javax.swing.JButton krediÇekButton;
    private javax.swing.JTextField krediÇekTextField;
    private javax.swing.JButton kullanılabilirLimitGörTextField;
    private javax.swing.JButton paraTransferiButton;
    private javax.swing.JTextField paraTransferiIDTextField;
    private javax.swing.JButton paraYatırButton;
    private javax.swing.JTextField paraYatırmaTextField;
    private javax.swing.JTextField paratTransferiTutarTextField;
    private javax.swing.JButton paraÇekButton;
    private javax.swing.JTextField paraÇekmeTextField;
    private javax.swing.JButton toplamBorçGör;
    // End of variables declaration//GEN-END:variables
}

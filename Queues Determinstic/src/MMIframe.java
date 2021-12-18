
import javax.swing.JOptionPane;



public class MMIframe extends javax.swing.JFrame {

     double Lambda=0 ;
        double Mu;
   
    public MMIframe() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_lambda = new javax.swing.JTextField();
        txt_mu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_l = new javax.swing.JTextField();
        txt_lq = new javax.swing.JTextField();
        txt_w = new javax.swing.JTextField();
        txt_wq = new javax.swing.JTextField();
        btn_calc = new javax.swing.JButton();
        txt_clear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lambda_check = new javax.swing.JComboBox<>();
        mu_check = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txt_p0 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 255));
        setForeground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("λ:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("u:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("M/M/I");

        txt_lambda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_lambda.setForeground(new java.awt.Color(102, 102, 102));
        txt_lambda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lambdaActionPerformed(evt);
            }
        });

        txt_mu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_mu.setForeground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("L:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Lq:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("W:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Wq:");

        txt_l.setEditable(false);
        txt_l.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_l.setForeground(new java.awt.Color(102, 102, 102));
        txt_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lActionPerformed(evt);
            }
        });

        txt_lq.setEditable(false);
        txt_lq.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_lq.setForeground(new java.awt.Color(102, 102, 102));
        txt_lq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lqActionPerformed(evt);
            }
        });

        txt_w.setEditable(false);
        txt_w.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_w.setForeground(new java.awt.Color(102, 102, 102));

        txt_wq.setEditable(false);
        txt_wq.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_wq.setForeground(new java.awt.Color(102, 102, 102));

        btn_calc.setBackground(new java.awt.Color(0, 255, 255));
        btn_calc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_calc.setForeground(new java.awt.Color(0, 0, 255));
        btn_calc.setText("Calc");
        btn_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcActionPerformed(evt);
            }
        });

        txt_clear.setBackground(new java.awt.Color(255, 51, 102));
        txt_clear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_clear.setForeground(new java.awt.Color(51, 51, 255));
        txt_clear.setText("Clear");
        txt_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_clearActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Click here to go the first page");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        lambda_check.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lambda_check.setForeground(new java.awt.Color(0, 102, 255));
        lambda_check.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hr", "Min", "Sec", " " }));
        lambda_check.setAutoscrolls(true);
        lambda_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lambda_checkActionPerformed(evt);
            }
        });

        mu_check.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mu_check.setForeground(new java.awt.Color(0, 102, 255));
        mu_check.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hr", "Min", "Sec" }));
        mu_check.setAutoscrolls(true);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("P0:");

        txt_p0.setEditable(false);
        txt_p0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_p0.setForeground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("Results");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(149, 149, 149))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_p0))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_wq, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                        .addComponent(txt_w)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(13, 13, 13))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_lq)
                                        .addComponent(txt_l))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btn_calc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_lambda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lambda_check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_mu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mu_check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txt_lambda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lambda_check)
                    .addComponent(mu_check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_lq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_w, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_wq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_p0)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_calc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_lambdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lambdaActionPerformed
        
    }//GEN-LAST:event_txt_lambdaActionPerformed

    private void txt_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lActionPerformed
        
    }//GEN-LAST:event_txt_lActionPerformed

    private void btn_calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcActionPerformed
     try {
            double λ = 0.0, u = 0.0, w = 0.0;
            ModelMMI mmi;
            if (!txt_lambda.getText().equals("")) {
                String s = txt_lambda.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(txt_lambda.getText());
                }
            }
            if (!txt_mu.getText().equals("")) {
                String s =txt_mu.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u = first / second;
                } else {
                    u = Double.parseDouble(txt_mu.getText());
                }
            

            // If we has just λ and u
            if ((λ > 0) && (u > 0) && (w == 0)) {
//                System.out.println("in one");
                 mmi = new ModelMMI (λ, u);

                // Check on Time
                if (lambda_check.getSelectedIndex() == 0) // Hour
                {
                    mmi.λ_HourToMin();
                } else if (lambda_check.getSelectedIndex() == 2) // Seconds
                {
                    mmi.λ_SecToMin();
                }

                if (mu_check.getSelectedIndex() == 0) // Hour
                {
                    mmi.u_HourToMin();
                } else if (mu_check.getSelectedIndex() == 2) // Seconds
                {
                    mmi.u_SecToMin();
                }

                mmi.has_λ_u();

                txt_l.setText(mmi.getL()); // L
                
                txt_lq.setText(mmi.getLq()); // Lq
                txt_w.setText(mmi.getW()); // Lq
                txt_wq.setText(mmi.getWq()); // Lq
             
                txt_p0.setText(mmi.getP0());

            } else if ((λ == 0.0) && (u > 0) && (w > 0)) { // Get λ - has u & w

                mmi = new ModelMMI(λ, u);

                // Check on Time
                if (mu_check.getSelectedIndex() == 0) // Hour
                {
                    mmi.u_HourToMin();
                } else if (mu_check.getSelectedIndex() == 2) // Seconds
                {
                    mmi.u_SecToMin();
                }

                
               

                
}
            } else {
                JOptionPane.showMessageDialog(null, "No suffiecent Positive Data");
            }
             } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }                 
    }//GEN-LAST:event_btn_calcActionPerformed

    private void txt_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_clearActionPerformed
        txt_l.setText("");
        txt_lq.setText("");
        txt_w.setText("");
        txt_wq.setText("");
        txt_lambda.setText("");
        txt_mu.setText("");
         txt_p0.setText("");
    }//GEN-LAST:event_txt_clearActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
      FirstJframe ck = new FirstJframe();
      ck.setVisible(true);
      ck.pack();
      ck.setLocationRelativeTo(null);
      ck.setDefaultCloseOperation(DDIframe1.EXIT_ON_CLOSE);
      this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void lambda_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lambda_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lambda_checkActionPerformed

    private void txt_lqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lqActionPerformed

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
            java.util.logging.Logger.getLogger(MMIframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MMIframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MMIframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MMIframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MMIframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> lambda_check;
    private javax.swing.JComboBox<String> mu_check;
    private javax.swing.JButton txt_clear;
    private javax.swing.JTextField txt_l;
    private javax.swing.JTextField txt_lambda;
    private javax.swing.JTextField txt_lq;
    private javax.swing.JTextField txt_mu;
    private javax.swing.JTextField txt_p0;
    private javax.swing.JTextField txt_w;
    private javax.swing.JTextField txt_wq;
    // End of variables declaration//GEN-END:variables
}

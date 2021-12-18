

import javax.swing.JOptionPane;





























 
public class MMCframe extends javax.swing.JFrame {

    
    public MMCframe() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_L = new javax.swing.JLabel();
        txt_m = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_lambda = new javax.swing.JTextField();
        txt_mu = new javax.swing.JTextField();
        txt_c = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_L1 = new javax.swing.JTextField();
        txt_lq = new javax.swing.JTextField();
        txt_w = new javax.swing.JTextField();
        txt_wq = new javax.swing.JTextField();
        bt_txt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_p0 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_ci = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(850, 550));
        setResizable(false);

        txt_L.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_L.setForeground(new java.awt.Color(0, 0, 153));
        txt_L.setText("λ:");

        txt_m.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_m.setForeground(new java.awt.Color(0, 0, 153));
        txt_m.setText("u:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("C:");

        txt_lambda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_lambda.setForeground(new java.awt.Color(102, 102, 102));

        txt_mu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_mu.setForeground(new java.awt.Color(102, 102, 102));
        txt_mu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_muActionPerformed(evt);
            }
        });

        txt_c.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_c.setForeground(new java.awt.Color(102, 102, 102));
        txt_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("L:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Lq:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("W:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Wq:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("M/M/C");

        txt_L1.setEditable(false);
        txt_L1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_L1.setForeground(new java.awt.Color(102, 102, 102));
        txt_L1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_L1ActionPerformed(evt);
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
        txt_w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_wActionPerformed(evt);
            }
        });

        txt_wq.setEditable(false);
        txt_wq.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_wq.setForeground(new java.awt.Color(102, 102, 102));

        bt_txt.setBackground(new java.awt.Color(0, 255, 255));
        bt_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_txt.setForeground(new java.awt.Color(204, 0, 0));
        bt_txt.setText("Calculation");
        bt_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_txtActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Click here to go the first page");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("P0:");

        txt_p0.setEditable(false);
        txt_p0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_p0.setForeground(new java.awt.Color(102, 102, 102));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("ci:");

        txt_ci.setEditable(false);
        txt_ci.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_ci.setForeground(new java.awt.Color(102, 102, 102));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Results");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_L, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(bt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_c, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_p0, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ci, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(241, 241, 241))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_lq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_lambda, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_L1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txt_m)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_mu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_wq, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(txt_w))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_lambda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_L))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_mu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_m, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_c, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_L1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_w, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_p0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_wq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(91, 91, 91))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_wActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_wActionPerformed

    private void bt_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_txtActionPerformed
        try {
            double λ = 0.0, u = 0.0;
            int  c = 0;  int n=0;
            
            if (! txt_lambda.getText().equals("")) {
                String s =  txt_lambda.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ = first / second;
                } else {
                    λ = Double.parseDouble( txt_lambda.getText());
                }
            }
            if (!txt_mu.getText().equals("")) {
                String s = txt_mu.getText();
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
            }
            if (!txt_c.getText().equals("")) {
                c = Integer.parseInt(txt_c.getText());
            }
            

            if ((λ > 0) && (u > 0) && (c > 0)) {
                 ModelMMC  mmc=new ModelMMC ( λ, u,c);
                double L = mmc.L();
                String format1 = String.format("%.4g%n",L);
                txt_L1 .setText(format1+"");
                
                double Lq = mmc.Lq();
                String format2 = String.format("%.4g%n",Lq);
               txt_lq.setText(format2+"");
               
                double W = mmc.W();
                String format3 = String.format("%.4g%n",W);
                txt_w.setText(format3+"");
                
                double Wq = mmc.Wq();
                String format4 = String.format("%.4g%n",Wq);
                txt_wq.setText(format4+"");
                
                double ci = mmc.Pci();
                 String format5 = String.format("%.4g%n",ci);
                txt_ci.setText(format5+"");
                
                double P0 = mmc.p0();
                 String format6 = String.format("%.4g%n",P0);
                txt_p0.setText(format6+"");
                
           } else {
                    JOptionPane.showMessageDialog(null, "n Should be positive");
                }
        
        } catch ( NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
            
    }//GEN-LAST:event_bt_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt_lq.setText("");
        txt_L1.setText("");
        txt_w.setText("");
        txt_wq.setText("");
        txt_lambda.setText("");
        txt_mu.setText("");
        txt_c.setText("");
        txt_ci.setText("");
        txt_p0.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_L1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_L1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_L1ActionPerformed

    private void txt_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cActionPerformed

    private void txt_muActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_muActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_muActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        FirstJframe ck = new FirstJframe();
      ck.setVisible(true);
      ck.pack();
      ck.setLocationRelativeTo(null);
      ck.setDefaultCloseOperation(DDIframe1.EXIT_ON_CLOSE);
      this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(MMCframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MMCframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MMCframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MMCframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MMCframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txt_L;
    private javax.swing.JTextField txt_L1;
    private javax.swing.JTextField txt_c;
    private javax.swing.JTextField txt_ci;
    private javax.swing.JTextField txt_lambda;
    private javax.swing.JTextField txt_lq;
    private javax.swing.JLabel txt_m;
    private javax.swing.JTextField txt_mu;
    private javax.swing.JTextField txt_p0;
    private javax.swing.JTextField txt_w;
    private javax.swing.JTextField txt_wq;
    // End of variables declaration//GEN-END:variables

    

    
    

   

   

    
}

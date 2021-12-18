

import java.awt.Color;

import javax.swing.JOptionPane;



public class DDIframe1 extends javax.swing.JFrame {
       DeterministicQ Dc1, Dc2;

    
    public DDIframe1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jText_λ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jText_u = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        getResults = new javax.swing.JButton();
        txt_clear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jText_t = new javax.swing.JTextField();
        btn_return = new javax.swing.JLabel();
        bt_sim = new javax.swing.JButton();
        check_ti2 = new javax.swing.JCheckBox();
        check_n2 = new javax.swing.JCheckBox();
        check_w2 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jText_K = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtext_n = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtext_M = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        setForeground(new java.awt.Color(102, 204, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 800));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("λ:");

        jText_λ.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jText_λ.setForeground(new java.awt.Color(102, 102, 102));
        jText_λ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_λActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("U:");

        jText_u.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jText_u.setForeground(new java.awt.Color(102, 102, 102));
        jText_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_uActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("t:");

        getResults.setBackground(new java.awt.Color(51, 204, 255));
        getResults.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getResults.setForeground(new java.awt.Color(255, 51, 51));
        getResults.setText("Calc");
        getResults.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getResultsActionPerformed(evt);
            }
        });

        txt_clear.setBackground(new java.awt.Color(255, 0, 51));
        txt_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_clear.setText("Clear");
        txt_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_clearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Determinstic Model");

        jText_t.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jText_t.setForeground(new java.awt.Color(102, 102, 102));
        jText_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_tActionPerformed(evt);
            }
        });

        btn_return.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_return.setForeground(new java.awt.Color(0, 0, 204));
        btn_return.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_return.setText("click here to go to first page");
        btn_return.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        btn_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_returnMouseClicked(evt);
            }
        });

        bt_sim.setBackground(new java.awt.Color(153, 204, 255));
        bt_sim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_sim.setForeground(new java.awt.Color(51, 51, 255));
        bt_sim.setText("Chart");
        bt_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simActionPerformed(evt);
            }
        });

        check_ti2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        check_ti2.setForeground(new java.awt.Color(255, 0, 51));
        check_ti2.setText("ti");
        check_ti2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_ti2ActionPerformed(evt);
            }
        });

        check_n2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        check_n2.setForeground(new java.awt.Color(255, 0, 51));
        check_n2.setText("n(t)");
        check_n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_n2ActionPerformed(evt);
            }
        });

        check_w2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        check_w2.setForeground(new java.awt.Color(255, 0, 0));
        check_w2.setText("wq");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("k:");

        jText_K.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jText_K.setForeground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("n:");

        jtext_n.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtext_n.setForeground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("M:");

        jtext_M.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtext_M.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jText_λ, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jText_u, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(jText_t, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_ti2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check_n2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(getResults, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jText_K))
                        .addGap(80, 80, 80)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(jtext_n, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(jtext_M, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(check_w2)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_return)
                        .addGap(257, 257, 257))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(bt_sim, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jText_λ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jText_u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(check_ti2)
                        .addGap(18, 18, 18)
                        .addComponent(check_n2)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jText_K, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jtext_n, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(jtext_M, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(check_w2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_clear)
                    .addComponent(bt_sim)
                    .addComponent(getResults))
                .addGap(61, 61, 61)
                .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getResultsActionPerformed
 try {
            double λd = 0, ud = 0;
            double wqn = -1, ti = -1, nt = -1;
            int n = 0, m = 0, kd = 0, T = 0, n_of_checked_results = 0;
            String errors = "";

            if (!jText_λ.getText().equals("")) {
                String s = jText_λ.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λd = first / second;
                } else {
                    λd = Double.parseDouble(jText_λ.getText());
                }
            }
            if (!jText_u.getText().equals("")) {
                String s = jText_u.getText();
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    ud = first / second;
                } else {
                    ud = Double.parseDouble(jText_u.getText());
                }
            }
            if (!jText_t.getText().equals("")) {
                T = Integer.parseInt(jText_t.getText());
            }
            if (!jtext_n.getText().equals("")) {
                n = Integer.parseInt(jtext_n.getText());
            }
            if (!jText_K.getText().equals("")) {
                kd = Integer.parseInt(jText_K.getText());
            }
            if (!jtext_M.getText().equals("")) {
                m = Integer.parseInt(jtext_M.getText());
            }

            // Case 1
            if (m == 0 && (λd > 0) && (ud > 0) && (kd > 0) && λd > ud) {

                Dc1 = new DeterministicQ((double) ud, λd, kd);

                ti = Dc1.get_ti();

                if (check_ti2.isSelected()) {
                    n_of_checked_results++;
                } else {
                    ti = -1;
                }

                if (check_n2.isSelected()) {
                    n_of_checked_results++;
                    if (T == 0) {
                        errors = "Please Enter positive Integer in (t) field";
                    } else {
                        nt = Dc1.get_nt(T);
//                        System.out.println("nt = " + nt + " T = " + T + " λd = " + λd + " U = " + ud);

                    }
                }
                if (check_w2.isSelected()) {
                    n_of_checked_results++;
                    if (n == 0) {
                        if (errors.equals("")) {
                            errors = "Please Enter positive Integer in (n) Field";
                        } else {
                            errors += " & n field";
                        }
                    } else {
                        wqn = Dc1.get_Wqn((double) n);
                    }
                }

                if (n_of_checked_results == 0) {
                    errors = "Please check any result you want";
                }

                if (errors.equals("")) {
                    Result re = new Result(nt, wqn, ti);
                    re.setVisible(true);
                    re.pack();
                    re.setLocationRelativeTo(null);
                    re.setDefaultCloseOperation(2);
                } else {
                    JOptionPane.showMessageDialog(null, errors);
                }

                // Case Number 2
            } else if ((m > 0) && (λd > 0) && (ud > 0) && (kd > 0) && (ud >= λd)) {
                Dc2 = new DeterministicQ((double) ud, λd, kd, m);
                double nt2 = -1, wqn2 = -1, ti2 = -1;

                ti2 = Dc2.get_ti_2();

                if (check_ti2.isSelected()) {
                    n_of_checked_results++;
                }

                if (check_n2.isSelected()) {
                    n_of_checked_results++;
                    if (T == 0) {
                        errors = "Please Enter positive Integer in (t) field";
                    } else {
                        nt2 = Dc2.get_nt_2(T);
                        //System.out.println("nt = " + nt + " T = " + T + " λd = " + λd + " U = " + ud);
                    }
                }
                if (check_w2.isSelected()) {
                    n_of_checked_results++;
                    System.out.println("one");
                    if (n == 0) {
                        if (errors.equals("")) {
                            errors = "Please Enter positive Integer in (n) Field";
                        } else {
                            errors += " & n field";
                        }
                    } else {

                        wqn2 = Dc2.get_Wqn_2((double) n);

                    }
                }
                if (n_of_checked_results == 0) {
                    errors = "Please check any result you want";
                }

                if (errors.equals("")) {
                    Result re = new Result(nt2, wqn2, ti2);
                    re.setVisible(true);
                    re.pack();
                    re.setLocationRelativeTo(null);
                    re.setDefaultCloseOperation(2);
                } else {
                    JOptionPane.showMessageDialog(null, errors);
                }

            } else if ((m > 0) && (λd > 0) && (ud > 0) && (kd > 0)) {
                JOptionPane.showMessageDialog(null, "Can\'t have M with ( λ > u )");

            } else if (m == 0 && (λd > 0) && (ud > 0) && (kd > 0) && (λd <= ud)) {
                JOptionPane.showMessageDialog(null, "M is required when ( λ <= u )");
            } else {
                JOptionPane.showMessageDialog(null, "No Sufficient Positive Valid Data");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
        
            
                
    }//GEN-LAST:event_getResultsActionPerformed

    private void txt_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_clearActionPerformed
        jText_λ.setText("");
        jText_u.setText("");
        jText_t.setText("");
        jText_K.setText("");
        jtext_n.setText("");
        jtext_M.setText("");
        
    }//GEN-LAST:event_txt_clearActionPerformed

    private void jText_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_uActionPerformed

    private void jText_λActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_λActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_λActionPerformed

    private void btn_returnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnMouseClicked
        FirstJframe ck = new FirstJframe();
      ck.setVisible(true);
      ck.pack();
      ck.setLocationRelativeTo(null);
      ck.setDefaultCloseOperation(DDIframe1.EXIT_ON_CLOSE);
      this.dispose();
    }//GEN-LAST:event_btn_returnMouseClicked

    private void bt_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simActionPerformed
 try {
            double λ = 0.0, u = 0.0;
            int M = 0, K = 0, length = 0;
            DeterministicQ dq;
            if (!jText_λ.getText().equals("")) {
                String s = jText_λ.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(jText_λ.getText());
                }
            }
            if (!jText_u.getText().equals("")) {
                String s = jText_u.getText();
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u = first / second;
                } else {
                    u = Double.parseDouble(jText_u.getText());
                }
            }
            if (!jText_K.getText().equals("")) {
                K = Integer.parseInt(jText_K.getText());
            }
            if (!jtext_M.getText().equals("")) {
                M = Integer.parseInt(jtext_M.getText());
            }

            // If we has just λ and u
            if ((λ > 0) && (u > 0) && (K > 0) && (M == 0) && (u < λ)) {
                final XYStepChartDemo demo = new XYStepChartDemo(u, λ, K);
                demo.displayChart();
            } else if ((λ > 0) && (u > 0) && (K > 0) && (M > 0) && (u >= λ)) {
                final XYStepChartDemo demo = new XYStepChartDemo(u, λ, K, M);
                demo.displayChart();
            } else if (M == 0 && (λ > 0) && (u > 0) && (K > 0) && (λ <= u)) {
                JOptionPane.showMessageDialog(null, "M is required when ( λ <= u )");
            } else {
                JOptionPane.showMessageDialog(null, "You Should write a possitive λ & u & K ...!!!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }

       
       
       
       
      
                
                
        
        
        
        
        
    }//GEN-LAST:event_bt_simActionPerformed

    private void jText_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_tActionPerformed

    private void check_ti2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_ti2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_ti2ActionPerformed

    private void check_n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_n2ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DDIframe1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sim;
    private javax.swing.JLabel btn_return;
    private javax.swing.JCheckBox check_n2;
    private javax.swing.JCheckBox check_ti2;
    private javax.swing.JCheckBox check_w2;
    private javax.swing.JButton getResults;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jText_K;
    private javax.swing.JTextField jText_t;
    private javax.swing.JTextField jText_u;
    private javax.swing.JTextField jText_λ;
    private javax.swing.JTextField jtext_M;
    private javax.swing.JTextField jtext_n;
    private javax.swing.JButton txt_clear;
    // End of variables declaration//GEN-END:variables
}

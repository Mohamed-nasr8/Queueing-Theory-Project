/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author AbdullahSalah
 */
public class Result extends javax.swing.JFrame {

    /**
     * Creates new form Result
     */
    double wq , nt , ti  ;
    public Result() {
        initComponents();
    }
    public Result (double wq , double nt , double ti ){
            initComponents();
        this.wq = wq ; 
        this.nt= nt ; 
        this.ti = ti ; 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_ti = new javax.swing.JLabel();
        jLabel_wqn = new javax.swing.JLabel();
        jLabel_nt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField_wqn = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextField_nt = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextField_ti = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel_ti.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_ti.setForeground(new java.awt.Color(0, 204, 204));
        jLabel_ti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ti.setText("ti:");

        jLabel_wqn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_wqn.setForeground(new java.awt.Color(0, 204, 204));
        jLabel_wqn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wqn.setText("Wq(n):");

        jLabel_nt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_nt.setForeground(new java.awt.Color(0, 204, 204));
        jLabel_nt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_nt.setText("n(t):");

        jTextField_wqn.setEditable(false);
        jTextField_wqn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_wqn.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(jTextField_wqn);

        jTextField_nt.setEditable(false);
        jTextField_nt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_nt.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_nt.setMinimumSize(new java.awt.Dimension(6, 37));
        jScrollPane2.setViewportView(jTextField_nt);

        jTextField_ti.setEditable(false);
        jTextField_ti.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_ti.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane3.setViewportView(jTextField_ti);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Results");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_wqn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel_nt))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_ti)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1))
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_ti))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel_nt)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel_wqn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if(ti != -1)
            jTextField_ti.setText(String.valueOf(ti));
        else
            jTextField_ti.setText("Unchecked");
        if(wq != -1)
        jTextField_nt.setText(String.valueOf(wq));
        else
            jTextField_nt.setText("Unchecked");
        if(nt != -1)
        jTextField_wqn.setText(String.valueOf(nt));
        else
            jTextField_wqn.setText("Unchecked");


    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_nt;
    private javax.swing.JLabel jLabel_ti;
    private javax.swing.JLabel jLabel_wqn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextField_nt;
    private javax.swing.JTextPane jTextField_ti;
    private javax.swing.JTextPane jTextField_wqn;
    // End of variables declaration//GEN-END:variables
}

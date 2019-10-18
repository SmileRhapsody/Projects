/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Information.Data;
import Information.SavData;
/**
 *
 * @author Administrator
 */
public class SavInfoFrame extends javax.swing.JFrame {

    /**
     * Creates new form SavInfoFrame
     */
    private Data data;
    private SavData savdata;
    public SavInfoFrame(Data data) {
        initComponents();
        this.savdata = data.getSavdata();
        this.data = data;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        savSplitPanel = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        savCreateBtn = new javax.swing.JButton();
        savViewBtn = new javax.swing.JButton();
        savExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        savCreateBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        savCreateBtn.setForeground(new java.awt.Color(0, 51, 51));
        savCreateBtn.setText("Create");
        savCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savCreateBtnActionPerformed(evt);
            }
        });

        savViewBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        savViewBtn.setForeground(new java.awt.Color(0, 51, 51));
        savViewBtn.setText("View");
        savViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savViewBtnActionPerformed(evt);
            }
        });

        savExit.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        savExit.setForeground(new java.awt.Color(0, 51, 51));
        savExit.setText("Exit");
        savExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(savCreateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savViewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(savCreateBtn)
                .addGap(56, 56, 56)
                .addComponent(savViewBtn)
                .addGap(55, 55, 55)
                .addComponent(savExit)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        savSplitPanel.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        savSplitPanel.setRightComponent(jPanel2);

        getContentPane().add(savSplitPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savCreateBtnActionPerformed
        // TODO add your handling code here:
        SavCreatePanel savcreatepanel = new SavCreatePanel(data);
        savSplitPanel.setRightComponent(savcreatepanel);
    }//GEN-LAST:event_savCreateBtnActionPerformed

    private void savViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savViewBtnActionPerformed
        // TODO add your handling code here:
        SavViewPanel savviewpanel = new SavViewPanel(data);
        savSplitPanel.setRightComponent(savviewpanel);
    }//GEN-LAST:event_savViewBtnActionPerformed

    private void savExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savExitActionPerformed
        // TODO add your handling code here:
        setVisible(false);

    }//GEN-LAST:event_savExitActionPerformed

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
            java.util.logging.Logger.getLogger(SavInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SavInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SavInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SavInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton savCreateBtn;
    private javax.swing.JButton savExit;
    private javax.swing.JSplitPane savSplitPanel;
    private javax.swing.JButton savViewBtn;
    // End of variables declaration//GEN-END:variables
}

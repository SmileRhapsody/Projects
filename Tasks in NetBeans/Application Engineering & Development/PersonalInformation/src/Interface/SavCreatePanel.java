/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Information.Data;
import Information.SavData;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class SavCreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form SavCreatePanel
     */
    private Data data;
    private SavData savdata;
    public SavCreatePanel(Data data) {
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

        jLabel0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bankNameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bankRouNumText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bankAccText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        accBalText = new javax.swing.JTextField();
        savCreateBtn = new javax.swing.JButton();

        jLabel0.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        jLabel0.setText("Create Your Saving Account Information");
        jLabel0.setToolTipText("");

        jLabel1.setText("Bank Name");

        jLabel2.setText("Bank Routing Number");

        jLabel3.setText("Bank Account Number");

        jLabel4.setText("Account Balance");

        savCreateBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        savCreateBtn.setText("Create");
        savCreateBtn.setToolTipText("");
        savCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savCreateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(savCreateBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel0)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bankRouNumText, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(bankAccText)
                                    .addComponent(accBalText)
                                    .addComponent(bankNameText))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(bankNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addComponent(bankRouNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(bankAccText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(accBalText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(savCreateBtn)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void savCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savCreateBtnActionPerformed
        // TODO add your handling code here:
        savdata.setBankName(bankNameText.getText());
        savdata.setBankRouNum(bankRouNumText.getText());
        savdata.setBankAccNum(bankAccText.getText());
        savdata.setAccountBal(accBalText.getText());  
        data.setSavdata(savdata);
        JOptionPane.showMessageDialog(null, "Create Information Successfully");
    }//GEN-LAST:event_savCreateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accBalText;
    private javax.swing.JTextField bankAccText;
    private javax.swing.JTextField bankNameText;
    private javax.swing.JTextField bankRouNumText;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton savCreateBtn;
    // End of variables declaration//GEN-END:variables
}
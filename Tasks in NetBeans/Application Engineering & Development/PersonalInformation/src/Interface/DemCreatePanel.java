/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Information.Data;
import Information.DemData;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class DemCreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form demCreatePanel
     */
    private Data data;
    private DemData demdata;
    public DemCreatePanel(Data data) {
        initComponents();
        this.data = data;
        this.demdata = data.getDemdata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        demCreatePanel = new javax.swing.JPanel();
        jLabel0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fNameText = new javax.swing.JTextField();
        lNameText = new javax.swing.JTextField();
        phoneNumText = new javax.swing.JTextField();
        birthdayText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        heightText = new javax.swing.JTextField();
        weightText = new javax.swing.JTextField();
        socialSecNumText = new javax.swing.JTextField();
        demTypeBtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        demCreatePanel.setPreferredSize(new java.awt.Dimension(304, 298));

        jLabel0.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        jLabel0.setText("Create Your Demographic Information");
        jLabel0.setToolTipText("");

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Phone Number");

        jLabel4.setText("Date of Birth");

        jLabel5.setText("Age");

        jLabel6.setText("Height");

        jLabel7.setText("Weight");

        jLabel8.setText("Social Security Number");

        demTypeBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        demTypeBtn.setText("Create");
        demTypeBtn.setToolTipText("");
        demTypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demTypeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout demCreatePanelLayout = new javax.swing.GroupLayout(demCreatePanel);
        demCreatePanel.setLayout(demCreatePanelLayout);
        demCreatePanelLayout.setHorizontalGroup(
            demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(demCreatePanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel0)
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(demCreatePanelLayout.createSequentialGroup()
                .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(demCreatePanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(demCreatePanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lNameText)
                                .addComponent(phoneNumText)
                                .addComponent(birthdayText)
                                .addComponent(ageText)
                                .addComponent(heightText)
                                .addComponent(weightText)
                                .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(socialSecNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(demCreatePanelLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(demTypeBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        demCreatePanelLayout.setVerticalGroup(
            demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(demCreatePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel0)
                .addGap(18, 18, 18)
                .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(phoneNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(birthdayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(heightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(weightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(demCreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(socialSecNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(demTypeBtn)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(demCreatePanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void demTypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demTypeBtnActionPerformed
        // TODO add your handling code here:
        demdata.setFirstName(fNameText.getText());
        demdata.setLastName(lNameText.getText());
        demdata.setPhoneNumber(phoneNumText.getText());
        demdata.setBirthDay(birthdayText.getText());
        demdata.setAge(ageText.getText());
        demdata.setHeight(heightText.getText());
        demdata.setWeight(weightText.getText());
        demdata.setSocialSecNum(socialSecNumText.getText());
        data.setDemdata(demdata);
        JOptionPane.showMessageDialog(null, "Create Information Successfully");
    }//GEN-LAST:event_demTypeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private javax.swing.JTextField birthdayText;
    private javax.swing.JPanel demCreatePanel;
    private javax.swing.JButton demTypeBtn;
    private javax.swing.JTextField fNameText;
    private javax.swing.JTextField heightText;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField lNameText;
    private javax.swing.JTextField phoneNumText;
    private javax.swing.JTextField socialSecNumText;
    private javax.swing.JTextField weightText;
    // End of variables declaration//GEN-END:variables
}

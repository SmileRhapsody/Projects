/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Information.Data;

/**
 *
 * @author Administrator
 */
public class AddViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddViewPanel
     */
    private Data data;
    public AddViewPanel(Data data) {
        initComponents();
        displayAddInfo(data);
    }
    
     private void displayAddInfo(Data data){
        strAddLabel.setText(data.getAdddata().getStreetAdd());
        cityLabel.setText(data.getAdddata().getCity());
        stateLabel.setText(data.getAdddata().getState());
        zipCodeLabel.setText(data.getAdddata().getZipCode());
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
        strAddLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        zipCodeLabel = new javax.swing.JLabel();

        jLabel0.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        jLabel0.setText("View Your Address Information");

        jLabel1.setText("Street Address:");

        strAddLabel.setText("jLabel9");

        jLabel2.setText("City:");

        cityLabel.setText("jLabel10");

        jLabel3.setText("State:");

        stateLabel.setText("jLabel11");

        jLabel4.setText("Zip Code:");

        zipCodeLabel.setText("jLabel12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel0))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strAddLabel)
                            .addComponent(cityLabel)
                            .addComponent(stateLabel)
                            .addComponent(zipCodeLabel))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel0)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(strAddLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cityLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(stateLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(zipCodeLabel))
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel strAddLabel;
    private javax.swing.JLabel zipCodeLabel;
    // End of variables declaration//GEN-END:variables
}
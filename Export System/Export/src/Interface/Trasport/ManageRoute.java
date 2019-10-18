/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Trasport;

import Business.Airline.Flight;
import Business.Airline.Airline;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.User.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author peichun
 */
public class ManageRoute extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Airline airline;  
    //Flight flight;
    private Enterprise enterprise;
    private User user;
    private Network network;
    /**
     * Creates new form ManageFlight
     */
//    public ManageFlight(JPanel upc, Airline s, User user, Enterprise enterprise) {
//        initComponents();
//        userProcessContainer = upc;
//        airline = s;
//        this.enterprise = enterprise;
//        this.user = user;
//        sNameTextField.setText(airline.getAlName());
//        refreshTable();
//    }
    
    public ManageRoute(JPanel upc, Enterprise enterprise, Network network) {
        initComponents();
        userProcessContainer = upc;  
        this.enterprise = enterprise;
        this.network = network;
        sNameTextField.setText(enterprise.getName());
        refreshTable();
    }
    
    
    public void refreshTable() {
        int rowCount = productCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel)productCatalog.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Flight p : enterprise.getDatastore().getFliList()) {
            Object row[] = new Object[3];
            row[0] = p.getFlightnumber();
            row[1] = p;
            //row[2] = p.getTime();
            //row[2] = p.getPrice();
            row[2] = p.getShippingFee();
            model.addRow(row);
            //flight=p;
            }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        createPButton = new javax.swing.JButton();
        sNameTextField = new javax.swing.JTextField();
        delButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productCatalog = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Manage Route Catalog");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Transport Company:");

        createPButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        createPButton.setForeground(java.awt.Color.green);
        createPButton.setText("Create New Shipping >>");
        createPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPButtonActionPerformed(evt);
            }
        });

        sNameTextField.setEditable(false);
        sNameTextField.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        sNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sNameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        sNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameTextFieldActionPerformed(evt);
            }
        });

        delButton5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        delButton5.setForeground(java.awt.Color.red);
        delButton5.setText("Delete shipping");
        delButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButton5ActionPerformed(evt);
            }
        });

        productCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Route Number", "City", "Price (/kg)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(productCatalog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(sNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(delButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createPButton)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createPButton))
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPButtonActionPerformed
        //flight = new Flight();
        CreateNewRoute cnfjp = new CreateNewRoute(userProcessContainer, enterprise, network);
        userProcessContainer.add("CreateNewFlightJPanel",cnfjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createPButtonActionPerformed

    private void sNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameTextFieldActionPerformed

    private void delButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButton5ActionPerformed
        // TODO add your handling code here:
        int row = productCatalog.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight p = (Flight)productCatalog.getValueAt(row, 1);
        enterprise.getDatastore().getFliList().remove(p);
        network.getNetworkDataStore().getFliList().remove(p);
        enterprise.getDatastore().getCountryList().remove(p.getCty());
        network.getNetworkDataStore().getCountryList().remove(p.getCty());
        refreshTable();
    }//GEN-LAST:event_delButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createPButton;
    private javax.swing.JButton delButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable productCatalog;
    private javax.swing.JTextField sNameTextField;
    // End of variables declaration//GEN-END:variables
}
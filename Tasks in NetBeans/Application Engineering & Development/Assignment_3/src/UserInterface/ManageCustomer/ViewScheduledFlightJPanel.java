/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomer;

import Business.Airliner;
import Business.CustomerDirectory;
import Business.Flight;
import Business.ScheduleFlight;
import UserInterface.ManageAirplane.SearchAirlinerJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ViewScheduledFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightJPanel
     */
    private JPanel CardSequenceJPanel;
    private ScheduleFlight scheduleflight;
    private ArrayList <Flight> scheduleList;
    private CustomerDirectory customerdirectory;
    public ViewScheduledFlightJPanel(JPanel CardSequenceJPanel, ScheduleFlight scheduleflight) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.scheduleflight = scheduleflight;
        //this.customerdirectory = customerdirectory;
        scheduleList = scheduleflight.getSelectedFlightList();
        populate();
        
    }

    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel) flightTable.getModel();
        dtm.setRowCount(0);
        SimpleDateFormat f = new SimpleDateFormat ("yyyy-MM-dd, HH:mm");
        for (Flight flight : scheduleList){
            Object[] row = new Object[7];
            row[0] = flight;
            row[1] = flight.getAirlinerName();
            row[2] = flight.getAirplaneName();
            row[3] = flight.getfLocation();
            row[4] = flight.gettLocation();
            row[5] = f.format(flight.getdTime());
            row[6] = f.format(flight.getaTime());
            dtm.addRow(row);
        }
    }
    
    private void backAction(){
        CardSequenceJPanel.remove(this);
        Component[] componentArray = CardSequenceJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        SearchFlightJPanel searchFlightJPanel = (SearchFlightJPanel) component;
        searchFlightJPanel.populate();
        searchFlightJPanel.populate1();
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("Complete Customer Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<<  Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        flightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Nmae", "Airliner Name", "Airplane Name", "Source", "Destination", "Departure", "Arrival"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(flightTable);
        if (flightTable.getColumnModel().getColumnCount() > 0) {
            flightTable.getColumnModel().getColumn(0).setResizable(false);
            flightTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            flightTable.getColumnModel().getColumn(1).setResizable(false);
            flightTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            flightTable.getColumnModel().getColumn(2).setResizable(false);
            flightTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            flightTable.getColumnModel().getColumn(3).setResizable(false);
            flightTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            flightTable.getColumnModel().getColumn(4).setResizable(false);
            flightTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            flightTable.getColumnModel().getColumn(5).setResizable(false);
            flightTable.getColumnModel().getColumn(5).setPreferredWidth(80);
            flightTable.getColumnModel().getColumn(6).setResizable(false);
            flightTable.getColumnModel().getColumn(6).setPreferredWidth(80);
        }

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Select Flight");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(288, 288, 288))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton2)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        scheduleflight.getSelectedFlightList().clear();
        backAction();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row = flightTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight flight = (Flight)flightTable.getValueAt(row, 0);
        customerdirectory = flight.getCustomerdirectory();
        CustomerInformationJPanel cijp = new CustomerInformationJPanel(CardSequenceJPanel, flight, customerdirectory);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        CardSequenceJPanel.add("customerinformation",cijp);
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable flightTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Sell;

import Business.Enterprise.Enterprise;
import Business.Supplier.Product;
import Business.User.User;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class SellProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form sellproducts
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private User user;
    public SellProductJPanel(JPanel userProcessContainer, User user, Enterprise enterprise) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.user = user;
        initComponents();
        populateTable();
        populateSelectedTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);
        
        for (Product product : enterprise.getDatastore().getProList()){
            Object[] row = new Object[6];
            row[0] = product;
            row[1] = product.getSupplierName();
            row[2] = product.getOriginPrice();
            row[3] = user.getEmployee().getFlight().getShippingFee()*product.getSize();
            row[4] = product.getOriginPrice() + user.getEmployee().getFlight().getShippingFee()*product.getSize();
            row[5] = product.getNum();
            model.addRow(row);
        }
    }
    
    public void populateSelectedTable(){
        DefaultTableModel model = (DefaultTableModel) employeeProductTable.getModel();
        model.setRowCount(0);
        
        for (Product product : user.getEmployee().getProducts()){
            Object[] row = new Object[5];
            row[0] = product;
            row[1] = product.getSupplierName();
            row[2] = product.getOriginPrice() + product.getShippingCost();
            row[3] = product.getSellPrice();
            row[4] = product.getNum();
            model.addRow(row);
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

        add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeeProductTable = new javax.swing.JTable();
        quantitySpinner = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        sellPriceText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        undo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        returnQuantitySpinner = new javax.swing.JSpinner();

        add.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        employeeProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Supplier", "Cost", "Sell Price", "Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(employeeProductTable);

        quantitySpinner.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Supplier", "Original Price", "Shipping Fee", "Cost", "Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(productTable);

        sellPriceText.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Sell Price");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Quantity");

        undo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        undo.setText("Undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Quantity");

        returnQuantitySpinner.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(returnQuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(undo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(sellPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(sellPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(add))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(undo)
                    .addComponent(returnQuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        boolean alreadyHas = false;
        int selectedRow = productTable.getSelectedRow();
        if(sellPriceText.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter a selling price");
            return;
        }
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        Product selectedProduct = (Product)productTable.getValueAt(selectedRow, 0);
        int quantity = (Integer) quantitySpinner.getValue();
        if(quantity <= 0){
            JOptionPane.showMessageDialog(null, "Quantity can not be less than 1");
            return;
        }else if(quantity > selectedProduct.getNum()){
            JOptionPane.showMessageDialog(null, "There are not enough products");
            return;
        }
        try{
            double sellPrice = Integer.parseInt(sellPriceText.getText());
            if(sellPrice <= selectedProduct.getOriginPrice()+user.getEmployee().getFlight().getShippingFee()*selectedProduct.getSize()){
                JOptionPane.showMessageDialog(null, "The selling price must be larger than the cost");
                return;
            }

            //同一种产品可以有不用的sell price
            //            for(Product pro : user.getEmployee().getProducts()){
                //                if(pro.getName().equals(selectedProduct.getName()) &&
                    //                        pro.getSupplierName().equals(selectedProduct.getSupplierName()) &&
                    //                        pro.getSellPrice() == sellPrice ){
                    //                    pro.setNum(pro.getNum()+quantity);
                    //                    alreadyHas = true;
                    //                }
                //            }
            //同一种产品只有一个sell price
            for(Product pro : user.getEmployee().getProducts()){
                if(pro.getName().equals(selectedProduct.getName()) &&
                    pro.getSupplierName().equals(selectedProduct.getSupplierName())){
                    if(pro.getSellPrice() == sellPrice){
                        pro.setNum(pro.getNum()+quantity);
                        alreadyHas = true;
                    }else{
                        JOptionPane.showMessageDialog(null, "The same product should have the same selling price");
                        return;
                    }
                }
            }
            if(!alreadyHas){
                Product employeeProduct = new Product(selectedProduct.getName(),selectedProduct.getOriginPrice(),
                    quantity,selectedProduct.getSupplierName());
                employeeProduct.setSellPrice(sellPrice);
                employeeProduct.setShippingCost(selectedProduct.getOriginPrice() + user.getEmployee().getFlight().getShippingFee()*selectedProduct.getSize());
                user.getEmployee().getProducts().add(employeeProduct);
            }
            int leftNumber = selectedProduct.getNum() - quantity;
            if(leftNumber == 0 ){
                enterprise.getDatastore().getProList().remove(selectedProduct);
            }else{
                selectedProduct.setNum(leftNumber);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter right price");
        }
        populateTable();
        populateSelectedTable();
    }//GEN-LAST:event_addActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        // TODO add your handling code here:
        boolean alreadyHas = false;
        int selectedRow = employeeProductTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        Product selectedProduct = (Product)employeeProductTable.getValueAt(selectedRow, 0);
        int quantity = (Integer) returnQuantitySpinner.getValue();
        if(quantity <= 0){
            JOptionPane.showMessageDialog(null, "Quantity can not be less than 1");
            return;
        }else if(quantity > selectedProduct.getNum()){
            JOptionPane.showMessageDialog(null, "There are not enough products");
            return;
        }
        for(Product pro : enterprise.getDatastore().getProList()){
            if(pro.getName().equals(selectedProduct.getName()) &&
                pro.getSupplierName().equals(selectedProduct.getSupplierName())){
                pro.setNum(pro.getNum()+quantity);
                alreadyHas = true;
            }
        }
        if(!alreadyHas){
            Product employeeProduct = new Product(selectedProduct.getName(),selectedProduct.getOriginPrice(),
                quantity,selectedProduct.getSupplierName());
            enterprise.getDatastore().getProList().add(employeeProduct);
        }
        int leftNumber = selectedProduct.getNum() - quantity;
        if(leftNumber == 0 ){
            user.getEmployee().getProducts().remove(selectedProduct);
        }else{
            selectedProduct.setNum(leftNumber);
        }

        populateTable();
        populateSelectedTable();
    }//GEN-LAST:event_undoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTable employeeProductTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JSpinner returnQuantitySpinner;
    private javax.swing.JTextField sellPriceText;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;
import Business.Airline.Flight;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.Supplier.Product;
import Business.User.User;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class SelectProductsJPanel extends javax.swing.JPanel {
    private JPanel upc;
    private Customer customer;
    private EcoSystem business;
    private Flight flight;
    private Enterprise enterprise;
    private User user;
    private List<Product> products;
    /**
     * Creates new form SelectProductsJPanel
     */
    public SelectProductsJPanel(JPanel upc, User user, Customer customer, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.upc = upc;
        this.customer = customer;
        this.business = business;
        this.user = user;
        this.flight = user.getEmployee().getFlight();
        this.enterprise = enterprise;
        products = new ArrayList<>();
        populateTable();
        populateSelectedTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);
        
        for (Product product : user.getEmployee().getProducts()){
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getSupplierName();
            row[2] = product.getSellPrice();
            row[3] = product.getNum();
            model.addRow(row);
        }
    }
    
    public void populateSelectedTable(){
        DefaultTableModel model = (DefaultTableModel) customerProductTable.getModel();
        model.setRowCount(0);
        
        for (Product product : products){
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getSupplierName();
            row[2] = product.getSellPrice();
            row[3] = product.getNum();
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

        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        order = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerProductTable = new javax.swing.JTable();
        quantitySpinner = new javax.swing.JSpinner();
        undo = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Quantity");

        add.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        order.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        order.setText("Order");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        back.setText("<<  Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Supplier", "Price", "Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(productTable);

        customerProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Supplier", "Price", "Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(customerProductTable);

        quantitySpinner.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        undo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        undo.setText("Undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(order))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(22, 22, 22)
                                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(add))
                                .addComponent(jScrollPane2)))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(back)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(undo)
                    .addComponent(add))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(order)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        boolean alreadyHas = false;
        int selectedRow = productTable.getSelectedRow();
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
        for(Product pro : products){
            if(pro.getName().equals(selectedProduct.getName()) &&
                pro.getSupplierName().equals(selectedProduct.getSupplierName())){
                pro.setNum(pro.getNum()+quantity);
                alreadyHas = true;
            }
        }
        if(!alreadyHas){
            Product customerProduct = new Product(selectedProduct.getName(),selectedProduct.getOriginPrice(), selectedProduct.getSellPrice(),
                quantity,selectedProduct.getSize(),selectedProduct.getSupplierName());
            customerProduct.setShippingCost(selectedProduct.getShippingCost());
            products.add(customerProduct);
        }
        int leftNumber = selectedProduct.getNum() - quantity;
        if(leftNumber == 0 ){
            user.getEmployee().getProducts().remove(selectedProduct);
        }else{
            selectedProduct.setNum(leftNumber);
        }

        populateTable();
        populateSelectedTable();
    }//GEN-LAST:event_addActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
        if(products.size() == 0){
            JOptionPane.showMessageDialog(null, "Please select products");
            return;
        }
        List<Product> orderProducts = new ArrayList<>();
        orderProducts.addAll(products);
        Order order = new Order(orderProducts);
        order.setCustomer(customer);
        order.setEmployee(user.getEmployee());
        customer.getOrderList().getOrders().add(order);
        user.getEmployee().getOrderList().getOrders().add(order);
        enterprise.getDatastore().getOrderList().getOrders().add(order);
        products.clear();
        System.out.println(products.size());
        populateTable();
        populateSelectedTable();
        System.out.println(enterprise.getName());
        for(Order order1 : enterprise.getDatastore().getOrderList().getOrders()){
            for(Product p : order1.getProducts()){
                System.out.println(p.getName());
            }
        }
    }//GEN-LAST:event_orderActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        for(Product selectedPro : products){
            boolean alreadyHas = false;
            for(Product pro : user.getEmployee().getProducts()){
                if(pro.getName().equals(selectedPro.getName()) &&
                    pro.getSupplierName().equals(selectedPro.getSupplierName())){
                    pro.setNum(pro.getNum()+selectedPro.getNum());
                    alreadyHas = true;
                }
            }
            if(!alreadyHas){
                Product employeeProduct = new Product(selectedPro.getName(),selectedPro.getOriginPrice(), selectedPro.getSellPrice(),
                    selectedPro.getNum(),selectedPro.getSize(),selectedPro.getSupplierName());
                user.getEmployee().getProducts().add(employeeProduct);
            }
        }
        products.clear();
        upc.remove(this);
        Component[] componentArray = upc.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SelectEnterpriseJPanel selectEnterpriseJPanel = (SelectEnterpriseJPanel) component;
        selectEnterpriseJPanel.populate();
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        // TODO add your handling code here:
        boolean alreadyHas = false;
        int selectedRow = customerProductTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        Product selectedProduct = (Product)customerProductTable.getValueAt(selectedRow, 0);
        int quantity = (Integer) quantitySpinner.getValue();
        if(quantity <= 0){
            JOptionPane.showMessageDialog(null, "Quantity can not be less than 1");
            return;
        }else if(quantity > selectedProduct.getNum()){
            JOptionPane.showMessageDialog(null, "There are not enough products");
            return;
        }
        for(Product pro : user.getEmployee().getProducts()){
            if(pro.getName().equals(selectedProduct.getName()) &&
                pro.getSupplierName().equals(selectedProduct.getSupplierName())){
                pro.setNum(pro.getNum()+quantity);
                alreadyHas = true;
            }
        }
        if(!alreadyHas){
            Product employeeProduct = new Product(selectedProduct.getName(),selectedProduct.getOriginPrice(), selectedProduct.getSellPrice(),
                quantity,selectedProduct.getSize(),selectedProduct.getSupplierName());
            employeeProduct.setShippingCost(selectedProduct.getShippingCost());
            user.getEmployee().getProducts().add(employeeProduct);
        }
        int leftNumber = selectedProduct.getNum() - quantity;
        if(leftNumber == 0 ){
            products.remove(selectedProduct);
        }else{
            selectedProduct.setNum(leftNumber);
        }

        populateTable();
        populateSelectedTable();
    }//GEN-LAST:event_undoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JTable customerProductTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton order;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}

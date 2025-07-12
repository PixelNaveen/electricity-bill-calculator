
package Frames;

import Classes.CustomerDetails;
import Classes.DBConnection;
import Classes.NonEditableTableModel;
import Classes.UsageDetails;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;


public class MonthlySummary extends javax.swing.JFrame {
    
    NonEditableTableModel model = new NonEditableTableModel(new String[]{"Usage ID", "Customer ID", "Customer NIC", "Date","No of Units","Total Bill"}, 0);
    Connection conn = null;

    
    public MonthlySummary() {
        initComponents();
        conn = DBConnection.getInstance().getConnection();
        tblUsage.setModel(model);
        setDefault();
        hideColumns();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsage = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Monthly Summary & Usage");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel3.setText("Enter Customer NIC Number");

        tfSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(tblUsage);

        btnExit.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(615, Short.MAX_VALUE)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnUpdate)
                    .addComponent(btnInsert))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
       new ElectricityUsageEntry().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       new MainFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        loadSelectedRowToSecondFrame();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchKeyPressed

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        searchBillByNIC();
    }//GEN-LAST:event_tfSearchKeyReleased

    
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
            java.util.logging.Logger.getLogger(MonthlySummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonthlySummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonthlySummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonthlySummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonthlySummary().setVisible(true);
            }
        });
    }
    
    
    private void hideColumns() {
    tblUsage.getColumnModel().getColumn(0).setMinWidth(0);
    tblUsage.getColumnModel().getColumn(0).setMaxWidth(0);
    tblUsage.getColumnModel().getColumn(0).setWidth(0);
    
    tblUsage.getColumnModel().getColumn(1).setMinWidth(0);
    tblUsage.getColumnModel().getColumn(1).setMaxWidth(0);
    tblUsage.getColumnModel().getColumn(1).setWidth(0);
}
    
     private ArrayList<UsageDetails> getMemberList(String query) {
        ArrayList<UsageDetails> obj = new ArrayList<>();

        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);

            UsageDetails usage;
            while (rs.next()) {
                usage = new UsageDetails(
                        rs.getInt("id"),
                        rs.getInt("customer_id"),
                        rs.getString("customer_nic"),
                        rs.getString("month"),
                        rs.getInt("units"),
                        rs.getDouble("total_bill")
                );
                obj.add(usage);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cannot display results: " + e.getMessage());
            System.out.println("Cannot display results: " + e.getMessage());
            e.printStackTrace();
        }

        return obj;
    }

    private void setMemberTableData(String query) {
        model.setRowCount(0);
        ArrayList<UsageDetails> temp = getMemberList(query);

        for (UsageDetails member : temp) {
            int id = member.getId();
            int customerId = member.getCustomer_id();
            String customerNic = member.getCustomer_nic();
            String month = member.getMonth();
            int units = member.getUnits();
            double totalBill = member.getTotal_bill();

            model.addRow(new Object[]{id, customerId, customerNic, month, units, totalBill});
        }
    }

    private void setDefault() {
        String query = "SELECT * FROM electricity_usage";
        getMemberList(query);
        setMemberTableData(query);
    }
    
    
    
    
    
    
    private void loadSelectedRowToSecondFrame() {
    int selectedRow = tblUsage.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to load data.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Object usageIdValue = model.getValueAt(selectedRow, 0);
    Object customerIdValue = model.getValueAt(selectedRow, 1);
    Object customerNicValue = model.getValueAt(selectedRow, 2);
    Object dateValue = model.getValueAt(selectedRow, 3);
    Object noOfUnitsValue = model.getValueAt(selectedRow, 4);
    Object totalBillValue = model.getValueAt(selectedRow, 5);

    if (usageIdValue == null || customerIdValue == null || customerNicValue == null || dateValue == null || noOfUnitsValue == null || totalBillValue == null) {
        JOptionPane.showMessageDialog(this, "Incomplete data in the selected row.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int usageId = Integer.parseInt(usageIdValue.toString());
    int customerId = Integer.parseInt(customerIdValue.toString());
    String customerNic = customerNicValue.toString();
    String date = dateValue.toString();
    int noOfUnits = Integer.parseInt(noOfUnitsValue.toString());
    double totalBill = Double.parseDouble(totalBillValue.toString());

    // Extract month part from the "date" column (assuming the format is "Month Year")
    String[] dateParts = date.split(" ");
    String selectedMonth = dateParts[0]; // Take only the month part

    // Pass data to the second frame
    ElectricityUsageUpdate secondFrame = new ElectricityUsageUpdate();

    secondFrame.usageIdLabel(usageId);
    secondFrame.setCustomerIdLabel(customerId);
    secondFrame.setCustomerNicTextField(customerNic);
    secondFrame.setComboBoxMonth(selectedMonth); // Assuming you have a method to set the selected item in the combo box
    secondFrame.setNoOfUnitsTextField(noOfUnits);
    secondFrame.setTotalBillTextField(totalBill);

    secondFrame.setVisible(true);
    this.dispose();
}
    
    public void searchBillByNIC() {
    String customerNIC = tfSearch.getText().trim(); // Get the NIC value from the search text field

    // If the search field is empty, reload the full table
    if (customerNIC.isEmpty()) {
        setDefault(); // Call method to load all data
        return;
    }

    String query = "SELECT * FROM electricity_usage WHERE customer_nic = ?";

    try {
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, customerNIC); // Set the NIC parameter

        ResultSet rs = pst.executeQuery();

        // Clear the existing table data
        model.setRowCount(0);

        // Populate the table with search results
        while (rs.next()) {
            Object[] rowData = {
                rs.getInt("id"),
                rs.getInt("customer_id"),
                rs.getString("customer_nic"),
                rs.getString("month"),
                rs.getInt("units"),
                rs.getDouble("total_bill")
            };
            model.addRow(rowData);
        }

        if (model.getRowCount() == 0) {
            //JOptionPane.showMessageDialog(null, "No bills found for the provided NIC.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "No bills found for the provided NIC.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
       // JOptionPane.showMessageDialog(null, "Error while fetching bills: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblUsage;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}

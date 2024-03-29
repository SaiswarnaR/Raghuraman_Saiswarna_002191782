/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Uber;
import Business.UberCarInformation;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saiswarna
 */
public class viewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJpanel
     */
    private JPanel userProcessContainer;
    private UberCarInformation carinformationList;
    private int manufactured_year;
    //private ArrayList<Car> totalavailable;
    
    viewJPanel(JPanel userProcessContainer, UberCarInformation carinformationlist) {
        initComponents();
        lbltimestamp.setText(updateJPanel.Time);
        this.userProcessContainer=userProcessContainer;
        this.carinformationList=carinformationlist;
       
       populateTable();   
       
       totalAvailable();
      
    }
    
    
    private void totalAvailable(){
        ArrayList<Uber> totalavailable = new ArrayList<>();
        totalavailable = carinformationList.getTotalAvailable();
        
        
        ArrayList<Uber> totalUnavailable = new ArrayList<>();
        totalUnavailable = carinformationList.getTotalUnAvailable();
        int total = totalavailable.size();
        
        String S = Integer.toString(total);
        
        int totalN = totalUnavailable.size();
        
        String SS = Integer.toString(totalN);
     
       txtAvailableTotal.setText(S);
       txtUnvailableTotal.setText(SS);
    }
    

    
     private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblView.getModel(); 
        dtm.setRowCount(0);
        for (Uber car : carinformationList.getCarList()){
            Object[] row = new Object[10];
            row[0] = car;
            row[1] = car.getManufactured_year();
            row[2]= car.getMax_seats();
            row[3]= car.getMin_seats();
            row[4]=car.getSerial_num();
            row[5]=car.getModel_num();
            row[6]=car.getAvailble_city();
            row[7]=car.isAvailable();
            row[8]=car.isMaintenance_certificate();
            row[9]=car.getCreatedOn();
            dtm.addRow(row);
            
    }
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maintBtnGrp = new javax.swing.ButtonGroup();
        avaiBtnGrp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtAvailableTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUnvailableTotal = new javax.swing.JTextField();
        btnFirstAvailable = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbltimestamp = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("VIEW CARS");

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BRAND", "MANUFACTURED YEAR", "MAX SEATS", "MIN SEATS", "SERIAL NUMBER", "MODEL NUMBER", "AVAILABLE CITY", "AVAILABILITY", "MAINTENANCE", "CREATED ON"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblView);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("FUNCTIONS");

        btnSearch.setText("CUSTOMER SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel13.setText("TOTAL NUMBER OF AVAILABLE CARS");

        txtAvailableTotal.setEnabled(false);
        txtAvailableTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailableTotalActionPerformed(evt);
            }
        });

        jLabel14.setText("TOTAL NUMBER OF UNAVAILABLE CARS");

        txtUnvailableTotal.setEnabled(false);
        txtUnvailableTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnvailableTotalActionPerformed(evt);
            }
        });

        btnFirstAvailable.setText("FIRST AVAILABLE PASSENGER CAR");
        btnFirstAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailableActionPerformed(evt);
            }
        });

        jLabel2.setText("LAST UPDATED DATE");

        lbltimestamp.setText("  ");

        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAvailableTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(txtUnvailableTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbltimestamp, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(93, 93, 93))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSearch)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFirstAvailable))
                                .addGap(0, 777, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(347, 347, 347)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtAvailableTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtUnvailableTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete)
                        .addComponent(jLabel3)
                        .addComponent(lbltimestamp)))
                .addGap(25, 25, 25)
                .addComponent(btnFirstAvailable)
                .addGap(121, 121, 121))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
           userProcessContainer.remove(this);
           CardLayout layout = (CardLayout) userProcessContainer.getLayout();
           layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       searchJPanel panel = new searchJPanel(userProcessContainer,carinformationList);
       userProcessContainer.add("SearchJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
       
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblView.getSelectedRow();
        if(selectedRow>=0){
         int dialogButton = JOptionPane.YES_NO_OPTION;
            int selectedDialog = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", dialogButton);
            if (selectedDialog == JOptionPane.YES_OPTION){
                Uber car = (Uber) tblView.getValueAt(selectedRow, 0);
                carinformationList.deleteCar(car);
                populateTable();
                
            }
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtAvailableTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailableTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailableTotalActionPerformed

    private void txtUnvailableTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnvailableTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnvailableTotalActionPerformed

    private void btnFirstAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailableActionPerformed
        // TODO add your handling code here:
        
        ArrayList<Uber> result = carinformationList.getFirstAvailable();
        if (result==null){
            JOptionPane.showMessageDialog(null, "Invalid Model Number");
        }
        else {
      DefaultTableModel dtm = (DefaultTableModel) tblView.getModel();
       dtm.setRowCount(0);
       for(Uber car : result){
           Object[] row = new Object[10];
           row[0] = car;
            row[1] = car.getManufactured_year();
            row[2]= car.getMax_seats();
            row[3]= car.getMin_seats();
            row[4]=car.getSerial_num();
            row[5]=car.getModel_num();
            row[6]=car.getAvailble_city();
            row[7]=car.isAvailable();
            row[8]=car.isMaintenance_certificate();
            row[9]=car.getCreatedOn();
            dtm.addRow(row);
     }
    } 
        
        
    }//GEN-LAST:event_btnFirstAvailableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup avaiBtnGrp;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirstAvailable;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltimestamp;
    private javax.swing.ButtonGroup maintBtnGrp;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtAvailableTotal;
    private javax.swing.JTextField txtUnvailableTotal;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Uber;
import Business.UberCarInformation;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saiswarna
 */
public class createJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
   private JPanel userProcessContainer;
   private UberCarInformation carinformationList;

    createJPanel(JPanel userProcessContainer, UberCarInformation carinformationlist) {
       initComponents();
       this.userProcessContainer=userProcessContainer;
       this.carinformationList=carinformationlist;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCreateCar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtYearOfMfg = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtMaxSeats = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        txtMinSeats = new javax.swing.JTextField();
        txtModelNum = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        rbYesMaintainance = new javax.swing.JRadioButton();
        rbNoMaintainance = new javax.swing.JRadioButton();
        rbYesAvailability = new javax.swing.JRadioButton();
        rbNoAvailability = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("ENTER CAR DETAILS");

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreateCar.setText("Create");
        btnCreateCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCarActionPerformed(evt);
            }
        });

        jLabel2.setText("MANUFACTURER NAME");

        jLabel3.setText("MANUFACTURE YEAR");

        jLabel4.setText("MINIMUM SEATS");

        jLabel5.setText("MAXIMUM SEATS");

        jLabel6.setText("SERIAL NUMBER");

        jLabel7.setText("MODEL NUMBER");

        jLabel8.setText("AVAILABLE CITY");

        jLabel9.setText("MAINTENANCE CERTIFICATE");

        jLabel10.setText("AVAILABILITY");

        txtMinSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinSeatsActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbYesMaintainance);
        rbYesMaintainance.setText("Yes");
        rbYesMaintainance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYesMaintainanceActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbNoMaintainance);
        rbNoMaintainance.setText("No");

        buttonGroup1.add(rbYesAvailability);
        rbYesAvailability.setText("Yes");

        buttonGroup1.add(rbNoAvailability);
        rbNoAvailability.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtModelNum, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(txtSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(txtBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(txtMaxSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(txtYearOfMfg)
                                        .addComponent(txtMinSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbYesMaintainance)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNoMaintainance))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbYesAvailability)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNoAvailability))
                                    .addComponent(btnCreateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtYearOfMfg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbYesMaintainance)
                    .addComponent(rbNoMaintainance))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rbYesAvailability)
                    .addComponent(rbNoAvailability))
                .addGap(39, 39, 39)
                .addComponent(btnCreateCar)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
           userProcessContainer.remove(this);
           CardLayout layout = (CardLayout) userProcessContainer.getLayout();
           layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCarActionPerformed
        String brand = "";
        String model_num="";
        String available_city="";
        
            
            if(txtBrand.getText().equals("") || txtModelNum.getText().equals("") || txtCity.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            
            }
            else{
                 brand = txtBrand.getText();
                 model_num = txtModelNum.getText();
                 available_city=txtCity.getText();
            }
        try{    
        int manufactured_year = (Integer.parseInt(txtYearOfMfg.getText()));
        int min_seats = Integer.parseInt(txtMinSeats.getText());
        int max_seats = Integer.parseInt(txtMaxSeats.getText());
        int serial_num = Integer.parseInt(txtSerialNumber.getText());
    
   
            
        
        
        
       if(buttonGroup2.getSelection()==null || buttonGroup1.getSelection()==null)
       { 
        JOptionPane.showMessageDialog(null, "Fields cannot be empty");
       }
       else {
        Uber car = carinformationList.addCar();
        car.setBrand(brand);
        car.setManufactured_year(manufactured_year);
        car.setMax_seats(max_seats);
        car.setMin_seats(min_seats);
        car.setSerial_num(serial_num);
        car.setModel_num(model_num);
        car.setAvailble_city(available_city);
        
         if(rbYesAvailability.isSelected()){
            car.setAvailable(true);
        }else if(rbNoAvailability.isSelected()){
            car.setAvailable(false);
                }
         
         if(rbYesMaintainance.isSelected()){
            car.setMaintenance_certificate(true);
        }else if(rbNoMaintainance.isSelected()){
            car.setMaintenance_certificate(false);
        }
        JOptionPane.showMessageDialog(null, "Car Added Successfully");
        
        
        txtBrand.setText("");
        txtCity.setText("");
        txtMaxSeats.setText("");
        txtMinSeats.setText("");
        txtModelNum.setText("");
        txtSerialNumber.setText("");
        txtYearOfMfg.setText("");
        }
        }catch(NumberFormatException c){ JOptionPane.showMessageDialog(null, "Enter Numeric value");}
        
        
    }//GEN-LAST:event_btnCreateCarActionPerformed

    private void txtMinSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinSeatsActionPerformed

    private void rbYesMaintainanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYesMaintainanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbYesMaintainanceActionPerformed

    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbNoAvailability;
    private javax.swing.JRadioButton rbNoMaintainance;
    private javax.swing.JRadioButton rbYesAvailability;
    private javax.swing.JRadioButton rbYesMaintainance;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtModelNum;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtYearOfMfg;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.placementservice.UserInterface;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 640
 */
public class UpdateStudent extends javax.swing.JFrame {

    public void Clear(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }



    /**
     * Creates new form UpdateStudent
     */
    public UpdateStudent() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(159, 106, 106));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Index Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 136, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 243, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 243, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 243, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 240, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delaete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Second Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Birth Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 14));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Parent Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 240, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ID Number");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 240, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 380, 370));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPDATE STUDENT");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("INFORMATION");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 370));

        setSize(new java.awt.Dimension(607, 371));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //search button

        String index=jTextField1.getText();

        try {
            Connection connection=MysqlConnector.connect();
            Statement statement=connection.createStatement();
            ResultSet resultSet01=statement.executeQuery("SELECT * FROM placementdb.placedstudent WHERE `Index`='"+index+"'");
            if (resultSet01.next()){
                JOptionPane.showMessageDialog(null, "Student Already Placed");
                Clear();
            }else {
                ResultSet resultSet02=statement.executeQuery("SELECT * FROM placementdb.studentdetails WHERE `index`='"+index+"'");
                if (resultSet02.next()){
                    jTextField2.setText(resultSet02.getString(1));
                    jTextField3.setText(resultSet02.getString(2));
                    jTextField4.setText(resultSet02.getString(3));
                    jComboBox1.addItem(resultSet02.getString(5));
                    jTextField5.setText(resultSet02.getString(6));
                    jTextField6.setText(resultSet02.getString(7));
                }else {
                    JOptionPane.showMessageDialog(null, "Student Does Not Exist");
                }
            }

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //save button

        try {
            Connection connection=MysqlConnector.connect();
            PreparedStatement preparedStatement=connection.prepareStatement("UPDATE placementdb.studentdetails SET Fname=? ," +
                    "Sname=?,Yob=?,Gender=?,Pname=?,P_ID=? WHERE `index`='"+jTextField1.getText()+"'");
            preparedStatement.setString(1, jTextField2.getText());
            preparedStatement.setString(2, jTextField3.getText());
            preparedStatement.setString(3, jTextField4.getText());
            preparedStatement.setString(4, (String) jComboBox1.getSelectedItem());
            preparedStatement.setString(5, jTextField5.getText());
            preparedStatement.setString(6,jTextField6.getText());
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Updated Successfully");

            Clear();


        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        //clear button

        Clear();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        //delete button
        try {
            Connection connection=MysqlConnector.connect();
            Statement statement=connection.createStatement();
            Statement statement1=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * from placementdb.placedstudent WHERE `Index`='"+jTextField1.getText()+"'");
            ResultSet resultSet1=statement1.executeQuery("SELECT * FROM placementdb.marks WHERE IndexNumber='"+jTextField1.getText()+"'");

            if (resultSet.next()&&resultSet1.next()){
                JOptionPane.showMessageDialog(null, "Student Already Placed");
            }
            else {
                statement.executeUpdate("DELETE FROM placementdb.studentdetails WHERE `index`='"+jTextField1.getText()+"'");

                JOptionPane.showMessageDialog(null, "Deleted Successfully");
                Clear();
            }

        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);

        }



    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        //Close Button

        JOptionPane.showMessageDialog(null, "Confirm Close","select",JOptionPane.YES_NO_OPTION);
            new Navigation().setVisible(true);
            setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
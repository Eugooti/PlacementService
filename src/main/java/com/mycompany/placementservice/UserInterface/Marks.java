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
public class Marks extends javax.swing.JFrame {


    public  void Clear(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }
    public int Total(){
        int maths= Integer.parseInt(jTextField2.getText());
        int english=Integer.parseInt(jTextField3.getText());
        int Kiswahili=Integer.parseInt(jTextField4.getText());
        int Science=Integer.parseInt(jTextField5.getText());
        int SSTRE=Integer.parseInt(jTextField6.getText());

        return maths+english+Kiswahili+Science+SSTRE;

    }






    /**
     * Creates new form Marks
     */
    public Marks() {
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

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 195, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 420, 10));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 238, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 238, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 238, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 238, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 238, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Index");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Maths");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("English");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Kiswahili");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 21));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Science");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("SSTRE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 420, 410));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT MARKS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 410));

        setSize(new java.awt.Dimension(658, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        //Close Button
        JOptionPane.showMessageDialog(null, "Confirm Close","select",JOptionPane.YES_NO_OPTION);
            new Navigation().setVisible(true);
            setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //Search Button

        try {
            Connection connection=MysqlConnector.connect();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM placementdb.placedstudent WHERE `Index`='"+jTextField1.getText()+"'");
            if (resultSet.next()){
                JOptionPane.showMessageDialog(null, "Student Already Placed");
                jTextField1.setText("");
            }else {
                ResultSet resultSet1=statement.executeQuery("SELECT * FROM placementdb.studentdetails WHERE `index`='"+jTextField1.getText()+"' LIMIT 1");
                if (resultSet1.next()) {
                    jTextField1.setEditable(false);
                    JOptionPane.showMessageDialog(null, "Proceed to add marks");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Student Does Not Exist");
                    new RegisterStudent().setVisible(true);
                    setVisible(false);
                }

            }


        }
        catch (Exception e){

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //Submit buttons

        try {
            Connection connection=MysqlConnector.connect();
            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO placementdb.marks (IndexNumber, Maths, English, Kiswahili, Science, SSTRE, Total,School) VALUES (?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, jTextField1.getText());
            preparedStatement.setString(2, jTextField2.getText());
            preparedStatement.setString(3, jTextField3.getText());
            preparedStatement.setString(4, jTextField4.getText());
            preparedStatement.setString(5, jTextField5.getText());
            preparedStatement.setString(6, jTextField6.getText());
            preparedStatement.setInt(7, Total());

            if (Total()>=400){
                Statement statement=connection.createStatement();
                ResultSet resultSet=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=1 LIMIT 1");
                if (resultSet.next()){
                    String School=resultSet.getString(1);
                    int Count=resultSet.getInt(2);
                    if (Count<=10){
                        preparedStatement.setString(8, School);

                        Count++;

                        PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count+"' WHERE Code=1");
                        preparedStatement1.executeUpdate();
                    }
                    else {
                        Statement statement1=connection.createStatement();
                        ResultSet resultSet1=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=2");
                        if (resultSet.next()){
                            String School1=resultSet.getString(1);
                            int Count1=resultSet.getInt(2);
                            if (Count1<=10){
                                preparedStatement.setString(8, School1);

                                Count1++;

                                PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count1+"' WHERE Code=2");
                                preparedStatement1.executeUpdate();
                            }
                            else {
                                Statement statement2=connection.createStatement();
                                ResultSet resultSet2=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=3");
                                if (resultSet.next()){
                                    String School2=resultSet.getString(1);
                                    int Count2=resultSet.getInt(2);
                                    if (Count2<=10){
                                        preparedStatement.setString(8, School2);

                                        Count2++;

                                        PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count2+"' WHERE Code=3");
                                        preparedStatement1.executeUpdate();
                                    }
                                    else {
                                        Statement statement3=connection.createStatement();
                                        ResultSet resultSet3=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=4");
                                        if (resultSet.next()){
                                            String School3=resultSet.getString(1);
                                            int Count3=resultSet.getInt(2);
                                            if (Count3<=10){
                                                preparedStatement.setString(8, School3);

                                                Count3++;

                                                PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count3+"' WHERE Code=4");
                                                preparedStatement1.executeUpdate();
                                            }
                                            else {
                                                Statement statement4=connection.createStatement();
                                                ResultSet resultSet4=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=5");
                                                if (resultSet.next()){
                                                    String School4=resultSet.getString(1);
                                                    int Count4=resultSet.getInt(2);
                                                    if (Count4<=10){
                                                        preparedStatement.setString(8, School4);

                                                        Count4++;

                                                        PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count4+"' WHERE Code=5");
                                                        preparedStatement1.executeUpdate();
                                                    }

                                                }
                                            }
                                        }

                                    }
                                }

                            }
                        }

                    }


                }
            }


            else if (Total()>=350){

                    Statement statement=connection.createStatement();
                    ResultSet resultSet=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=2");
                    if (resultSet.next()){
                        String School=resultSet.getString(1);
                        int Count=resultSet.getInt(2);
                        if (Count<=10){
                            preparedStatement.setString(8, School);

                            Count++;

                            PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count+"' WHERE Code=2");
                            preparedStatement1.executeUpdate();
                        }
                        else {
                            Statement statement2=connection.createStatement();
                            ResultSet resultSet2=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=3");
                            if (resultSet.next()){
                                String School2=resultSet.getString(1);
                                int Count2=resultSet.getInt(2);
                                if (Count2 <=10){
                                    preparedStatement.setString(8, School2);

                                    Count2++;

                                    PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count2+"' WHERE Code=3");
                                    preparedStatement1.executeUpdate();
                                }
                                else {
                                    Statement statement3=connection.createStatement();
                                    ResultSet resultSet3=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=4");
                                    if (resultSet.next()){
                                        String School3=resultSet.getString(1);
                                        int Count3=resultSet.getInt(2);
                                        if (Count3<=10){
                                            preparedStatement.setString(8, School3);

                                            Count3++;

                                            PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count3+"' WHERE Code=4");
                                            preparedStatement1.executeUpdate();
                                        }
                                        else {
                                            Statement statement4=connection.createStatement();
                                            ResultSet resultSet4=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=5");
                                            if (resultSet.next()){
                                                String School4=resultSet.getString(1);
                                                int Count4=resultSet.getInt(2);
                                                if (Count4<=10){
                                                    preparedStatement.setString(8, School4);

                                                    Count4++;

                                                    PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count4+"' WHERE Code=5");
                                                    preparedStatement1.executeUpdate();
                                                }

                                            }
                                        }
                                    }

                                }
                            }

                        }
                }
            }


            else if (Total()>=300){
                Statement statement=connection.createStatement();
                ResultSet resultSet=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=3");
                if (resultSet.next()){
                    String School=resultSet.getString(1);
                    int Count=resultSet.getInt(2);
                    if (Count<=10){
                        preparedStatement.setString(8, School);

                        Count++;

                        PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count+"' WHERE Code=3");
                        preparedStatement1.executeUpdate();
                    }
                    else {
                        Statement statement3=connection.createStatement();
                        ResultSet resultSet3=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=4");
                        if (resultSet.next()){
                            String School3=resultSet.getString(1);
                            int Count3=resultSet.getInt(2);
                            if (Count3<=10){
                                preparedStatement.setString(8, School3);

                                Count3++;

                                PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count3+"' WHERE Code=4");
                                preparedStatement1.executeUpdate();
                            }
                            else {
                                Statement statement4=connection.createStatement();
                                ResultSet resultSet4=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=5");
                                if (resultSet.next()){
                                    String School4=resultSet.getString(1);
                                    int Count4=resultSet.getInt(2);
                                    if (Count4<=10){
                                        preparedStatement.setString(8, School4);

                                        Count4++;

                                        PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count4+"' WHERE Code=5");
                                        preparedStatement1.executeUpdate();
                                    }

                                }
                            }
                        }

                    }
                }
            }


            else if (Total()>=250){
                Statement statement=connection.createStatement();
                ResultSet resultSet=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=4");
                if (resultSet.next()){
                    String School=resultSet.getString(1);
                    int Count=resultSet.getInt(2);
                    if (Count<=10){
                        preparedStatement.setString(8, School);

                        Count++;

                        PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count+"' WHERE Code=4");
                        preparedStatement1.executeUpdate();
                    }
                    else {
                        Statement statement4=connection.createStatement();
                        ResultSet resultSet4=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=5");
                        if (resultSet.next()){
                            String School4=resultSet.getString(1);
                            int Count4=resultSet.getInt(2);
                            if (Count4<=10){
                                preparedStatement.setString(8, School4);

                                Count4++;

                                PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count4+"' WHERE Code=5");
                                preparedStatement1.executeUpdate();
                            }

                        }
                    }
                }
            }



            else if (Total()<250){
                Statement statement=connection.createStatement();
                ResultSet resultSet=statement.executeQuery("SELECT * FROM placementdb.schools WHERE Code=5");
                if (resultSet.next()){
                    String School=resultSet.getString(1);
                    int Count=resultSet.getInt(2);
                    if (Count<=10){
                        preparedStatement.setString(8, School);

                        Count++;

                        PreparedStatement preparedStatement1=connection.prepareStatement("UPDATE placementdb.schools SET Count='"+Count+"' WHERE Code=5");
                        preparedStatement1.executeUpdate();
                    }

                }
            }

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Marks Successfully Added");
            Clear();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        //Clear Button

        Clear();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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

package com.mycompany.placementservice.UserInterface;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnector {

    public static Connection connect(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/placementdb", "root", "IN16/00054/19");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }    }
}

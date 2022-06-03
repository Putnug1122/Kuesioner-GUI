/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuesionerfix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DBConnection {
    
    private static Connection con;
    

    public static void main(String[] args) {
        DBConnection connection = new DBConnection();
        connection.connection();
    }
    
    public void connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/kuesioner_1";
            String username = "root";
            String password = "";
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Terhubung");
        }
    }
    
    public static Connection getConnection() {
        if (con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/kuesioner_1";
                String username = "root";
                String password = "";
                con = DriverManager.getConnection(url, username, password);
                return con;
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal Terhubung");
                return null;
            }

        }
        return con;
    }
 }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuesionerfix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import kuesionerfix.entity.UserLogin;

/**
 *
 * @author ASUS
 */
public class DBConnection {
    
    private static Connection con;
    

    public static void main(String[] args) {
        String sql = "SELECT * FROM users WHERE username = 'admin'";
        try {
            Connection connection = DBConnection.getConnection();
            Statement smt = connection.createStatement();
            
            ResultSet rs = smt.executeQuery(sql);
            if (rs.next()) {
                UserLogin.setUserLogin(rs.getInt("id"), rs.getString("name"), rs.getString("username"), rs.getString("id_prov"), rs.getString("role"));
            }
        }  catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static Connection getConnection() {
        if (con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/kuesioner_1";
                String username = "root";
                String password = "4p34d3nt0";
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


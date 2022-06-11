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
    private static String host = "localhost";
    private static int port = 3306;
    private static String database = "kuesioner_1";
    private static String username = "root";
    private static String password = "";
    
    public static Connection getConnection() {
        if (con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = String.format("jdbc:mysql://%s:%d/%s", DBConnection.host, DBConnection.port, DBConnection.database);
                String username = DBConnection.username;
                String password = DBConnection.password;
                con = DriverManager.getConnection(url, username, password);
                return con;
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal Terhubung");
                return null;
            }

        }
        return con;
    }

    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        DBConnection.con = con;
    }

    public static String getHost() {
        return host;
    }

    public static void setHost(String host) {
        DBConnection.host = host;
    }

    public static int getPort() {
        return port;
    }

    public static void setPort(int port) {
        DBConnection.port = port;
    }

    public static String getDatabase() {
        return database;
    }

    public static void setDatabase(String database) {
        DBConnection.database = database;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        DBConnection.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        DBConnection.password = password;
    }
    
    
 }
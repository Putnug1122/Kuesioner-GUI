/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuesionerfix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class KuesionerFix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kuesioner_1", "root", "");
                System.out.println("Koneksi Berhasil");
            System.out.println("Koneksi Berhasil");
            } catch (ClassNotFoundException ex) {
                System.out.println("Koneksi Gagal");
            }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuesionerfix.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kuesionerfix.DBConnection;

/**
 *
 * @author Damars
 */
public class RegistrasiRepo {

    private Connection connection;

    public RegistrasiRepo(Connection connection) {
        this.connection = connection;
    }

    public void approveRegistrasi(int idRegistrasi) {
        String sql = "UPDATE registrasi SET status = 'approve' WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idRegistrasi);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil approve registrasi", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuesionerfix.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import kuesionerfix.DBConnection;
import kuesionerfix.entity.User;
import kuesionerfix.entity.UserLogin;

/**
 *
 * @author Damars
 */
public class UserRepo {

    private Connection connection;

    public UserRepo(Connection connection) {
        this.connection = connection;
    }

    public void login(String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                UserLogin.setUserLogin(rs.getInt("id"), rs.getString("name"), rs.getString("username"),
                        rs.getString("id_prov"), rs.getString("role"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addOperator(User user) {
        String sql = "INSERT INTO users (name, username, password, role) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getRole());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Operator berhasil ditambahkan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}

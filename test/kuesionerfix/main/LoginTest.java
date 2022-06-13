/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuesionerfix.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import kuesionerfix.DBConnection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author HP
 */
public class LoginTest {
    @Test
    public void testLogin() throws SQLException {
        Connection connection = DBConnection.getConnection();
            Statement smt = connection.createStatement();
            
            ResultSet rs = smt.executeQuery("SELECT * FROM users WHERE username = '" + "admin" + "' AND password = '" + "asdf" + "'");
            
            rs.next();
            assertEquals(rs.getInt("id"), 1);
            assertEquals(rs.getString("name"), "Admin Pusat");
            assertEquals(rs.getString("username"), "admin");
            assertEquals(rs.getString("role"), "admin");
    }
}

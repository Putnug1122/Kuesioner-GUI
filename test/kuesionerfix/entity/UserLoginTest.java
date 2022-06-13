/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuesionerfix.entity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import kuesionerfix.DBConnection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author HP
 */
public class UserLoginTest {
    UserLogin userlogin = new UserLogin();
    
    @Test
    public void testGetId() {
        userlogin.setId(1);
        assertEquals(userlogin.getId(), 1);
    }
    
    @Test
    public void testGetName() {
        userlogin.setName("Shawna");
        assertEquals(userlogin.getName(), "Shawna");
    }
    
    @Test
    public void testGetUsername() {
        userlogin.setUsername("shawna12345");
        assertEquals(userlogin.getUsername(), "shawna12345");
    }
    
    @Test
    public void testGetIdProv() {
        userlogin.setIdProv("11");
        assertEquals(userlogin.getIdProv(), "11");
    }
    
    @Test
    public void testGetRole() {
        userlogin.setRole("admin");
        assertEquals(userlogin.getRole(), "admin");
    }
    
}

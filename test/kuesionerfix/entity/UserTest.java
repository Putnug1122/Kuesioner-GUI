/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package kuesionerfix.entity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class UserTest {

    public UserTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetProperty() {
        User user = new User("Damar", "damar", "123", "operator");

        assertEquals(user.getName(), "Damar");
        assertEquals(user.getUsername(), "damar");
        assertEquals(user.getPassword(), "123");
        assertEquals(user.getRole(), "operator");
    }

    @Test
    public void testSetProperty() {
        User user = new User();

        user.setName("Damar");
        user.setUsername("damar");
        user.setPassword("123");
        user.setRole("operator");

        assertEquals(user.getName(), "Damar");
        assertEquals(user.getUsername(), "damar");
        assertEquals(user.getPassword(), "123");
        assertEquals(user.getRole(), "operator");
    }

}

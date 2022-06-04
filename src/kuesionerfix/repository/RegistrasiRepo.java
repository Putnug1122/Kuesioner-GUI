/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuesionerfix.repository;

import java.sql.Connection;

/**
 *
 * @author Damars
 */
public class RegistrasiRepo {
    private Connection connection;
    
    public RegistrasiRepo(Connection connection) {
        this.connection = connection;
    }
    
}

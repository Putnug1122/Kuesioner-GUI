/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuesionerfix.entity;

/**
 *
 * @author Damars
 */
public class UserLogin {

    private static int id = -1;
    private static String name = "";
    private static String username = "";
    private static String idProv = "";
    private static String role = "";

    public UserLogin() {

    }

    public static void setUserLogin(int id, String name, String username, String idProv, String role) {
        UserLogin.id = id;
        UserLogin.name = name;
        UserLogin.username = username;
        UserLogin.idProv = idProv;
        UserLogin.role = role;
    }

    public static void setUserLogin(int id, String name, String username, String role) {
        UserLogin.id = id;
        UserLogin.name = name;
        UserLogin.username = username;
        UserLogin.role = role;
    }

    public static void destroyUserLogin() {
        UserLogin.id = 0;
        UserLogin.name = "";
        UserLogin.idProv = "";
        UserLogin.role = "";
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UserLogin.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        UserLogin.name = name;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserLogin.username = username;
    }

    public static String getIdProv() {
        return idProv;
    }

    public static void setIdProv(String idProv) {
        UserLogin.idProv = idProv;
    }

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        UserLogin.role = role;
    }
}

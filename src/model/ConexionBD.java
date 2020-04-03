/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class ConexionBD {

    
    public static String url = "jdbc:mysql://localhost/findingpeople?useTimezone=true&serverTimezone=UTC";
    public static String usuario = "root";
    public static String contrasena = "";
  //  public static String clase = "com.mysql.cj.jdbc.Driver";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión establecida");
        } catch (Exception e) {
            System.out.println("Fallo en la conexión con la bd");
            e.printStackTrace();
        }
        return conexion;
    }

}

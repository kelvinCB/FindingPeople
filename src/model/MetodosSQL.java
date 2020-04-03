/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author USER
 */
public class MetodosSQL {

    public static ConexionBD conexion = new ConexionBD();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultados;
    public static String sql;

    public static int resultado_numero = 0;

    public int guardar(String nombre, String usuario, String contrasena, String telefono, String sexo) {

        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO usuarios (nombre,usuario,contrasena,telefono,sexo) VALUES (?,?,?,?,?)");

        try {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, usuario);
            sentencia_preparada.setString(3, contrasena);
            sentencia_preparada.setString(4, telefono);
            sentencia_preparada.setString(5, sexo);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error al insertar datos a la BD");
            e.printStackTrace();
        }

        return resultado;
    }

    public static String buscarNombre(String usuario) {
        String busqueda_nombre = null;
        Connection conexion = null;
        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar = ("SELECT nombre FROM usuarios WHERE usuario = '" + usuario + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultados = sentencia_preparada.executeQuery();
            if (resultados.next()) {
                String nombre = resultados.getString("nombre");
                busqueda_nombre = nombre;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error en el método getUsuario");
            e.printStackTrace();
        }

        return busqueda_nombre;
    }

    public static String busquedaDeUsuarioRegistrado(String usuario, String contrasena) {

        String busqueda_usuario = null;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar_usuario = ("SELECT nombre,usuario,contrasena FROM usuarios WHERE usuario = '" + usuario + "' && contrasena = '" + contrasena + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
            resultados = sentencia_preparada.executeQuery();
            if (resultados.next()) {
                busqueda_usuario = "Usuario Encontrado";
            } else {
                busqueda_usuario = "Usuario No Encontrado";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error en el metodo de busquedaDeUsuario");
            e.printStackTrace();
        }
        return busqueda_usuario;
    }

}

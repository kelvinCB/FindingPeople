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

        public int guardarAdmin(String nombre, String usuario, String contrasena, String telefono, String sexo) {

        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO administradores (nombre,usuario,contrasena,telefono,sexo) VALUES (?,?,?,?,?)");

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
    
    
    //busca el nombre de un usuario
    public static String buscarNombreDeUsuario(String usuario) {
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
    
       //busca el nombre de un administrador
    public static String buscarNombreDeAdministrador(String usuario) {
        String busqueda_nombre = null;
        Connection conexion = null;
        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar = ("SELECT nombre FROM administradores WHERE usuario = '" + usuario + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultados = sentencia_preparada.executeQuery();
            if (resultados.next()) {
                String nombre = resultados.getString("nombre");
                busqueda_nombre = nombre;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error en el método buscarNombreDeAdministrador");
            e.printStackTrace();
        }

        return busqueda_nombre;
    }

    //busca un usuario registrado
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
    
    
    
    //busca un administrador registrado
    
        public static String busquedaDeAdministradorRegistrado(String usuario, String contrasena) {

        String busqueda_usuario = null;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar_usuario = ("SELECT nombre,usuario,contrasena FROM administradores WHERE usuario = '" + usuario + "' && contrasena = '" + contrasena + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
            resultados = sentencia_preparada.executeQuery();
            if (resultados.next()) {
                busqueda_usuario = "Administrador Encontrado";
            } else {
                busqueda_usuario = "Administrador No Encontrado";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error en el metodo de busqueda de administrador");
            e.printStackTrace();
        }
        return busqueda_usuario;
    }
    
    // Insertar datos en personas desaparecidas
    
        public int guardarPersonaDesaparecida(String nombre, String sexo, String correo_contacto, String telefono_contacto, String fecha_registro, String foto) {

        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO desaparecidos (nombre,sexo,correo_contacto,telefono_contacto,fecha_registro,foto) VALUES (?,?,?,?,?,?)");

        try {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, sexo);
            sentencia_preparada.setString(3, correo_contacto);
            sentencia_preparada.setString(4, telefono_contacto);
            sentencia_preparada.setString(5, fecha_registro);
            sentencia_preparada.setString(6, foto);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error al insertar datos a la tabla desaparecidos");
            e.printStackTrace();
        }

        return resultado;
    }
        
        public static String[] buscarDatosEnDesaparecidos(String desaparecido) {
         String[] busqueda_nombre = null;
        Connection conexion = null;
        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar = ("SELECT nombre,sexo,correo_contacto,telefono_contacto,fecha_registro,foto FROM desaparecidos WHERE nombre = '" + desaparecido + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultados = sentencia_preparada.executeQuery();
            if (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String sexo = resultados.getString("sexo");
                String correo_contacto = resultados.getString("correo_contacto");
                String telefono_contacto = resultados.getString("telefono_contacto");
                String fecha_registro = resultados.getString("fecha_registro");
                String foto = resultados.getString("foto");
                busqueda_nombre = new String[]{nombre,sexo,correo_contacto,telefono_contacto,fecha_registro,foto};
                
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error en el método getUsuario");
            e.printStackTrace();
        }

        return busqueda_nombre;
    }

        
        // Insertar datos en personas encontradas
    
        public int guardarPersonaEncontrada(String nombre, String sexo, String correo_contacto, String telefono_contacto, String fecha_encuentro, String lugar_encuentro, String foto) {

        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO encontrados (nombre,sexo,correo_contacto,telefono_contacto,fecha_encuentro,lugar_encuentro,foto) VALUES (?,?,?,?,?,?,?)");

        try {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, sexo);
            sentencia_preparada.setString(3, correo_contacto);
            sentencia_preparada.setString(4, telefono_contacto);
            sentencia_preparada.setString(5, fecha_encuentro);
            sentencia_preparada.setString(6, lugar_encuentro);
            sentencia_preparada.setString(7, foto);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error al insertar datos a la tabla encontrados");
            e.printStackTrace();
        }

        return resultado;
    }

}

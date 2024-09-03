package Modelo;

import Configuracion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OdontoloDAO {

    private Connection con;
    private PreparedStatement pstm;
    private ResultSet rs;

    public Odontologo validar(String usu, String pass) {
        Odontologo odont = null; 
        Conectar conexion = new Conectar();

        try {
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
                
                // Preparamos la consulta SQL
                pstm = con.prepareStatement("SELECT * FROM odontologos WHERE usuario = ? AND Contrasena = ?");
                pstm.setString(1, usu);
                pstm.setString(2, pass); // Agregamos la contraseña a la consulta
                rs = pstm.executeQuery();

                // Verificamos si hay resultados
                if (rs.next()) {
                    odont = new Odontologo();
                    odont.setId(rs.getInt("id"));
                    odont.setNombres(rs.getString("nombres"));
                    odont.setApellidos(rs.getString("apellidos"));
                    odont.setUsuario(rs.getString("Usuario"));
                    odont.setContrasena(rs.getString("Contrasena"));
                    odont.setTipo(rs.getString("Tipo"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al conectarse con la base de datos: " + e.getMessage());
        } finally {
            // Cerramos los recursos en el bloque finally
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar los recursos: " + e.getMessage());
            }
        }
        return odont; // Devuelve null si no se encontró el odontólogo
    }

    // Agrega más métodos para insertar, actualizar y eliminar odontólogos según tus necesidades
}
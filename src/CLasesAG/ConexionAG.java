/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLasesAG;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author allan
 */

public class ConexionAG {
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_medicaag";
    private static final String USER = "root"; // Usuario de MySQL
    private static final String PASSWORD = ""; // Contraseña de MySQL

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new SQLException("Error al conectar a la base de datos", e);
        }
    }
}



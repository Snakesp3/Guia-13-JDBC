/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Snakesp2
 */
public class Conectar {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/tienda";

    public Conectar() {
        
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user , password);
            if (conn != null) {
                System.out.println("Conexion establecida...");
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectarse..." + e);
        }
    }
    // Este metodo retorna la conexion
    public Connection getConnection(){
        
        return conn;
    }
    // Este metodo nos desconectamos de la base de datos
    public void desconectar(){
        
        conn = null;
        if (conn == null) {
            System.out.println("Conexion Terminada...");
        }
    }
}


package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class FabricaConexao {

    public static Connection getConexao(){
        Connection conn=null;
        try { 
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cookbook","postgres","12345678"); 
                        
       } catch(SQLException e) {
            e.printStackTrace();
       }
        return conn;
    }    
    
}

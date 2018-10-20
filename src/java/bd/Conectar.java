/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author cesar1
 */
public class Conectar {
    //tipo de conexion
    static Connection cnn;
    private static void conectar() throws Exception {
            //conexion a mysql y datos del localhost nombre y contraseña
            Class.forName("com.mysql.jdbc.Driver"); 
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/etb", "root", "cesar"); 
        
    }
     public static Connection getInstace()throws Exception {
        //cuando se cumpla la condicion se va a iniciar la conexion    
        if (cnn == null) {
            conectar();
        }
        return cnn;
    }

}

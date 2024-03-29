/**
 * Clase para conectarse a la base de datos
 * 
 * @author Kevin Robles, Raquel Rojas
 * @version 1.0
 */
package utilidad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexionBD {
  static Connection contacto = null;
  
  /**
   * Metodo para realizar la conexion con la base de datos
   * 
   * @return conexion con la base de datos
   */  
  public static Connection getConexion(){        
    try{
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    }
    catch(ClassNotFoundException e){    
      System.out.println(e);
    }
    try{
      String  url = "jdbc:sqlserver://localhost:1433;databaseName=LABMVC";
      contacto = DriverManager.getConnection(url,"sa","sa");
    }
    catch(SQLException e){
      System.out.println(e);
    }
    return contacto;
    }
}

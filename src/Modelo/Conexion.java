package Modelo;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    // Declaramos la Conexion a mysql
    private static Connection con;
    // Declaramos los datos de Conexion a la bd
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";

    private static final String url="jdbc:mysql://localhost:3306/bakery";


    // Funcion que va conectarse a mi bd de mysql
    public Connection Conector() throws SQLException{
       
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(url, user, pass);
            // Si la Conexion fue exitosa mostramos un mensaje de Conexion exitosa
            if (con!=null){
              System.out.println("aceptado");
            }
        }
        // Si la Conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,e);
              System.out.println("error");
        }
          return con;
      
    }
                                      
    
}

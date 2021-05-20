package Modelo;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {
    // Declaramos la conexion a mysql
    private static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";

    private static final String url="jdbc:mysql://localhost:3306/bakery";


    // Funcion que va conectarse a mi bd de mysql
    public void conector() {
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con!=null){
              System.out.println("aceptado");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE,null,e);
              System.out.println("error");
        }
      
    }
                                      
    
}
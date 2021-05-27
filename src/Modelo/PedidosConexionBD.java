
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author AYLIN
 */
public class PedidosConexionBD {
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
   public String NoSerieVentas()
  {
      String serie="";
      String sql ="Select max(Numero_ventas) from ventas";
      try{
        con=cn.Conector();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next())
        {
              serie=rs.getString(1);  
        }
      }
      catch(Exception e){
          
      }
      return serie;
  }
    
    
    
}

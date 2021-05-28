
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author AYLIN
 */
public class PedidosConexionBD implements CRUD {
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
   public String NoSerieVentas()
  {
      String serie="";
      String sql ="Select max(Id_pedido) from pedidos";
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
   public Pedidos listarId(int Id)
    {
         Pedidos p= new Pedidos();
        String sql ="Select * from pedidos where Id_pedido=?";
        try{
        con=cn.Conector();
        ps=con.prepareStatement(sql);
        ps.setInt(1, Id);
        rs=ps.executeQuery();
        while(rs.next())
        {
             
              p.setId_pedido(1);
              p.setProducto(rs.getString(2));
              p.setTotal(rs.getInt(3));      
        }
        } 
        catch(Exception e){JOptionPane.showMessageDialog(null, "Error, Ocurrió un error en mostrar registros", "ERROR!", JOptionPane.ERROR_MESSAGE);}
        return p;
    }

    @Override
    public List listar() {
        List <Pedidos> listaPedido= new ArrayList<>();
        String sql ="select * from pedidos";
        try{
            con=cn.Conector();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
             Pedidos ped = new Pedidos();
             ped.setId_pedido(rs.getInt(1));
             ped.setProducto(rs.getString(2));
             ped.setSabor(rs.getString(4));
             ped.setTamaño(rs.getString(3));
             ped.setTopping(rs.getString(5));
             ped.setTotal(rs.getFloat(6));
             ped.setFecha_actual(rs.getString(7));
             ped.setFecha_entrega(rs.getString(8));
             ped.setId_cliente(rs.getInt(9));
             ped.setComentarios(rs.getString(10));
             
             
             
              listaPedido.add(ped);
              
              
            }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error, Ocurrió un error en mostrar registros", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        return listaPedido;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
      String sql="insert into pedidos (Id_pedido, Producto, Sabor, tamaño, topping, Total, Fecha_actual, Fecha_entrega, Id_cliente, Comentarios) values (?,?,?,?,?,?,?,?,?,?)";
      try{
          con=cn.Conector();
          ps=con.prepareStatement(sql);
          ps.setObject(1, o[0]);
          ps.setObject(2, o[1]);
          ps.setObject(3, o[2]);
          ps.setObject(4, o[3]);
          ps.setObject(5, o[4]);
          ps.setObject(6, o[5]);
          ps.setObject(7, o[6]);
          ps.setObject(8, o[7]);
          ps.setObject(9, o[8]);
          ps.setObject(10, o[9]);
          r= ps.executeUpdate();
        
           JOptionPane.showMessageDialog(null, "Registro agregado con éxito");
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, "Error, no se puede agregar registro", "ERROR!", JOptionPane.ERROR_MESSAGE); 
      }
      return r;
       
    }

    @Override
    public int actualizar(Object[] o) {
          int r=0;
      String sql="update materia set Nombre=? ,Cantidad=? where Id_materia=?";
      try{
          con=cn.Conector();
          ps=con.prepareStatement(sql);
          ps.setObject(1, o[0]);
          ps.setObject(2, o[1]);
          ps.setObject(3, o[2]);
          r= ps.executeUpdate();
        
          JOptionPane.showMessageDialog(null, "Registro actualizado con éxito");
      }
      catch(Exception e)
      {
           JOptionPane.showMessageDialog(null, "Error, no se puede actualizar registro", "ERROR!", JOptionPane.ERROR_MESSAGE);
      }
      return r;
    }

    @Override
    public void eliminar(int id) {
          int r=0;
      String sql="delete from pedidos where Id_pedido=?";
      try{
          con=cn.Conector();
          ps=con.prepareStatement(sql);
          ps.setInt(1, id);
          ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null, "Error, no se puede eliminar registro", "ERROR!", JOptionPane.ERROR_MESSAGE); 
      }
    } 
    
    
}

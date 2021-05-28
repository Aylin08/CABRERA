package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author AYLIN
 */
public class ClienteConexionBD implements CRUD {
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Cliente co=new Cliente();
    
    
    public Cliente listarId(String Id_cliente)
    {
  Cliente clientes=new Cliente();
        String sql ="Select * from cliente where Id_cliente=?";
        try{
        con=cn.Conector();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next())
        {
            clientes.setId_cliente(rs.getInt(1));
            clientes.setNombre_cliente(rs.getString(2));
            clientes.setTelefono(rs.getString(3));
            clientes.setDireccion(rs.getString(4));
              
        }
        } 
        catch(Exception e){JOptionPane.showMessageDialog(null, "Error, Ocurrió un error en mostrar registros", "ERROR!", JOptionPane.ERROR_MESSAGE);}
        return clientes;
    }
  
      public List listar() {
         List <Cliente> lista= new ArrayList<>();
        String sql ="select * from cliente";
        try{
            con=cn.Conector();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
              Cliente c=new Cliente();
              
             c.setId_cliente(rs.getInt(1));
             c.setNombre_cliente(rs.getString(2));
             c.setTelefono(rs.getString(3));
             c.setDireccion(rs.getString(4));
              
              lista.add(c);
              
              
            }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error, Ocurrió un error en mostrar registros", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
      String sql="insert into cliente (Id_cliente,Nombre_cliente,Telefono,Direccion) values (?,?,?,?)";
      try{
          con=cn.Conector();
          ps=con.prepareStatement(sql);
          ps.setObject(1, o[0]);
          ps.setObject(2, o[1]);
          ps.setObject(3, o[2]);
          ps.setObject(4, o[3]);
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
    public int actualizar(Object [] o) {
           int r=0;
      String sql="update cliente set Id_cliente=?, Nombre_cliente=?, Telefono=?, Direccion=? ";
      try{
          con=cn.Conector();
          ps=con.prepareStatement(sql);
          ps.setObject(1, o[0]);
          ps.setObject(2, o[1]);
          ps.setObject(3, o[2]);
          ps.setObject(4, o[3]);
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
 
      String sql="delete from cliente where Id_cliente=?";
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

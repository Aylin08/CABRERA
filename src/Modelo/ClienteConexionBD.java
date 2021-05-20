package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AYLIN
 */
public class ClienteConexionBD implements CRUD {
     Connection con;
    conexion cn= new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    
    public Cliente listarId(String Id_cliente)
    {
  Cliente cliente=new Cliente();
        String sql ="Select * from cliente where Id_cliente=?";
        try{
        con=cn.conector();
        ps=con.prepareStatement(sql);
        ps.setString(0,Id_cliente);
        rs=ps.executeQuery();
        while(rs.next())
        {
            cliente.setId_cliente(rs.getInt(0));
            cliente.setNombre_cliente(rs.getString(1));
            cliente.setTelefono(rs.getString(2));
            cliente.setDireccion(rs.getString(3));
              
        }
        } 
        catch(Exception e){}
        return cliente;
    }
    @Override
    public List listar() {
        Cliente cliente=new Cliente();
         List <Cliente> lista= new ArrayList<>();
        String sql ="SELECT * FROM cliente ";
        try{
            con=cn.conector();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {              
            cliente.setId_cliente(rs.getInt(0));
            cliente.setNombre_cliente(rs.getString(1));
            cliente.setTelefono(rs.getString(2));
            cliente.setDireccion(rs.getString(3));
                
            
              lista.add(cliente);
              
            }
        }
        catch(Exception e){
            
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
      String sql="insert into cliente (Id_cliente,Nombre_cliente,Telefono,Direccion) values (?,?,?,?)";
      try{
          con=cn.conector();
          ps=con.prepareStatement(sql);
          ps.setObject(1, o[0]);
          ps.setObject(2, o[1]);
          ps.setObject(3, o[2]);
          ps.setObject(4, o[3]);
          r= ps.executeUpdate();
        
          
      }
      catch(Exception e)
      {
          
      }
      return r;
    }   

    @Override
    public int actualizar(Object [] o) {
           int r=0;
      String sql="update cliente set Id_cliente=? ,Nombre_cliente=?, Telefono=?, Direccion=? where Id_cliente=?";
      try{
          con=cn.conector();
          ps=con.prepareStatement(sql);
          ps.setObject(1, o[0]);
          ps.setObject(2, o[1]);
          ps.setObject(3, o[2]);
          ps.setObject(4, o[3]);
          r= ps.executeUpdate();
        
          
      }
      catch(Exception e)
      {
          
      }
      return r;
    }

    @Override
    public void eliminar(int id) {
           int r=0;
      String sql="delete from cliente where Id_cliente=?";
      try{
          con=cn.conector();
          ps=con.prepareStatement(sql);
          ps.setInt(0, id);
          ps.executeUpdate();
      }
      catch(Exception e)
      {
          
      }
    
    }
}

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
public class MateriaConexionBD implements CRUD {
     int r;
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    AltasMateria pro= new AltasMateria();
    
    public int actualizarStock(int cant, int idp)
    {
        String sql="update materia set Cantidad=? where Id_materia=?";
        try{
            
        con=cn.Conector();
        ps=con.prepareStatement(sql);
        ps.setInt(1, cant);
        ps.setInt(2, idp);
        ps.executeUpdate();
        
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "Error, no se puede actualizar registro", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    public AltasMateria listarId(int Id)
    {
         AltasMateria p= new AltasMateria();
        String sql ="Select * from materia where Id_materia=?";
        try{
        con=cn.Conector();
        ps=con.prepareStatement(sql);
        ps.setInt(1, Id);
        rs=ps.executeQuery();
        while(rs.next())
        {
              p.setId_materia(1);
              p.setNombre(rs.getString(2));
              p.setCantidad(rs.getInt(3));      
        }
        } 
        catch(Exception e){JOptionPane.showMessageDialog(null, "Error, Ocurrió un error en mostrar registros", "ERROR!", JOptionPane.ERROR_MESSAGE);}
        return p;
    }

    @Override
    public List listar() {
        List <AltasMateria> listaProducto= new ArrayList<>();
        String sql ="select * from materia";
        try{
            con=cn.Conector();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
              AltasMateria prod=new AltasMateria();
              prod.setId_materia(rs.getInt(1));
              prod.setNombre(rs.getString(2));
              prod.setCantidad(rs.getInt(3));
              listaProducto.add(prod);
              
              
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, Ocurrió un error en mostrar registros", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        return listaProducto;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
      String sql="insert into materia (Id_materia, Nombre,Cantidad) values (?,?,?)";
      try{
          con=cn.Conector();
          ps=con.prepareStatement(sql);
          ps.setObject(1, o[0]);
          ps.setObject(2, o[1]);
          ps.setObject(3, o[2]);
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
      String sql="delete from materia where Id_materia=?";
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

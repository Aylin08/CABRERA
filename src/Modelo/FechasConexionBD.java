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
public class FechasConexionBD implements CRUD{
    
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
       public List listar() {
         List <Pedidos> lista= new ArrayList<>();
        String sql ="SELECT producto, comentarios FROM pedidos WHERE fecha_entrega=?";
        try{
            con=cn.Conector();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
              Pedidos ped = new Pedidos();
              
             ped.setProducto(rs.getString(1));
             ped.setComentarios(rs.getString(2)); 
             ped.setFecha_entrega(rs.getString(3));             
              lista.add(ped);
              
              
            }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error, Ocurrió un error en mostrar registros", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

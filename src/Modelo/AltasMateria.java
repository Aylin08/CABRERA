package Modelo;

/**
 *
 * @author AYLIN
 */
public class AltasMateria {
    int Id_materia;
    String Nombre;
    int Cantidad;
    
    public AltasMateria(){}
    
    public AltasMateria(int Id_materia, String Nombre, int Cantidad)
    {
        
    }

    public int getId_materia() {
        return Id_materia;
    }

    public void setId_materia(int Id_materia) {
        this.Id_materia = Id_materia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
    
}

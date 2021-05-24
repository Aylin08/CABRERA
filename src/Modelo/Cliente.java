package Modelo;

public class Cliente {
    String Id_cliente;
    String Nombre_cliente;
    String Telefono;
    String Direccion;
    
   public Cliente()
    {
        
    }
   
   public Cliente(String Id_cliente, String Nombre_cliente, String Telefono, String Direccion){
       this.Id_cliente = Id_cliente;
        this.Nombre_cliente = Nombre_cliente;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        
   }

    public String getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(String Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public String getNombre_cliente() {
        return Nombre_cliente;
    }

    public void setNombre_cliente(String Nombre_cliente) {
        this.Nombre_cliente = Nombre_cliente;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
            
    
}

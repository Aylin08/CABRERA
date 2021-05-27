package Modelo;
/*** @author AYLIN*/
public class Pedidos {
    int Id_pedido;
    String Producto;
    String Sabor;
    String tamaño;
    String topping;
    float   total;
    String Fecha;
    int Id_cliente;
    int Id_materia;
    
    public Pedidos(){
        
    }
    public Pedidos(int Id_pedido, String Producto, String Sabor, String tamaño, String topping, float total, String Fecha,  int Id_cliente, int Id_materia)
    {
    this.Id_pedido=Id_pedido;
    this.Producto=Producto;
    this.Sabor=Sabor;
    this.tamaño=tamaño;
    this.topping=topping;
    this.total=total;
    this.Fecha=Fecha;
    this.Id_cliente= Id_cliente;
    this.Id_materia= Id_materia;
        
    }

    public int getId_pedido() {
        return Id_pedido;
    }

    public void setId_pedido(int Id_pedido) {
        this.Id_pedido = Id_pedido;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public int getId_materia() {
        return Id_materia;
    }

    public void setId_materia(int Id_materia) {
        this.Id_materia = Id_materia;
    }
    
}

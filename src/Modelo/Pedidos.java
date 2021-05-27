package Modelo;
/*** @author AYLIN*/
public class Pedidos {
    int Id_pedido;
    String Producto;
    String Sabor;
    String tamaño;
    String topping;
    float   total;
    String Fecha_actual;
    String Fecha_entrega;
    int Id_cliente;
    String comentarios;
     String serie;
    
    public Pedidos(){
        
    }
    public Pedidos(int Id_pedido, String Producto, String Sabor, String tamaño, String topping, float total, String Fecha_actual,String Fecha_entrega,  int Id_cliente, String comentarios,  String serie)
    {
    this.Id_pedido=Id_pedido;
    this.Producto=Producto;
    this.Sabor=Sabor;
    this.tamaño=tamaño;
    this.topping=topping;
    this.total=total;
    this.Fecha_entrega=Fecha_entrega;
    this.Fecha_actual=Fecha_actual;
    this.Id_cliente= Id_cliente;
    this.comentarios= comentarios;
    this.serie=serie;
        
    }

    public String getFecha_actual() {
        return Fecha_actual;
    }

    public void setFecha_actual(String Fecha_actual) {
        this.Fecha_actual = Fecha_actual;
    }

    public String getFecha_entrega() {
        return Fecha_entrega;
    }

    public void setFecha_entrega(String Fecha_entrega) {
        this.Fecha_entrega = Fecha_entrega;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios (String comentarios) {
        this.comentarios = comentarios;
    }
    
}

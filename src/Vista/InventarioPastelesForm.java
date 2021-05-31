package Vista;
import Modelo.Conexion;
import Modelo.Pedidos;
import Modelo.PedidosConexionBD;
import java.io.*;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/** @author Jhon Leunam
 */
public class InventarioPastelesForm extends javax.swing.JInternalFrame {

    PedidosConexionBD p= new PedidosConexionBD();
    Pedidos pe= new Pedidos();
    DefaultTableModel modelo= new DefaultTableModel();
     DefaultTableModel modelo1= new DefaultTableModel();
   
    void listar()
    {
        List <Pedidos> lista=p.listar();
        modelo1=(DefaultTableModel)tabla_registro.getModel();
        Object [] ob= new Object[10];
        for(int i=0; i<lista.size(); i++)
        {
            ob[0]=lista.get(i).getId_pedido();
            ob[1]=lista.get(i).getProducto();
            ob[2]=lista.get(i).getSabor();
            ob[3]=lista.get(i).getTamaño();
            ob[4]=lista.get(i).getTopping();
            ob[5]=lista.get(i).getTotal();
            ob[6]=lista.get(i).getFecha_actual();
            ob[7]=lista.get(i).getFecha_entrega();
            ob[8]=lista.get(i).getId_cliente();
            ob[9]=lista.get(i).getComentarios();
            modelo1.addRow(ob);
        }
        tabla_registro.setModel(modelo1);
    }
     void listar1()
    {
        List <Pedidos> lista=p.listar();
        modelo=(DefaultTableModel)tabla_editar.getModel();
        Object [] ob= new Object[10];
        for(int i=0; i<lista.size(); i++)
        {
            ob[0]=lista.get(i).getId_pedido();
            ob[1]=lista.get(i).getProducto();
            ob[2]=lista.get(i).getSabor();
            ob[3]=lista.get(i).getTamaño();
            ob[4]=lista.get(i).getTopping();
            ob[5]=lista.get(i).getTotal();
            ob[6]=lista.get(i).getFecha_actual();
            ob[7]=lista.get(i).getFecha_entrega();
            ob[8]=lista.get(i).getId_cliente();
            ob[9]=lista.get(i).getComentarios();
            modelo.addRow(ob);
        }
        tabla_editar.setModel(modelo);
    }
    public InventarioPastelesForm() {
        initComponents();
        generarSerie();
        fecha();
        listar();
        listar1();
    }
    void fecha(){
        Calendar calendar=new GregorianCalendar();
        txt_fecha1.setText(""+calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DAY_OF_MONTH));
       
    }
   void generarSerie()
    {
        String serie=p.NoSerieVentas();
        if(serie==null)
        {
            txt_noPedido.setText("0000001");
        }
        else{
            int increment=Integer.parseInt(serie);
            increment= increment +1;
            txt_noPedido.setText("000000"+ increment);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_nueva = new javax.swing.JButton();
        btn_agrega = new javax.swing.JButton();
        btn_sal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pane_registrar = new javax.swing.JTabbedPane();
        panel_principal = new javax.swing.JPanel();
        lbl_registro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_producto = new javax.swing.JLabel();
        txt_producto = new javax.swing.JComboBox<>();
        lbl_sabor = new javax.swing.JLabel();
        txt_sabor = new javax.swing.JComboBox<>();
        lbl_nombre4 = new javax.swing.JLabel();
        txt_tamaño = new javax.swing.JComboBox<>();
        lbl_seleccionar = new javax.swing.JLabel();
        txt_extra = new javax.swing.JComboBox<>();
        lbl_comentarios = new javax.swing.JLabel();
        txt_comentarios = new javax.swing.JTextField();
        lbl_subtotal = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        lbl_extra = new javax.swing.JLabel();
        txt_cobroextra = new javax.swing.JTextField();
        lbl_total = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        lbl_noPedido = new javax.swing.JLabel();
        txt_noPedido = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_registro = new javax.swing.JTable();
        lbl_cliente = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        lbl_fecha1 = new javax.swing.JLabel();
        txt_fecha1 = new javax.swing.JTextField();
        txt_entrega1 = new javax.swing.JTextField();
        lbl_fecha3 = new javax.swing.JLabel();
        btn_nueva1 = new javax.swing.JButton();
        btn_agrega1 = new javax.swing.JButton();
        btn_sal1 = new javax.swing.JButton();
        Calcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_productos = new javax.swing.JLabel();
        txt_producto2 = new javax.swing.JComboBox<>();
        lbl_sabores = new javax.swing.JLabel();
        txt_sabores = new javax.swing.JComboBox<>();
        lbl_tamaño = new javax.swing.JLabel();
        txt_tamaño1 = new javax.swing.JComboBox<>();
        lbl_topping = new javax.swing.JLabel();
        txt_extra1 = new javax.swing.JComboBox<>();
        lbl_estado8 = new javax.swing.JLabel();
        txt_com = new javax.swing.JTextField();
        lbl_estado9 = new javax.swing.JLabel();
        txt_subtotal1 = new javax.swing.JTextField();
        lbl_extras = new javax.swing.JLabel();
        txt_cobroextra1 = new javax.swing.JTextField();
        lbl_totales = new javax.swing.JLabel();
        txt_totales = new javax.swing.JTextField();
        lbl_no1 = new javax.swing.JLabel();
        txt_Pedido = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_editar = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        lbl_clientes = new javax.swing.JLabel();
        txt_clientes = new javax.swing.JTextField();
        lbl_fecha = new javax.swing.JLabel();
        txt_entrega = new javax.swing.JTextField();
        lbl_fecha2 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        btn_actualiza = new javax.swing.JButton();
        btn_elimina = new javax.swing.JButton();
        btn_sal2 = new javax.swing.JButton();
        Calcular1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        btn_nueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btn_nueva.setText("Nuevo");
        btn_nueva.setToolTipText("Nuevo registro");
        btn_nueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaActionPerformed(evt);
            }
        });

        btn_agrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/anadir.png"))); // NOI18N
        btn_agrega.setText("Agregar");
        btn_agrega.setToolTipText("Agregar registro. ");
        btn_agrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregaActionPerformed(evt);
            }
        });

        btn_sal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salida.png"))); // NOI18N
        btn_sal.setText("Salir");
        btn_sal.setToolTipText("Salir de clientes");
        btn_sal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 153, 0));
        setTitle("Registar /modificar pedido");

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        pane_registrar.setBackground(new java.awt.Color(255, 153, 0));

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));

        lbl_registro.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lbl_registro.setForeground(new java.awt.Color(255, 153, 0));
        lbl_registro.setText("Registro");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N

        lbl_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tarta-de-queso.png"))); // NOI18N
        lbl_producto.setText("Producto:");

        txt_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Pastel", "Cupcakes" }));
        txt_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_productoMouseClicked(evt);
            }
        });
        txt_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_productoActionPerformed(evt);
            }
        });

        lbl_sabor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/receta.png"))); // NOI18N
        lbl_sabor.setText("Sabor:");

        txt_sabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Chocolate", "Vainilla", "Fresa", "Zanahoria" }));
        txt_sabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_saborActionPerformed(evt);
            }
        });

        lbl_nombre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/grafico-circular.png"))); // NOI18N
        lbl_nombre4.setText("Tamaño:");

        txt_tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Individual", "Mediano", "Grande", "Media plancha", "Plancha completa" }));

        lbl_seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nueces.png"))); // NOI18N
        lbl_seleccionar.setText("Toping Extra:");

        txt_extra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Queso extra", "Relleno de queso", "Nuez", "Cholate extra" }));

        lbl_comentarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/observacion.png"))); // NOI18N
        lbl_comentarios.setText("Comentarios:");

        lbl_subtotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-de-dinero.png"))); // NOI18N
        lbl_subtotal.setText("Subtotal: $");

        txt_subtotal.setEditable(false);

        lbl_extra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/extra.png"))); // NOI18N
        lbl_extra.setText("Extra:      $");

        txt_cobroextra.setEditable(false);

        lbl_total.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dinero.png"))); // NOI18N
        lbl_total.setText("Total:      $");

        txt_total.setEditable(false);

        lbl_noPedido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_noPedido.setText("No. Pedido");

        txt_noPedido.setEditable(false);
        txt_noPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noPedidoActionPerformed(evt);
            }
        });

        tabla_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Pedido", "Producto", "Sabor", "Tamaño", "Toping extra", "Total", "Fecha_actual", "Fecha_entrega", "Id_cliente", "Comentarios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_registroMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla_registro);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );

        lbl_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carnet-de-identidad.png"))); // NOI18N
        lbl_cliente.setText("Id cliente: ");

        txt_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_clienteActionPerformed(evt);
            }
        });

        lbl_fecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendario.png"))); // NOI18N
        lbl_fecha1.setText("Fecha actual:");

        lbl_fecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendario.png"))); // NOI18N
        lbl_fecha3.setText("Fecha entrega:");

        btn_nueva1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btn_nueva1.setText("Nuevo");
        btn_nueva1.setToolTipText("Nuevo registro");
        btn_nueva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueva1ActionPerformed(evt);
            }
        });

        btn_agrega1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/anadir.png"))); // NOI18N
        btn_agrega1.setText("Agregar");
        btn_agrega1.setToolTipText("Agregar registro. ");
        btn_agrega1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agrega1ActionPerformed(evt);
            }
        });

        btn_sal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salida.png"))); // NOI18N
        btn_sal1.setText("Salir");
        btn_sal1.setToolTipText("Salir de clientes");
        btn_sal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sal1ActionPerformed(evt);
            }
        });

        Calcular.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        Calcular.setForeground(new java.awt.Color(51, 0, 51));
        Calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuesto.png"))); // NOI18N
        Calcular.setText("Calcular");
        Calcular.setToolTipText("");
        Calcular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addComponent(lbl_comentarios)
                        .addGap(18, 18, 18)
                        .addComponent(txt_comentarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombre4)
                            .addComponent(lbl_producto)
                            .addComponent(lbl_sabor)
                            .addComponent(lbl_seleccionar)
                            .addComponent(lbl_cliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sabor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_extra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_principalLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel_principalLayout.createSequentialGroup()
                                        .addComponent(lbl_extra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_cobroextra, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                    .addGroup(panel_principalLayout.createSequentialGroup()
                                        .addComponent(lbl_subtotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_subtotal))
                                    .addGroup(panel_principalLayout.createSequentialGroup()
                                        .addComponent(lbl_total)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_total))))
                            .addGroup(panel_principalLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_principalLayout.createSequentialGroup()
                                        .addComponent(lbl_noPedido)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_noPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_principalLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lbl_fecha3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_entrega1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addComponent(lbl_fecha1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_principalLayout.createSequentialGroup()
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_nueva1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(btn_agrega1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_sal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(182, 182, 182))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_principalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbl_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_noPedido)
                    .addComponent(txt_noPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fecha1))
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_principalLayout.createSequentialGroup()
                                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_producto))
                                .addGap(16, 16, 16))
                            .addGroup(panel_principalLayout.createSequentialGroup()
                                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_extra)
                                    .addComponent(txt_cobroextra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_sabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_sabor))
                        .addGap(18, 18, 18)
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre4)
                            .addComponent(txt_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btn_nueva1)
                        .addGap(16, 16, 16)
                        .addComponent(btn_agrega1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Calcular)
                            .addComponent(lbl_subtotal)
                            .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btn_sal1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_principalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_seleccionar))
                                .addGap(18, 18, 18)
                                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_cliente)
                                    .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_principalLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_total)
                                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_fecha3)
                                    .addComponent(txt_entrega1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_principalLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lbl_comentarios))
                            .addGroup(panel_principalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_comentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pane_registrar.addTab("Registar", panel_principal);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Editar");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N

        lbl_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tarta-de-queso.png"))); // NOI18N
        lbl_productos.setText("Producto:");

        txt_producto2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Pastel", "Cupcakes" }));
        txt_producto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_producto2MouseClicked(evt);
            }
        });
        txt_producto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_producto2ActionPerformed(evt);
            }
        });

        lbl_sabores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/receta.png"))); // NOI18N
        lbl_sabores.setText("Sabor:");

        txt_sabores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Chocolate", "Vainilla", "Fresa", "Zanahoria" }));
        txt_sabores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_saboresActionPerformed(evt);
            }
        });

        lbl_tamaño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/grafico-circular.png"))); // NOI18N
        lbl_tamaño.setText("Tamaño:");

        txt_tamaño1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Individual", "Mediano", "Grande", "Media plancha", "Plancha completa" }));

        lbl_topping.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nueces.png"))); // NOI18N
        lbl_topping.setText("Toping Extra:");

        txt_extra1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Queso extra", "Relleno de queso", "Nuez", "Cholate extra" }));

        lbl_estado8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/observacion.png"))); // NOI18N
        lbl_estado8.setText("Comentarios:");

        lbl_estado9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-de-dinero.png"))); // NOI18N
        lbl_estado9.setText("Subtotal: $");

        txt_subtotal1.setEditable(false);

        lbl_extras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/extra.png"))); // NOI18N
        lbl_extras.setText("Extra:      $");

        lbl_totales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dinero.png"))); // NOI18N
        lbl_totales.setText("Total:      $");

        txt_totales.setEditable(false);

        lbl_no1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_no1.setText("No. Pedido");

        txt_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PedidoActionPerformed(evt);
            }
        });

        tabla_editar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Pedido", "Producto", "Sabor", "Tamaño", "Toping extra", "Total", "Fecha_actual", "Fecha_entrega", "Id_cliente", "Comentarios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_editarMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla_editar);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        lbl_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carnet-de-identidad.png"))); // NOI18N
        lbl_clientes.setText("Id cliente: ");

        lbl_fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendario.png"))); // NOI18N
        lbl_fecha.setText("Fecha actual:");

        lbl_fecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendario.png"))); // NOI18N
        lbl_fecha2.setText("Fecha entrega:");

        btn_actualiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btn_actualiza.setText("Actualizar");
        btn_actualiza.setToolTipText("Actualizar registro");
        btn_actualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizaActionPerformed(evt);
            }
        });

        btn_elimina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btn_elimina.setText("Eliminar");
        btn_elimina.setToolTipText("Eliminar registro");
        btn_elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminaActionPerformed(evt);
            }
        });

        btn_sal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salida.png"))); // NOI18N
        btn_sal2.setText("Salir");
        btn_sal2.setToolTipText("Salir de clientes");
        btn_sal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sal2ActionPerformed(evt);
            }
        });

        Calcular1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        Calcular1.setForeground(new java.awt.Color(51, 0, 51));
        Calcular1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/presupuesto.png"))); // NOI18N
        Calcular1.setText("Calcular");
        Calcular1.setToolTipText("");
        Calcular1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        Calcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcular1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_estado8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_com)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_topping)
                                        .addComponent(lbl_sabores)
                                        .addComponent(lbl_tamaño))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_tamaño1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_extra1, javax.swing.GroupLayout.Alignment.LEADING, 0, 122, Short.MAX_VALUE)
                                            .addComponent(txt_sabores, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(txt_clientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(lbl_productos)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_producto2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lbl_clientes))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_totales)
                                    .addComponent(lbl_extras)
                                    .addComponent(lbl_estado9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cobroextra1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_totales, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(txt_subtotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_fecha2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_elimina, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Calcular1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_sal2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_actualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(lbl_no1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(lbl_fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_no1)
                                .addComponent(txt_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_buscar))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_producto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_productos))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_tamaño)
                                    .addComponent(txt_tamaño1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_sabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_sabores))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbl_topping)
                                            .addComponent(txt_extra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbl_totales)
                                            .addComponent(txt_totales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_clientes)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_fecha2)
                                    .addComponent(txt_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_subtotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_extras))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_estado9)
                                    .addComponent(txt_cobroextra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_actualiza)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_elimina)
                                .addGap(11, 11, 11)
                                .addComponent(Calcular1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_sal2)
                                .addGap(26, 26, 26))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_fecha)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_estado8)
                    .addComponent(txt_com, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pane_registrar.addTab("Editar", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pane_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pane_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pane_registrar.getAccessibleContext().setAccessibleName("Registar pedido");

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 0));
        jMenuBar1.setBorder(null);
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_saborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_saborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_saborActionPerformed

    private void txt_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_productoActionPerformed

    }//GEN-LAST:event_txt_productoActionPerformed

    private void txt_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_productoMouseClicked

    }//GEN-LAST:event_txt_productoMouseClicked

    private void tabla_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_registroMouseClicked
        
    }//GEN-LAST:event_tabla_registroMouseClicked

    private void txt_noPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noPedidoActionPerformed

    private void txt_producto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_producto2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_producto2MouseClicked

    private void txt_producto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_producto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_producto2ActionPerformed

    private void txt_saboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_saboresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_saboresActionPerformed

    private void txt_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PedidoActionPerformed

    private void tabla_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_editarMouseClicked
       int fila=tabla_editar.getSelectedRow();
        if(fila== -1)
        {
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        }
        else{

            String id=tabla_editar.getValueAt(fila, 0).toString();
            String producto=tabla_editar.getValueAt(fila, 1).toString();
            String sabor=tabla_editar.getValueAt(fila, 2).toString();
            String tamaño=tabla_editar.getValueAt(fila, 3).toString();
            String topping=tabla_editar.getValueAt(fila, 4).toString();
            String total= tabla_editar.getValueAt(fila, 5).toString();
            String fecha_actual= tabla_editar.getValueAt(fila, 6).toString();
            String fecha_entrega= tabla_editar.getValueAt(fila, 7).toString();
            String id_cliente=tabla_editar.getValueAt(fila, 8).toString();
            String comentarios= tabla_editar.getValueAt(fila, 9).toString();  
           
            
            
            txt_Pedido.setText(id);
            txt_producto2.setSelectedItem(producto);
            txt_sabores.setSelectedItem(sabor);
            txt_tamaño1.setSelectedItem(tamaño);
            txt_extra1.setSelectedItem(topping);
            txt_clientes.setText(id_cliente);
            txt_totales.setText(total);
            txt_fecha.setText(fecha_actual);
            txt_entrega.setText(fecha_entrega);
            txt_com.setText(comentarios);

        }
    }//GEN-LAST:event_tabla_editarMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_clienteActionPerformed

    private void btn_nuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaActionPerformed
        nuevo();
    }//GEN-LAST:event_btn_nuevaActionPerformed

    private void btn_nueva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueva1ActionPerformed
        nuevo();
    }//GEN-LAST:event_btn_nueva1ActionPerformed

    private void btn_agregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregaActionPerformed

        agregar();
        limpiar();
        listar();
        nuevo();

    }//GEN-LAST:event_btn_agregaActionPerformed

    private void btn_agrega1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agrega1ActionPerformed

        agregar();
        limpiar();
        listar();
        nuevo();

    }//GEN-LAST:event_btn_agrega1ActionPerformed

    private void btn_salActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salActionPerformed

        Object[] options = { "Yes", "No" };
        int confirmado = JOptionPane.showOptionDialog( null,
            "¿Desea salir?, puede que los cambios no guardados se borren","Salir",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (confirmado == 0)
        {  this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Bueno, seguimos trabajando");

        }
    }//GEN-LAST:event_btn_salActionPerformed

    private void btn_sal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sal1ActionPerformed

        Object[] options = { "Yes", "No" };
        int confirmado = JOptionPane.showOptionDialog( null,
            "¿Desea salir?, puede que los cambios no guardados se borren","Salir",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (confirmado == 0)
        {  this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Bueno, seguimos trabajando");

        }
    }//GEN-LAST:event_btn_sal1ActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        String total3;
        int total=0;
        int total2=0;
        String op= (String) txt_producto.getSelectedItem();
        String op2= (String) txt_sabor.getSelectedItem();
        String op3= (String) txt_tamaño.getSelectedItem();
        String op4= (String) txt_extra.getSelectedItem();
        
     if(op=="Cupcakes")
     {
         total=100;
         
     }else if(op=="Pastel")
     {
         total=200;
 
     }
         if(op2=="Chocolate")
         {total=total+30;}
         else if(op2=="Vainilla")
         {total=total+25;}
          else if(op2=="Zanahoria")
         {total=total+35;}
          else if(op2=="Fresa")
         {total=total+50;}
             if(op3=="Individual")
             {total=total+50;}
             else if(op3=="Mediano")
                {total=total+100;}
              else if(op3=="Media plancha")
                {total=total+120;}
              else if(op3=="Plancha completa")
                {total=total+200;}
                 if(op4=="Nuez")
                 {
                 total2=30;  
                 total3=Integer.toString(total2);
                 txt_cobroextra.setText(total3);}
                 else if(op4=="Queso extra")
                {total2=50;  
                 total3=Integer.toString(total2);
                 txt_cobroextra.setText(total3);}
                  else if(op4=="Relleno de queso")
                {total2=70;  
                 total3=Integer.toString(total2);
                 txt_cobroextra.setText(total3);}
                  else if(op4=="Cholate extra")
                {total2=60;  
                 total3=Integer.toString(total2);
                 txt_cobroextra.setText(total3);}
                     total3=Integer.toString(total);
                     txt_subtotal.setText(total3);
                    total= total2+total;
                    total3=Integer.toString(total);
                    txt_total.setText(total3);
    }//GEN-LAST:event_CalcularActionPerformed

    private void btn_actualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizaActionPerformed
        actualizar();
        limpiar();
        listar();
        nuevo();
    }//GEN-LAST:event_btn_actualizaActionPerformed

    private void btn_eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaActionPerformed

        eliminar();
       limpiar();
       limpiar1();
       nuevoEditar();
       listar1();
       listar();
    }//GEN-LAST:event_btn_eliminaActionPerformed

    private void btn_sal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sal2ActionPerformed

        Object[] options = { "Yes", "No" };
        int confirmado = JOptionPane.showOptionDialog( null,
            "¿Desea salir?, puede que los cambios no guardados se borren","Salir",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (confirmado == 0)
        {  this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Bueno, seguimos trabajando");

        }
    }//GEN-LAST:event_btn_sal2ActionPerformed

    private void Calcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcular1ActionPerformed
          String total3;
        int total=0;
        int total2=0;
        String op= (String) txt_producto2.getSelectedItem();
        String op2= (String) txt_sabores.getSelectedItem();
        String op3= (String) txt_tamaño1.getSelectedItem();
        String op4= (String) txt_extra1.getSelectedItem();
        
     if(op=="Cupcakes")
     {
         total=100;
         
     }else if(op=="Pastel")
     {
         total=200;
 
     }
         if(op2=="Chocolate")
         {total=total+30;}
         else if(op2=="Vainilla")
         {total=total+25;}
          else if(op2=="Zanahoria")
         {total=total+35;}
          else if(op2=="Fresa")
         {total=total+50;}
             if(op3=="Individual")
             {total=total+50;}
             else if(op3=="Mediano")
                {total=total+100;}
              else if(op3=="Media plancha")
                {total=total+120;}
              else if(op3=="Plancha completa")
                {total=total+200;}
                 if(op4=="Nuez")
                 {
                 total2=30;  
                 total3=Integer.toString(total2);
                 txt_cobroextra1.setText(total3);}
                 else if(op4=="Queso extra")
                {total2=50;  
                 total3=Integer.toString(total2);
                 txt_cobroextra1.setText(total3);}
                  else if(op4=="Relleno de queso")
                {total2=70;  
                 total3=Integer.toString(total2);
                 txt_cobroextra1.setText(total3);}
                  else if(op4=="Cholate extra")
                {total2=60;  
                 total3=Integer.toString(total2);
                 txt_cobroextra1.setText(total3);}
                     total3=Integer.toString(total);
                     txt_subtotal1.setText(total3);
                    total= total2+total;
                    total3=Integer.toString(total);
                    txt_totales.setText(total3);
    }//GEN-LAST:event_Calcular1ActionPerformed
 void agregar()
    {
        String id=txt_noPedido.getText();
        String nom=txt_producto.getSelectedItem().toString();
        String tam=txt_tamaño.getSelectedItem().toString();
        String sabor= txt_sabor.getSelectedItem().toString();
        String extra= txt_extra.getSelectedItem().toString();
        String total= txt_total.getText();
        String fecha_actual= txt_fecha1.getText();
        String fecha_entrega= txt_entrega1.getText();
        String cliente= txt_cliente.getText();
        String comentarios=txt_comentarios.getText();

        Object [] ob=new Object[10];
        ob[0]=id;
        ob[1]=nom;
        ob[2]=tam;
        ob[3]=sabor;
        ob[4]=extra;
        ob[5]=total;
        ob[6]=fecha_actual;
        ob[7]=fecha_entrega;
        ob[8]=cliente;
        ob[9]=comentarios;
        

        p.add(ob);



    }
    void eliminar()
    {
      int fila=tabla_editar.getSelectedRow();
      if(fila == -1)
      {
          JOptionPane.showMessageDialog(this, "Debe selecionar una fila");
      }else{
        int ids=Integer.parseInt(tabla_editar.getValueAt(fila,0).toString());
         p.eliminar(ids);
      }
    }
    void actualizar()
    {int fila=tabla_registro.getSelectedRow();
      if(fila == -1)
      {
          JOptionPane.showMessageDialog(this, "Debe selecionar una fila");
      }
      else{

        String id=txt_noPedido.getText();
        String nom=txt_producto.getSelectedItem().toString();
        String tam=txt_tamaño.getSelectedItem().toString();
        String sabor= txt_sabor.getSelectedItem().toString();
        String extra= txt_extra.getSelectedItem().toString();
        String total= txt_total.getText();
        String fecha_actual= txt_fecha1.getText();
        String fecha_entrega= txt_entrega1.getText();
        String cliente= txt_cliente.getText();
        String comentarios=txt_comentarios.getText();

        Object [] ob=new Object[9];
        ob[0]=id;
        ob[1]=nom;
        ob[2]=tam;
        ob[3]=sabor;
        ob[4]=extra;
        ob[5]=total;
        ob[6]=fecha_actual;
        ob[7]=fecha_entrega;
        ob[8]=cliente;
        ob[9]=comentarios;

        p.actualizar(ob);
      }
    }
    void nuevo()
    {   txt_producto.setSelectedItem("--Seleccionar--");
        txt_tamaño.setSelectedItem("--Seleccionar--");
        txt_sabor.setSelectedItem("--Seleccionar--");
        txt_extra.setSelectedItem("--Seleccionar--");
        txt_total.setText("");
        txt_subtotal.setText("");
        txt_cliente.setText("");
        txt_comentarios.setText("");
        txt_cobroextra.setText("");
        txt_entrega1.setText("");
        txt_producto.requestFocus();


    }
      void nuevoEditar()
    {   txt_producto2.setSelectedItem("--Seleccionar--");
        txt_tamaño1.setSelectedItem("--Seleccionar--");
        txt_sabores.setSelectedItem("--Seleccionar--");
        txt_extra1.setSelectedItem("--Seleccionar--");
        txt_clientes.setText("");
        txt_com.setText("");
        txt_Pedido.setText("");
        txt_entrega.setText("");
        txt_totales.setText("");
        txt_subtotal1.setText("");
       txt_cobroextra1.setText("");
        txt_producto2.requestFocus();


    }
    void limpiar(){
        for(int i=0; i<modelo.getRowCount(); i++)
        {
            modelo.removeRow(i);
            i=i-1;
        }
    }
     void limpiar1(){
        for(int i=0; i<modelo1.getRowCount(); i++)
        {
            modelo1.removeRow(i);
            i=i-1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Calcular1;
    private javax.swing.JButton btn_actualiza;
    private javax.swing.JButton btn_agrega;
    private javax.swing.JButton btn_agrega1;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_elimina;
    private javax.swing.JButton btn_nueva;
    private javax.swing.JButton btn_nueva1;
    private javax.swing.JButton btn_sal;
    private javax.swing.JButton btn_sal1;
    private javax.swing.JButton btn_sal2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JLabel lbl_clientes;
    private javax.swing.JLabel lbl_comentarios;
    private javax.swing.JLabel lbl_estado8;
    private javax.swing.JLabel lbl_estado9;
    private javax.swing.JLabel lbl_extra;
    private javax.swing.JLabel lbl_extras;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_fecha1;
    private javax.swing.JLabel lbl_fecha2;
    private javax.swing.JLabel lbl_fecha3;
    private javax.swing.JLabel lbl_no1;
    private javax.swing.JLabel lbl_noPedido;
    private javax.swing.JLabel lbl_nombre4;
    private javax.swing.JLabel lbl_producto;
    private javax.swing.JLabel lbl_productos;
    private javax.swing.JLabel lbl_registro;
    private javax.swing.JLabel lbl_sabor;
    private javax.swing.JLabel lbl_sabores;
    private javax.swing.JLabel lbl_seleccionar;
    private javax.swing.JLabel lbl_subtotal;
    private javax.swing.JLabel lbl_tamaño;
    private javax.swing.JLabel lbl_topping;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_totales;
    private javax.swing.JTabbedPane pane_registrar;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTable tabla_editar;
    private javax.swing.JTable tabla_registro;
    private javax.swing.JTextField txt_Pedido;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_clientes;
    private javax.swing.JTextField txt_cobroextra;
    private javax.swing.JTextField txt_cobroextra1;
    private javax.swing.JTextField txt_com;
    private javax.swing.JTextField txt_comentarios;
    private javax.swing.JTextField txt_entrega;
    private javax.swing.JTextField txt_entrega1;
    private javax.swing.JComboBox<String> txt_extra;
    private javax.swing.JComboBox<String> txt_extra1;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_fecha1;
    private javax.swing.JTextField txt_noPedido;
    private javax.swing.JComboBox<String> txt_producto;
    private javax.swing.JComboBox<String> txt_producto2;
    private javax.swing.JComboBox<String> txt_sabor;
    private javax.swing.JComboBox<String> txt_sabores;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_subtotal1;
    private javax.swing.JComboBox<String> txt_tamaño;
    private javax.swing.JComboBox<String> txt_tamaño1;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_totales;
    // End of variables declaration//GEN-END:variables
}

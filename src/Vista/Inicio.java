package Vista;

import Vista.CotizacionNormalForm;
import Vista.FechasDisponiblesForm;
import Vista.InventarioPastelesForm;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AYLIN
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        imgscalada();
    }
    
    public void imgscalada(){
        ImageIcon imgfondo = new ImageIcon(getClass().getResource("/Img/fondo.png"));
        //procesodeescalado
        Image img = imgfondo.getImage();
        Image imgscaled = img.getScaledInstance(VentanaPrincipal.getWidth(),VentanaPrincipal.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon iconscaled = new ImageIcon(imgscaled);
        VentanaPrincipal.setIcon(iconscaled);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        VentanaPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenuItem();
        clientes = new javax.swing.JMenuItem();
        cotizacion = new javax.swing.JMenu();
        eventos = new javax.swing.JMenuItem();
        normal = new javax.swing.JMenuItem();
        calendario = new javax.swing.JMenu();
        Fechas_disponibles = new javax.swing.JMenuItem();
        pedido = new javax.swing.JMenu();
        nuevo_editar = new javax.swing.JMenuItem();
        inventario = new javax.swing.JMenu();
        materia_prima = new javax.swing.JMenuItem();
        reporte_inventario = new javax.swing.JMenuItem();
        reporte_pedidos = new javax.swing.JMenuItem();
        reporte_ventas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Backery \"Cabrera\"");
        setBackground(new java.awt.Color(255, 153, 51));
        setLocationByPlatform(true);

        VentanaPrincipal.setMaximumSize(new java.awt.Dimension(1535, 944));

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu.png"))); // NOI18N
        menu.setText("Men??");
        menu.setToolTipText("Men?? principal");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar1.png"))); // NOI18N
        salir.setText("Salir");
        salir.setToolTipText("Salir del sistema");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ayudar.png"))); // NOI18N
        ayuda.setText("Ayuda");
        ayuda.setToolTipText("Soporte/ Ayuda");
        menu.add(ayuda);

        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/opinion-del-cliente.png"))); // NOI18N
        clientes.setText("Clientes");
        clientes.setToolTipText("Clientes registrados");
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        menu.add(clientes);

        jMenuBar1.add(menu);

        cotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pago.png"))); // NOI18N
        cotizacion.setText("Cotizaci??n");
        cotizacion.setToolTipText("Realizar cotizaci??n");

        eventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/trabajo-en-equipo.png"))); // NOI18N
        eventos.setText("Eventos");
        eventos.setToolTipText("Cotizaciones para eventos");
        cotizacion.add(eventos);

        normal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/llamada.png"))); // NOI18N
        normal.setText("Normal");
        normal.setToolTipText("Cotizaciones individuales.");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });
        cotizacion.add(normal);

        jMenuBar1.add(cotizacion);

        calendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fecha.png"))); // NOI18N
        calendario.setText("Fechas");
        calendario.setToolTipText("Fechas");

        Fechas_disponibles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendario.png"))); // NOI18N
        Fechas_disponibles.setText("Abrir calendario");
        Fechas_disponibles.setToolTipText("Abrir calendario");
        Fechas_disponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fechas_disponiblesActionPerformed(evt);
            }
        });
        calendario.add(Fechas_disponibles);

        jMenuBar1.add(calendario);

        pedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar.png"))); // NOI18N
        pedido.setText("Pedidos");
        pedido.setToolTipText("Ingresar pedido.");

        nuevo_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/anadir.png"))); // NOI18N
        nuevo_editar.setText("Nuevo / Editar");
        nuevo_editar.setToolTipText("Editar o registra pedido");
        nuevo_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_editarActionPerformed(evt);
            }
        });
        pedido.add(nuevo_editar);

        jMenuBar1.add(pedido);

        inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/factura.png"))); // NOI18N
        inventario.setText("Inventario");
        inventario.setToolTipText("Inventarioy reportes");

        materia_prima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/valores.png"))); // NOI18N
        materia_prima.setText("Inventario de materia prima");
        materia_prima.setToolTipText("Materia prima ");
        materia_prima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materia_primaActionPerformed(evt);
            }
        });
        inventario.add(materia_prima);

        reporte_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/inventario.png"))); // NOI18N
        reporte_inventario.setText("Reporte de Inventario");
        reporte_inventario.setToolTipText("Inventario en casa");
        reporte_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_inventarioActionPerformed(evt);
            }
        });
        inventario.add(reporte_inventario);
        reporte_inventario.getAccessibleContext().setAccessibleDescription("");

        reporte_pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/directorio.png"))); // NOI18N
        reporte_pedidos.setText("Reporte de pedidos");
        reporte_pedidos.setToolTipText("Pedidos a realizar");
        reporte_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_pedidosActionPerformed(evt);
            }
        });
        inventario.add(reporte_pedidos);

        reporte_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reporte.png"))); // NOI18N
        reporte_ventas.setText("Reporte de ventas");
        reporte_ventas.setToolTipText("Ventas realizadas");
        reporte_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_ventasActionPerformed(evt);
            }
        });
        inventario.add(reporte_ventas);

        jMenuBar1.add(inventario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1535, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
         
    }//GEN-LAST:event_menuMouseClicked

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
           Object[] options = { "Yes", "No" };
     int confirmado = JOptionPane.showOptionDialog( null,
     "??Desea salir?, puede que los cambios no guardados se borren","Salir",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

    if (confirmado == 0)
    {  System.exit(0);
       }
    else{
           JOptionPane.showMessageDialog(null, "Bueno, seguimos trabajando.");
        
    }
    }//GEN-LAST:event_salirActionPerformed

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
        
        try{CotizacionNormalForm cn= new CotizacionNormalForm();
        cn.setSize(600, 500);
        cn.setVisible(true);
        CentrarVentanaFrame(cn);}
        catch(Exception e ){
        }
    }//GEN-LAST:event_normalActionPerformed

    private void Fechas_disponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fechas_disponiblesActionPerformed
      try{ 
       FechasDisponiblesForm fd= new FechasDisponiblesForm();
       fd.setSize(800,600);
       fd.setVisible(true);
       CentrarVentanaFrame(fd);}
     catch(Exception e ){}
    }//GEN-LAST:event_Fechas_disponiblesActionPerformed

    private void nuevo_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_editarActionPerformed
       InventarioPastelesForm ip=new InventarioPastelesForm();
       CentrarVentana(ip);
    }//GEN-LAST:event_nuevo_editarActionPerformed

    private void reporte_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_ventasActionPerformed
       ReporteVentasForm vf=new ReporteVentasForm();
       CentrarVentana(vf);
    }//GEN-LAST:event_reporte_ventasActionPerformed

    private void reporte_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_pedidosActionPerformed
       ReportePedidosForm rp =new ReportePedidosForm();
       CentrarVentana(rp);
    }//GEN-LAST:event_reporte_pedidosActionPerformed

    private void reporte_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_inventarioActionPerformed
        ReporteExistenciasForm RE = new ReporteExistenciasForm();
        CentrarVentana(RE);
        
    }//GEN-LAST:event_reporte_inventarioActionPerformed

    private void materia_primaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materia_primaActionPerformed
        ExistenciasForm EF =new ExistenciasForm();
        CentrarVentana(EF);
    }//GEN-LAST:event_materia_primaActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
      ClienteForm CF= new ClienteForm();
      CentrarVentana(CF);
    }//GEN-LAST:event_clientesActionPerformed
  public void CentrarVentana(JInternalFrame frame){
        VentanaPrincipal.add(frame);
        Dimension dimension=VentanaPrincipal.getSize();
        Dimension DFrame=frame.getSize();
         setLocationRelativeTo(null); 
        //frame.setLocation((dimension.width - DFrame.height)/2,(dimension.height-DFrame.width)/2);
        frame.show();
    } 
  public void CentrarVentanaFrame(JFrame frame){
        VentanaPrincipal.add(frame);
        Dimension dimension=VentanaPrincipal.getSize();
        Dimension DFrame=frame.getSize();
         setLocationRelativeTo(null); 
        //frame.setLocation((dimension.width - DFrame.height)/2,(dimension.height-DFrame.width)/2);
        frame.show();
    }
 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Fechas_disponibles;
    public javax.swing.JLabel VentanaPrincipal;
    private javax.swing.JMenuItem ayuda;
    private javax.swing.JMenu calendario;
    private javax.swing.JMenuItem clientes;
    private javax.swing.JMenu cotizacion;
    private javax.swing.JMenuItem eventos;
    private javax.swing.JMenu inventario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JMenuItem materia_prima;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem normal;
    private javax.swing.JMenuItem nuevo_editar;
    private javax.swing.JMenu pedido;
    private javax.swing.JMenuItem reporte_inventario;
    private javax.swing.JMenuItem reporte_pedidos;
    private javax.swing.JMenuItem reporte_ventas;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}

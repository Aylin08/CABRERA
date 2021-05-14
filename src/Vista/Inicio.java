package Vista;

import Vista.CotizacionNormalForm;
import Vista.FechasDisponiblesForm;
import Vista.InventarioPastelesForm;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author AYLIN
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
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
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Fechas_disponibles = new javax.swing.JMenuItem();
        jmenu_pedido = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menu_materiPrima = new javax.swing.JMenuItem();
        menu_inventario = new javax.swing.JMenuItem();
        menu_pedidos = new javax.swing.JMenuItem();
        menu_ventas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Backery \"Cabrera\"");
        setBackground(new java.awt.Color(255, 153, 51));
        setLocationByPlatform(true);

        VentanaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo.png"))); // NOI18N
        VentanaPrincipal.setMaximumSize(new java.awt.Dimension(1539, 948));

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu.png"))); // NOI18N
        menu.setText("Menú");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar1.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ayudar.png"))); // NOI18N
        ayuda.setText("Ayuda");
        menu.add(ayuda);

        jMenuBar1.add(menu);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pago.png"))); // NOI18N
        jMenu2.setText("Cotización");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/trabajo-en-equipo.png"))); // NOI18N
        jMenuItem1.setText("Eventos");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/llamada.png"))); // NOI18N
        jMenuItem2.setText("Normal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fecha.png"))); // NOI18N
        jMenu3.setText("Fechas");

        Fechas_disponibles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendario.png"))); // NOI18N
        Fechas_disponibles.setText("Abrir calendario");
        Fechas_disponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fechas_disponiblesActionPerformed(evt);
            }
        });
        jMenu3.add(Fechas_disponibles);

        jMenuBar1.add(jMenu3);

        jmenu_pedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar.png"))); // NOI18N
        jmenu_pedido.setText("Pedidos");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/anadir.png"))); // NOI18N
        jMenuItem5.setText("Nuevo / Editar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmenu_pedido.add(jMenuItem5);

        jMenuBar1.add(jmenu_pedido);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/factura.png"))); // NOI18N
        jMenu4.setText("Inventario");

        menu_materiPrima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/valores.png"))); // NOI18N
        menu_materiPrima.setText("Inventario de materia prima");
        menu_materiPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_materiPrimaActionPerformed(evt);
            }
        });
        jMenu4.add(menu_materiPrima);

        menu_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/inventario.png"))); // NOI18N
        menu_inventario.setText("Reporte de Inventario");
        menu_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_inventarioActionPerformed(evt);
            }
        });
        jMenu4.add(menu_inventario);
        menu_inventario.getAccessibleContext().setAccessibleDescription("");

        menu_pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/directorio.png"))); // NOI18N
        menu_pedidos.setText("Reporte de pedidos");
        menu_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_pedidosActionPerformed(evt);
            }
        });
        jMenu4.add(menu_pedidos);

        menu_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reporte.png"))); // NOI18N
        menu_ventas.setText("Reporte de ventas");
        menu_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ventasActionPerformed(evt);
            }
        });
        jMenu4.add(menu_ventas);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1348, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
         
    }//GEN-LAST:event_menuMouseClicked

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);  
    }//GEN-LAST:event_salirActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CotizacionNormalForm cn= new CotizacionNormalForm();
        CentrarVentana(cn);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void Fechas_disponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fechas_disponiblesActionPerformed
       FechasDisponiblesForm fd= new FechasDisponiblesForm();
       CentrarVentana(fd);
    }//GEN-LAST:event_Fechas_disponiblesActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       InventarioPastelesForm ip=new InventarioPastelesForm();
       CentrarVentana(ip);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menu_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ventasActionPerformed
       ReporteVentasForm vf=new ReporteVentasForm();
       CentrarVentana(vf);
    }//GEN-LAST:event_menu_ventasActionPerformed

    private void menu_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_pedidosActionPerformed
       ReportePedidosForm rp =new ReportePedidosForm();
       CentrarVentana(rp);
    }//GEN-LAST:event_menu_pedidosActionPerformed

    private void menu_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_inventarioActionPerformed
        ReporteExistenciasForm RE = new ReporteExistenciasForm();
        CentrarVentana(RE);
        
    }//GEN-LAST:event_menu_inventarioActionPerformed

    private void menu_materiPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_materiPrimaActionPerformed
        ExistenciasForm EF =new ExistenciasForm();
        CentrarVentana(EF);
    }//GEN-LAST:event_menu_materiPrimaActionPerformed
  public void CentrarVentana(JInternalFrame frame){
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JMenu jmenu_pedido;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menu_inventario;
    private javax.swing.JMenuItem menu_materiPrima;
    private javax.swing.JMenuItem menu_pedidos;
    private javax.swing.JMenuItem menu_ventas;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}

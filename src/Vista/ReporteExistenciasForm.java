package Vista;

import Modelo.AltasMateria;
import Modelo.MateriaConexionBD;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/** @author AYLIN*/
public class ReporteExistenciasForm extends javax.swing.JInternalFrame {
  
    
    AltasMateria pr = new AltasMateria();
    MateriaConexionBD bd= new MateriaConexionBD();
    DefaultTableModel modelo= new DefaultTableModel();

   public ReporteExistenciasForm() {
        initComponents();
        listar();
    }

 void listar()
    {
        List <AltasMateria> lista=bd.listar();
        modelo=(DefaultTableModel)tabla_reporte.getModel();
        Object [] ob= new Object[3];
        for(int i=0; i<lista.size(); i++)
        {
            ob[0]=lista.get(i).getId_materia();
            ob[1]=lista.get(i).getNombre();
            ob[2]=lista.get(i).getCantidad();
            modelo.addRow(ob);
        }
        tabla_reporte.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lbl_reporte = new javax.swing.JLabel();
        txt_noPedido = new javax.swing.JTextField();
        lbl_producto = new javax.swing.JLabel();
        btn_imprimir = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 0));
        setTitle("Reporte materia prima");

        tabla_reporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Descripción", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tabla_reporte);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N

        lbl_reporte.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        lbl_reporte.setForeground(new java.awt.Color(255, 255, 255));
        lbl_reporte.setText("Reporte de materia prima");

        txt_noPedido.setEditable(false);
        txt_noPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noPedidoActionPerformed(evt);
            }
        });

        lbl_producto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_producto.setText("Producto:");

        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/impresion (1).png"))); // NOI18N
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btn_salir.setToolTipText("Rechaza cotización");
        btn_salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lbl_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(lbl_producto)
                        .addGap(18, 18, 18)
                        .addComponent(txt_noPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_producto)
                    .addComponent(txt_noPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_imprimir))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_noPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noPedidoActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_producto;
    private javax.swing.JLabel lbl_reporte;
    private javax.swing.JTable tabla_reporte;
    private javax.swing.JTextField txt_noPedido;
    // End of variables declaration//GEN-END:variables
}

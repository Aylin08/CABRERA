package Vista;
import Modelo.AltasMateria;
import Modelo.MateriaConexionBD;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ExistenciasForm extends javax.swing.JInternalFrame {
    AltasMateria pr = new AltasMateria();
    MateriaConexionBD bd= new MateriaConexionBD();

    DefaultTableModel modelo= new DefaultTableModel();

    public ExistenciasForm() {
        initComponents();
         listar();
    }
 void listar()
    {
        List <AltasMateria> lista=bd.listar();
        modelo=(DefaultTableModel)tabla_inventario.getModel();
        Object [] ob= new Object[3];
        for(int i=0; i<lista.size(); i++)
        {
            ob[0]=lista.get(i).getId_materia();
            ob[1]=lista.get(i).getNombre();
            ob[2]=lista.get(i).getCantidad();
            modelo.addRow(ob);
        }
        tabla_inventario.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_producto = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_inventario = new javax.swing.JTable();
        btn_agrega = new javax.swing.JButton();
        btn_actualiza = new javax.swing.JButton();
        btn_elimina = new javax.swing.JButton();
        btn_nueva = new javax.swing.JButton();
        btn_sal = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 0));
        setTitle("Inventario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID del Producto:");

        jLabel2.setText("Nombre de Producto:");

        jLabel3.setText("Cantidad:");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));

        jLabel13.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("Inventario de productos");

        tabla_inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID de Producto", "Nombre de Producto", "Cantidad"
            }
        ));
        tabla_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_inventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_inventario);

        btn_agrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/anadir.png"))); // NOI18N
        btn_agrega.setText("Agregar");
        btn_agrega.setToolTipText("Agregar registro. ");
        btn_agrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregaActionPerformed(evt);
            }
        });

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

        btn_nueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btn_nueva.setText("Nuevo");
        btn_nueva.setToolTipText("Nuevo registro");
        btn_nueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel11)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_elimina, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_sal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_nueva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_actualiza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_agrega, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_actualiza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_elimina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sal)
                        .addGap(38, 38, 38)))
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modificaciones", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        
    }//GEN-LAST:event_txt_idActionPerformed

    private void tabla_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_inventarioMouseClicked
        int fila=tabla_inventario.getSelectedRow();
        if(fila== -1)
        {
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        }
        else{

            String id=tabla_inventario.getValueAt(fila, 0).toString();
            String nom=tabla_inventario.getValueAt(fila, 1).toString();
            String cant=tabla_inventario.getValueAt(fila, 2).toString();


            txt_id.setText(id);
            txt_producto.setText(nom);
            txt_cantidad.setText(cant);

        }
    }//GEN-LAST:event_tabla_inventarioMouseClicked

    private void btn_agregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregaActionPerformed

        agregar();
        limpiar();
        listar();
        nuevo();
        

    }//GEN-LAST:event_btn_agregaActionPerformed

    private void btn_actualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizaActionPerformed
        actualizar();
        limpiar();
        listar();
        nuevo();
    }//GEN-LAST:event_btn_actualizaActionPerformed

    private void btn_eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaActionPerformed

        eliminar();
        limpiar();
        listar();
        nuevo();

    }//GEN-LAST:event_btn_eliminaActionPerformed

    private void btn_nuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaActionPerformed
        nuevo();
    }//GEN-LAST:event_btn_nuevaActionPerformed

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

    void agregar()
    {
        String nom=txt_producto.getText();
        String cant=txt_cantidad.getText();
        String id=txt_id.getText();

        Object [] ob=new Object[3];
        ob[0]=id;
        ob[1]=nom;
        ob[2]=cant;

        bd.add(ob);



    }
    void eliminar()
    {
      int fila=tabla_inventario.getSelectedRow();
      if(fila == -1)
      {
          JOptionPane.showMessageDialog(this, "Debe selecionar una fila");
      }else{
        int ids=Integer.parseInt(tabla_inventario.getValueAt(fila,0).toString());
         bd.eliminar(ids);
      }
    }
    void actualizar()
    {int fila=tabla_inventario.getSelectedRow();
      if(fila == -1)
      {
          JOptionPane.showMessageDialog(this, "Debe selecionar una fila");
      }
      else{

        String id=txt_id.getText();
        String producto=txt_producto.getText();
        String cant=txt_cantidad.getText();
        Object [] ob=new Object[3];
        ob[2]=id;
        ob[0]=producto;
        ob[1]=cant;

        bd.actualizar(ob);
      }
    }
    void nuevo()
    {
        txt_producto.setText("");
        txt_id.setText("");
        txt_cantidad.setText("");
        txt_producto.requestFocus();


    }
    void limpiar(){
        for(int i=0; i<modelo.getRowCount(); i++)
        {
            modelo.removeRow(i);
            i=i-1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualiza;
    private javax.swing.JButton btn_agrega;
    private javax.swing.JButton btn_elimina;
    private javax.swing.JButton btn_nueva;
    private javax.swing.JButton btn_sal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabla_inventario;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_producto;
    // End of variables declaration//GEN-END:variables
}

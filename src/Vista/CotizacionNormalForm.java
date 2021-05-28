package Vista;
import java.awt.*;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
public class CotizacionNormalForm extends javax.swing.JFrame {

    public CotizacionNormalForm(){
        initComponents();
    }
    double acum;
    Inicio in = new Inicio();
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_cotizacion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_estado7 = new javax.swing.JLabel();
        lbl_direccion3 = new javax.swing.JLabel();
        box_extra = new javax.swing.JComboBox<>();
        txt_observaciones = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        box_producto = new javax.swing.JComboBox<>();
        lbl_nombre3 = new javax.swing.JLabel();
        box_sabor = new javax.swing.JComboBox<>();
        box_tamaño = new javax.swing.JComboBox<>();
        lbl_direccion2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_estado4 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        lbl_estado5 = new javax.swing.JLabel();
        lbl_estado6 = new javax.swing.JLabel();
        txt_cobroextra = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_cotizacion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Cotizaciones");

        lbl_estado7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/observacion.png"))); // NOI18N
        lbl_estado7.setText("Observaciones:");

        lbl_direccion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nueces.png"))); // NOI18N
        lbl_direccion3.setText("Toping Extra:");

        box_extra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Queso extra", "Relleno de queso", "Nuez", "Cholate extra" }));

        lbl_nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tarta-de-queso.png"))); // NOI18N
        lbl_nombre.setText("Producto:");

        box_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Individual", "Mediano", "Grande", "Media plancha", "Plancha completa" }));
        box_producto.setToolTipText("Seleccione el producto.");
        box_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_productoActionPerformed(evt);
            }
        });

        lbl_nombre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/grafico-circular.png"))); // NOI18N
        lbl_nombre3.setText("Tamaño:");

        box_sabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Chocolate", "Vainilla", "Fresa", "Zanahoria" }));
        box_sabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_saborActionPerformed(evt);
            }
        });

        box_tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Pastel", "Cupcakes" }));
        box_tamaño.setToolTipText("Seleccione el tamaño.");
        box_tamaño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box_tamañoMouseClicked(evt);
            }
        });
        box_tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_tamañoActionPerformed(evt);
            }
        });

        lbl_direccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/receta.png"))); // NOI18N
        lbl_direccion2.setText("Sabor:");

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_estado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-de-dinero.png"))); // NOI18N
        lbl_estado4.setText("Subtotal: $");

        txt_subtotal.setEditable(false);

        lbl_estado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/extra.png"))); // NOI18N
        lbl_estado5.setText("Extra:      $");

        lbl_estado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dinero.png"))); // NOI18N
        lbl_estado6.setText("Total:      $");

        txt_cobroextra.setEditable(false);

        txt_total.setEditable(false);

        btn_aceptar.setBackground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/comprobado.png"))); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setToolTipText("Acepta Cotización");
        btn_aceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btn_salir.setText("Rechazar");
        btn_salir.setToolTipText("Salir");
        btn_salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_estado4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_estado6)
                        .addComponent(lbl_estado5)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cobroextra, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_estado4)
                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_estado5)
                    .addComponent(txt_cobroextra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_estado6))
                .addGap(85, 85, 85)
                .addComponent(btn_aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N

        Calcular.setBackground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout Panel_cotizacionLayout = new javax.swing.GroupLayout(Panel_cotizacion);
        Panel_cotizacion.setLayout(Panel_cotizacionLayout);
        Panel_cotizacionLayout.setHorizontalGroup(
            Panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_cotizacionLayout.createSequentialGroup()
                .addGroup(Panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_cotizacionLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(Panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombre)
                            .addComponent(lbl_nombre3)
                            .addComponent(lbl_direccion2)
                            .addComponent(lbl_direccion3)
                            .addComponent(lbl_estado7))
                        .addGap(21, 21, 21)
                        .addGroup(Panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_tamaño, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(box_producto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_extra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(box_sabor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_cotizacionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_cotizacionLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_cotizacionLayout.createSequentialGroup()
                                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_cotizacionLayout.setVerticalGroup(
            Panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_cotizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addGroup(Panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre))
                .addGap(28, 28, 28)
                .addGroup(Panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre3))
                .addGap(36, 36, 36)
                .addGroup(Panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_sabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_direccion2))
                .addGap(31, 31, 31)
                .addGroup(Panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion3)
                    .addComponent(box_extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(Panel_cotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_estado7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_cotizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_tamañoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box_tamañoMouseClicked
        producto();
    }//GEN-LAST:event_box_tamañoMouseClicked

    private void box_tamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_tamañoActionPerformed

    }//GEN-LAST:event_box_tamañoActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
       
        Object[] options = { "Yes", "No" };
     int confirmado = JOptionPane.showOptionDialog( null,
     "¿Desea confirmar pedido?","Yes",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

    if (confirmado == 0)
    { 
        FechasDisponiblesForm fed=new FechasDisponiblesForm();
        fed.setVisible(true);
        //CotizacionNormalForm.escritorio.add(fed);
        //fed.toFront();
        //fed.setVisible(true);
         System.out.println("confirmado");}
    else{
            System.out.println("vale... no hago nada...");}
       
      // in.CentrarVentana(fd);

    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void box_saborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_saborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_saborActionPerformed

    private void box_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_productoActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        String total3;
        int total=0;
        int total2=0;
        String op= (String) box_producto.getSelectedItem();
        String op2= (String) box_sabor.getSelectedItem();
        String op3= (String) box_tamaño.getSelectedItem();
        String op4= (String) box_extra.getSelectedItem();
        
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

    void producto()
{
    String op= "--Seleccionar--";
     if(op=="Pastel")
     {
         JOptionPane.showMessageDialog(null,"pasteles");
         txt_subtotal.setText("300");
     }
     else
     { if(op=="Cupcakes")
     {
         JOptionPane.showMessageDialog(null,"cupcakes");
         txt_subtotal.setText("300");
     }
     }
     
    
}
void sabor ()
{String op= "--Seleccionar--";
     switch (op){
         case "Chocolate":
             break;
         case "Vainilla":
             break;
         case "Fresa":
             break;
         case "Zanahoria":
             break;
     }
}
void tamaño(){
    String op= "--Seleccionar--";
     switch (op){
         case "Individual":
             break;
         case "Mediano":
             break;
         case "Grande":
             break;
         case "Media plancha":
             break;
         case "Plancha completa":
             break;
     }
}
void Extra()
{
    String op= "--Seleccionar--";
     switch (op){
         case "Queso extra":
             break;
         case "Relleno de queso":
             break;
         case "Nuez":
             break;
         case "Chocolate extra":
             break;
     }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CotizacionNormalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CotizacionNormalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CotizacionNormalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CotizacionNormalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CotizacionNormalForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    public javax.swing.JPanel Panel_cotizacion;
    private javax.swing.JComboBox<String> box_extra;
    private javax.swing.JComboBox<String> box_producto;
    private javax.swing.JComboBox<String> box_sabor;
    private javax.swing.JComboBox<String> box_tamaño;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_direccion2;
    private javax.swing.JLabel lbl_direccion3;
    private javax.swing.JLabel lbl_estado4;
    private javax.swing.JLabel lbl_estado5;
    private javax.swing.JLabel lbl_estado6;
    private javax.swing.JLabel lbl_estado7;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombre3;
    private javax.swing.JTextField txt_cobroextra;
    private javax.swing.JTextField txt_observaciones;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}

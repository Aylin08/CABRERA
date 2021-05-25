package Vista;

import java.awt.*;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class CotizacionNormalForm extends javax.swing.JInternalFrame {
    double acum;
    Inicio in = new Inicio();


    public CotizacionNormalForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox5 = new javax.swing.JComboBox<>();
        ventana = new javax.swing.JPanel();
        txt_extra = new javax.swing.JComboBox<>();
        lbl_nombre = new javax.swing.JLabel();
        txt_observaciones = new javax.swing.JTextField();
        txt_tamaño = new javax.swing.JComboBox<>();
        lbl_tamaño = new javax.swing.JLabel();
        txt_sabor = new javax.swing.JComboBox<>();
        lbl_sabor = new javax.swing.JLabel();
        txt_producto = new javax.swing.JComboBox<>();
        lbl_observacion = new javax.swing.JLabel();
        lbl_topping = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_subtotal = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        lbl_estado5 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        txt_cobroextra = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Pastel", "Cupcakes", "Gelatinas", " " }));

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setTitle("Cotización Normal");
        setPreferredSize(new java.awt.Dimension(1250, 610));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        ventana.setBackground(new java.awt.Color(255, 255, 255));
        ventana.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ventana.setPreferredSize(new java.awt.Dimension(1250, 610));

        txt_extra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Queso extra", "Relleno de queso", "Nuez", "Cholate extra" }));

        lbl_nombre.setText("Producto:");

        txt_tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Individual", "Mediano", "Grande", "Media plancha", "Plancha completa" }));

        lbl_tamaño.setText("Tamaño:");

        txt_sabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Chocolate", "Vainilla", "Fresa", "Zanahoria" }));
        txt_sabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_saborActionPerformed(evt);
            }
        });

        lbl_sabor.setText("Sabor:");

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

        lbl_observacion.setText("Observaciones:");

        lbl_topping.setText("Toping Extra:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 610));

        lbl_subtotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-de-dinero.png"))); // NOI18N
        lbl_subtotal.setText("Subtotal: $");

        txt_subtotal.setEditable(false);

        lbl_estado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/extra.png"))); // NOI18N
        lbl_estado5.setText("Extra:      $");

        lbl_total.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dinero.png"))); // NOI18N
        lbl_total.setText("Total:      $");

        txt_cobroextra.setEditable(false);

        txt_total.setEditable(false);

        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/comprobado.png"))); // NOI18N
        btn_aceptar.setToolTipText("Acepta Cotización");
        btn_aceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
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

        escritorio.setBackground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_subtotal)
                            .addComponent(lbl_estado5))
                        .addComponent(lbl_total))
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_cobroextra, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_subtotal)
                            .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_estado5)
                            .addComponent(txt_cobroextra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_total)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Cotizaciones");
        jLabel3.setMaximumSize(new java.awt.Dimension(83, 58));
        jLabel3.setMinimumSize(new java.awt.Dimension(83, 58));

        jButton1.setText("🖨");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventanaLayout = new javax.swing.GroupLayout(ventana);
        ventana.setLayout(ventanaLayout);
        ventanaLayout.setHorizontalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLayout.createSequentialGroup()
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaLayout.createSequentialGroup()
                                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ventanaLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(lbl_nombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaLayout.createSequentialGroup()
                                                .addComponent(txt_producto, 0, 1, Short.MAX_VALUE)
                                                .addGap(244, 244, 244))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txt_sabor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txt_tamaño, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(txt_extra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(ventanaLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1))
                            .addGroup(ventanaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_observacion)
                                    .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_tamaño)
                                        .addComponent(lbl_topping)
                                        .addComponent(lbl_sabor)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ventanaLayout.setVerticalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre)
                            .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sabor))
                .addGap(18, 18, 18)
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tamaño)
                    .addComponent(txt_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_topping)
                    .addComponent(txt_extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_observacion)
                    .addComponent(txt_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventana, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("CotizacionNormal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_productoActionPerformed(java.awt.event.ActionEvent evt)
    {
        
    }
                                                    

    private void txt_saborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_saborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_saborActionPerformed

    private void txt_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_productoMouseClicked
        producto();
    }//GEN-LAST:event_txt_productoMouseClicked

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
      
        Object[] options = { "Yes", "No" };
     int confirmado = JOptionPane.showOptionDialog( null,
     "¿Desea confirmar pedido?","yas",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

    if (confirmado == 0)
    { 
        FechasDisponiblesForm fed=new FechasDisponiblesForm();
        fed.setVisible(true);
        CotizacionNormalForm.escritorio.add(fed);
        fed.toFront();
        fed.setVisible(true);
     
         System.out.println("confirmado");}
    else{
            System.out.println("vale... no hago nada...");}
       
      // in.CentrarVentana(fd);
          
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed


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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_estado5;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_observacion;
    private javax.swing.JLabel lbl_sabor;
    private javax.swing.JLabel lbl_subtotal;
    private javax.swing.JLabel lbl_tamaño;
    private javax.swing.JLabel lbl_topping;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JTextField txt_cobroextra;
    private javax.swing.JComboBox<String> txt_extra;
    private javax.swing.JTextField txt_observaciones;
    private javax.swing.JComboBox<String> txt_producto;
    private javax.swing.JComboBox<String> txt_sabor;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JComboBox<String> txt_tamaño;
    private javax.swing.JTextField txt_total;
    private javax.swing.JPanel ventana;
    // End of variables declaration//GEN-END:variables
}

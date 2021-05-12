package Vista;

import javax.swing.JOptionPane;


public class FechasDisponiblesForm extends javax.swing.JInternalFrame {

    public FechasDisponiblesForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_salir = new javax.swing.JButton();
        ventana = new javax.swing.JPanel();
        rSCalendar1 = new rojeru_san.componentes.RSCalendar();
        jPanel1 = new javax.swing.JPanel();
        Confirmar = new javax.swing.JButton();
        btn_salir1 = new javax.swing.JButton();

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btn_salir.setToolTipText("Rechaza cotización");
        btn_salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        setTitle("Fechas disponibles");

        ventana.setBackground(new java.awt.Color(255, 255, 255));

        rSCalendar1.setColorBackground(new java.awt.Color(255, 153, 51));
        rSCalendar1.setColorButtonHover(new java.awt.Color(255, 255, 51));
        rSCalendar1.setColorDiaActual(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        Confirmar.setBackground(new java.awt.Color(255, 255, 255));
        Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/comprobado.png"))); // NOI18N
        Confirmar.setToolTipText("Acepta Cotización");
        Confirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        btn_salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btn_salir1.setToolTipText("Rechaza cotización");
        btn_salir1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salir1)
                    .addComponent(Confirmar))
                .addContainerGap())
        );

        javax.swing.GroupLayout ventanaLayout = new javax.swing.GroupLayout(ventana);
        ventana.setLayout(ventanaLayout);
        ventanaLayout.setHorizontalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ventanaLayout.setVerticalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaLayout.createSequentialGroup()
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        JOptionPane.showConfirmDialog(null, "Desea registar pedido");
       // JOptionPane.showMessageDialog(null, "Fecha diponible");
    }//GEN-LAST:event_ConfirmarActionPerformed
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_salir1;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private javax.swing.JPanel ventana;
    // End of variables declaration//GEN-END:variables
}

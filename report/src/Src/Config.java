package Src;


public class Config extends javax.swing.JPanel {


    public Config() {
        initComponents();
        if(!Configuracion.estado){
            offline.setSelected(true);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        online = new javax.swing.JRadioButton();
        offline = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(online);
        online.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        online.setSelected(true);
        online.setText("Online");
        online.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlineActionPerformed(evt);
            }
        });

        buttonGroup1.add(offline);
        offline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        offline.setText("Offline");
        offline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offlineActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Modo de conexion a Base de Datos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(online)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(offline))
                    .addComponent(jLabel1))
                .addGap(0, 209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(online)
                    .addComponent(offline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainReport.PanelTwo(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void offlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offlineActionPerformed
       Cambio();
    }//GEN-LAST:event_offlineActionPerformed

    private void onlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlineActionPerformed
       Cambio();
    }//GEN-LAST:event_onlineActionPerformed

    private void Cambio(){
       if(online.isSelected()){
           Configuracion.Escribir("true");
       }else if(offline.isSelected()){
           Configuracion.Escribir("false");
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton offline;
    private javax.swing.JRadioButton online;
    // End of variables declaration//GEN-END:variables
}

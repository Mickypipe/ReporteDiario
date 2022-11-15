package Src;


import Src.MainReport;
import Src.Configuracion;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import mySql.myConnection;
import mySql.myQueries;




public class User extends javax.swing.JPanel {

   
    public User() {
        initComponents();
        if(!Configuracion.estado){
            Online.setSelected(false);
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formUser = new javax.swing.JTextField();
        formPassword = new javax.swing.JPasswordField();
        boton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        Online = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(10240, 7200));
        setMinimumSize(new java.awt.Dimension(300, 300));

        formUser.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        formUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formUserKeyReleased(evt);
            }
        });

        formPassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        formPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formPasswordKeyReleased(evt);
            }
        });

        boton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boton.setText("Ingresar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(formPassword);
        jLabel1.setText("Contraseña:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setLabelFor(formUser);
        jLabel2.setText("Usuario:");

        errorLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setToolTipText("");
        errorLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Online.setBackground(new java.awt.Color(204, 204, 204));
        Online.setForeground(new java.awt.Color(255, 255, 255));
        Online.setSelected(true);
        Online.setEnabled(false);
        Online.setFocusable(false);
        Online.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlineActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Online");

        jButton1.setText("Configuracion");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 214, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(formUser, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(formPassword)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 214, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Online)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Online, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(formUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(formPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        formUser.getAccessibleContext().setAccessibleName("");
        jLabel2.getAccessibleContext().setAccessibleParent(formUser);
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        String contraseña="";
        char[] array = formPassword.getPassword();
        for (int i = 0; i < formPassword.getPassword().length; i++) {
            contraseña+=array[i];
        }
        if(formUser.getText().length()==0){
            errorLabel.setText("Falta nombre de usuario");
            formUser.requestFocus();
        }else{
            
            if(myQueries.Usuario(formUser.getText(), contraseña)){
                MainReport.PanelTwo(1);
            }
           
            
        } 
    }//GEN-LAST:event_botonActionPerformed

    private void formPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formPasswordKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boton.doClick();
        }
    }//GEN-LAST:event_formPasswordKeyReleased

    private void formUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formUserKeyReleased
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           formPassword.requestFocus();
        }
    }//GEN-LAST:event_formUserKeyReleased

    private void OnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineActionPerformed
        
    }//GEN-LAST:event_OnlineActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainReport.PanelTwo(2);
    }//GEN-LAST:event_jButton1ActionPerformed
      
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Online;
    private javax.swing.JButton boton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPasswordField formPassword;
    private javax.swing.JTextField formUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

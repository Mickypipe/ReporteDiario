
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import mySql.myConnection;




public class User extends javax.swing.JPanel {

   
    public User() {
        initComponents();
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formUser, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(formPassword)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(formUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(formPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
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
        }else if(contraseña.length()==0){
            errorLabel.setText("Falta una contraseña");
            formPassword.requestFocus();
        }else{
            myConnection.setUser(formUser.getText());
            myConnection.setPass(contraseña);
            if(myConnection.Test()){
                MainReport.PanelTwo();
            }
            if(myConnection.getMsg().contains("Login")){
                errorLabel.setText("Usuario invalido");
            }else if (myConnection.getMsg().equals("Correcto")){
                errorLabel.setText("");
            }else{
                JOptionPane.showMessageDialog(null, myConnection.getMsg());
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
      
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPasswordField formPassword;
    private javax.swing.JTextField formUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

package Src;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Dimension;

public class Window extends javax.swing.JFrame {
    
    
    public Window() {
        initComponents();
        this.setMinimumSize(new Dimension(680,480));
        try{
            setIconImage(new ImageIcon(getClass().getResource("next.png")).getImage());
        }catch(Exception e){
            System.out.println(e);
        }
        this.setTitle("Informes Vertex");
    }
    
    //funcion para cambiar de paneles
    public void Panel(JPanel panel){
        panel.setSize(windowPanel.getWidth(),windowPanel.getHeight());
        panel.setLocation(0, 0);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(windowPanel);
        windowPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel,0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel,0, 480, Short.MAX_VALUE)
        );
        windowPanel.removeAll();
        windowPanel.add(panel,BorderLayout.SOUTH);
        windowPanel.revalidate();
        windowPanel.repaint();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windowPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        windowPanel.setBackground(new java.awt.Color(102, 102, 102));
        windowPanel.setMaximumSize(null);

        javax.swing.GroupLayout windowPanelLayout = new javax.swing.GroupLayout(windowPanel);
        windowPanel.setLayout(windowPanelLayout);
        windowPanelLayout.setHorizontalGroup(
            windowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        windowPanelLayout.setVerticalGroup(
            windowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel windowPanel;
    // End of variables declaration//GEN-END:variables
}

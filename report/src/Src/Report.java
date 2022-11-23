package Src;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import mySql.myQueries;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Report extends javax.swing.JPanel {

    private ArrayList<String> codProyecto;
    
    public Report() {
        initComponents();
        jDateChooser.setDateFormatString("dd/MM/yyyy");
        ArrayList<String[]> list = myQueries.Proyecto();

        comboProyectos.addItem("Proyecto");
        codProyecto = new ArrayList();
        for (int i = 0;i<list.size() ;i++) {
            String[] aux = list.get(i);
            codProyecto.add(aux[0]);
            comboProyectos.addItem(aux[0]+" "+aux[1]);
        }
        comboProyectos.setEnabled(true);
        
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboProyectos = new javax.swing.JComboBox<>();
        comboEquipo = new javax.swing.JComboBox<>();
        jLabelAux2 = new javax.swing.JLabel();
        jLabelAux1 = new javax.swing.JLabel();
        preGenerar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePerforacion = new javax.swing.JTable();
        labelDescripcion = new javax.swing.JLabel();
        labelEquipo = new javax.swing.JLabel();
        labelProyecto = new javax.swing.JLabel();
        labelFaena = new javax.swing.JLabel();
        labelChimenea = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabelAux4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTarea = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));

        comboProyectos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboProyectos.setMinimumSize(new java.awt.Dimension(124, 25));
        comboProyectos.setPreferredSize(new java.awt.Dimension(124, 25));
        comboProyectos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProyectosItemStateChanged(evt);
            }
        });

        comboEquipo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboEquipo.setEnabled(false);
        comboEquipo.setMinimumSize(new java.awt.Dimension(124, 25));
        comboEquipo.setPreferredSize(new java.awt.Dimension(124, 25));

        jLabelAux2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelAux2.setLabelFor(comboProyectos);
        jLabelAux2.setText("Proyecto :");

        jLabelAux1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelAux1.setLabelFor(jDateChooser);
        jLabelAux1.setText("Fecha     :");

        preGenerar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        preGenerar.setText("Buscar");
        preGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preGenerarActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guardar.setText("Generar Informe");
        guardar.setEnabled(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        tablePerforacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablePerforacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Turno", "Actividad", "Estado", "Hora Inicial", "Hora Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePerforacion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tablePerforacion.setFocusable(false);
        tablePerforacion.setShowGrid(false);
        jScrollPane1.setViewportView(tablePerforacion);

        labelDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelDescripcion.setText("Descripcion  :");

        labelEquipo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelEquipo.setText("Equipo         :");

        labelProyecto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelProyecto.setText("Proyecto      :");

        labelFaena.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelFaena.setText("Faena             :");

        labelChimenea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelChimenea.setText("Chimenea        :");

        labelFecha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelFecha.setText("Fecha Informe :");

        jDateChooser.setMinimumSize(new java.awt.Dimension(124, 20));
        jDateChooser.setPreferredSize(new java.awt.Dimension(124, 20));

        jLabelAux4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelAux4.setLabelFor(comboEquipo);
        jLabelAux4.setText("Equipo    :");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Busqueda de Informes");

        tableTarea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableTarea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Turno", "Actividad", "Tarea", "Hora Inicial", "Hora Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTarea.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tableTarea.setFocusable(false);
        tableTarea.setShowGrid(false);
        jScrollPane2.setViewportView(tableTarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelChimenea, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFaena, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(preGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAux4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAux2)
                            .addComponent(jLabelAux1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboProyectos, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(labelFaena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(labelChimenea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(labelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelAux1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAux2)
                            .addComponent(comboProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAux4)
                            .addComponent(comboEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(preGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void preGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preGenerarActionPerformed
        boolean error = false;
        if(comboProyectos.getSelectedIndex()==0){
            jTextField1.setText("No se ha elegido un Proyecto");
            error = true;
        }
        if(comboEquipo.getSelectedIndex()==0){
            jTextField1.setText("No se ha elegido un Equipo");
            error = true;
        }
        if(jDateChooser.getDate()==null){
            jTextField1.setText("No se ha elegido una Fecha");
            error = true;
        }
        
        guardar.setEnabled(false);
        Vacio();
        
        if(error){
            labelProyecto.setText("Proyecto      : ");
            labelDescripcion.setText("Descripcion  : ");
            labelEquipo.setText("Equipo         : ");
            labelFaena.setText("Faena             : ");
            labelChimenea.setText("Chimenea        : ");
            labelFecha.setText("Fecha Informe : ");
            
        }else{
            jTextField1.setText("");
            
            String proyecto = codProyecto.get(comboProyectos.getSelectedIndex()-1);
            String equipo = comboEquipo.getSelectedItem().toString();
            
            Date date = jDateChooser.getDate();
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
            String fnacim = String.valueOf(sdf1.format(date));
            
            String fecha = fnacim;
            
            
            
            metrosPiloto = new double[5];
            metrosEscariado = new double[5];
            //sql------------------------------------------------------------------
            String formato = ("yyyy/MM/dd");
            SimpleDateFormat sdf2 = new SimpleDateFormat(formato);
            String auxFecha = String.valueOf(sdf2.format(date));
            String id_registroA = String.valueOf(sdf2.format(date))+"A"+proyecto+equipo;
            
            String codChimenea = myQueries.Chimenea(id_registroA);
            
            String descripcion = myQueries.Metodologia(codChimenea);
            String faena = myQueries.Mina(codChimenea);
            String chimenea = myQueries.Mandante(codChimenea);
            
            labelProyecto.setText("Proyecto      : "+proyecto);
            labelDescripcion.setText("Descripcion  : "+descripcion);
            labelEquipo.setText("Equipo         : "+equipo);
            labelFaena.setText("Faena             : "+faena);
            labelChimenea.setText("Chimenea        : "+chimenea);
            labelFecha.setText("Fecha Informe : "+fecha);
            
            head = new String[6];
            head[0]=proyecto;
            head[1]=descripcion;
            head[2]=equipo;
            head[3]=faena;
            head[4]=chimenea;
            head[5]=fecha;
            
            
            
            
            double[] aux = myQueries.Metros(id_registroA, auxFecha,codChimenea);
            metrosPiloto[0] = aux[0];
            metrosEscariado[0] = aux[1];
            
            String id_registroB = String.valueOf(sdf2.format(date))+"B"+proyecto+equipo;
            aux = myQueries.Metros(id_registroB, auxFecha,codChimenea);
            metrosPiloto[1] = aux[0];
            metrosEscariado[1] = aux[1];
            
            metrosPiloto[2] = aux[0];
            metrosEscariado[2] = aux[1];
            int count = myQueries.Comprobacion(id_registroA, id_registroB,codChimenea);
            
            horometro = new double[2][2];
            horometro[0]=myQueries.Horometro(id_registroA, equipo);
            
            horometro[1]=myQueries.Horometro(id_registroB, equipo);
            
            horometroRedTrax =new double[3];
            horometroRedTrax[0]=myQueries.HorometroRedTrackIni(id_registroA);
            horometroRedTrax[1]=myQueries.HorometroRedTrackFin(id_registroB);
            horometroRedTrax[2]=horometroRedTrax[1]-horometroRedTrax[0];
            
            
            horometroAuxiliar = new double[3];
            horometroAuxiliar[0]=myQueries.HorometroAuxiliarIni(id_registroA);
            horometroAuxiliar[1]=myQueries.HorometroAuxiliarFin(id_registroB);
            horometroAuxiliar[2]=horometroAuxiliar[1]-horometroAuxiliar[0];
            
            personal = new String[2][5];
            
            personal[0][0]=myQueries.Personal(id_registroA,"Supervisor Raisebore");
            personal[0][1]=myQueries.Personal(id_registroA,"Operador Raisebore");
            ArrayList<String> asistentes = myQueries.PersonalAsistente(id_registroA,"Asistente Raisebore");
            if(!asistentes.isEmpty()){
            personal[0][2]=myQueries.PersonalAsistente(id_registroA,"Asistente Raisebore").get(0);}
            else{
                personal[0][2]="";
            }
            if(asistentes.size()>1){
            personal[0][3]=myQueries.PersonalAsistente(id_registroA,"Asistente Raisebore").get(1);}
            else{
                personal[0][3]="";
            }
            personal[0][4]=myQueries.Personal(id_registroA,"Operador Equipo de Apoyo");
            
            personal[1][0]=myQueries.Personal(id_registroB,"Supervisor Raisebore");
            personal[1][1]=myQueries.Personal(id_registroB,"Operador Raisebore");
            asistentes = myQueries.PersonalAsistente(id_registroB,"Asistente Raisebore");
            if(!asistentes.isEmpty()){
            personal[1][2]=myQueries.PersonalAsistente(id_registroB,"Asistente Raisebore").get(0);}
            else{
                personal[1][2]="";
            }
            if(asistentes.size()>1){
            personal[1][3]=myQueries.PersonalAsistente(id_registroB,"Asistente Raisebore").get(1);}
            else{
                personal[1][3]="";
            }
            personal[1][4]=myQueries.Personal(id_registroB,"Operador Equipo de Apoyo");
            
            
            String formato2 = ("yyyy/MM");
            SimpleDateFormat sdf3 = new SimpleDateFormat(formato2);
            String id_registroMes = String.valueOf(sdf3.format(date))+"/%"+proyecto+equipo;
            //turnosMes = myQueries.TurnosWhere(id_registroMes,codChimenea,String.valueOf(sdf2.format(date)));
            aux = myQueries.Metros(id_registroMes, auxFecha,codChimenea);
            metrosPiloto[3] = aux[0];
            metrosEscariado[3] = aux[1];
  
            countMes = myQueries.Cuenta(id_registroMes,codChimenea,String.valueOf(sdf2.format(date)));

            
            String id_registroTotal = "%"+proyecto+equipo;
            turnosTotal = myQueries.TurnosWhere(id_registroTotal,codChimenea,String.valueOf(sdf2.format(date)));
            aux = myQueries.Metros(id_registroTotal, auxFecha,codChimenea);
            metrosPiloto[4] = aux[0];
            metrosEscariado[4] = aux[1];

            turnosMes = myQueries.Mes(proyecto, auxFecha);
            countTotal = myQueries.Cuenta(id_registroTotal,codChimenea,String.valueOf(sdf2.format(date)));
            
            String formato4 = ("yyyy-MM-dd");
            SimpleDateFormat sdf4 = new SimpleDateFormat(formato4);
            sug = String.valueOf(sdf4.format(date)) +" "+ equipo;
            //comentarioA = mySql.myQueries.Comentario(id_registroA , "TURNO A Operación: ");
            //comentarioB = mySql.myQueries.Comentario(id_registroB , "TURNO B Operación: ");
            //chimenea
            //proyecto
            //Date sqlFecha = new java.sql.Date(jDateChooser.getDate().getTime());
            turnos = myQueries.Turnos(id_registroA, id_registroB);
            jTextField1.setText("Turnos encontrados: "+count);
            if(count>=1){
               ArrayList<String[]> A = myQueries.Perforacion(id_registroA,"A");
               ArrayList<String[]> B = myQueries.Perforacion(id_registroB,"B");
               A.addAll(B);

                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Turno");
                model.addColumn("Actividad");
                model.addColumn("Estado");
                model.addColumn("Hora Inicial");
                model.addColumn("Hora Final");

                for (int i = 0; i < A.size(); i++) {
                    model.addRow(A.get(i));
                }
                tablePerforacion.setModel(model); 
                tablePerforacion.getColumnModel().getColumn(0).setPreferredWidth(50);
                tablePerforacion.getColumnModel().getColumn(1).setPreferredWidth(95);
                tablePerforacion.getColumnModel().getColumn(2).setPreferredWidth(95);
                tablePerforacion.getColumnModel().getColumn(3).setPreferredWidth(80);
                tablePerforacion.getColumnModel().getColumn(4).setPreferredWidth(80);

               A = myQueries.Tarea(id_registroA,"A");
               B = myQueries.Tarea(id_registroB,"B");
               A.addAll(B);
                DefaultTableModel model2 = new DefaultTableModel();
                model2.addColumn("Turno");
                model2.addColumn("Actividad");
                model2.addColumn("Tarea");
                model2.addColumn("Hora Inicial");
                model2.addColumn("Hora Final");


                for (int i = 0; i < A.size(); i++) {
                    model2.addRow(A.get(i));
                }
                tableTarea.setModel(model2); 
                tableTarea.getColumnModel().getColumn(0).setPreferredWidth(40);
                tableTarea.getColumnModel().getColumn(1).setPreferredWidth(80);
                tableTarea.getColumnModel().getColumn(2).setPreferredWidth(140);
                tableTarea.getColumnModel().getColumn(3).setPreferredWidth(70);
                tableTarea.getColumnModel().getColumn(4).setPreferredWidth(70);
                guardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_preGenerarActionPerformed

    private void Vacio(){
        DefaultTableModel model1 = new DefaultTableModel();
        model1.addColumn("Turno");
        model1.addColumn("Actividad");
        model1.addColumn("Estado");
        model1.addColumn("Hora Inicial");
        model1.addColumn("Hora Final");
        tablePerforacion.setModel(model1); 
        DefaultTableModel model2 = new DefaultTableModel();
        model2.addColumn("Turno");
        model2.addColumn("Actividad");
        model2.addColumn("Tarea");
        model2.addColumn("Hora Inicial");
        model2.addColumn("Hora Final");
        tableTarea.setModel(model2); 
    }
    
    private String sug="";
    
    private String comentarioA;
    private String comentarioB;
    
    private String[] head;
    private Map<String, double[]> turnos;
    private Map<String, double[]> turnosMes;
    private Map<String, double[]> turnosTotal;
    
    private double[] metrosPiloto;
    private double[] metrosEscariado;

    private int countTotal;
    private int countMes;
    
    double[][] horometro;
    double[] horometroRedTrax;
    
    double[] horometroAuxiliar;
    String[][] personal;
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        xls.NewXls.Creation();
        File file = Guardar();
        xls.NewXls.Fill(file,head,turnos,turnosMes,turnosTotal,metrosPiloto,metrosEscariado,countMes,countTotal,comentarioA,comentarioB,horometro,horometroRedTrax,horometroAuxiliar,personal);
        
        
        
    }//GEN-LAST:event_guardarActionPerformed

    private void comboProyectosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProyectosItemStateChanged
        if(comboProyectos.getSelectedIndex() != 0){
            String proyecto = codProyecto.get(comboProyectos.getSelectedIndex()-1);
             ArrayList<String> list2 = myQueries.Equipo(proyecto);
             comboEquipo.removeAllItems();
            comboEquipo.addItem("Equipo");
            for (int i = 0;i<list2.size() ;i++) {
                comboEquipo.addItem(list2.get(i));
            }
            comboEquipo.setEnabled(true);
        }else{
            comboEquipo.setEnabled(false);
            comboEquipo.removeAllItems();
            comboEquipo.addItem("Equipo");
            comboEquipo.setSelectedIndex(0);
        }
    }//GEN-LAST:event_comboProyectosItemStateChanged

    public File Guardar(){
        
        UIManager.put("FileChooser.saveButtonText","Guardar");
        UIManager.put("FileChooser.cancelButtonText","Cancelar");
        UIManager.put("FileChooser.openDialogTitleText", "Abrir");
        UIManager.put("FileChooser.lookInLabelText", "Mirar");
        UIManager.put("FileChooser.openButtonText", "Abrir");
        UIManager.put("FileChooser.cancelButtonText", "Cancelar");
        UIManager.put("FileChooser.fileNameLabelText", "Nombre de Archivo");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Tipo de Archivo");
        UIManager.put("FileChooser.openButtonToolTipText", "Abrir");
        UIManager.put("FileChooser.cancelButtonToolTipText","Cancelar");
        UIManager.put("FileChooser.fileNameHeaderText","Nombre");
        UIManager.put("FileChooser.upFolderToolTipText", "Subir una Carpeta");
        UIManager.put("FileChooser.homeFolderToolTipText","Escritorio");
        UIManager.put("FileChooser.newFolderToolTipText","Crear nueva carpeta");
        UIManager.put("FileChooser.listViewButtonToolTipText","Lista");
        UIManager.put("FileChooser.newFolderButtonText","Crear nueva ca´peta");
        UIManager.put("FileChooser.renameFileButtonText", "Renombrar archivo");
        UIManager.put("FileChooser.deleteFileButtonText", "Detalles del Archivo");
        UIManager.put("FileChooser.filterLabelText", "Tipo de Archivo");
        UIManager.put("FileChooser.detailsViewButtonToolTipText", "Detalles");
        UIManager.put("FileChooser.fileSizeHeaderText","Tamaño");
        UIManager.put("FileChooser.fileDateHeaderText", "Fecha de Modificacion");
        UIManager.put("FileChooser.fileSelectionText", "Carpetas");
                
        JFileChooser seleccion = new JFileChooser(); 
        seleccion.setDialogTitle("Seleccion de ruta"); 
        seleccion.setDialogType(JFileChooser.SAVE_DIALOG);
        seleccion.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        FileFilter filter = new FileNameExtensionFilter("Archivo Excel", "xlsx");
        seleccion.addChoosableFileFilter(filter);
        seleccion.setFileFilter(filter);
        
        seleccion.setSelectedFile(new File( sug));
        
        int respuesta = seleccion.showSaveDialog(this);
        switch(respuesta){ 
            case JFileChooser.APPROVE_OPTION:
                seleccion.setSelectedFile(new File(seleccion.getSelectedFile().toString()+".xlsx"));
              return seleccion.getSelectedFile();
            case JFileChooser.CANCEL_OPTION:
              System.out.println("Cancelado");
              return null;
            default :
              System.out.println("Error");
              return null;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboEquipo;
    private javax.swing.JComboBox<String> comboProyectos;
    private javax.swing.JButton guardar;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAux1;
    private javax.swing.JLabel jLabelAux2;
    private javax.swing.JLabel jLabelAux4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelChimenea;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelEquipo;
    private javax.swing.JLabel labelFaena;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelProyecto;
    private javax.swing.JButton preGenerar;
    private javax.swing.JTable tablePerforacion;
    private javax.swing.JTable tableTarea;
    // End of variables declaration//GEN-END:variables
}

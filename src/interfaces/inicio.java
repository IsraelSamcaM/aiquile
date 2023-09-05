/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import clases.mover;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import desplazable.Desface;
import javax.swing.JPanel;


public final class inicio extends javax.swing.JFrame {
    Desface desplace;
    mover moverMenu = new mover(); 
    public inicio() {
        initComponents();
        desplace = new Desface();
        setBackground(new Color(1.0f,1.0f,0.0f,0.0f));
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound2 = new interfaces.PanelRound();
        menu = new interfaces.PanelRound();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panel_rmensual = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panel_usuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_centros = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_viviendas = new javax.swing.JPanel();
        dirVivienda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_viviendas = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        n_vivienda = new javax.swing.JLabel();
        jefe_familia = new javax.swing.JLabel();
        n_habitaciones = new javax.swing.JLabel();
        telVivienda = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panel_brigadas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel_insecticidas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panel_formularios = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panel_rdiario = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(51, 153, 255));
        menu.setOpaque(true);
        menu.setRoundBottomLeft(50);
        menu.setRoundBottomRight(50);
        menu.setRoundTopLeft(50);
        menu.setRoundTopRight(50);
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Exit");
        jButton7.setAlignmentY(0.0F);
        jButton7.setAutoscrolls(true);
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setMargin(new java.awt.Insets(20, 20, 20, 20));
        jButton7.setOpaque(true);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        menu.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 120, 20));

        jButton9.setBackground(new java.awt.Color(0, 204, 204));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(51, 51, 51));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user-.png"))); // NOI18N
        jButton9.setText("USUARIOS     ");
        jButton9.setActionCommand("USUARIOS     ");
        jButton9.setAlignmentY(0.0F);
        jButton9.setAutoscrolls(true);
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton9.setName(""); // NOI18N
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        menu.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 220, 30));

        jButton8.setBackground(new java.awt.Color(0, 204, 204));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 51, 51));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vivienda.png"))); // NOI18N
        jButton8.setText("VIVIENDAS     ");
        jButton8.setActionCommand(" VIVIENDAS         ");
        jButton8.setAlignmentY(0.0F);
        jButton8.setAutoscrolls(true);
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        menu.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 30));

        jButton10.setBackground(new java.awt.Color(0, 204, 204));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(51, 51, 51));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jButton10.setText("BRIGADAS     ");
        jButton10.setAlignmentY(0.0F);
        jButton10.setAutoscrolls(true);
        jButton10.setBorder(null);
        jButton10.setContentAreaFilled(false);
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        menu.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 220, 30));

        jButton11.setBackground(new java.awt.Color(0, 204, 204));
        jButton11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 51, 51));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/centro_salud.png"))); // NOI18N
        jButton11.setText("CENTROS DE SALUD     ");
        jButton11.setActionCommand("CENTROS DE SALUD     ");
        jButton11.setAlignmentY(0.0F);
        jButton11.setAutoscrolls(true);
        jButton11.setBorder(null);
        jButton11.setContentAreaFilled(false);
        jButton11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        menu.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 220, 30));

        jButton12.setBackground(new java.awt.Color(0, 204, 204));
        jButton12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(51, 51, 51));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/insec.png"))); // NOI18N
        jButton12.setText("INSECTICIDAS     ");
        jButton12.setAlignmentY(0.0F);
        jButton12.setAutoscrolls(true);
        jButton12.setBorder(null);
        jButton12.setContentAreaFilled(false);
        jButton12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        menu.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 220, 30));

        jButton13.setBackground(new java.awt.Color(0, 204, 204));
        jButton13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(51, 51, 51));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/form.png"))); // NOI18N
        jButton13.setText("FORMULARIOS     ");
        jButton13.setAlignmentY(0.0F);
        jButton13.setAutoscrolls(true);
        jButton13.setBorder(null);
        jButton13.setContentAreaFilled(false);
        jButton13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        menu.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 220, 30));

        jButton15.setBackground(new java.awt.Color(0, 204, 204));
        jButton15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(51, 51, 51));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/diario.png"))); // NOI18N
        jButton15.setText("REPORTE DIARIO     ");
        jButton15.setAlignmentY(0.0F);
        jButton15.setAutoscrolls(true);
        jButton15.setBorder(null);
        jButton15.setContentAreaFilled(false);
        jButton15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        menu.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 210, 30));

        jButton16.setBackground(new java.awt.Color(0, 204, 204));
        jButton16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(51, 51, 51));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mensual.png"))); // NOI18N
        jButton16.setText("REPORTE MENSUAL     ");
        jButton16.setAlignmentY(0.0F);
        jButton16.setAutoscrolls(true);
        jButton16.setBorder(null);
        jButton16.setContentAreaFilled(false);
        jButton16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        menu.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 220, 30));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu.png"))); // NOI18N
        jButton4.setAlignmentY(0.0F);
        jButton4.setAutoscrolls(true);
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        menu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 50, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DashBoard ");
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        panelRound2.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 670));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.CardLayout());

        panel_rmensual.setBackground(new java.awt.Color(255, 255, 255));
        panel_rmensual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 153, 153));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("PANEL_MENSUAL");
        panel_rmensual.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, -1, -1));

        jPanel1.add(panel_rmensual, "card2");

        panel_usuario.setBackground(new java.awt.Color(255, 255, 255));
        panel_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("PANEL_USUARIO");
        panel_usuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        jPanel1.add(panel_usuario, "card2");

        panel_centros.setBackground(new java.awt.Color(255, 255, 255));
        panel_centros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(102, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("PANEL_CENTROS");
        panel_centros.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        jPanel1.add(panel_centros, "card2");

        panel_viviendas.setBackground(new java.awt.Color(255, 255, 255));
        panel_viviendas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dirVivienda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dirVivienda.setForeground(new java.awt.Color(102, 102, 102));
        dirVivienda.setText("Dirección: ");
        panel_viviendas.add(dirVivienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        tabla_viviendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_viviendas);

        panel_viviendas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 760, 240));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("VIVIENDAS");
        panel_viviendas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        n_vivienda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        n_vivienda.setForeground(new java.awt.Color(102, 102, 102));
        n_vivienda.setText("Número de Vivienda:");
        panel_viviendas.add(n_vivienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jefe_familia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jefe_familia.setForeground(new java.awt.Color(102, 102, 102));
        jefe_familia.setText("Jefe de Familia:");
        panel_viviendas.add(jefe_familia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        n_habitaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        n_habitaciones.setForeground(new java.awt.Color(102, 102, 102));
        n_habitaciones.setText("Número de Habitaciones:");
        panel_viviendas.add(n_habitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        telVivienda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telVivienda.setForeground(new java.awt.Color(102, 102, 102));
        telVivienda.setText("Tel/Cel de Referencia:");
        panel_viviendas.add(telVivienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panel_viviendas.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 160, -1));
        panel_viviendas.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 550, -1));
        panel_viviendas.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 520, -1));
        panel_viviendas.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 160, -1));
        panel_viviendas.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 550, -1));

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("NUEVO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel_viviendas.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 90, 30));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("NUEVO");
        panel_viviendas.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 90, 30));

        jPanel1.add(panel_viviendas, "card2");

        panel_brigadas.setBackground(new java.awt.Color(255, 255, 255));
        panel_brigadas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("PANEL_BRIGADAS");
        panel_brigadas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        jPanel1.add(panel_brigadas, "card2");

        panel_insecticidas.setBackground(new java.awt.Color(255, 255, 255));
        panel_insecticidas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("PANEL_INSEC");
        panel_insecticidas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        jPanel1.add(panel_insecticidas, "card2");

        panel_formularios.setBackground(new java.awt.Color(255, 255, 255));
        panel_formularios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("PANEL_FORMUALIO");
        panel_formularios.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, -1, -1));

        jPanel1.add(panel_formularios, "card2");

        panel_rdiario.setBackground(new java.awt.Color(255, 255, 255));
        panel_rdiario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("PANEL_DIARIO");
        panel_rdiario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, -1, -1));

        jPanel1.add(panel_rdiario, "card2");

        panelRound2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1050, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 1081, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        JButton[] btns = {jButton4,jButton16,jButton8,jButton10,jButton11,jButton12,jButton13,jButton15};
        //JPanel[] pnl = {panel_brigadas,panel_centros,panel_formularios,panel_insecticidas,panel_rdiario,panel_rmensual,panel_viviendas};
        gestionarBtn(jButton9,btns );
        gestionarBtnOpaque( btns);
        JPanel[] pnl = {panel_brigadas,panel_centros,panel_formularios,panel_insecticidas,panel_rdiario,panel_rmensual,panel_viviendas};
        moverMenu.gestionarPnl(panel_usuario, pnl);
        moverMenu.realizarMov(menu);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        JButton[] btns = {jButton4,jButton16,jButton9,jButton10,jButton11,jButton12,jButton13,jButton15};
        gestionarBtn(jButton8,btns );
        gestionarBtnOpaque( btns);
        JPanel[] pnl = {panel_brigadas,panel_usuario,panel_formularios,panel_insecticidas,panel_rdiario,panel_rmensual,panel_centros};
        moverMenu.gestionarPnl(panel_viviendas, pnl);
        moverMenu.realizarMov(menu);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       JButton[] btns = {jButton4,jButton16,jButton9,jButton8,jButton11,jButton12,jButton13,jButton15};
        gestionarBtn(jButton10,btns );
        gestionarBtnOpaque( btns);
        JPanel[] pnl = {panel_centros,panel_usuario,panel_formularios,panel_insecticidas,panel_rdiario,panel_rmensual,panel_viviendas};
        moverMenu.gestionarPnl(panel_brigadas, pnl);
        moverMenu.realizarMov(menu);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        JButton[] btns = {jButton4,jButton16,jButton8,jButton10,jButton9,jButton12,jButton13,jButton15};
        gestionarBtn(jButton11,btns );
        gestionarBtnOpaque( btns);
        JPanel[] pnl = {panel_brigadas,panel_usuario,panel_formularios,panel_insecticidas,panel_rdiario,panel_rmensual,panel_viviendas};
        moverMenu.gestionarPnl(panel_centros, pnl);
        moverMenu.realizarMov(menu);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        JButton[] btns = {jButton4,jButton16,jButton8,jButton10,jButton9,jButton11,jButton13,jButton15};
        gestionarBtn(jButton12,btns );
        gestionarBtnOpaque( btns);
        JPanel[] pnl = {panel_brigadas,panel_usuario,panel_formularios,panel_centros,panel_rdiario,panel_rmensual,panel_viviendas};
        moverMenu.gestionarPnl(panel_rdiario, pnl);
        moverMenu.realizarMov(menu);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        JButton[] btns = {jButton4,jButton16,jButton8,jButton10,jButton9,jButton11,jButton12,jButton15};
        gestionarBtn(jButton13,btns );
        gestionarBtnOpaque( btns);
        JPanel[] pnl = {panel_brigadas,panel_usuario,panel_centros,panel_insecticidas,panel_rdiario,panel_rmensual,panel_viviendas};
        moverMenu.gestionarPnl(panel_formularios, pnl);
        moverMenu.realizarMov(menu);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        JButton[] btns = {jButton4,jButton16,jButton8,jButton10,jButton9,jButton11,jButton12,jButton13};
        gestionarBtn(jButton15,btns );
        gestionarBtnOpaque( btns);
        JPanel[] pnl = {panel_brigadas,panel_usuario,panel_formularios,panel_insecticidas,panel_centros,panel_rmensual,panel_viviendas};
        moverMenu.gestionarPnl(panel_rdiario, pnl);
        moverMenu.realizarMov(menu);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        JButton[] btns = {jButton4,jButton8,jButton10,jButton9,jButton11,jButton12,jButton13,jButton15};
        gestionarBtn(jButton16,btns );
        gestionarBtnOpaque( btns);
        JPanel[] pnl = {panel_brigadas,panel_usuario,panel_formularios,panel_insecticidas,panel_rdiario,panel_centros,panel_viviendas};
        moverMenu.gestionarPnl(panel_rmensual, pnl);
        moverMenu.realizarMov(menu);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (menu.getX() == 0) {
            desplace.desplazarIzquierda(menu, menu.getX(), -170, 10, 10);
        } else if (menu.getX() == -170) {
            desplace.desplazarDerecha(menu, menu.getX(), 0, 10, 10);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    
    public static void gestionarBtn(JButton btn,JButton[] arr) {
        btn.setBackground(Color.WHITE);
        btn.setForeground(Color.BLACK);
        btn.setOpaque(true);

        for (int i = 0; i < arr.length; i++) {
            arr[i].setBackground(new java.awt.Color(0, 204, 204));
            arr[i].setForeground(new java.awt.Color(51, 51, 51));
            arr[i].setOpaque(true);
        }
    }
    
    public static void gestionarBtnOpaque(JButton[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].setOpaque(false);
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dirVivienda;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel jefe_familia;
    private interfaces.PanelRound menu;
    private javax.swing.JLabel n_habitaciones;
    private javax.swing.JLabel n_vivienda;
    private interfaces.PanelRound panelRound2;
    private javax.swing.JPanel panel_brigadas;
    private javax.swing.JPanel panel_centros;
    private javax.swing.JPanel panel_formularios;
    private javax.swing.JPanel panel_insecticidas;
    private javax.swing.JPanel panel_rdiario;
    private javax.swing.JPanel panel_rmensual;
    private javax.swing.JPanel panel_usuario;
    private javax.swing.JPanel panel_viviendas;
    private javax.swing.JTable tabla_viviendas;
    private javax.swing.JLabel telVivienda;
    // End of variables declaration//GEN-END:variables
}

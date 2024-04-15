/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.launcher;

import javax.swing.JOptionPane;


/**
 *
 *
 */
public class Launcher extends javax.swing.JFrame {

    /**
     * Creates new form Launcher
     */
    public Launcher() {
        initComponents();
        
        //Pantalla completa
        this.setExtendedState(MAXIMIZED_BOTH);
        //Llamada al método para pintar JLabel del controlador(Utilities)
        Utilities.SetImageLabel(bgBase, "src/com/images/FondoBase.png");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabpaneles = new javax.swing.JTabbedPane();
        tabpanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabpanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tabpanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tabpanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tabpanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tabpanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tabpanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tabpanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tabpanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tabpanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tabpanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tabpanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tabpanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tabpanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tabpanel15 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        JPanelEscudos = new javax.swing.JPanel();
        Escudo1 = new javax.swing.JLabel();
        Escudo2 = new javax.swing.JLabel();
        Escudo3 = new javax.swing.JLabel();
        Escudo4 = new javax.swing.JLabel();
        Escudo5 = new javax.swing.JLabel();
        Escudo6 = new javax.swing.JLabel();
        Escudo7 = new javax.swing.JLabel();
        Escudo8 = new javax.swing.JLabel();
        Escudo9 = new javax.swing.JLabel();
        Escudo10 = new javax.swing.JLabel();
        Escudo11 = new javax.swing.JLabel();
        Escudo12 = new javax.swing.JLabel();
        Escudo13 = new javax.swing.JLabel();
        Escudo14 = new javax.swing.JLabel();
        bgBase = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabpaneles.setOpaque(true);

        tabpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Pantalla Bienvenida");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tabpanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 430, 160));

        tabpaneles.addTab("", tabpanel1);

        tabpanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Simulador 1");
        tabpanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel2);

        tabpanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Simulador 2");
        tabpanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel3);

        tabpanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Simulador 3");
        tabpanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel4);

        tabpanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("Simulador 4");
        tabpanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel5);

        tabpanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("Simulador 5");
        tabpanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel6);

        tabpanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setText("Simulador 6");
        tabpanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel7);

        tabpanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setText("Simulador 7");
        tabpanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel8);

        tabpanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setText("Simulador 8");
        tabpanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel9);

        tabpanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setText("Simulador 9");
        tabpanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel10);

        tabpanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel11.setText("Simulador 10");
        tabpanel11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel11);

        tabpanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel12.setText("Simulador 11");
        tabpanel12.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel12);

        tabpanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel13.setText("Simulador 12");
        tabpanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel13);

        tabpanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel14.setText("Simulador 13");
        tabpanel14.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel14);

        tabpanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel16.setText("Simulador 14");
        tabpanel15.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 80));

        tabpaneles.addTab("", tabpanel15);

        getContentPane().add(tabpaneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 1550, 880));

        JPanelEscudos.setBackground(new java.awt.Color(102, 153, 255));
        JPanelEscudos.setOpaque(false);
        JPanelEscudos.setLayout(new java.awt.GridBagLayout());

        Escudo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton8.png"))); // NOI18N
        Escudo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo1.setFocusable(false);
        Escudo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo1MouseEntered(evt);
            }
        });
        JPanelEscudos.add(Escudo1, new java.awt.GridBagConstraints());

        Escudo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton0.png"))); // NOI18N
        Escudo2.setText(" ");
        Escudo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo2MouseEntered(evt);
            }
        });
        JPanelEscudos.add(Escudo2, new java.awt.GridBagConstraints());

        Escudo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton1.png"))); // NOI18N
        Escudo3.setText(" ");
        Escudo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo3MouseClicked(evt);
            }
        });
        JPanelEscudos.add(Escudo3, new java.awt.GridBagConstraints());

        Escudo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton2.png"))); // NOI18N
        Escudo4.setText(" ");
        Escudo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo4MouseClicked(evt);
            }
        });
        JPanelEscudos.add(Escudo4, new java.awt.GridBagConstraints());

        Escudo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton3.png"))); // NOI18N
        Escudo5.setText(" ");
        Escudo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo5MouseClicked(evt);
            }
        });
        JPanelEscudos.add(Escudo5, new java.awt.GridBagConstraints());

        Escudo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton4.png"))); // NOI18N
        Escudo6.setText(" ");
        Escudo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo6MouseClicked(evt);
            }
        });
        JPanelEscudos.add(Escudo6, new java.awt.GridBagConstraints());

        Escudo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton5.png"))); // NOI18N
        Escudo7.setText(" ");
        Escudo7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo7MouseClicked(evt);
            }
        });
        JPanelEscudos.add(Escudo7, new java.awt.GridBagConstraints());

        Escudo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton6.png"))); // NOI18N
        Escudo8.setText(" ");
        Escudo8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo8MouseClicked(evt);
            }
        });
        JPanelEscudos.add(Escudo8, new java.awt.GridBagConstraints());

        Escudo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton7.png"))); // NOI18N
        Escudo9.setText(" ");
        Escudo9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo9MouseClicked(evt);
            }
        });
        JPanelEscudos.add(Escudo9, new java.awt.GridBagConstraints());

        Escudo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton13.png"))); // NOI18N
        Escudo10.setText(" ");
        Escudo10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo10MouseClicked(evt);
            }
        });
        JPanelEscudos.add(Escudo10, new java.awt.GridBagConstraints());

        Escudo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton9.png"))); // NOI18N
        Escudo11.setText(" ");
        Escudo11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo11MouseClicked(evt);
            }
        });
        JPanelEscudos.add(Escudo11, new java.awt.GridBagConstraints());

        Escudo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton10.png"))); // NOI18N
        Escudo12.setText(" ");
        Escudo12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo12MouseClicked(evt);
            }
        });
        JPanelEscudos.add(Escudo12, new java.awt.GridBagConstraints());

        Escudo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton11.png"))); // NOI18N
        Escudo13.setText(" ");
        Escudo13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo13MouseClicked(evt);
            }
        });
        JPanelEscudos.add(Escudo13, new java.awt.GridBagConstraints());

        Escudo14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Escudos/LauncherButton12.png"))); // NOI18N
        Escudo14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo14MouseClicked(evt);
            }
        });
        JPanelEscudos.add(Escudo14, new java.awt.GridBagConstraints());

        getContentPane().add(JPanelEscudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 1550, 130));

        bgBase.setBackground(new java.awt.Color(255, 255, 255));
        bgBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/FondoBase.png"))); // NOI18N
        bgBase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgBaseMouseClicked(evt);
            }
        });
        getContentPane().add(bgBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        jLabel15.setBackground(new java.awt.Color(255, 153, 153));
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 100, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Escudo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo1MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Escudo1MouseEntered

    private void Escudo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo1MouseClicked
        // TODO add your handling code here:
        // JOptionPane.showMessageDialog(null, "Cuidado, esto es una advertencia", "Advertencia", JOptionPane.WARNING_MESSAGE); //manda un mensaje de advertencia al pulsar click en el primer escudo
         tabpaneles.setSelectedIndex(1);
    }//GEN-LAST:event_Escudo1MouseClicked

    private void Escudo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo2MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Escudo2MouseEntered

    private void Escudo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo2MouseClicked
        // TODO add your handling code here:
        tabpaneles.setSelectedIndex(2);
    }//GEN-LAST:event_Escudo2MouseClicked

    private void Escudo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo3MouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(3);
    }//GEN-LAST:event_Escudo3MouseClicked

    private void Escudo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo4MouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(4);
    }//GEN-LAST:event_Escudo4MouseClicked

    private void Escudo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo5MouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(5);
    }//GEN-LAST:event_Escudo5MouseClicked

    private void Escudo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo6MouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(6);
    }//GEN-LAST:event_Escudo6MouseClicked

    private void Escudo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo7MouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(7);
    }//GEN-LAST:event_Escudo7MouseClicked

    private void Escudo8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo8MouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(8);
    }//GEN-LAST:event_Escudo8MouseClicked

    private void Escudo9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo9MouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(9);
    }//GEN-LAST:event_Escudo9MouseClicked

    private void Escudo10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo10MouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(10);
    }//GEN-LAST:event_Escudo10MouseClicked

    private void Escudo11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo11MouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(11);
    }//GEN-LAST:event_Escudo11MouseClicked

    private void Escudo12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo12MouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(12);
    }//GEN-LAST:event_Escudo12MouseClicked

    private void Escudo13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo13MouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(13);
    }//GEN-LAST:event_Escudo13MouseClicked

    private void Escudo14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo14MouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(14);
    }//GEN-LAST:event_Escudo14MouseClicked

    private void bgBaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgBaseMouseClicked
        // TODO add your handling code here:
         tabpaneles.setSelectedIndex(0);
    }//GEN-LAST:event_bgBaseMouseClicked

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
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launcher().setVisible(true);
             
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Escudo1;
    private javax.swing.JLabel Escudo10;
    private javax.swing.JLabel Escudo11;
    private javax.swing.JLabel Escudo12;
    private javax.swing.JLabel Escudo13;
    private javax.swing.JLabel Escudo14;
    private javax.swing.JLabel Escudo2;
    private javax.swing.JLabel Escudo3;
    private javax.swing.JLabel Escudo4;
    private javax.swing.JLabel Escudo5;
    private javax.swing.JLabel Escudo6;
    private javax.swing.JLabel Escudo7;
    private javax.swing.JLabel Escudo8;
    private javax.swing.JLabel Escudo9;
    private javax.swing.JPanel JPanelEscudos;
    private javax.swing.JLabel bgBase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel tabpanel1;
    private javax.swing.JPanel tabpanel10;
    private javax.swing.JPanel tabpanel11;
    private javax.swing.JPanel tabpanel12;
    private javax.swing.JPanel tabpanel13;
    private javax.swing.JPanel tabpanel14;
    private javax.swing.JPanel tabpanel15;
    private javax.swing.JPanel tabpanel2;
    private javax.swing.JPanel tabpanel3;
    private javax.swing.JPanel tabpanel4;
    private javax.swing.JPanel tabpanel5;
    private javax.swing.JPanel tabpanel6;
    private javax.swing.JPanel tabpanel7;
    private javax.swing.JPanel tabpanel8;
    private javax.swing.JPanel tabpanel9;
    private javax.swing.JTabbedPane tabpaneles;
    // End of variables declaration//GEN-END:variables

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.login.view;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

/**
 *
 * @author isabe
 */
public class TelaTemperatura extends javax.swing.JFrame {

    /**
     * Creates new form TelaTemperatura
     */
    public TelaTemperatura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelGrandezas = new javax.swing.JComboBox<>();
        ButtonGerResul = new javax.swing.JButton();
        TempTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ResulBox = new javax.swing.JTextField();
        ButtonLimp = new javax.swing.JButton();
        butvoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        saibamais = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FísicaProgramada.ConversorTemperatura");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SelGrandezas.setForeground(new java.awt.Color(255, 255, 255));
        SelGrandezas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C - F", "F - C", "K - C", "C - K", "F - K", "K - F" }));
        SelGrandezas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SelGrandezasKeyPressed(evt);
            }
        });
        getContentPane().add(SelGrandezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 230, 20));

        ButtonGerResul.setBackground(new java.awt.Color(0, 0, 0));
        ButtonGerResul.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ButtonGerResul.setForeground(new java.awt.Color(255, 255, 255));
        ButtonGerResul.setText("GERAR RESULTADO");
        ButtonGerResul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonGerResul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGerResulActionPerformed(evt);
            }
        });
        ButtonGerResul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonGerResulKeyPressed(evt);
            }
        });
        getContentPane().add(ButtonGerResul, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 160, 40));

        TempTxt.setBackground(new java.awt.Color(204, 204, 204));
        TempTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TempTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TempTxtKeyPressed(evt);
            }
        });
        getContentPane().add(TempTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 260, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Resultado: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 130, 30));

        ResulBox.setBackground(new java.awt.Color(204, 204, 204));
        ResulBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(ResulBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 150, -1));

        ButtonLimp.setBackground(new java.awt.Color(0, 0, 0));
        ButtonLimp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ButtonLimp.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLimp.setText("LIMPAR");
        ButtonLimp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimpActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLimp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 90, 40));

        butvoltar.setBackground(new java.awt.Color(0, 0, 0));
        butvoltar.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        butvoltar.setForeground(new java.awt.Color(255, 255, 255));
        butvoltar.setText("VOLTAR");
        butvoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butvoltarActionPerformed(evt);
            }
        });
        getContentPane().add(butvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/POO. Telas - 2 (3).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));

        jMenu4.add(jSeparator1);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-menu-arredondado-16.png"))); // NOI18N
        jMenu5.setText("Menu");
        jMenu5.add(jSeparator2);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-saída-de-emergência-24.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);
        jMenu5.add(jSeparator3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-visão-diurna-24.png"))); // NOI18N
        jMenu2.setText("Ir Para:");

        jMenuItem3.setText("Velocidade Média");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Temperatura");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Pesos em Astros");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenu5.add(jMenu2);

        saibamais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-decisão-24.png"))); // NOI18N
        saibamais.setText("Saiba mais");
        saibamais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saibamaisActionPerformed(evt);
            }
        });
        jMenu5.add(saibamais);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonGerResulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGerResulActionPerformed
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String box1 = (String)SelGrandezas.getSelectedItem();
     if(box1.equals("C - F")){
                double C = Double.parseDouble(TempTxt.getText());
              double F = (double)(C * 1.8 + 32);
                 ResulBox.setText(decimalFormat.format(F)+" °F");
           }
           else if(box1.equals("F - C")){
                double f = Double.parseDouble(TempTxt.getText());
              double c = (double)((f - 32) * 5/9);
                 ResulBox.setText(decimalFormat.format(c)+" °C");
           }
            else if(box1.equals("K - C")){
                double K = Double.parseDouble(TempTxt.getText());
              double c1 = (double)(K - 273.15);
                 ResulBox.setText(decimalFormat.format(c1)+" °C");
           }
           else if(box1.equals("C - K")){
                double C2 = Double.parseDouble(TempTxt.getText());
              double K1 = (double)(C2 + 273.15);
              
              if(K1<0)
                 ResulBox.setText(0 +" K");
              else 
                 ResulBox.setText(decimalFormat.format(K1)+" K");
           }
           else if(box1.equals("F - K")){
                double F2 = Double.parseDouble(TempTxt.getText());
              double K2 = (double)((F2 - 32) * 5/9 + 273.15);
              
              if(K2<0)
                 ResulBox.setText(0 +" K");
              else 
                   ResulBox.setText(decimalFormat.format(K2)+" K");
           }
           else if (box1.equals("K - F")){
                double K3 = Double.parseDouble(TempTxt.getText());
              double F3 = (double)((K3 - 273.15) * 9/5 + 32);
                 ResulBox.setText(decimalFormat.format(F3)+" °F");
           }
             
               
    }//GEN-LAST:event_ButtonGerResulActionPerformed

    private void ButtonLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimpActionPerformed
       TempTxt.setText("");
       ResulBox.setText("");
    }//GEN-LAST:event_ButtonLimpActionPerformed

    private void butvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butvoltarActionPerformed
         TelaSelecionar telasel = new TelaSelecionar();
        telasel.setVisible(true);
        dispose();
    }//GEN-LAST:event_butvoltarActionPerformed

    private void SelGrandezasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SelGrandezasKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        TempTxt.requestFocus();
       }
    }//GEN-LAST:event_SelGrandezasKeyPressed

    private void ButtonGerResulKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonGerResulKeyPressed
  
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String box1 = (String)SelGrandezas.getSelectedItem();
     if(box1.equals("C - F")){
                double C = Double.parseDouble(TempTxt.getText());
              double F = (double)(C * 1.8 + 32);
                 ResulBox.setText(decimalFormat.format(F)+" °F");
           }
           else if(box1.equals("F - C")){
                double f = Double.parseDouble(TempTxt.getText());
              double c = (double)((f - 32) * 5/9);
                 ResulBox.setText(decimalFormat.format(c)+" °C");
           }
            else if(box1.equals("K - C")){
                double K = Double.parseDouble(TempTxt.getText());
              double c1 = (double)(K - 273.15);
                 ResulBox.setText(decimalFormat.format(c1)+" °C");
           }
           else if(box1.equals("C - K")){
                double C2 = Double.parseDouble(TempTxt.getText());
              double K1 = (double)(C2 + 273.15);
              
              if(K1<0)
                 ResulBox.setText(0 +" K");
              else 
                 ResulBox.setText(decimalFormat.format(K1)+" K");
           }
           else if(box1.equals("F - K")){
                double F2 = Double.parseDouble(TempTxt.getText());
              double K2 = (double)((F2 - 32) * 5/9 + 273.15);
              
              if(K2<0)
                 ResulBox.setText(0 +" K");
              else 
                   ResulBox.setText(decimalFormat.format(K2)+" K");
           }
           else if (box1.equals("K - F")){
                double K3 = Double.parseDouble(TempTxt.getText());
              double F3 = (double)((K3 - 273.15) * 9/5 + 32);
                 ResulBox.setText(decimalFormat.format(F3)+" °F");
           }
             
    }//GEN-LAST:event_ButtonGerResulKeyPressed

    private void TempTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TempTxtKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        ButtonGerResul.requestFocus();
         }
    }//GEN-LAST:event_TempTxtKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaAgradecimento agrad = new TelaAgradecimento();
        agrad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaVelocidadeMedia1 sel = new TelaVelocidadeMedia1();
        sel.setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaTemperatura sel = new TelaTemperatura ();
        sel.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        TelaPesoPlanetas sel = new TelaPesoPlanetas();
        sel.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void saibamaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saibamaisActionPerformed
        SaibaMais2 sel = new SaibaMais2 ();
        sel.setVisible(true);
        dispose();
    }//GEN-LAST:event_saibamaisActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTemperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGerResul;
    private javax.swing.JButton ButtonLimp;
    private javax.swing.JTextField ResulBox;
    private javax.swing.JComboBox<String> SelGrandezas;
    private javax.swing.JTextField TempTxt;
    private javax.swing.JButton butvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem saibamais;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.login.view;

import br.com.login.controller.LoginController;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Alunos
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    public LoginView() {
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

        jTextFieldLogin = new javax.swing.JTextField();
        SenhaButton = new javax.swing.JPasswordField();
        jButtonEntrar1 = new javax.swing.JButton();
        jButtonRealizarCadastro = new javax.swing.JButton();
        jButton1Voltar = new javax.swing.JButton();
        jLabel1Voltar = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FísicaProgramada.Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldLogin.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldLogin.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldLogin.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });
        jTextFieldLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLoginKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 220, 30));

        SenhaButton.setBackground(new java.awt.Color(204, 204, 204));
        SenhaButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(SenhaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 220, 30));

        jButtonEntrar1.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEntrar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonEntrar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar1.setText(" ENTRAR");
        jButtonEntrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 130, 30));

        jButtonRealizarCadastro.setBackground(new java.awt.Color(0, 0, 0));
        jButtonRealizarCadastro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonRealizarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRealizarCadastro.setText("CADASTRE-SE ");
        jButtonRealizarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRealizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 160, 30));

        jButton1Voltar.setBackground(new java.awt.Color(0, 0, 0));
        jButton1Voltar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1Voltar.setForeground(new java.awt.Color(255, 255, 255));
        jButton1Voltar.setText("VOLTAR");
        jButton1Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 130, 30));

        jLabel1Voltar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Tela de Login.png"))); // NOI18N
        getContentPane().add(jLabel1Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(32, 32, 32));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setEnabled(false);
        jMenuBar1.setFocusable(false);
        jMenuBar1.setRequestFocusEnabled(false);
        jMenuBar1.setVerifyInputWhenFocusTarget(false);

        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-menu-arredondado-16.png"))); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenu2.setText("Menu");
        jMenu2.add(jSeparator2);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-saída-de-emergência-24.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator3);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-decisão-24.png"))); // NOI18N
        jMenuItem2.setText("Saiba mais");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jButtonRealizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarCadastroActionPerformed
        CadastroView telaDeCadastro = new CadastroView();
        telaDeCadastro.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButtonRealizarCadastroActionPerformed

    private void jButtonEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrar1ActionPerformed

        if(jTextFieldLogin.getText().matches("") || SenhaButton.getText().matches("")){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
        } else {
            this.dispose();
            try{
           LoginController login = new LoginController();
           login.loginUsuario(this);
           
            
       } catch (SQLException sql) {
     
       }
            
       
        }
    
    }//GEN-LAST:event_jButtonEntrar1ActionPerformed

    private void jButton1VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1VoltarActionPerformed
        TelaInicial volta = new TelaInicial();
        volta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1VoltarActionPerformed

    private void jTextFieldLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLoginKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        SenhaButton.requestFocus();
       }
    }//GEN-LAST:event_jTextFieldLoginKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaSaibaMais saiba = new TelaSaibaMais();
        saiba.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    
    public JPasswordField getjPasswordFieldSenha() {
        return SenhaButton;
    }

    public void setjPasswordFieldSenha(JPasswordField jPasswordFieldSenha) {
        this.SenhaButton = jPasswordFieldSenha;
    }

    public JTextField getjTextFieldLogin() {
        return jTextFieldLogin;
    }

    /**
     * @param args the command line arguments
     */
    public void setjTextFieldLogin(JTextField jTextFieldLogin) {
        this.jTextFieldLogin = jTextFieldLogin;
    }

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField SenhaButton;
    private javax.swing.JButton jButton1Voltar;
    private javax.swing.JButton jButtonEntrar1;
    private javax.swing.JButton jButtonRealizarCadastro;
    private javax.swing.JLabel jLabel1Voltar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
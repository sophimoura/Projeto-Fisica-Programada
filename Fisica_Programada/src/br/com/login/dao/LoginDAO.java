/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.dao;

import br.com.login.view.LoginView;
import br.com.login.view.TelaSelecionar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class LoginDAO {
    
    public void cadastrarUusuario(String nome, String email, String senha) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "INSERT INTO login (nome, email, senha) VALUES ('"+nome+"','"+email+"','"+senha+"')";
        System.out.println(sql);
        PreparedStatement statment = conexao.prepareStatement(sql); 
        statment.execute();
        conexao.close();
    }
    
    public void login(String nome, String senha) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT nome, senha FROM login WHERE nome = '"+nome+"'AND senha = '"+senha+"'";
        System.out.println(sql);
        PreparedStatement statment = conexao.prepareStatement(sql);
        ResultSet rs = statment.executeQuery();
        
        if (rs.next()) {
           TelaSelecionar sel = new TelaSelecionar();
           sel.setVisible(true);
            
        }else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos. Confira se o casdastro foi realmente efetuado.");
            LoginView login = new LoginView();
        login.setVisible(true);
        
        }
        
        conexao.close();
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

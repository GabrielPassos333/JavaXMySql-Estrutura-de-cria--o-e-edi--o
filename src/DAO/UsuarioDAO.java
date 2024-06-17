package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Usuario;

public class UsuarioDAO {

  /**
   * Método para cadastrar um usuário no banco de dados
   * @param usuario - objeto do tipo Usuario, com nome, login, senha e email
   */
  public void cadastrarUsuario(Usuario usuario) {
   
    String sql = "INSERT INTO usuario (nome, login, senha, email) VALUES (?, ?, ?, ?)";
  
    Connection conexao = null;
    PreparedStatement ps = null;

    try {
      conexao = Conexao.getConexao();
      ps = conexao.prepareStatement(sql);
      ps.setString(1, usuario.getNome()); // 1 é a posição do ?
      ps.setString(2, usuario.getLogin());
      ps.setString(3, usuario.getSenha());
      ps.setString(4, usuario.getEmail());
      
      ps.execute();// executa o comando sql
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (ps != null) ps.close();
        if (conexao != null) conexao.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
  //--------------------------------------------
  /**
   * Método para listar todos os usuários cadastrados no banco de dados
   */
  public void listarUsuarios() {
    String sql = "SELECT * FROM usuario";
    Connection conexao = null;
    PreparedStatement ps = null;
    ResultSet rs = null; // ResultSet é um objeto que contém os resultados da consulta SQL

    try {
        conexao = Conexao.getConexao();
        ps = conexao.prepareStatement(sql);
        rs = ps.executeQuery(); // Use executeQuery para consultas que retornam dados

        while (rs.next()) { //next() retorna true se houver mais linhas na tabela
            //int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String login = rs.getString("login");
            String senha = rs.getString("senha");
            String email = rs.getString("email");

            System.out.println("Nome: " + nome + ", Email: " + email + ", Login: " + login + ", Senha: " + senha);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // É importante fechar os recursos na ordem inversa de sua abertura
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conexao != null) conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  }

  //--------------------------------------------
  /**
   * Método para deletar um usuário do banco de dados
   * @param id - id do usuário a ser deletado
   */
  public void deletarUsuario(int id) {
    String sql = "DELETE FROM usuario WHERE id = ?";
    Connection conexao = null;
    PreparedStatement ps = null;

    try {
        conexao = Conexao.getConexao();
        ps = conexao.prepareStatement(sql);
        ps.setInt(1, id);
        int rowsAffected = ps.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println("Usuário deletado com sucesso!");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (ps != null) ps.close();
            if (conexao != null) conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
      }
    }
}

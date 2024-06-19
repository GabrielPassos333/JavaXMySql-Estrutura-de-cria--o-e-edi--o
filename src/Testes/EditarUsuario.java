package Testes;

import DAO.UsuarioDAO;
import entity.Usuario;

public class EditarUsuario {
  public static void main(String[] args) {

    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Usuario usuario = new Usuario();
    // Cria uma instância de Usuario com os dados que deseja atualizar

    usuario.setCodigo(14); // Supondo que o ID do usuário que você deseja editar é 14
    usuario.setNome("Neww");
    usuario.setLogin("NewLogin");
    usuario.setSenha("Sengaaaa");
    usuario.setEmail("novoemail@UwU.com");

    usuarioDAO.editarUsuario(usuario);
    // Cria uma instância de UsuarioDAO para acessar o método editarUsuario
    
  }
}

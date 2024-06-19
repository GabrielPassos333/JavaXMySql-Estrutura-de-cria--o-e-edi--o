package Testes;

import DAO.UsuarioDAO;
import entity.Usuario;

public class GerenciarUsuarios {

    public static void main(String[] args) {
        GerenciarUsuarios gerenciador = new GerenciarUsuarios();
        gerenciador.editarUsuarioDemo();
    }

    public void editarUsuarioDemo() {
        // Cria uma instância de Usuario com os dados que deseja atualizar
        Usuario usuario = new Usuario();
        usuario.setCodigo(1); // Supondo que o ID do usuário que você deseja editar é 1
        usuario.setNome("Novo Nome");
        usuario.setLogin("novoLogin");
        usuario.setSenha("novaSenha");
        usuario.setEmail("novoemail@example.com");

        // Cria uma instância de UsuarioDAO para acessar o método editarUsuario
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.editarUsuario(usuario);
    }
}
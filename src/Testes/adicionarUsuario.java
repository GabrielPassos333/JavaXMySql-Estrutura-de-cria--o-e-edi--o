package Testes;

import DAO.UsuarioDAO;
import entity.Usuario;

public class adicionarUsuario {
    public static void main(String[] args) throws Exception {
        
        Usuario u = new Usuario();
        u.setNome("Trem");
        u.setLogin("Das 11");
        u.setSenha("ferr@rI");
        u.setEmail("carros@sa.com.br");

        new UsuarioDAO().cadastrarUsuario(u); //cadastra o usuário no banco de dados

    }
}

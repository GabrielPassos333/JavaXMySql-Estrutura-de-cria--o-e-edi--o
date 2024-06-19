package Testes;

import DAO.UsuarioDAO;
import entity.Usuario;

public class adicionarUsuario {
    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario();
        u.setNome("Nome do Usuario");
        u.setLogin("LoginUsuario");
        u.setSenha("senhasenha");
        u.setEmail("email@ra.com.br");

        //Pode ser feito dessa forma também
        //Usuario u = new Usuario("Vai", "que", "tremtrem", "email@email.com");
        new UsuarioDAO().cadastrarUsuario(u); //cadastra o usuário no banco de dados
    }
}

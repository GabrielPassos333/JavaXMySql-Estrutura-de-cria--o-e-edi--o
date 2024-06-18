package Testes;

import java.util.Scanner;


import DAO.UsuarioDAO;

public class DeletarUsuario {
    public static void main(String[] args) {
      //UsuarioDAO usuarioDAO = new UsuarioDAO();

      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite um número inteiro: ");
      if (scanner.hasNextInt()) {
        int numero = scanner.nextInt();
        
        new UsuarioDAO().deletarUsuario(numero);
    } else {
      System.out.println("Entrada inválida. O valor digitado não é um número inteiro.");
    }
    scanner.close();
  }
}

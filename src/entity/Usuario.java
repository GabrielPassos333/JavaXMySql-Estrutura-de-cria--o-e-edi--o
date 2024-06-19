package entity;

public class Usuario {

  private int codigo;
  private String nome;
  private String login;
  private String email;
  private String senha;

  // Novo construtor com todos os atributos
  public Usuario(String nome, String login, String senha, String email) {
    this.nome = nome;
    this.login = login;
    this.senha = senha;
    this.email = email;
}

  // Construtor vazio
  public Usuario() {
  }
  
  public int getCodigo() {
    return codigo;
  }
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }
}

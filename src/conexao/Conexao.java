package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

  private static String url = "jdbc:mysql://localhost:3306/exemplobd";
  private static String user = "root";
  private static String senha = "root";

  private static Connection conn;

  public static Connection getConexao() {
    try {
      if (conn == null) {
        //Class.forName("com.mysql.cj.jdbc.Driver"); //aqui foi criado um erro de compilação
        conn = DriverManager.getConnection(url, user, senha);
        return conn;
      }
      else {
        return conn;
      }
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}

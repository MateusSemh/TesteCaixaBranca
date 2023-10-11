package login;

/**
*
* Todos os imports necessários para realizar a conexão com o banco
*
*
* "java.sql.Connection" representa uma conexão com um banco de dados
* "java.sql.DriverManager" fornece métodos para registrar e obter drivers de banco de dados
* "java.sql.ResultSet" representa um conjunto de resultados de uma consulta SQL
* "java.sql.Statement" representa uma instrução SQL.
*
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Essa é uma classe que simula um usuário, todas as conexões com o banco e verificações.
 */
public class User {

    /**
     * 
     * Esse método é responsável por estabelecer uma conexão com o banco de dados MySQL
     * 
     */

    public Connection conectarBD() {
	    
/**
* Connection é a conexão com o banco de dados.
*/
	    
Connection conn = null;
        try {
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
        }
        return conn;
    }

    /**
     * Nome do usuário
     */

    public String nome = "";

    /**
     * Retorna true se o nome do usuário existir. Senão, continua false.
     */
    public boolean result = false;

    /**
     * Esse método verifica se um usuário com um login e senha fornecidos existe no banco de dados.
     * 
     *
     * @param login (String): O login do usuário a ser verificado.
     * @param senha (String): A senha do usuário a ser verificada.
     *
     * @return true se ambos forem compatíveis e false caso a combinação não exsita 
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        // INSTRUÇÃO SQL
        sql += "select nome from usuarios ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
        }

        return result;
    }
}

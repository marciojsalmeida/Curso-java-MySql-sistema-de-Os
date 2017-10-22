package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Marcio Almeida
 */
public class ModuloConexao {

    //metodo responsavel por estabelecer a conexao com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //a linha abaixo chama o driver 
        String driver = "org.mariadb.jdbc.Driver";
        // armazenando informações referente ao banco
        String url = "jdbc:mariadb://MARCIO-PC:3306/dbinfox";
        String user = "marcio";
        String password = "marcio";
        // Estabelecendo a conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            return null;
        }
    }
}

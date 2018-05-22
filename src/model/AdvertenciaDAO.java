
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe que contém os métodos de acesso ao Banco de Dados ExercitoDB
 * e os métodos de CRUD para advertencias
 * @author Guilherme Souto Cardoso
 * @since Classe criada em: 06/11/2017
 */

public class AdvertenciaDAO {
    
    static Connection conexao;
    static Statement stmt;
    static ResultSet rs;
    static String sql;
     
    //Método que estabelece a conexão com o Banco de Dados
    public static Connection getConnection() throws SQLException {
        Connection con;
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ExercitoDB?autoReconnect=true&useSSL=false", "root", "root");
        return con;
    }
    
    //Método para buscar o nome e a quantidade de advertências do soldado pelo código
    public static ResultSet buscarCodigoSoldadoAdvertencias(String codigoSoldado) throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "SELECT nomesoldado, total FROM advertencias WHERE codigosoldado = " + codigoSoldado;
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
    //Método para buscar todas as advertências dos soldados
    public static ResultSet buscarTodasAdvertencias() throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "SELECT nomesoldado, total FROM advertencias WHERE total >= 1 ORDER BY 2 DESC";
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
}

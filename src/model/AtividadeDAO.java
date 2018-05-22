
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Classe que contém os métodos de acesso ao Banco de Dados ExercitoDB
 * e os métodos de CRUD para atividades
 * @author Guilherme Souto Cardoso
 * @since Classe criada em: 31/10/2017
 */

public class AtividadeDAO {
    
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
    
    //Método para inserir uma nova Atividade na tabela atividades
    public static void inserirNovaAtividade(Atividade atividade) throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "INSERT INTO atividades VALUES ("
                + atividade.getCodigo() + ","
                + "'" + atividade.getMes() + "',"
                + atividade.isAulasTeoricas() + ","
                + atividade.isFlexoes() + ","
                + atividade.isAbdominais() + ","
                + atividade.isNatacao() + ","
                + atividade.isCorrida() + ","
                + atividade.isDefesaPessoal() + ","
                + atividade.isRastejarLama() + ","
                + atividade.isPraticaTiro() + ","
                + atividade.getCodigoSoldado() + ","
                + "'" + atividade.getNomeSoldado() + "')";
        
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Atividade inserida com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro!", "ERRO", JOptionPane.ERROR_MESSAGE);
    }
    
    //Método para buscar o Soldado pelo código
    public static ResultSet buscarCodigoSoldado(String codigoSoldado) throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "SELECT nome, caserna FROM soldados WHERE codigo = " + codigoSoldado;
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
    //Método para buscar todas as atividades cadastradas
    public static ResultSet buscarTodasAtividades() throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "SELECT * FROM atividades";
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
    //Método para contar uma advertência
    public static void alteraAtividadeAdvertencia(String codigoSoldado, int total) throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "UPDATE advertencias SET "
                + "total = " + total
                + " WHERE codigosoldado = " + codigoSoldado;
        stmt.executeUpdate(sql);
        
    }
    
    //Método para buscar a quantidade de advertências de um soldado
    public static ResultSet buscarAdvertencias(String codigoSoldado) throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "SELECT total FROM advertencias WHERE codigosoldado = " + codigoSoldado;
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
    //Método para buscar as atividades de prática de tiro
    public static ResultSet buscarPraticaTiro() throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "SELECT nomesoldado, mes, praticatiro FROM atividades ORDER BY nomesoldado ASC";
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
}

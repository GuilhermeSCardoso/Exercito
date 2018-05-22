
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Classe que contém os métodos de acesso ao Banco de Dados ExercitoDB
 * e os métodos de CRUD para soldados
 * @author Guilherme Souto Cardoso
 * @since Classe criada em: 19/09/2017
 */

public class SoldadoDAO {
    
    static Connection conexao;
    static Statement stmt;
    static ResultSet rs;
    static String sql, sql2, sql3;
     
    //Método que estabelece a conexão com o Banco de Dados
    public static Connection getConnection() throws SQLException {
        Connection con;
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ExercitoDB?autoReconnect=true&useSSL=false", "root", "root");
        return con;
    }
    
    //Método para inserir um novo Soldado na tabela soldados
    public static void inserirNovoSoldado(Soldado soldado) throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "INSERT INTO soldados VALUES ("
                + soldado.getCodigo() + ","
                + "'" + soldado.getNome() + "',"
                + "'" + soldado.getEndereco() + "',"
                + "'" + soldado.getMunicipio() + "',"
                + "'" + soldado.getCaserna() + "',"
                + "'" + soldado.getDataNascimento() + "',"
                + soldado.getIdade() + ","
                + soldado.getAltura() + ","
                + "'" + soldado.getSexo() + "')";
        
        if(stmt.executeUpdate(sql) > 0) 
            JOptionPane.showMessageDialog(null, "Soldado inserido com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro!", "ERRO", JOptionPane.ERROR_MESSAGE);
             
    }
    
    //Método para buscar o Soldado pelo código na alteração
    public static ResultSet buscarCodigoAlteraSoldado(String codigoSoldado) throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "SELECT * FROM soldados WHERE codigo = " + codigoSoldado;
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
    //Método para alterar os dados do Soldado
    public static void alterarSoldado(String codigoSoldado, Soldado soldado, Atividade atividade) throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "UPDATE soldados SET "
                + "nome = '" + soldado.getNome() + "',"
                + "endereco = '" + soldado.getEndereco() + "',"
                + "municipio = '" + soldado.getMunicipio() + "',"
                + "caserna = '" + soldado.getCaserna() + "',"
                + "nascimento = '" + soldado.getDataNascimento() + "',"
                + "idade = " + soldado.getIdade() + ","
                + "altura = " + soldado.getAltura() + ","
                + "sexo = '" + soldado.getSexo() + "'"
                + " WHERE codigo = '" + codigoSoldado + "'";
        
        sql2 = "UPDATE atividades SET nomesoldado = '"
                + atividade.getNomeSoldado() + "'"
                + " WHERE codigosoldado = '" + codigoSoldado + "'";
        stmt.executeUpdate(sql2);
        
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados do soldado alterados com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro!", "ERRO", JOptionPane.ERROR_MESSAGE);
    }
    
    //Método para excluir um Soldado
    public static void excluirSoldado(String codigoSoldado) throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "DELETE FROM soldados WHERE codigo = " + codigoSoldado;
        sql2 = "DELETE FROM atividades WHERE codigosoldado = " + codigoSoldado;
        sql3 = "DELETE FROM advertencias WHERE codigosoldado = " + codigoSoldado;
        stmt.executeUpdate(sql2);
        stmt.executeUpdate(sql3);
        if(stmt.executeUpdate(sql) > 0) 
            JOptionPane.showMessageDialog(null, "Soldado excluído com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro!", "AVISO", JOptionPane.ERROR_MESSAGE);  
    }
    
    //Método para buscar todos os dados de todos os soldados
    public static ResultSet buscarTodosSoldados() throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "SELECT * FROM soldados";
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
    //Método para inserir dados das advertências na tabela advertencias
    public static void inserirAdvertencia(Advertencia advertencia) throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "INSERT INTO advertencias VALUES ("
                + advertencia.getCodigoSoldado() + ","
                + "'" + advertencia.getNomeSoldado() + "',"
                + advertencia.getContagemAdvertencias() + ")";
        stmt.executeUpdate(sql);
    }
    
    //Método para alterar o nome do soldado na tabela advertencias
    public static void alterarSoldadoAdvertencia(String codigoSoldado, Advertencia advertencia) throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "UPDATE advertencias SET nomesoldado = '"
                + advertencia.getNomeSoldado() + "'"
                + " WHERE codigosoldado = '" + codigoSoldado + "'";
        stmt.executeUpdate(sql);
    }
    
    //Método para buscar todos os dados de todos os soldados
    public static ResultSet buscarTodosSoldadosRelatorio() throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "SELECT nome, caserna FROM soldados ORDER BY 2";
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
    //Método para buscar idade e altura dos soldados
    public static ResultSet buscarSoldadosIdadeAltura() throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "SELECT nome, idade, altura FROM soldados ORDER BY 3 DESC";
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
    //Método para buscar soldados recrutados este ano
    public static ResultSet buscarSoldadosRecrutadosEsteAno() throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "SELECT nome, caserna, sexo, idade, nascimento FROM soldados WHERE idade <= 18 ORDER BY 1";
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
    //Método para buscar todos os dados de todos os soldados
    public static ResultSet buscarTodosSoldadosGeral() throws SQLException {
        conexao = getConnection();
        stmt = (Statement) conexao.createStatement();
        sql = "SELECT * FROM soldados ORDER BY 2 ASC";
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
}

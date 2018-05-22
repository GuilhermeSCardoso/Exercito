
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.SoldadoDAO;
import view.FrameMenu;

/**
 * Classe que contém as regras de negócio para buscar os Soldados.
 * @author Guilherme Souto Cardoso
 * @since  Classe criada em: 31/10/2017
 */

public class BuscaSoldado {
    
    public static ResultSet localizarSoldadoCodigo(String codigoSoldado) throws SQLException {
        return SoldadoDAO.buscarCodigoAlteraSoldado(codigoSoldado);
    }
    
    public static String localizarTodosSoldados(String listagemSoldados) throws SQLException {
        JFrame frameListagemSoldados = new JFrame();
        JTextArea jtaListagemSoldados = new JTextArea();
        ResultSet rs = listarTodosSoldados();
        listagemSoldados = "\n  Código\tNome Completo do Soldado\t\t\tCaserna\t\tIdade\t\tAltura\tSexo\n";
        listagemSoldados = listagemSoldados + "==================================================="
                + "==============================================================================="
                + "===============\n";
        
        try {
            while(rs.next()) {
                listagemSoldados = listagemSoldados + " " + rs.getString("codigo")
                        + "\t" + rs.getString("nome")
                        + "\t\t\t" + rs.getString("caserna")
                        + "\t\t" + rs.getString("idade") + " anos"
                        + "\t\t" + rs.getString("altura") + "m"
                        + "\t" + rs.getString("sexo")
                        + "\n";
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrameMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jtaListagemSoldados.setText(listagemSoldados);
        frameListagemSoldados.add(jtaListagemSoldados);
        frameListagemSoldados.setSize(1000, 600);
        frameListagemSoldados.setTitle("Listagem Completa de Soldados Cadastrados");
        frameListagemSoldados.setLocation(200, 100);
        frameListagemSoldados.setVisible(true);
        frameListagemSoldados.setResizable(false);
        jtaListagemSoldados.setEditable(false);
        JScrollPane sp = new JScrollPane(jtaListagemSoldados);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frameListagemSoldados.setContentPane(sp);
        return listagemSoldados;
    }
    
    public static ResultSet listarTodosSoldados() throws SQLException {
        return SoldadoDAO.buscarTodosSoldados();
    }
    
    public static ResultSet listarTodosSoldadosRelatorio() throws SQLException {
        return SoldadoDAO.buscarTodosSoldadosRelatorio();
    }
    
    public static ResultSet listarSoldadosIdadeAltura() throws SQLException {
        return SoldadoDAO.buscarSoldadosIdadeAltura();
    }
    
    public static ResultSet listarSoldadosRecrutadosEsteAno() throws SQLException {
        return SoldadoDAO.buscarSoldadosRecrutadosEsteAno();
    }
    
    public static ResultSet listarTodosSoldadosGeral() throws SQLException {
        return SoldadoDAO.buscarTodosSoldadosGeral();
    }
    
}

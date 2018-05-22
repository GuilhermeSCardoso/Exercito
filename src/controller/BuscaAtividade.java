
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.AtividadeDAO;
import view.FrameMenu;

/**
 * Classe que contém as regras de negócio para buscar as Atividades.
 * @author Guilherme Souto Cardoso
 * @since  Classe criada em: 31/10/2017
 */

public class BuscaAtividade {
    
    public static ResultSet localizarSoldado(String codigoSoldado) throws SQLException {
        return AtividadeDAO.buscarCodigoSoldado(codigoSoldado);
    }
    
    public static String localizarTodasAtividades(String listagemAtividades) throws SQLException {
        JFrame frameListagemAtividades = new JFrame();
        JTextArea jtaListagemAtividades = new JTextArea(); 
        ResultSet rs = listarTodasAtividades();
        //String listagemAtividades = new String();
        listagemAtividades = "\n\n"
                + "  NOTA  =  1 :   ATIVIDADE REALIZADA\n"
                + "  NOTA  =  0 :   ATIVIDADE NÃO REALIZADA\n\n";
        listagemAtividades = listagemAtividades + 
                "\n  Mês\tNome Completo do Soldado\t\t\t Aulas Teóricas      Flexões      Abdominais"
                + "      Natação      Corrida      Defesa Pessoal      Rastejar Na Lama      Prática De Tiro\n";
        listagemAtividades = listagemAtividades + "==================================================="
                + "==============================================================================="
                + "========================================\n";
        
        try {
            while(rs.next()) {
                listagemAtividades = listagemAtividades + "  " + rs.getString("mes")
                        + "\t" + rs.getString("nomesoldado")
                        + "\t\t\t " + rs.getString("aulasteoricas") 
                        + "\t      " + rs.getString("flexoes")
                        + "\t" + rs.getString("abdominais")
                        + "\t" + rs.getString("natacao")
                        + "                  " + rs.getString("corrida")
                        + "\t\t" + rs.getString("defesapessoal")
                        + "\t" + rs.getString("rastejarlama")
                        + "\t" + rs.getString("praticatiro")
                        + "\n";
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrameMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jtaListagemAtividades.setText(listagemAtividades);
        frameListagemAtividades.add(jtaListagemAtividades);
        frameListagemAtividades.setSize(1200, 600);
        frameListagemAtividades.setTitle("Listagem Completa das Atividades Realizadas");
        frameListagemAtividades.setLocation(90, 100);
        frameListagemAtividades.setVisible(true);
        frameListagemAtividades.setResizable(false);
        jtaListagemAtividades.setEditable(false);
        JScrollPane sp = new JScrollPane(jtaListagemAtividades);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frameListagemAtividades.setContentPane(sp);
        return listagemAtividades;
    }
    
    public static ResultSet listarTodasAtividades() throws SQLException {
        return AtividadeDAO.buscarTodasAtividades();
    }
    
    public static ResultSet localizarAdvertencias(String codigoSoldado) throws SQLException {
        return AtividadeDAO.buscarAdvertencias(codigoSoldado);
    }
    
    public static ResultSet localizarPraticaTiro() throws SQLException {
        return AtividadeDAO.buscarPraticaTiro();
    }
    
}


package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Advertencia;
import model.Atividade;
import model.Soldado;
import model.SoldadoDAO;

/**
 * Classe que contém as regras de negócio para alterar os dados de um Soldado.
 * @author Guilherme Souto Cardoso
 * @since Classe criada em: 31/10/2017
 */

public class AlteraSoldado {
    
    public static void alterarDadosSoldado(String codigo, Soldado soldado, Atividade atividade) throws SQLException {
        if (soldado.getIdade() < 18) {
            JOptionPane.showMessageDialog(null, "Não é permitido alterar a idade para menos de 18 anos!");
        } else {
            if (soldado.getIdade() > 40) {
                JOptionPane.showMessageDialog(null, "Não é permitido alterar a idade para mais de 40 anos!");
            } else {
                SoldadoDAO.alterarSoldado(codigo, soldado, atividade);
            }
        }        
    }
    
    public static void alterarSoldadoAdvertencia(String codigo, Advertencia advertencia) throws SQLException {
        SoldadoDAO.alterarSoldadoAdvertencia(codigo, advertencia);
    }
    
}

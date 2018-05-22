
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Advertencia;
import model.Soldado;
import model.SoldadoDAO;

/**
 * Classe para receber um objeto do tipo Soldado e realizar todas as regras de
 * negócio necessárias para validação antes de enviar para o Banco de Dados.
 * @author Guiherme Souto Cardoso
 * @since Classe criada em 31/10/2017
 */

public class GravaSoldado {
    
    public static void cadastrarNovoSoldado(Soldado soldado) throws SQLException {
        if (soldado.getIdade() < 18) {
            JOptionPane.showMessageDialog(null, "Não é permitido cadastrar um soldado menor de idade!");
        } else {
            if (soldado.getIdade() > 40) {
                JOptionPane.showMessageDialog(null, "A idade máxima é de 40 anos!");
            } else {
                SoldadoDAO.inserirNovoSoldado(soldado);
            }
        }
    }
    
    public static void cadastrarAdvertencia(Advertencia advertencia) throws SQLException {
        SoldadoDAO.inserirAdvertencia(advertencia);
    }
    
}

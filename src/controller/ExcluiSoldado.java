
package controller;

import java.sql.SQLException;
import model.SoldadoDAO;

/**
 * Classe que contém as regras de negócio para excluir um Soldado.
 * @author Guilherme Souto Cardoso
 * @since Classe criada em: 31/10/2017
 */

public class ExcluiSoldado {
    
    public static void apagarSoldado(String codigo) throws SQLException {
        SoldadoDAO.excluirSoldado(codigo);
    }
    
}

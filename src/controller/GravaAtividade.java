
package controller;

import java.sql.SQLException;
import model.Atividade;
import model.AtividadeDAO;

/**
 * Classe para receber um objeto do tipo Atividade e realizar todas as regras de
 * negócio necessárias para validação antes de enviar para o Banco de Dados.
 * @author Guiherme Souto Cardoso
 * @since Classe criada em 31/10/2017
 */

public class GravaAtividade {
    
    public static void cadastrarNovaAtividade(Atividade atividade) throws SQLException {
        AtividadeDAO.inserirNovaAtividade(atividade);
    }
    
    public static void contarAdvertencia(String codigoSoldado, int total) throws SQLException {
        AtividadeDAO.alteraAtividadeAdvertencia(codigoSoldado, total);
    }
    
}

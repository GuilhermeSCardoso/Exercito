
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.AdvertenciaDAO;

/**
 * Classe que contém as regras de negócio para buscar as Advertências.
 * @author Guilherme Souto Cardoso
 * @since Classe criada em: 06/11/2017
 */

public class BuscaAdvertencia {
    
    public static ResultSet localizarAdvertenciasSoldado(String codigoSoldado) throws SQLException {
        return AdvertenciaDAO.buscarCodigoSoldadoAdvertencias(codigoSoldado);
    }
    
    public static ResultSet localizarTodasAdvertencias() throws SQLException {
        return AdvertenciaDAO.buscarTodasAdvertencias();
    }
    
}

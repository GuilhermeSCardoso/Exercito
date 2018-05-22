
package model;

/**
 * Classe criada para gerar um objeto do tipo Advertência.
 * @author Guilherme Souto Cardoso
 * @since Classe criada em: 06/11/2017
 */

public class Advertencia {
    
    private int codigoSoldado;
    private String nomeSoldado;
    private int contagemAdvertencias;
    
    public Advertencia() {
        
    }

    public Advertencia(int codigoSoldado, String nomeSoldado, int contagemAdvertencias) {
        this.codigoSoldado = codigoSoldado;
        this.nomeSoldado = nomeSoldado;
        this.contagemAdvertencias = contagemAdvertencias;
    }

    public int getCodigoSoldado() {
        return codigoSoldado;
    }

    public void setCodigoSoldado(int codigoSoldado) {
        this.codigoSoldado = codigoSoldado;
    }

    public String getNomeSoldado() {
        return nomeSoldado;
    }

    public void setNomeSoldado(String nomeSoldado) {
        this.nomeSoldado = nomeSoldado;
    }

    public int getContagemAdvertencias() {
        return contagemAdvertencias;
    }

    public void setContagemAdvertencias(int contagemAdvertencias) {
        this.contagemAdvertencias = contagemAdvertencias;
    }
    
}

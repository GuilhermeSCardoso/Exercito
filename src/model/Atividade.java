
package model;

/**
 * Classe criada para gerar um objeto do tipo Atividade.
 * @author Guilherme Souto Cardoso
 * @since Classe criada em: 18/09/2017
 */

public class Atividade {
    
    private int codigo;
    private String mes;
    private int codigoSoldado;
    private String nomeSoldado;
    private String casernaSoldado;
    private boolean aulasTeoricas;
    private boolean flexoes;
    private boolean abdominais;
    private boolean natacao;
    private boolean corrida;
    private boolean defesaPessoal;
    private boolean rastejarLama;
    private boolean praticaTiro;
    
    //Método construtor da Classe
    public Atividade() {
        
    }

    public Atividade(int codigo, String mes, int codigoSoldado, String nomeSoldado, String casernaSoldado, boolean aulasTeoricas, boolean flexoes, boolean abdominais, boolean natacao, boolean corrida, boolean defesaPessoal, boolean rastejarLama, boolean praticaTiro) {
        this.codigo = codigo;
        this.mes = mes;
        this.codigoSoldado = codigoSoldado;
        this.nomeSoldado = nomeSoldado;
        this.casernaSoldado = casernaSoldado;
        this.aulasTeoricas = aulasTeoricas;
        this.flexoes = flexoes;
        this.abdominais = abdominais;
        this.natacao = natacao;
        this.corrida = corrida;
        this.defesaPessoal = defesaPessoal;
        this.rastejarLama = rastejarLama;
        this.praticaTiro = praticaTiro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
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

    public String getCasernaSoldado() {
        return casernaSoldado;
    }

    public void setCasernaSoldado(String casernaSoldado) {
        this.casernaSoldado = casernaSoldado;
    }

    public boolean isAulasTeoricas() {
        return aulasTeoricas;
    }

    public void setAulasTeoricas(boolean aulasTeoricas) {
        this.aulasTeoricas = aulasTeoricas;
    }

    public boolean isFlexoes() {
        return flexoes;
    }

    public void setFlexoes(boolean flexoes) {
        this.flexoes = flexoes;
    }

    public boolean isAbdominais() {
        return abdominais;
    }

    public void setAbdominais(boolean abdominais) {
        this.abdominais = abdominais;
    }

    public boolean isNatacao() {
        return natacao;
    }

    public void setNatacao(boolean natacao) {
        this.natacao = natacao;
    }

    public boolean isCorrida() {
        return corrida;
    }

    public void setCorrida(boolean corrida) {
        this.corrida = corrida;
    }

    public boolean isDefesaPessoal() {
        return defesaPessoal;
    }

    public void setDefesaPessoal(boolean defesaPessoal) {
        this.defesaPessoal = defesaPessoal;
    }

    public boolean isRastejarLama() {
        return rastejarLama;
    }

    public void setRastejarLama(boolean rastejarLama) {
        this.rastejarLama = rastejarLama;
    }

    public boolean isPraticaTiro() {
        return praticaTiro;
    }

    public void setPraticaTiro(boolean praticaTiro) {
        this.praticaTiro = praticaTiro;
    }
    
}//fim da classe

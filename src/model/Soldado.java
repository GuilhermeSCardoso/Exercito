
package model;

/**
 * Classe criada para gerar um objeto do tipo Soldado.
 * @author Guilherme Souto Cardoso
 * @since Classe criada em: 18/09/2017
 */

public class Soldado {
    
    private int codigo;
    private String nome;
    private String endereco;
    private String municipio;
    private String dataNascimento;
    private int idade;
    private float altura;
    private String sexo;
    private String caserna;
    
    //Método construtor da Classe
    public Soldado() {
        
    }

    public Soldado(int codigo, String nome, String endereco, String municipio, String dataNascimento, int idade, float altura, String sexo, String caserna) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.municipio = municipio;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
        this.caserna = caserna;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCaserna() {
        return caserna;
    }

    public void setCaserna(String caserna) {
        this.caserna = caserna;
    }
    
}//fim da classe

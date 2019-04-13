package br.ufjf.dcc193.ongplus;

import java.util.Date;

/**
 * Membro
 */
public class Membro {
    private Sede sede;
    private String nome;
    private String funcao;
    private String email;
    private Date data_entrada;
    private Date data_saida;

    /**
     * @return the sede
     */
    public Sede getSede() {
        return sede;
    }

    /**
     * @param sede the sede to set
     */
    public void setSede(Sede sede) {
        this.sede = sede;
    }

    /**
     * @return the data_entrada
     */
    public Date getData_entrada() {
        return data_entrada;
    }

    /**
     * @return the data_saida
     */
    public Date getData_saida() {
        return data_saida;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param data_entrada the data_entrada to set
     */
    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    /**
     * @param data_saida the data_saida to set
     */
    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
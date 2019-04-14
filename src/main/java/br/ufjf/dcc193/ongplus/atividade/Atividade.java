package br.ufjf.dcc193.ongplus.atividade;

import br.ufjf.dcc193.ongplus.sede.Sede;

/**
 * Atividade
 */
public class Atividade {
    private Sede sede;
    private String titulo;
    private String descricao;
    private String data_inicio;
    private String data_fim;
    private Float total_horas;

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
     * @return the data_fim
     */
    public String getData_fim() {
        return data_fim;
    }

    /**
     * @return the data_inicio
     */
    public String getData_inicio() {
        return data_inicio;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the total_horas
     */
    public Float getTotal_horas() {
        return total_horas;
    }

    /**
     * @param data_fim the data_fim to set
     */
    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param total_horas the total_horas to set
     */
    public void setTotal_horas(Float total_horas) {
        this.total_horas = total_horas;
    }
}
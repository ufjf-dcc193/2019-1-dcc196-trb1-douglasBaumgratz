package br.ufjf.dcc193.ongplus.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Atividade
 */
@Entity
public class Atividade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    // @JoinColumn(name = "id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Sede sede;
    private String titulo;
    private String descricao;
    private String data_inicio;
    private String data_fim;
    private double total_horas;
    private int totalHorasAssistencial;
    private int totalHorasJuridica;
    private int totalHorasExecutiva;
    private int totalHorasFinanceira;

    public Atividade() {
    }

    public Atividade(String titulo, String descricao, String data_inicio, String data_fim, double total_horas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.total_horas = total_horas;
    }

    public Atividade(Sede sede, String titulo, String descricao, String data_inicio, String data_fim,
            double total_horas) {
        this.sede = sede;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.total_horas = total_horas;
    }

    /**
     * @return the totalHorasAssistencial
     */
    public int getTotalHorasAssistencial() {
        return totalHorasAssistencial;
    }

    /**
     * @return the totalHorasExecutiva
     */
    public int getTotalHorasExecutiva() {
        return totalHorasExecutiva;
    }

    /**
     * @return the totalHorasFinanceira
     */
    public int getTotalHorasFinanceira() {
        return totalHorasFinanceira;
    }

    /**
     * @return the totalHorasJuridica
     */
    public int getTotalHorasJuridica() {
        return totalHorasJuridica;
    }

    /**
     * @param totalHorasAssistencial the totalHorasAssistencial to set
     */
    public void setTotalHorasAssistencial(int totalHorasAssistencial) {
        this.totalHorasAssistencial = totalHorasAssistencial;
    }

    /**
     * @param totalHorasExecutiva the totalHorasExecutiva to set
     */
    public void setTotalHorasExecutiva(int totalHorasExecutiva) {
        this.totalHorasExecutiva = totalHorasExecutiva;
    }

    /**
     * @param totalHorasFinanceira the totalHorasFinanceira to set
     */
    public void setTotalHorasFinanceira(int totalHorasFinanceira) {
        this.totalHorasFinanceira = totalHorasFinanceira;
    }

    /**
     * @param totalHorasJuridica the totalHorasJuridica to set
     */
    public void setTotalHorasJuridica(int totalHorasJuridica) {
        this.totalHorasJuridica = totalHorasJuridica;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

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
    public double getTotal_horas() {
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
    public void setTotal_horas(double total_horas) {
        this.total_horas = total_horas;
    }
}
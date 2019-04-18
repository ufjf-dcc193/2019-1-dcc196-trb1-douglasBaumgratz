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
    private int horasAssistencial;
    private int horasJuridica;
    private int horasExecutiva;
    private int horasFinanceira;

    public Atividade() {
    }

    public Atividade(String titulo, String descricao, String data_inicio, String data_fim, int horasAssistencial,
            int horasJuridica, int horasExecutiva, int horasFinanceira) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.horasAssistencial = horasAssistencial;
        this.horasJuridica = horasJuridica;
        this.horasExecutiva = horasExecutiva;
        this.horasFinanceira = horasFinanceira;
    }

    public Atividade(Sede sede, String titulo, String descricao, String data_inicio, String data_fim,
            int horasAssistencial, int horasJuridica, int horasExecutiva, int horasFinanceira) {
        this.sede = sede;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.horasAssistencial = horasAssistencial;
        this.horasJuridica = horasJuridica;
        this.horasExecutiva = horasExecutiva;
        this.horasFinanceira = horasFinanceira;
    }

    /**
     * @return the horasAssistencial
     */
    public int getHorasAssistencial() {
        return horasAssistencial;
    }

    /**
     * @return the horasExecutiva
     */
    public int getHorasExecutiva() {
        return horasExecutiva;
    }

    /**
     * @return the horasFinanceira
     */
    public int getHorasFinanceira() {
        return horasFinanceira;
    }

    /**
     * @return the horasJuridica
     */
    public int getHorasJuridica() {
        return horasJuridica;
    }

    /**
     * @param horasAssistencial the horasAssistencial to set
     */
    public void setHorasAssistencial(int horasAssistencial) {
        this.horasAssistencial = horasAssistencial;
    }

    /**
     * @param horasExecutiva the horasExecutiva to set
     */
    public void setHorasExecutiva(int horasExecutiva) {
        this.horasExecutiva = horasExecutiva;
    }

    /**
     * @param horasFinanceira the horasFinanceira to set
     */
    public void setHorasFinanceira(int horasFinanceira) {
        this.horasFinanceira = horasFinanceira;
    }

    /**
     * @param horasJuridica the horasJuridica to set
     */
    public void setHorasJuridica(int horasJuridica) {
        this.horasJuridica = horasJuridica;
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


}
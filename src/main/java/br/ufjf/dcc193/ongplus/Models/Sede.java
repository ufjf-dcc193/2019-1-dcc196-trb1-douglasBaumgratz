package br.ufjf.dcc193.ongplus.Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Sede
 */
@Entity
public class Sede implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome_fantasia;
    private String estado;
    private String cidade;
    private String bairro;
    private int telefone;
    private String endereco;
    // List<Atividade> atividade = new ArrayList<Atividade>();

    // /**
    //  * @return the atividade
    //  */
    // public List<Atividade> getAtividade() {
    //     return atividade;
    // }

    // /**
    //  * @param atividade the atividade to set
    //  */
    // public void setAtividade(List<Atividade> atividade) {
    //     this.atividade = atividade;
    // }
    // @OneToMany(mappedBy = "sedeMembro", cascade = CascadeType.ALL)
    // private Set<Membro> membros;
    // @OneToMany(mappedBy = "sedeAtividade", cascade = CascadeType.ALL)
    // private Set<Atividade> atividades;

    public Sede() {

    }

    public Sede(String nome_fantasia, String estado, String cidade, String bairro, int telefone, String endereco) {
        this.nome_fantasia = nome_fantasia;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // /**
    // * @return the atividades
    // */
    // public Set<Atividade> getAtividades() {
    // return atividades;
    // }

    // /**
    // * @return the membros
    // */
    // public Set<Membro> getMembros() {
    // return membros;
    // }

    // /**
    // * @param atividades the atividades to set
    // */
    // public void setAtividades(Set<Atividade> atividades) {
    // this.atividades = atividades;
    // }

    // /**
    // * @param membros the membros to set
    // */
    // public void setMembros(Set<Membro> membros) {
    // this.membros = membros;
    // }

    @Override
    public String toString() {
        return super.toString();
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
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @return the nome_fantasia
     */
    public String getNome_fantasia() {
        return nome_fantasia;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @param nome_fantasia the nome_fantasia to set
     */
    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
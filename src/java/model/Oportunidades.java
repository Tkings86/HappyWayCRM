/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thiago Reis
 */
@Entity
@Table(name = "OPORTUNIDADES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Oportunidades.findAll", query = "SELECT o FROM Oportunidades o"),
    @NamedQuery(name = "Oportunidades.findByCodigoOportunidade", query = "SELECT o FROM Oportunidades o WHERE o.codigoOportunidade = :codigoOportunidade"),
    @NamedQuery(name = "Oportunidades.findByFaseVenda", query = "SELECT o FROM Oportunidades o WHERE o.faseVenda = :faseVenda"),
    @NamedQuery(name = "Oportunidades.findByValor", query = "SELECT o FROM Oportunidades o WHERE o.valor = :valor"),
    @NamedQuery(name = "Oportunidades.findByDataPrevista", query = "SELECT o FROM Oportunidades o WHERE o.dataPrevista = :dataPrevista"),
    @NamedQuery(name = "Oportunidades.findByVinculado", query = "SELECT o FROM Oportunidades o WHERE o.vinculado = :vinculado"),
    @NamedQuery(name = "Oportunidades.findByDataCriacao", query = "SELECT o FROM Oportunidades o WHERE o.dataCriacao = :dataCriacao"),
    @NamedQuery(name = "Oportunidades.findByProbabilidade", query = "SELECT o FROM Oportunidades o WHERE o.probabilidade = :probabilidade"),
    @NamedQuery(name = "Oportunidades.findByDescricao", query = "SELECT o FROM Oportunidades o WHERE o.descricao = :descricao")})
public class Oportunidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_OPORTUNIDADE")
    private Integer codigoOportunidade;
    @Size(max = 10)
    @Column(name = "FASE_VENDA")
    private String faseVenda;
    @Column(name = "VALOR")
    private Long valor;
    @Column(name = "DATA_PREVISTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPrevista;
    @Size(max = 15)
    @Column(name = "VINCULADO")
    private String vinculado;
    @Column(name = "DATA_CRIACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Size(max = 5)
    @Column(name = "PROBABILIDADE")
    private String probabilidade;
    @Size(max = 120)
    @Column(name = "DESCRICAO")
    private String descricao;
    @JoinColumn(name = "CODIGO_ATEND", referencedColumnName = "CODIGO_ATEND")
    @ManyToOne
    private Atendimento codigoAtend;

    public Oportunidades() {
    }

    public Oportunidades(Integer codigoOportunidade) {
        this.codigoOportunidade = codigoOportunidade;
    }

    public Integer getCodigoOportunidade() {
        return codigoOportunidade;
    }

    public void setCodigoOportunidade(Integer codigoOportunidade) {
        this.codigoOportunidade = codigoOportunidade;
    }

    public String getFaseVenda() {
        return faseVenda;
    }

    public void setFaseVenda(String faseVenda) {
        this.faseVenda = faseVenda;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public String getVinculado() {
        return vinculado;
    }

    public void setVinculado(String vinculado) {
        this.vinculado = vinculado;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getProbabilidade() {
        return probabilidade;
    }

    public void setProbabilidade(String probabilidade) {
        this.probabilidade = probabilidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Atendimento getCodigoAtend() {
        return codigoAtend;
    }

    public void setCodigoAtend(Atendimento codigoAtend) {
        this.codigoAtend = codigoAtend;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoOportunidade != null ? codigoOportunidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oportunidades)) {
            return false;
        }
        Oportunidades other = (Oportunidades) object;
        if ((this.codigoOportunidade == null && other.codigoOportunidade != null) || (this.codigoOportunidade != null && !this.codigoOportunidade.equals(other.codigoOportunidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Oportunidades[ codigoOportunidade=" + codigoOportunidade + " ]";
    }
    
}

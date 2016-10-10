/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thiago Reis
 */
@Entity
@Table(name = "OCORRENCIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ocorrencias.findAll", query = "SELECT o FROM Ocorrencias o"),
    @NamedQuery(name = "Ocorrencias.findByCodigoOcorrencia", query = "SELECT o FROM Ocorrencias o WHERE o.codigoOcorrencia = :codigoOcorrencia"),
    @NamedQuery(name = "Ocorrencias.findByPrioridade", query = "SELECT o FROM Ocorrencias o WHERE o.prioridade = :prioridade"),
    @NamedQuery(name = "Ocorrencias.findBySituacao", query = "SELECT o FROM Ocorrencias o WHERE o.situacao = :situacao"),
    @NamedQuery(name = "Ocorrencias.findByTipo", query = "SELECT o FROM Ocorrencias o WHERE o.tipo = :tipo"),
    @NamedQuery(name = "Ocorrencias.findByAssunto", query = "SELECT o FROM Ocorrencias o WHERE o.assunto = :assunto"),
    @NamedQuery(name = "Ocorrencias.findByDescricao", query = "SELECT o FROM Ocorrencias o WHERE o.descricao = :descricao"),
    @NamedQuery(name = "Ocorrencias.findByResolucao", query = "SELECT o FROM Ocorrencias o WHERE o.resolucao = :resolucao"),
    @NamedQuery(name = "Ocorrencias.findByAtribuido", query = "SELECT o FROM Ocorrencias o WHERE o.atribuido = :atribuido")})
public class Ocorrencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_OCORRENCIA")
    private Integer codigoOcorrencia;
    @Size(max = 10)
    @Column(name = "PRIORIDADE")
    private String prioridade;
    @Size(max = 10)
    @Column(name = "SITUACAO")
    private String situacao;
    @Size(max = 10)
    @Column(name = "TIPO")
    private String tipo;
    @Size(max = 60)
    @Column(name = "ASSUNTO")
    private String assunto;
    @Size(max = 60)
    @Column(name = "DESCRICAO")
    private String descricao;
    @Size(max = 60)
    @Column(name = "RESOLUCAO")
    private String resolucao;
    @Size(max = 15)
    @Column(name = "ATRIBUIDO")
    private String atribuido;
    @JoinColumn(name = "CODIGO_CLIENTE", referencedColumnName = "CODIGO_CLIENTE")
    @ManyToOne
    private Cliente codigoCliente;

    public Ocorrencias() {
    }

    public Ocorrencias(Integer codigoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
    }

    public Integer getCodigoOcorrencia() {
        return codigoOcorrencia;
    }

    public void setCodigoOcorrencia(Integer codigoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getAtribuido() {
        return atribuido;
    }

    public void setAtribuido(String atribuido) {
        this.atribuido = atribuido;
    }

    public Cliente getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Cliente codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoOcorrencia != null ? codigoOcorrencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ocorrencias)) {
            return false;
        }
        Ocorrencias other = (Ocorrencias) object;
        if ((this.codigoOcorrencia == null && other.codigoOcorrencia != null) || (this.codigoOcorrencia != null && !this.codigoOcorrencia.equals(other.codigoOcorrencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Ocorrencias[ codigoOcorrencia=" + codigoOcorrencia + " ]";
    }
    
}

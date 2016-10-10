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
@Table(name = "LIGACOES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ligacoes.findAll", query = "SELECT l FROM Ligacoes l"),
    @NamedQuery(name = "Ligacoes.findByCodigoLigacoes", query = "SELECT l FROM Ligacoes l WHERE l.codigoLigacoes = :codigoLigacoes"),
    @NamedQuery(name = "Ligacoes.findByAssunto", query = "SELECT l FROM Ligacoes l WHERE l.assunto = :assunto"),
    @NamedQuery(name = "Ligacoes.findByDataLigacao", query = "SELECT l FROM Ligacoes l WHERE l.dataLigacao = :dataLigacao"),
    @NamedQuery(name = "Ligacoes.findByHoraLigacao", query = "SELECT l FROM Ligacoes l WHERE l.horaLigacao = :horaLigacao"),
    @NamedQuery(name = "Ligacoes.findByDuracaoLigacao", query = "SELECT l FROM Ligacoes l WHERE l.duracaoLigacao = :duracaoLigacao"),
    @NamedQuery(name = "Ligacoes.findByDescricao", query = "SELECT l FROM Ligacoes l WHERE l.descricao = :descricao"),
    @NamedQuery(name = "Ligacoes.findByStatus", query = "SELECT l FROM Ligacoes l WHERE l.status = :status"),
    @NamedQuery(name = "Ligacoes.findByReferente", query = "SELECT l FROM Ligacoes l WHERE l.referente = :referente"),
    @NamedQuery(name = "Ligacoes.findByAviso", query = "SELECT l FROM Ligacoes l WHERE l.aviso = :aviso"),
    @NamedQuery(name = "Ligacoes.findByAtribuido", query = "SELECT l FROM Ligacoes l WHERE l.atribuido = :atribuido"),
    @NamedQuery(name = "Ligacoes.findByNomeConvidado", query = "SELECT l FROM Ligacoes l WHERE l.nomeConvidado = :nomeConvidado"),
    @NamedQuery(name = "Ligacoes.findByEmailConvidado", query = "SELECT l FROM Ligacoes l WHERE l.emailConvidado = :emailConvidado")})
public class Ligacoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_LIGACOES")
    private Integer codigoLigacoes;
    @Size(max = 50)
    @Column(name = "ASSUNTO")
    private String assunto;
    @Size(max = 10)
    @Column(name = "DATA_LIGACAO")
    private String dataLigacao;
    @Size(max = 12)
    @Column(name = "HORA_LIGACAO")
    private String horaLigacao;
    @Size(max = 12)
    @Column(name = "DURACAO_LIGACAO")
    private String duracaoLigacao;
    @Size(max = 60)
    @Column(name = "DESCRICAO")
    private String descricao;
    @Size(max = 25)
    @Column(name = "STATUS")
    private String status;
    @Size(max = 60)
    @Column(name = "REFERENTE")
    private String referente;
    @Size(max = 60)
    @Column(name = "AVISO")
    private String aviso;
    @Size(max = 25)
    @Column(name = "ATRIBUIDO")
    private String atribuido;
    @Size(max = 50)
    @Column(name = "NOME_CONVIDADO")
    private String nomeConvidado;
    @Size(max = 50)
    @Column(name = "EMAIL_CONVIDADO")
    private String emailConvidado;
    @JoinColumn(name = "CODIGO_ATEND", referencedColumnName = "CODIGO_ATEND")
    @ManyToOne
    private Atendimento codigoAtend;

    public Ligacoes() {
    }

    public Ligacoes(Integer codigoLigacoes) {
        this.codigoLigacoes = codigoLigacoes;
    }

    public Integer getCodigoLigacoes() {
        return codigoLigacoes;
    }

    public void setCodigoLigacoes(Integer codigoLigacoes) {
        this.codigoLigacoes = codigoLigacoes;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDataLigacao() {
        return dataLigacao;
    }

    public void setDataLigacao(String dataLigacao) {
        this.dataLigacao = dataLigacao;
    }

    public String getHoraLigacao() {
        return horaLigacao;
    }

    public void setHoraLigacao(String horaLigacao) {
        this.horaLigacao = horaLigacao;
    }

    public String getDuracaoLigacao() {
        return duracaoLigacao;
    }

    public void setDuracaoLigacao(String duracaoLigacao) {
        this.duracaoLigacao = duracaoLigacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReferente() {
        return referente;
    }

    public void setReferente(String referente) {
        this.referente = referente;
    }

    public String getAviso() {
        return aviso;
    }

    public void setAviso(String aviso) {
        this.aviso = aviso;
    }

    public String getAtribuido() {
        return atribuido;
    }

    public void setAtribuido(String atribuido) {
        this.atribuido = atribuido;
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }

    public String getEmailConvidado() {
        return emailConvidado;
    }

    public void setEmailConvidado(String emailConvidado) {
        this.emailConvidado = emailConvidado;
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
        hash += (codigoLigacoes != null ? codigoLigacoes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ligacoes)) {
            return false;
        }
        Ligacoes other = (Ligacoes) object;
        if ((this.codigoLigacoes == null && other.codigoLigacoes != null) || (this.codigoLigacoes != null && !this.codigoLigacoes.equals(other.codigoLigacoes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Ligacoes[ codigoLigacoes=" + codigoLigacoes + " ]";
    }
    
}

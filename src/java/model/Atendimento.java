/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Thiago Reis
 */
@Entity
@Table(name = "ATENDIMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atendimento.findAll", query = "SELECT a FROM Atendimento a"),
    @NamedQuery(name = "Atendimento.findByCodigoAtend", query = "SELECT a FROM Atendimento a WHERE a.codigoAtend = :codigoAtend"),
    @NamedQuery(name = "Atendimento.findByDescri\u00e7\u00e3o", query = "SELECT a FROM Atendimento a WHERE a.descri\u00e7\u00e3o = :descri\u00e7\u00e3o"),
    @NamedQuery(name = "Atendimento.findByDataCriacaoHora", query = "SELECT a FROM Atendimento a WHERE a.dataCriacaoHora = :dataCriacaoHora"),
    @NamedQuery(name = "Atendimento.findByStatus", query = "SELECT a FROM Atendimento a WHERE a.status = :status")})
public class Atendimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_ATEND")
    private Integer codigoAtend;
    @Size(max = 150)
    @Column(name = "DESCRI\u00c7\u00c3O")
    private String descrição;
    @Column(name = "DATA_CRIACAO_HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacaoHora;
    @Size(max = 15)
    @Column(name = "STATUS")
    private String status;
    @OneToMany(mappedBy = "codigoAtend")
    private Collection<Ligacoes> ligacoesCollection;
    @OneToMany(mappedBy = "codigoAtend")
    private Collection<Oportunidades> oportunidadesCollection;
    @JoinColumn(name = "CODIGO_CLIENTE", referencedColumnName = "CODIGO_CLIENTE")
    @ManyToOne
    private Cliente codigoCliente;

    public Atendimento() {
    }

    public Atendimento(Integer codigoAtend) {
        this.codigoAtend = codigoAtend;
    }

    public Integer getCodigoAtend() {
        return codigoAtend;
    }

    public void setCodigoAtend(Integer codigoAtend) {
        this.codigoAtend = codigoAtend;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Date getDataCriacaoHora() {
        return dataCriacaoHora;
    }

    public void setDataCriacaoHora(Date dataCriacaoHora) {
        this.dataCriacaoHora = dataCriacaoHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<Ligacoes> getLigacoesCollection() {
        return ligacoesCollection;
    }

    public void setLigacoesCollection(Collection<Ligacoes> ligacoesCollection) {
        this.ligacoesCollection = ligacoesCollection;
    }

    @XmlTransient
    public Collection<Oportunidades> getOportunidadesCollection() {
        return oportunidadesCollection;
    }

    public void setOportunidadesCollection(Collection<Oportunidades> oportunidadesCollection) {
        this.oportunidadesCollection = oportunidadesCollection;
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
        hash += (codigoAtend != null ? codigoAtend.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atendimento)) {
            return false;
        }
        Atendimento other = (Atendimento) object;
        if ((this.codigoAtend == null && other.codigoAtend != null) || (this.codigoAtend != null && !this.codigoAtend.equals(other.codigoAtend))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Atendimento[ codigoAtend=" + codigoAtend + " ]";
    }
    
}

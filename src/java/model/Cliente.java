/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Thiago Reis
 */
@Entity
@Table(name = "CLIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCodigoCliente", query = "SELECT c FROM Cliente c WHERE c.codigoCliente = :codigoCliente"),
    @NamedQuery(name = "Cliente.findByCpfCnpj", query = "SELECT c FROM Cliente c WHERE c.cpfCnpj = :cpfCnpj"),
    @NamedQuery(name = "Cliente.findByNomeRazaoSocial", query = "SELECT c FROM Cliente c WHERE c.nomeRazaoSocial = :nomeRazaoSocial")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @NotNull

    @Column(name = "CODIGO_CLIENTE")
    private Integer codigoCliente;
    @Size(max = 18)

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;
    @Size(max = 50)

    @Column(name = "NOME_RAZAO_SOCIAL")
    private String nomeRazaoSocial;

    @OneToMany(mappedBy = "codigoCliente")
    private Collection<EndCliente> endClienteCollection;

    @OneToMany(mappedBy = "codigoCliente")
    private Collection<Ocorrencias> ocorrenciasCollection;

    @OneToMany(mappedBy = "codigoCliente")
    private Collection<Telefone> telefoneCollection;

    @OneToMany(mappedBy = "codigoCliente")
    private Collection<Atendimento> atendimentoCollection;

    @OneToMany(mappedBy = "codigoCliente")
    private Collection<Contatos> contatosCollection;

    public Cliente() {
    }

    public Cliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }

    @XmlTransient
    public Collection<EndCliente> getEndClienteCollection() {
        return endClienteCollection;
    }

    public void setEndClienteCollection(Collection<EndCliente> endClienteCollection) {
        this.endClienteCollection = endClienteCollection;
    }

    @XmlTransient
    public Collection<Ocorrencias> getOcorrenciasCollection() {
        return ocorrenciasCollection;
    }

    public void setOcorrenciasCollection(Collection<Ocorrencias> ocorrenciasCollection) {
        this.ocorrenciasCollection = ocorrenciasCollection;
    }

    @XmlTransient
    public Collection<Telefone> getTelefoneCollection() {
        return telefoneCollection;
    }

    public void setTelefoneCollection(Collection<Telefone> telefoneCollection) {
        this.telefoneCollection = telefoneCollection;
    }

    @XmlTransient
    public Collection<Atendimento> getAtendimentoCollection() {
        return atendimentoCollection;
    }

    public void setAtendimentoCollection(Collection<Atendimento> atendimentoCollection) {
        this.atendimentoCollection = atendimentoCollection;
    }

    @XmlTransient
    public Collection<Contatos> getContatosCollection() {
        return contatosCollection;
    }

    public void setContatosCollection(Collection<Contatos> contatosCollection) {
        this.contatosCollection = contatosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCliente != null ? codigoCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codigoCliente == null && other.codigoCliente != null) || (this.codigoCliente != null && !this.codigoCliente.equals(other.codigoCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cliente[ codigoCliente=" + codigoCliente + " ]";
    }

}

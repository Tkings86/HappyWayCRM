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
@Table(name = "END_CLIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EndCliente.findAll", query = "SELECT e FROM EndCliente e"),
    @NamedQuery(name = "EndCliente.findByCodigoEnd", query = "SELECT e FROM EndCliente e WHERE e.codigoEnd = :codigoEnd"),
    @NamedQuery(name = "EndCliente.findByRua", query = "SELECT e FROM EndCliente e WHERE e.rua = :rua"),
    @NamedQuery(name = "EndCliente.findByNumero", query = "SELECT e FROM EndCliente e WHERE e.numero = :numero"),
    @NamedQuery(name = "EndCliente.findByBairro", query = "SELECT e FROM EndCliente e WHERE e.bairro = :bairro"),
    @NamedQuery(name = "EndCliente.findByComplemento", query = "SELECT e FROM EndCliente e WHERE e.complemento = :complemento"),
    @NamedQuery(name = "EndCliente.findByCidade", query = "SELECT e FROM EndCliente e WHERE e.cidade = :cidade"),
    @NamedQuery(name = "EndCliente.findByUf", query = "SELECT e FROM EndCliente e WHERE e.uf = :uf"),
    @NamedQuery(name = "EndCliente.findByCep", query = "SELECT e FROM EndCliente e WHERE e.cep = :cep")})
public class EndCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_END")
    private Integer codigoEnd;
    @Size(max = 50)
    @Column(name = "RUA")
    private String rua;
    @Column(name = "NUMERO")
    private Long numero;
    @Size(max = 50)
    @Column(name = "BAIRRO")
    private String bairro;
    @Size(max = 50)
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @Size(max = 50)
    @Column(name = "CIDADE")
    private String cidade;
    @Size(max = 2)
    @Column(name = "UF")
    private String uf;
    @Size(max = 9)
    @Column(name = "CEP")
    private String cep;
    @JoinColumn(name = "CODIGO_CLIENTE", referencedColumnName = "CODIGO_CLIENTE")
    @ManyToOne
    private Cliente codigoCliente;

    public EndCliente() {
    }

    public EndCliente(Integer codigoEnd) {
        this.codigoEnd = codigoEnd;
    }

    public Integer getCodigoEnd() {
        return codigoEnd;
    }

    public void setCodigoEnd(Integer codigoEnd) {
        this.codigoEnd = codigoEnd;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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
        hash += (codigoEnd != null ? codigoEnd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EndCliente)) {
            return false;
        }
        EndCliente other = (EndCliente) object;
        if ((this.codigoEnd == null && other.codigoEnd != null) || (this.codigoEnd != null && !this.codigoEnd.equals(other.codigoEnd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.EndCliente[ codigoEnd=" + codigoEnd + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "LOJA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Loja.findAll", query = "SELECT l FROM Loja l"),
    @NamedQuery(name = "Loja.findByCodLoja", query = "SELECT l FROM Loja l WHERE l.codLoja = :codLoja"),
    @NamedQuery(name = "Loja.findByFilial", query = "SELECT l FROM Loja l WHERE l.filial = :filial")})
public class Loja implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_LOJA")
    private BigDecimal codLoja;
    @Size(max = 15)
    @Column(name = "FILIAL")
    private String filial;

    public Loja() {
    }

    public Loja(BigDecimal codLoja) {
        this.codLoja = codLoja;
    }

    public BigDecimal getCodLoja() {
        return codLoja;
    }

    public void setCodLoja(BigDecimal codLoja) {
        this.codLoja = codLoja;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codLoja != null ? codLoja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loja)) {
            return false;
        }
        Loja other = (Loja) object;
        if ((this.codLoja == null && other.codLoja != null) || (this.codLoja != null && !this.codLoja.equals(other.codLoja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Loja[ codLoja=" + codLoja + " ]";
    }
    
}

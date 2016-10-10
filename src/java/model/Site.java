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
@Table(name = "SITE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Site.findAll", query = "SELECT s FROM Site s"),
    @NamedQuery(name = "Site.findByDominioSite", query = "SELECT s FROM Site s WHERE s.dominioSite = :dominioSite")})
public class Site implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "DOMINIO_SITE")
    private String dominioSite;

    public Site() {
    }

    public Site(String dominioSite) {
        this.dominioSite = dominioSite;
    }

    public String getDominioSite() {
        return dominioSite;
    }

    public void setDominioSite(String dominioSite) {
        this.dominioSite = dominioSite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dominioSite != null ? dominioSite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Site)) {
            return false;
        }
        Site other = (Site) object;
        if ((this.dominioSite == null && other.dominioSite != null) || (this.dominioSite != null && !this.dominioSite.equals(other.dominioSite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Site[ dominioSite=" + dominioSite + " ]";
    }
    
}

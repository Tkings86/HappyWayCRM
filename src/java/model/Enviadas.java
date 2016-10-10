/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thiago Reis
 */
@Entity
@Table(name = "ENVIADAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enviadas.findAll", query = "SELECT e FROM Enviadas e"),
    @NamedQuery(name = "Enviadas.findByCodigoCliente", query = "SELECT e FROM Enviadas e WHERE e.enviadasPK.codigoCliente = :codigoCliente"),
    @NamedQuery(name = "Enviadas.findByCodigoCampanha", query = "SELECT e FROM Enviadas e WHERE e.enviadasPK.codigoCampanha = :codigoCampanha")})
public class Enviadas implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EnviadasPK enviadasPK;

    public Enviadas() {
    }

    public Enviadas(EnviadasPK enviadasPK) {
        this.enviadasPK = enviadasPK;
    }

    public Enviadas(int codigoCliente, long codigoCampanha) {
        this.enviadasPK = new EnviadasPK(codigoCliente, codigoCampanha);
    }

    public EnviadasPK getEnviadasPK() {
        return enviadasPK;
    }

    public void setEnviadasPK(EnviadasPK enviadasPK) {
        this.enviadasPK = enviadasPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enviadasPK != null ? enviadasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enviadas)) {
            return false;
        }
        Enviadas other = (Enviadas) object;
        if ((this.enviadasPK == null && other.enviadasPK != null) || (this.enviadasPK != null && !this.enviadasPK.equals(other.enviadasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Enviadas[ enviadasPK=" + enviadasPK + " ]";
    }
    
}

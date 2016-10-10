/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Thiago Reis
 */
@Embeddable
public class EnviadasPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_CLIENTE")
    private int codigoCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_CAMPANHA")
    private long codigoCampanha;

    public EnviadasPK() {
    }

    public EnviadasPK(int codigoCliente, long codigoCampanha) {
        this.codigoCliente = codigoCliente;
        this.codigoCampanha = codigoCampanha;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public long getCodigoCampanha() {
        return codigoCampanha;
    }

    public void setCodigoCampanha(long codigoCampanha) {
        this.codigoCampanha = codigoCampanha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigoCliente;
        hash += (int) codigoCampanha;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnviadasPK)) {
            return false;
        }
        EnviadasPK other = (EnviadasPK) object;
        if (this.codigoCliente != other.codigoCliente) {
            return false;
        }
        if (this.codigoCampanha != other.codigoCampanha) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.EnviadasPK[ codigoCliente=" + codigoCliente + ", codigoCampanha=" + codigoCampanha + " ]";
    }
    
}

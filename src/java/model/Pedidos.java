/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "PEDIDOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p"),
    @NamedQuery(name = "Pedidos.findByCodigoPedido", query = "SELECT p FROM Pedidos p WHERE p.codigoPedido = :codigoPedido"),
    @NamedQuery(name = "Pedidos.findByNumeroPedido", query = "SELECT p FROM Pedidos p WHERE p.numeroPedido = :numeroPedido"),
    @NamedQuery(name = "Pedidos.findByNomePedido", query = "SELECT p FROM Pedidos p WHERE p.nomePedido = :nomePedido"),
    @NamedQuery(name = "Pedidos.findByValorPedido", query = "SELECT p FROM Pedidos p WHERE p.valorPedido = :valorPedido"),
    @NamedQuery(name = "Pedidos.findByNfPedido", query = "SELECT p FROM Pedidos p WHERE p.nfPedido = :nfPedido"),
    @NamedQuery(name = "Pedidos.findByDataPedido", query = "SELECT p FROM Pedidos p WHERE p.dataPedido = :dataPedido")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_PEDIDO")
    private Integer codigoPedido;
    @Column(name = "NUMERO_PEDIDO")
    private Integer numeroPedido;
    @Size(max = 20)
    @Column(name = "NOME_PEDIDO")
    private String nomePedido;
    @Column(name = "VALOR_PEDIDO")
    private BigInteger valorPedido;
    @Column(name = "NF_PEDIDO")
    private BigInteger nfPedido;
    @Size(max = 10)
    @Column(name = "DATA_PEDIDO")
    private String dataPedido;
    @OneToMany(mappedBy = "codigoPedido")
    private Collection<Venda> vendaCollection;

    public Pedidos() {
    }

    public Pedidos(Integer codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public Integer getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(Integer codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public BigInteger getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(BigInteger valorPedido) {
        this.valorPedido = valorPedido;
    }

    public BigInteger getNfPedido() {
        return nfPedido;
    }

    public void setNfPedido(BigInteger nfPedido) {
        this.nfPedido = nfPedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    @XmlTransient
    public Collection<Venda> getVendaCollection() {
        return vendaCollection;
    }

    public void setVendaCollection(Collection<Venda> vendaCollection) {
        this.vendaCollection = vendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPedido != null ? codigoPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.codigoPedido == null && other.codigoPedido != null) || (this.codigoPedido != null && !this.codigoPedido.equals(other.codigoPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pedidos[ codigoPedido=" + codigoPedido + " ]";
    }
    
}

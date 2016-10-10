/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thiago Reis
 */
@Entity
@Table(name = "CAMPANHA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campanha.findAll", query = "SELECT c FROM Campanha c"),
    @NamedQuery(name = "Campanha.findByCodigoCampanha", query = "SELECT c FROM Campanha c WHERE c.codigoCampanha = :codigoCampanha"),
    @NamedQuery(name = "Campanha.findByNomeCampanha", query = "SELECT c FROM Campanha c WHERE c.nomeCampanha = :nomeCampanha"),
    @NamedQuery(name = "Campanha.findByStatus", query = "SELECT c FROM Campanha c WHERE c.status = :status"),
    @NamedQuery(name = "Campanha.findByTipo", query = "SELECT c FROM Campanha c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Campanha.findByFrequencia", query = "SELECT c FROM Campanha c WHERE c.frequencia = :frequencia"),
    @NamedQuery(name = "Campanha.findByDataInicial", query = "SELECT c FROM Campanha c WHERE c.dataInicial = :dataInicial"),
    @NamedQuery(name = "Campanha.findByDataFinal", query = "SELECT c FROM Campanha c WHERE c.dataFinal = :dataFinal"),
    @NamedQuery(name = "Campanha.findByCustoEsperado", query = "SELECT c FROM Campanha c WHERE c.custoEsperado = :custoEsperado"),
    @NamedQuery(name = "Campanha.findByReceitaEsperada", query = "SELECT c FROM Campanha c WHERE c.receitaEsperada = :receitaEsperada"),
    @NamedQuery(name = "Campanha.findByVinculado", query = "SELECT c FROM Campanha c WHERE c.vinculado = :vinculado"),
    @NamedQuery(name = "Campanha.findByDescricao", query = "SELECT c FROM Campanha c WHERE c.descricao = :descricao"),
    @NamedQuery(name = "Campanha.findByObjetivo", query = "SELECT c FROM Campanha c WHERE c.objetivo = :objetivo")})
public class Campanha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_CAMPANHA")
    private Long codigoCampanha;
    @Size(max = 50)
    @Column(name = "NOME_CAMPANHA")
    private String nomeCampanha;
    @Size(max = 50)
    @Column(name = "STATUS")
    private String status;
    @Size(max = 50)
    @Column(name = "TIPO")
    private String tipo;
    @Size(max = 50)
    @Column(name = "FREQUENCIA")
    private String frequencia;
    @Column(name = "DATA_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInicial;
    @Size(max = 15)
    @Column(name = "DATA_FINAL")
    private String dataFinal;
    @Column(name = "CUSTO_ESPERADO")
    private BigInteger custoEsperado;
    @Column(name = "RECEITA_ESPERADA")
    private BigInteger receitaEsperada;
    @Size(max = 50)
    @Column(name = "VINCULADO")
    private String vinculado;
    @Size(max = 120)
    @Column(name = "DESCRICAO")
    private String descricao;
    @Size(max = 120)
    @Column(name = "OBJETIVO")
    private String objetivo;

    public Campanha() {
    }

    public Campanha(Long codigoCampanha) {
        this.codigoCampanha = codigoCampanha;
    }

    public Long getCodigoCampanha() {
        return codigoCampanha;
    }

    public void setCodigoCampanha(Long codigoCampanha) {
        this.codigoCampanha = codigoCampanha;
    }

    public String getNomeCampanha() {
        return nomeCampanha;
    }

    public void setNomeCampanha(String nomeCampanha) {
        this.nomeCampanha = nomeCampanha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public BigInteger getCustoEsperado() {
        return custoEsperado;
    }

    public void setCustoEsperado(BigInteger custoEsperado) {
        this.custoEsperado = custoEsperado;
    }

    public BigInteger getReceitaEsperada() {
        return receitaEsperada;
    }

    public void setReceitaEsperada(BigInteger receitaEsperada) {
        this.receitaEsperada = receitaEsperada;
    }

    public String getVinculado() {
        return vinculado;
    }

    public void setVinculado(String vinculado) {
        this.vinculado = vinculado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCampanha != null ? codigoCampanha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campanha)) {
            return false;
        }
        Campanha other = (Campanha) object;
        if ((this.codigoCampanha == null && other.codigoCampanha != null) || (this.codigoCampanha != null && !this.codigoCampanha.equals(other.codigoCampanha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Campanha[ codigoCampanha=" + codigoCampanha + " ]";
    }
    
}

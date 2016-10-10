package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;
import model.Ligacoes;
import model.Oportunidades;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-09T19:53:15")
@StaticMetamodel(Atendimento.class)
public class Atendimento_ { 

    public static volatile SingularAttribute<Atendimento, Cliente> codigoCliente;
    public static volatile CollectionAttribute<Atendimento, Oportunidades> oportunidadesCollection;
    public static volatile SingularAttribute<Atendimento, String> status;
    public static volatile SingularAttribute<Atendimento, Date> dataCriacaoHora;
    public static volatile SingularAttribute<Atendimento, Integer> codigoAtend;
    public static volatile CollectionAttribute<Atendimento, Ligacoes> ligacoesCollection;
    public static volatile SingularAttribute<Atendimento, String> descrição;

}
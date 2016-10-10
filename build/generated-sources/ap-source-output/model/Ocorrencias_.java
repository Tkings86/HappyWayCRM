package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-10T00:21:23")
@StaticMetamodel(Ocorrencias.class)
public class Ocorrencias_ { 

    public static volatile SingularAttribute<Ocorrencias, Integer> codigoOcorrencia;
    public static volatile SingularAttribute<Ocorrencias, String> atribuido;
    public static volatile SingularAttribute<Ocorrencias, Cliente> codigoCliente;
    public static volatile SingularAttribute<Ocorrencias, String> tipo;
    public static volatile SingularAttribute<Ocorrencias, String> situacao;
    public static volatile SingularAttribute<Ocorrencias, String> assunto;
    public static volatile SingularAttribute<Ocorrencias, String> resolucao;
    public static volatile SingularAttribute<Ocorrencias, String> descricao;
    public static volatile SingularAttribute<Ocorrencias, String> prioridade;

}
package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Atendimento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-09T19:53:14")
@StaticMetamodel(Ligacoes.class)
public class Ligacoes_ { 

    public static volatile SingularAttribute<Ligacoes, String> atribuido;
    public static volatile SingularAttribute<Ligacoes, Integer> codigoLigacoes;
    public static volatile SingularAttribute<Ligacoes, String> emailConvidado;
    public static volatile SingularAttribute<Ligacoes, String> horaLigacao;
    public static volatile SingularAttribute<Ligacoes, String> referente;
    public static volatile SingularAttribute<Ligacoes, String> status;
    public static volatile SingularAttribute<Ligacoes, String> nomeConvidado;
    public static volatile SingularAttribute<Ligacoes, Atendimento> codigoAtend;
    public static volatile SingularAttribute<Ligacoes, String> assunto;
    public static volatile SingularAttribute<Ligacoes, String> dataLigacao;
    public static volatile SingularAttribute<Ligacoes, String> aviso;
    public static volatile SingularAttribute<Ligacoes, String> descricao;
    public static volatile SingularAttribute<Ligacoes, String> duracaoLigacao;

}
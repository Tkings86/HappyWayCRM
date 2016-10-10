package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Atendimento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-09T19:53:14")
@StaticMetamodel(Oportunidades.class)
public class Oportunidades_ { 

    public static volatile SingularAttribute<Oportunidades, String> faseVenda;
    public static volatile SingularAttribute<Oportunidades, Long> valor;
    public static volatile SingularAttribute<Oportunidades, String> probabilidade;
    public static volatile SingularAttribute<Oportunidades, Atendimento> codigoAtend;
    public static volatile SingularAttribute<Oportunidades, Date> dataCriacao;
    public static volatile SingularAttribute<Oportunidades, Date> dataPrevista;
    public static volatile SingularAttribute<Oportunidades, Integer> codigoOportunidade;
    public static volatile SingularAttribute<Oportunidades, String> descricao;
    public static volatile SingularAttribute<Oportunidades, String> vinculado;

}
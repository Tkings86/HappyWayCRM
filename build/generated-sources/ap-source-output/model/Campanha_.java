package model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-10T00:21:23")
@StaticMetamodel(Campanha.class)
public class Campanha_ { 

    public static volatile SingularAttribute<Campanha, String> frequencia;
    public static volatile SingularAttribute<Campanha, String> dataFinal;
    public static volatile SingularAttribute<Campanha, BigInteger> receitaEsperada;
    public static volatile SingularAttribute<Campanha, String> status;
    public static volatile SingularAttribute<Campanha, String> objetivo;
    public static volatile SingularAttribute<Campanha, String> tipo;
    public static volatile SingularAttribute<Campanha, Long> codigoCampanha;
    public static volatile SingularAttribute<Campanha, BigInteger> custoEsperado;
    public static volatile SingularAttribute<Campanha, Date> dataInicial;
    public static volatile SingularAttribute<Campanha, String> nomeCampanha;
    public static volatile SingularAttribute<Campanha, String> descricao;
    public static volatile SingularAttribute<Campanha, String> vinculado;

}
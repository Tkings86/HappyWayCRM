package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-10T00:21:23")
@StaticMetamodel(EndCliente.class)
public class EndCliente_ { 

    public static volatile SingularAttribute<EndCliente, String> bairro;
    public static volatile SingularAttribute<EndCliente, String> cidade;
    public static volatile SingularAttribute<EndCliente, Cliente> codigoCliente;
    public static volatile SingularAttribute<EndCliente, Integer> codigoEnd;
    public static volatile SingularAttribute<EndCliente, String> complemento;
    public static volatile SingularAttribute<EndCliente, String> cep;
    public static volatile SingularAttribute<EndCliente, String> uf;
    public static volatile SingularAttribute<EndCliente, String> rua;
    public static volatile SingularAttribute<EndCliente, Long> numero;

}
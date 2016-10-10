package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-10T00:21:23")
@StaticMetamodel(Contatos.class)
public class Contatos_ { 

    public static volatile SingularAttribute<Contatos, Long> codigo;
    public static volatile SingularAttribute<Contatos, Cliente> codigoCliente;
    public static volatile SingularAttribute<Contatos, String> email;

}
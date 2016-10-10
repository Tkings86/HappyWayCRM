package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pedidos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-09T19:53:14")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, String> atribuido;
    public static volatile SingularAttribute<Venda, Pedidos> codigoPedido;
    public static volatile SingularAttribute<Venda, Integer> codigoVenda;
    public static volatile SingularAttribute<Venda, Date> dataVenda;
    public static volatile SingularAttribute<Venda, Long> valorVenda;

}
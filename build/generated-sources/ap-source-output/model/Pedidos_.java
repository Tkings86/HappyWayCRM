package model;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-09T19:53:15")
@StaticMetamodel(Pedidos.class)
public class Pedidos_ { 

    public static volatile SingularAttribute<Pedidos, BigInteger> valorPedido;
    public static volatile SingularAttribute<Pedidos, Integer> codigoPedido;
    public static volatile SingularAttribute<Pedidos, String> nomePedido;
    public static volatile SingularAttribute<Pedidos, BigInteger> nfPedido;
    public static volatile CollectionAttribute<Pedidos, Venda> vendaCollection;
    public static volatile SingularAttribute<Pedidos, String> dataPedido;
    public static volatile SingularAttribute<Pedidos, Integer> numeroPedido;

}
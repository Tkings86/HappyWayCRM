package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Atendimento;
import model.Contatos;
import model.EndCliente;
import model.Ocorrencias;
import model.Telefone;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-09T19:53:15")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile CollectionAttribute<Cliente, Contatos> contatosCollection;
    public static volatile SingularAttribute<Cliente, String> cpfCnpj;
    public static volatile SingularAttribute<Cliente, Integer> codigoCliente;
    public static volatile CollectionAttribute<Cliente, Atendimento> atendimentoCollection;
    public static volatile CollectionAttribute<Cliente, Ocorrencias> ocorrenciasCollection;
    public static volatile CollectionAttribute<Cliente, Telefone> telefoneCollection;
    public static volatile CollectionAttribute<Cliente, EndCliente> endClienteCollection;
    public static volatile SingularAttribute<Cliente, String> nomeRazaoSocial;

}
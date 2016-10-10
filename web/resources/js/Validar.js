//Script Cadastro Clientes 
function validarForm() {
    if (document.formCliente.razaoSocial.value === "") {
        alert("Digite a Razão Social!");
        document.formCliente.razaoSocial.focus();
        return false;
    }
    if (document.formCliente.cpfCnpj.value === "") {
        alert("Digite o cnpj/cpf !");
        document.formCliente.cpfCnpj.focus();
        return false;
    }

    if (document.formCliente.endereco.value === "") {
        alert("Digite o endereço!");
        document.formCliente.endereco.focus();
        return false;
    }
    if (document.formCliente.num.value === "") {
        alert("Digite o Numero!");
        document.formCliente.endereco.focus();
        return false;
    }
    if (document.formCliente.bairro.value === "") {
        alert("Digite o Bairro!");
        document.formCliente.bairro.focus();
        return false;
    }

    if (document.formCliente.complemento.value === "") {
        alert("Digite o complemento!");
        document.formCliente.complemento.focus();
        return false;
    }

    if (document.formCliente.cidade.value === "") {
        alert("Digite o cidade!");
        document.formCliente.cidade.focus();
        return false;
    }

    if (document.formCliente.uf.value === "") {
        alert("Digite o estado!");
        document.formCliente.uf.focus();
        return false;
    }

    if (document.formCliente.cep.value === "") {
        alert("Digite o CEP!");
        document.formCliente.cep.focus();
        return false;
    }
    if (document.formCliente.telefone.value === "") {
        alert("Digite o telefone!");
        document.formCliente.telefone.focus();
        return false;
    }

    if (document.formCliente.email.value === "") {
        alert("Digite o Email!");
        document.formCliente.email.focus();
        return false;
    }
    if (document.formCliente.website.value === "") {
        alert("Digite o website!");
        document.formCliente.website.focus();
        return false;
    }
    if (document.formCliente.obsevacao.value === "") {
        alert("Digite o observações!");
        document.formCliente.obsevacao.focus();
        return false;
    }

}
//Script Vendas 
function  validarFormVendas() {
    //ADD VENDAS SCRIPT
    if (document.formVendas.vcpfCnpj.value === "") {
        alert("Digite o cnpj/cpf !");
        document.formVendas.vcpfCnpj.focus();
        return false;
    }
    if (document.formVendas.nomeVendas.value === "") {
        alert("Digite a Razão Social!");
        document.formVendas.nomeVendas.focus();
        return false;
    }
    if (document.formVendas.nomeProduto.value === "") {
        alert("Digite o nome do Produto!");
        document.formVendas.nomeProduto.focus();
        return false;
    }
    if (document.formVendas.valorVenda.value === "") {
        alert("Digite o Valor da Venda!");
        document.formVendas.valorVenda.focus();
        return false;
    }
     if (document.formVendas.valorCusto.value === "") {
        alert("Digite o Valor do Custo!");
        document.formVendas.valorCusto.focus();
        return false;
    }
      if (document.formVendas.quantidade.value === "") {
        alert("Digite a quantidade!");
        document.formVendas.quantidade.focus();
        return false;
    }
}
//Script Campanha
function validarCampanha(){


    }

//Script SAC
function validarSAC(){


 }





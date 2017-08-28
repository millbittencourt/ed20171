package br.ucsal.bes.ed20162.questao4;

	import java.util.Date;

	public class Questao04 {

	public static void main(String[] args){
	System.out.println("Vendas:");
	Questao04Venda venda=new Questao04Venda();
	int codigo=1;
	float valor=1000.0F;
	Date data=new Date();
	Questao04Item item = new Questao04Item();
	String nome="Item 1";
	float valoritem=500.0F;
	int codigoitem=1;
	if(venda.ehVazia()){
	System.out.println("Não existem vendas registradas.");
	}else{
	System.out.println("Existem vendas registradas.");
	}
	venda.inserirVenda(codigo, valor, data);
	venda.consultarVenda(codigo);
	venda.imprimeVenda(codigo);
	venda.imprimeItensVenda(codigo);
	venda.imprimeTodasAsVendas();
	item.inserirItem(codigoitem, nome, valoritem);
	if(item.consultarItem(codigoitem)){
	System.out.println("Esse item está cadastrado.");
	}else{
	System.out.println("Este item não está cadastrado.");
	}
	venda.insereItemVenda(codigo, item.getNoItem(codigoitem));
	venda.calculaValorTotalVenda(codigo);
	venda.imprimeVendasMaioresQue(valor-3);
	venda.imprimeVendasMenoresQue(valor+3);
	venda.removeVenda(codigo);
	venda.consultarVenda(codigo);
	if(venda.ehVazia()){
	System.out.println("Não existem vendas registradas.");
	}else{
	System.out.println("Existem vendas registradas.");
	}
	System.out.println("Fim.");
	}

	}


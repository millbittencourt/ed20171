package br.ucsal.bes.ed20162.questao4;

	import java.util.Date;

	public class Questao04Venda {

	private Questao04NoVenda venda;

	public void inserirVenda(int codigo, float valor, Date data){
	Questao04NoVenda novo = new Questao04NoVenda();
	novo.setCodigo(codigo);
	novo.setValor(valor);
	novo.setData(data);
	if(ehVazia())
	venda=novo;
	else{
	if(!consultarVenda(codigo)){
	Questao04NoVenda aux = venda;
	while(aux.getProx()!=null)
	aux=aux.getProx();
	aux.setProx(novo);
	}else{
	System.out.println("Venda já registrada!");
	}
	}
	}

	public void removeVenda(int codigo){
	if(ehVazia())
	System.out.println("Lista de vendas vazia!");
	else{
	Questao04NoVenda ant = null;
	Questao04NoVenda aux = venda;
	while(aux.getProx()!=null&&aux.getCodigo()!=codigo){
	ant=aux;
	aux=aux.getProx();
	}
	if(aux.getCodigo()==codigo)
	if(ant==null){
	venda=aux.getProx();
	aux=null;
	}else if(aux.getProx()==null){
	ant.setProx(null);
	aux=null;
	}else{
	ant.setProx(aux.getProx());
	aux=null;
	}
	else{
	System.out.println("Venda não encontrada!");
	}
	}
	}

	public boolean consultarVenda(int codigo){
	if(ehVazia())
	System.out.println("Lista de vendas vazia!");
	else{
	Questao04NoVenda aux = venda;
	while(aux.getProx()!=null&&aux.getCodigo()!=codigo)
	aux=aux.getProx();
	if(aux.getCodigo()==codigo)
	return true;
	}
	return false;
	}

	public void imprimeVenda(int codigo){
	if(ehVazia())
	System.out.println("Lista de vendas vazia!");
	else{
	Questao04NoVenda aux = venda;
	while(aux.getProx()!=null&&aux.getCodigo()!=codigo)
	aux=aux.getProx();
	if(aux.getCodigo()==codigo)
	System.out.println("Venda: " + aux.getCodigo() + " " + aux.getValor() + " " + aux.getData().toString() + ";");
	}
	}

	public void imprimeItensVenda(int codigo){
	if(ehVazia())
	System.out.println("Lista de vendas vazia!");
	else{
		Questao04NoVenda aux = venda;
	while(aux.getProx()!=null&&aux.getCodigo()!=codigo){
	aux=aux.getProx();
		}
	if(aux!=null){
	System.out.println("Venda: " + aux.getCodigo());
	Questao04NoItem item = aux.getItem();
	if(item!=null){
	while(item!=null){
	System.out.println("Item: " + item.getCodigo() + " - " + item.getNome() + " - " + item.getValor() + ";");
	item = item.getProx();
	}
	}else{
	System.out.println("Nenhum item encontrado.");
	}
	}
	}
	System.out.println("");
	}

	public void imprimeTodasAsVendas(){
	System.out.println("Lista de Todas as Vendas:");
	if(ehVazia())
	System.out.println("Lista de vendas vazia!");
	else{
	Questao04NoVenda aux = venda;
	while(aux.getProx()!=null){
	aux=aux.getProx();
	System.out.println("Venda: " + aux.getCodigo() + " " + aux.getValor() + " " + aux.getData() + ";");
	}
	}
	}

	public void calculaValorTotalVenda(int codigo){
	if(ehVazia())
	System.out.println("Lista de vendas vazia!");
	else{
		Questao04NoVenda aux = venda;
	while(aux.getProx()!=null&&aux.getCodigo()!=codigo){
	aux=aux.getProx();
	}
	if(aux!=null){
	System.out.println("Venda: " + aux.getCodigo());
	Questao04NoItem item = aux.getItem();
	float valortotal=aux.getValor();
	while(item!=null){
	valortotal=valortotal+(float)item.getValor();
	item = item.getProx();
	}
	System.out.println("R$ "+valortotal);
	}
	}
	System.out.println("");
	}

	public void imprimeVendasMaioresQue(float valor){
	if(ehVazia())
	System.out.println("Lista de vendas vazia!");
	else{
	Questao04NoVenda aux = venda;
	System.out.println("Vendas maiores que: "+valor);
	while(aux!=null){
	if(aux.getValor()>valor){
	System.out.println("Venda: " + aux.getCodigo() + " - R$ "+aux.getValor() + ";");
	}
	aux=aux.getProx();
	}
	}
	}

	public void imprimeVendasMenoresQue(float valor){
	if(ehVazia())
	System.out.println("Lista de vendas vazia!");
	else{
	Questao04NoVenda aux = venda;
	System.out.println("Vendas menores que: "+valor);
	while(aux!=null){
	if(aux.getValor()<valor){
	System.out.println("Venda: " + aux.getCodigo() + " - R$ "+aux.getValor() + ";");
	}
	aux=aux.getProx();
	}
	}
	}

	public boolean ehVazia(){
	if(venda==null)
	return true;
	else
	return false;
	}

	public void insereItemVenda(int codigovenda, Questao04NoItem item){
	if(ehVazia())
	System.out.println("Lista de vendas vazia!");
	else{
	Questao04NoVenda aux = venda;
	while(aux.getProx()!=null&&aux.getCodigo()!=codigovenda)
	aux=aux.getProx();
	if(aux!=null){
	aux.setItem(item);
	}
	}
	}

	}


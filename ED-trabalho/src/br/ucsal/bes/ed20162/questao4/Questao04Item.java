package br.ucsal.bes.ed20162.questao4;

public class Questao04Item {

private Questao04NoItem item;

public void inserirItem(int codigo, String nome, double valor){
Questao04NoItem novo = new Questao04NoItem();
novo.setCodigo(codigo);
novo.setNome(nome);
novo.setValor(valor);
if(ehVazia())
item=novo;
else{
if(!consultarItem(codigo)){
Questao04NoItem aux = item;
while(aux.getProx()!=null)
aux=aux.getProx();
aux.setProx(novo);
}else{
System.out.println("Item já registrado!");
}
}
}

public void removeItem(int codigo){
if(ehVazia())
System.out.println("Lista de items vazia!");
else{
Questao04NoItem ant = null;
Questao04NoItem aux = item;
while(aux.getProx()!=null&&aux.getCodigo()!=codigo){
ant=aux;
aux=aux.getProx();
}
if(aux.getCodigo()==codigo)
if(ant==null){
item=aux.getProx();
aux=null;
}else if(aux.getProx()==null){
ant.setProx(null);
aux=null;
}else{
ant.setProx(aux.getProx());
aux=null;
}
else{
System.out.println("Item não encontrado!");
}
}
}

public boolean consultarItem(int codigo){
if(ehVazia())
System.out.println("Lista de items vazia!");
else{
Questao04NoItem aux = item;
while(aux.getProx()!=null&&aux.getCodigo()!=codigo)
aux=aux.getProx();
if(aux.getCodigo()==codigo)
return true;
}
return false;
}

public boolean ehVazia(){
if(item==null)
return true;
else
return false;
}

public Questao04NoItem getNoItem(int codigo){
if(ehVazia()){
System.out.println("Lista de itens vazia.");
}else{
Questao04NoItem aux = item;
while(aux.getProx()!=null&&aux.getCodigo()!=codigo)
aux=aux.getProx();
if(aux.getCodigo()==codigo)
return aux;
}
return null;	
}

}

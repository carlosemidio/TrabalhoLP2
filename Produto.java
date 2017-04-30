package br.imd.modelo;

public class Produto {
	private String codigoProduto;
	private String descricaoProduto;
	private String unidadeProduto;
	
	public Produto(String codigoProduto, String descricaoProduto, String unidadeProduto) {
		super();
		this.codigoProduto = codigoProduto;
		this.descricaoProduto = descricaoProduto;
		this.unidadeProduto = unidadeProduto;
	}
	
	public String toString(){
		return ("\nC�digo: "+this.codigoProduto+"\nDescri��o: "+this.descricaoProduto+"\nUnidade: "+this.unidadeProduto);
	}
}

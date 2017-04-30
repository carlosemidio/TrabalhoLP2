package br.imd.modelo;

public class Fornecedor {
	
	private String codigoFornecedor;
	private String nomeFornecedor;
	private String cnpjFornecedor;
	
	
	public Fornecedor(String codigoFornecedor, String nomeFornecedor, String cnpjFornecedor) {
		super();
		this.codigoFornecedor = codigoFornecedor;
		this.nomeFornecedor = nomeFornecedor;
		this.cnpjFornecedor = cnpjFornecedor;
	}
	
	public String toString(){
		return ("\nCódigo: "+this.codigoFornecedor+"\nNome: "+this.nomeFornecedor+"\nCNPJ: "+this.cnpjFornecedor);
	}
}

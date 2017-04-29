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
}

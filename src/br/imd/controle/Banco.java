package br.imd.controle;

import java.util.ArrayList;

import br.imd.modelo.Cliente;
import br.imd.modelo.Fornecedor;
import br.imd.modelo.Produto;

public class Banco {
	private ArrayList<Cliente>  clientes 	   = new ArrayList<>();
	private ArrayList<Fornecedor> fornecedores = new ArrayList<>();
	private ArrayList<Produto> produtos        = new ArrayList<>();
	
	public void inserirCliente(Cliente c){
		clientes.add(c);
	}
	public void inserirFornecedor(Fornecedor f){
		fornecedores.add(f);
	}
	public void inserirProduto(Produto p){
		produtos.add(p);
	}
	
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public ArrayList<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
}

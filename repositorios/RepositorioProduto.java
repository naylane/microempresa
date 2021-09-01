package repositorios;

import java.util.ArrayList;
import java.util.List;

import microempresa.Produto;

public class RepositorioProduto {
	
	private List<Produto>listaDeProdutos;
	
	public RepositorioProduto() {
		this.listaDeProdutos = new ArrayList<>();
	}
	
	
	public Produto getProduto(int codigo) {
		for (Produto produto : this.listaDeProdutos) {
			if(produto.getCodigo() == codigo) {
				return produto;
			}
		} 
		throw new IllegalArgumentException("Produto não encontrado.");
	}
	
	
	public void adicionarProduto(Produto produto) {
		this.listaDeProdutos.add(produto);
	}
	
	
	public void removerProduto(Produto produto) {
		this.listaDeProdutos.remove(produto);
	}


	public List<Produto> exibirTodosProdutos() {
		return new ArrayList<>(listaDeProdutos);
	}
	
	
	
}

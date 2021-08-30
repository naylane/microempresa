package repositorios;

import java.util.List;

import microempresa.Produto;

public class RepositorioProduto {
	
	
	private List<Produto>listaDeProdutos;
	
	
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
	
	
	public void editarQuantidade() {
	

	}

	
	public List<Produto> exibirTodosProdutos() {
		return this.listaDeProdutos;
	}
	
	
	
}

package microempresa;

import java.util.List;

public class RepositorioProduto {
	
	
	private List<Produto>listaDeProdutos;
	
	
	public Produto getProduto(int codigo) {
		for (Produto produto : this.listaDeProdutos) {
			if(produto.getCodigo() == codigo) {
				return produto;
			}
		} throw new RuntimeException("Produto não encontrado.");
	}
	
	
	public void adicionarProduto(Produto produto) {
		this.listaDeProdutos.add(produto);
	}
	
	
	public void removerProduto(Produto produto) {
		this.listaDeProdutos.remove(produto);
	}
	
	
	public void editarProduto() {
		
	}

	
	public List<Produto> exibirTodosProdutos() {
		return this.listaDeProdutos;
	}
	
	
	
}

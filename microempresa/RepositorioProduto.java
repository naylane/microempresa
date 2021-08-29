package microempresa;

import java.util.List;

public class RepositorioProduto {
	
	
	private List<Produto>listaDeProdutos;
	
	
	public Produto selecionarProduto(int codigo) { // getProduto
		for (Produto produto : this.listaDeProdutos) {
			if(produto.getCodigo() == codigo) {
				return produto;
			}
		} throw new RuntimeException("Produto n�o encontrado.");
	}
	
	
	public void adicionarProduto(Produto produto) {
		this.listaDeProdutos.add(produto);
	}
	
	
	public void removerProduto(Produto produto) {
		this.listaDeProdutos.remove(produto);
	}

	
}

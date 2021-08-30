package microempresa;

public class LinhaDeVenda {
	private int quantidade;
	private Produto produto;
	
	public LinhaDeVenda(int quantidade, Produto produto) {
		this.quantidade=quantidade;
		this.produto=produto;
	}

	public int getQuantidade() {
		return this.quantidade;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public int getPreco() {
		return this.produto.getPreco();
	}
	
}

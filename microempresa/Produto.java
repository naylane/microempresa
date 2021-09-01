package microempresa;

public class Produto {
	
	private String nomeDoProduto;
	private int preco;
	private int quantidade;
	private int codigo;

	private static int contadorDeProduto;
	
	public Produto(String nomeDoProduto, int preco, int quantidade){
		this.nomeDoProduto = nomeDoProduto;
		this.preco = preco;	
		this.quantidade = quantidade;
		codigo = gerarCodigo();
	}
	
	
	public static int gerarCodigo() {
		return contadorDeProduto++;
	}
	
	
	public int getCodigo() {
		return this.codigo;
	}
	
	
	public String getNomeDoProduto() {
		return this.nomeDoProduto;
	}
	
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	
	public int getPreco() {
		return this.preco;
	}
	
	
	public void setQuantidade(int quantidadeNova) {
		this.quantidade=quantidadeNova;
	}
	
	
	public void setPreco(int precoNovo) {
		this.preco=precoNovo;
	}
	
	
	public String toString() {
		String nomeDoProduto=this.nomeDoProduto;
		int quantidade=this.quantidade;
		int preco=this.preco;
		int codigo=this.codigo;
		
		return "| Codigo: " + codigo + "; Produto: " + nomeDoProduto + "; Preço: " + preco + "; Quantidade: " + quantidade + " | ";
	}

}

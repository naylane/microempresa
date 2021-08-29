package microempresa;

public class Produto {
	
	String nomeDoProduto;
	int quantidade;
	int preco;
	int codigo;

	private static int contadorDeProduto;
	
	public Produto(String nomeDoProduto, int quantidade, int preco){
		this.nomeDoProduto = nomeDoProduto;
		this.quantidade = quantidade;
		this.preco = preco;	
		codigo = gerarCodigo();
	}
	
	public static int gerarCodigo() {
		return contadorDeProduto++;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String nomeDoProduto() {
		return this.nomeDoProduto;
	}
	
	public int quantidade() {
		return this.quantidade;
	}
	
	public int preco() {
		return this.preco;
	}

}

package microempresa;

public class Produto {
	
	String nomeDoProduto;
	int codigo;
	int quantidade;
	int preco;
	date dataDeValidade;
	
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
		
	}

}

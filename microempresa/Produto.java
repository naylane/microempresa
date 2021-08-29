package microempresa;

public class Produto {
	
	String nomeDoProduto;
	int preco;
	int quantidade;
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
		
	}

}

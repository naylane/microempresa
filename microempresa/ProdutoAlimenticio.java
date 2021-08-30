package microempresa;

import java.util.Date;

public class ProdutoAlimenticio extends Produto{
	
	public ProdutoAlimenticio(String nomeDoProduto, int quantidade, int preco) {
		super(nomeDoProduto, quantidade, preco);
	}

	Date dataDeValidade;
	
}

package microempresa;

public class InterfaceProduto {
	
	private RepositorioProduto repositorioProduto;
	
	
	public InterfaceProduto(RepositorioProduto repositorioProduto) {
		
	}
	
	
	public void gerenciarProduto() {
		
		int opcao;
		
		do {
			System.out.println("---- Gereciamento de Produto ----");
			System.out.println("Essas s�o as op��es:");
			System.out.println("1- Selecionar Produto");
			System.out.println("2- Adicionar Produto");
			System.out.println("0- Voltar para o menu principal");	
			System.out.println("Selecione a op��o desejada:");
			opcao = ler.nextInt();
		}while(opcao!=0);
		
		
		
	}
	
}

package microempresa;

import java.util.Scanner;

public class InterfaceProduto {
	
	private RepositorioProduto repositorioProduto;
	private Scanner ler;
	
	public InterfaceProduto(RepositorioProduto repositorioProduto, Scanner ler) {
		if(repositorioProduto==null) {
			throw new IllegalArgumentException("Não é possível criar interface produto sem repositório");
		}
		this.repositorioProduto = repositorioProduto;
		this.ler = ler;
	}
	
	
	public void gerenciarProduto() {
		
		int opcao;
		
		do {
			System.out.println("---- Gereciamento de Produto ----");
			System.out.println("Essas são as opções:");
			System.out.println("1- Adicionar Produto");
			System.out.println("2- Remover Produto");
			System.out.println("0- Voltar para o menu principal");	
			System.out.println("Selecione a opção desejada:");
			opcao = ler.nextInt();
			
			switch(opcao) {
				case 1:
					adicionarProduto();
					break;
				case 2:
					removerProduto();
					break;	
			}	
		}while(opcao!=0);
	}
	
	String respostaDeConfirmacao;
	boolean operacaoCancelada=false;
	boolean confirmacao;
		
	private void adicionarProduto(Scanner ler) {
		String nomeDoProduto;
		int preco;
		int quantidade;
		
		do {
			System.out.println("Qual o nome do produto que deseja adicionar?");
			nomeDoProduto = ler.nextLine();
			System.out.println("Digite o preço da unidade:");
			preco = ler.nextInt();
			System.out.println("Digite a quantidade do produto:");
			quantidade = ler.nextInt();
			System.out.println("Por favor, confirme os dados a seguir:");
			System.out.println("Produto: " + nomeDoProduto);
			System.out.println("Se os dados estão corretos, digite 'sim'. Para cancelar a ação, digite 'cancelar'");
			respostaDeConfirmacao = ler.nextLine();
			confirmacao = respostaDeConfirmacao.equalsIgnoreCase("sim");
			operacaoCancelada = respostaDeConfirmacao.equalsIgnoreCase("cancelar");
		}while(!(confirmacao || operacaoCancelada));
		
		if(confirmacao) {
			Produto produto = null;
			produto = new Produto(nomeDoProduto, preco, quantidade);
			this.repositorioProduto.adicionarProduto(produto);
		}
	}
	
	private void removerProduto(Scanner ler) {
		
		
	}
	
}

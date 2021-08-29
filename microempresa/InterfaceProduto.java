package microempresa;

import java.util.List;
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
			System.out.println("2- Selecionar Produto");
			System.out.println("3- Editar Produto");
			System.out.println("4- Exibir todos os produtos");
			System.out.println("0- Voltar para o menu principal");	
			System.out.println("Selecione a opção desejada:");
			opcao = ler.nextInt();
			
			switch(opcao) {
				case 1:
					adicionarProduto();
					break;
				case 2:
					selecionarProduto();
					break;	
				case 3:
					editarProduto();
					break;
				case 4:
					exibirTodosProdutos();
					break;
			}	
		}while(opcao!=0);
	}
	
	
	boolean operacaoCancelada=false;
	boolean confirmacao;
	
	
	private void adicionarProduto() {
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
			System.out.println("Produto: " + nomeDoProduto + " Preço: " + preco + " Quantidade: " + quantidade);
			System.out.println("Se os dados estão corretos, digite 'sim'. Para cancelar a ação, digite 'cancelar'");
			String respostaDeConfirmacao = ler.nextLine();
			confirmacao = respostaDeConfirmacao.equalsIgnoreCase("sim");
			operacaoCancelada = respostaDeConfirmacao.equalsIgnoreCase("cancelar");
		}while(!(confirmacao || operacaoCancelada));
		
		if(confirmacao) {
			Produto produto = null;
			produto = new Produto(nomeDoProduto, preco, quantidade);
			this.repositorioProduto.adicionarProduto(produto);
		}
	}
	
	
	private Produto selecionarProduto() {	
		int codigo;
		Produto produtoSelecionado;
		boolean repete=false;
		
		do {
			System.out.println("Digite o codigo do produto:");
			codigo = this.ler.nextInt();
			produtoSelecionado = this.repositorioProduto.getProduto(codigo);
			
			if(produtoSelecionado==null) {
				System.out.println("Produto não encontrado. Se deseja tentar novamente, digite 'sim'");
				String respostaDeConfirmacao = ler.nextLine();
				confirmacao = respostaDeConfirmacao.equalsIgnoreCase("sim");
				if(confirmacao) {
					repete=true;
				}else {
					repete=false;
				}
			}else {
				repete=false;
			}
		}while(repete);	
		return produtoSelecionado;
	}
	
	
	private void editarProduto() {
		int opcao;
		Produto produtoSelecionado = this.selecionarProduto();
		
		if(produtoSelecionado!=null) { // usuário não cancelou
			do {
				System.out.println("Essas são os dados que você pode editar:");
				System.out.println("1- Editar a quantidade");
				System.out.println("2- Editar o preço");
				System.out.println("0- Sair");
				
				switch(opcao) {
					case 1:
				
			
				}
				
				
				
			}while(opcao!=0);
			
			
			
			
			
		}
		
		
		
	}
	
	
	private List<Produto> exibirTodosProdutos() {
		System.out.println("Esses são todos os atuais produtos cadastrados no sistema:");
		return this.repositorioProduto.exibirTodosProdutos();
	}
	
	
}

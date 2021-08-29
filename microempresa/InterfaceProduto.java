package microempresa;

import java.util.List;
import java.util.Scanner;

public class InterfaceProduto {
	
	private RepositorioProduto repositorioProduto;
	private Scanner ler;
	
	public InterfaceProduto(RepositorioProduto repositorioProduto, Scanner ler) {
		if(repositorioProduto==null) {
			throw new IllegalArgumentException("N�o � poss�vel criar interface produto sem reposit�rio");
		}
		this.repositorioProduto = repositorioProduto;
		this.ler = ler;
	}
	
	
	public void gerenciarProduto() {
		
		int opcao;
		
		do {
			System.out.println("---- Gereciamento de Produto ----");
			System.out.println("Essas s�o as op��es:");
			System.out.println("1- Adicionar Produto");
			System.out.println("2- Selecionar Produto");
			System.out.println("3- Editar Produto");
			System.out.println("4- Exibir todos os produtos");
			System.out.println("0- Voltar para o menu principal");	
			System.out.println("Selecione a op��o desejada:");
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
			System.out.println("Digite o pre�o da unidade:");
			preco = ler.nextInt();
			System.out.println("Digite a quantidade do produto:");
			quantidade = ler.nextInt();
			System.out.println("Por favor, confirme os dados a seguir:");
			System.out.println("Produto: " + nomeDoProduto + " Pre�o: " + preco + " Quantidade: " + quantidade);
			System.out.println("Se os dados est�o corretos, digite 'sim'. Para cancelar a a��o, digite 'cancelar'");
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
				System.out.println("Produto n�o encontrado. Se deseja tentar novamente, digite 'sim'");
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
		
		if(produtoSelecionado!=null) { // usu�rio n�o cancelou
			do {
				System.out.println("Essas s�o os dados que voc� pode editar:");
				System.out.println("1- Editar a quantidade");
				System.out.println("2- Editar o pre�o");
				System.out.println("0- Sair");
				
				switch(opcao) {
					case 1:
				
			
				}
				
				
				
			}while(opcao!=0);
			
			
			
			
			
		}
		
		
		
	}
	
	
	private List<Produto> exibirTodosProdutos() {
		System.out.println("Esses s�o todos os atuais produtos cadastrados no sistema:");
		return this.repositorioProduto.exibirTodosProdutos();
	}
	
	
}

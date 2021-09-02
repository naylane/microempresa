package interfaces;

import java.util.List;
import java.util.Scanner;

import microempresa.Produto;
import repositorios.RepositorioProduto;

public class InterfaceProduto {
	
	private RepositorioProduto repositorioProduto;
	private Scanner ler;
	
	public InterfaceProduto(RepositorioProduto repositorioProduto, Scanner ler) {
		if(repositorioProduto==null) {
			throw new IllegalArgumentException("N�o � poss�vel criar interface sem o reposit�rio.");
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
			System.out.println("2- Remover Produto");
			System.out.println("3- Editar Produto");
			System.out.println("4- Exibir um produto");
			System.out.println("5- Exibir todos os produtos");
			System.out.println("0- Voltar para o menu principal");	
			System.out.println("Selecione a op��o desejada:");
			opcao = ler.nextInt();
			ler.nextLine();
			
			switch(opcao) {
				case 1:
					adicionarProduto();
					break;
				case 2:
					removerProduto();
					break;	
				case 3:
					editarProduto();
					break;
				case 4:
					exibirProduto();
					break;
				case 5:
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
			ler.nextLine();
			System.out.println("Digite a quantidade do produto:");
			quantidade = ler.nextInt();
			ler.nextLine();
			System.out.println("Por favor, confirme os dados a seguir:");
			System.out.println("Produto: " + nomeDoProduto + "; Pre�o: " + preco + "; Quantidade: " + quantidade);
			System.out.println("Se os dados est�o corretos, digite 'sim'. Para cancelar a a��o, digite 'cancelar'");
			String respostaDeConfirmacao = ler.nextLine();
			confirmacao = respostaDeConfirmacao.equalsIgnoreCase("sim");
			operacaoCancelada = respostaDeConfirmacao.equalsIgnoreCase("cancelar");
		}while(!(confirmacao || operacaoCancelada));
		
		if(confirmacao) {
			Produto produto = null;
			produto = new Produto(nomeDoProduto, preco, quantidade);
			this.repositorioProduto.adicionarProduto(produto);
			System.out.println("Produto adicionado com sucesso!");
		}
	}
	
	
	private Produto selecionarProduto() {	
		int codigo;
		Produto produtoSelecionado;
		boolean repete=false;
		
		do {
			System.out.println("Digite o codigo do produto:");
			codigo = this.ler.nextInt();
			ler.nextLine();
			produtoSelecionado = this.repositorioProduto.getProduto(codigo);
			System.out.println("Esse foi o produto selecionado: " + produtoSelecionado);
			
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
	
	
	private void removerProduto(){
		
		Produto produtoSelecionado = this.selecionarProduto();
		
		if(produtoSelecionado!=null) {
			
			do {
				System.out.println("Tem certeza que deseja remover essa produto?");
				System.out.println("Digite 'sim' para remover ou 'cancelar' para cancelar a a��o.");
				String respostaDeConfirmacao = ler.nextLine();
				confirmacao = respostaDeConfirmacao.equalsIgnoreCase("sim");
				operacaoCancelada = respostaDeConfirmacao.equalsIgnoreCase("cancelar");
			}while(!(confirmacao || operacaoCancelada));
		}
		
		if(confirmacao) {
			this.repositorioProduto.removerProduto(produtoSelecionado);
			System.out.println("Produto removido com sucesso.");
		}
		
	}
	
	
	private void editarProduto() {
		int opcao=0;
					
			do {
				System.out.println("Esses s�o os dados que voc� pode editar:");
				System.out.println("1- Editar a quantidade");
				System.out.println("2- Editar o pre�o");
				System.out.println("0- Sair");
				System.out.println("Digite a op��o desejada:");
				opcao = ler.nextInt();
				ler.nextLine();
				
				switch(opcao) {
					case 1:
						editarQuantidade();
						break;
					case 2:
						editarPreco();
						break;
				}

			}while(opcao!=0);	

	}

	
	private void editarQuantidade() {
		boolean operacaoCancelada=false;
		boolean confirmacao;
		int quantidadeNova;
		Produto produtoSelecionado = this.selecionarProduto();
		
		do {
			System.out.println("Digite a nova quantidade:");
			quantidadeNova = ler.nextInt();
			ler.nextLine();
			System.out.println("Tem certeza que deseja alterar esse produto?: " + produtoSelecionado);
			System.out.println("Digite 'sim' para continuar ou 'cancelar' para cancelar a a��o:");
			String respostaDeConfirmacao = ler.nextLine();
			confirmacao = respostaDeConfirmacao.equalsIgnoreCase("sim");
			operacaoCancelada = respostaDeConfirmacao.equalsIgnoreCase("cancelar");
		}while(!(confirmacao || operacaoCancelada));
		
		if(confirmacao) {
			produtoSelecionado.setQuantidade(quantidadeNova);
			System.out.println("A quantidade do produto foi alterada com sucesso!");
		}
	}
	
		
	private void editarPreco() {
			int precoNovo;
			Produto produtoSelecionado = this.selecionarProduto();
			
			System.out.println("Digite o novo pre�o:");
			precoNovo = ler.nextInt();
			ler.nextLine();
			produtoSelecionado.setPreco(precoNovo);
			System.out.println("O pre�o do produto foi alterado com sucesso!");	
	}
	
	
	private Produto exibirProduto() {
		Produto produtoSelecionado = this.selecionarProduto();
		
		return produtoSelecionado;
	}
		
	
	private List<Produto> exibirTodosProdutos() {
		System.out.println("Esses s�o todos os atuais produtos cadastrados no sistema:");
		System.out.println(this.repositorioProduto.exibirTodosProdutos());
		
		return this.repositorioProduto.exibirTodosProdutos();
	}
	
	
}

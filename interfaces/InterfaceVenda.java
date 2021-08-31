package interfaces;

import java.util.List;
import java.util.Scanner;

import microempresa.Venda;
import repositorios.RepositorioVenda;

public class InterfaceVenda {
	
	private RepositorioVenda repositorioVenda;
	private Scanner ler;
	
	public InterfaceVenda(RepositorioVenda repositorioVenda, Scanner ler) {
		if(repositorioVenda==null) {
			throw new IllegalArgumentException("N�o � poss�vel criar a interface sem o reposit�rio");
		}
		this.repositorioVenda=repositorioVenda;
		this.ler=ler;
	}
	
	
	public void gerenciarVenda() {
		int opcao;
		
		do {
			System.out.println("---- Gerenciamento de Vendas ----");
			System.out.println("Essas s�o as op��es disponiv�is:");
			System.out.println("1- Adicionar Venda");
			System.out.println("2- Remover Venda");
			System.out.println("3- Exibir todas as vendas");
			System.out.println("0- Sair");
			System.out.println("Digite o n�mero da op��o desejada:");
			opcao = ler.nextInt();
			
			switch(opcao) {
				case 1:
					adicionarVenda();
					break;
				case 2: 
					removerVenda();
					break;
				case 3:
					exibirTodasVendas();
					break;
			}
		}while(opcao!=0);
	}
	
	
	boolean operacaoCancelada=false;
	boolean confirmacao;
	
	
	private void adicionarVenda() {
		int codigo;
		int valor;
		
		do {
			System.out.println("Qual o c�digo da venda que deseja adicionar?");
			codigo = ler.nextInt();
			ler.nextLine();
			System.out.println("Digite o valor total da venda:");
			valor = ler.nextInt();
			ler.nextLine();
			System.out.println("Por favor, confirme os dados a seguir:");
			System.out.println("C�digo: " + codigo + "; Valor total: " + valor);
			System.out.println("Se os dados est�o corretos, digite 'sim'. Para cancelar a a��o, digite 'cancelar'.");
			String respostaDeConfirmacao = ler.nextLine();
			confirmacao=respostaDeConfirmacao.equalsIgnoreCase("sim");
			operacaoCancelada = respostaDeConfirmacao.equalsIgnoreCase("cancelar");
		}while(!(confirmacao || operacaoCancelada));
		
		if(confirmacao) {
			Venda venda = null;
			venda = new Venda(codigo, valor);
			this.repositorioVenda.adicionarVenda(venda);
			System.out.println("Venda adicionada com sucesso!");
		}	
	}
	
	
	private Venda selecionarVenda() {	
		int codigo;
		Venda vendaSelecionada;
		boolean repete=false;
		
		do {
			System.out.println("Digite o codigo da venda:");
			codigo = this.ler.nextInt();
			ler.nextLine();
			vendaSelecionada = this.repositorioVenda.getVenda(codigo);
			
			if(vendaSelecionada==null) {
				System.out.println("Venda n�o encontrada. Se deseja tentar novamente, digite 'sim'");
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
		return vendaSelecionada;
	}
	
	
	private void removerVenda() {
		Venda vendaSelecionada = this.selecionarVenda();
		
		
		if(vendaSelecionada!=null) {
			
			do {
				System.out.println("Tem certeza que deseja remover essa venda?");
				System.out.println("Digite 'sim' para remover ou 'cancelar' para cancelar a a��o.");
				String respostaDeConfirmacao = ler.nextLine();
				confirmacao = respostaDeConfirmacao.equalsIgnoreCase("sim");
				operacaoCancelada = respostaDeConfirmacao.equalsIgnoreCase("cancelar");
			}while(!(confirmacao || operacaoCancelada));
		}
		
		if(confirmacao) {
			this.repositorioVenda.removerVenda(vendaSelecionada);
			System.out.println("Venda removida com sucesso.");
		}
		
	}
	
	
	private List<Venda> exibirTodasVendas() {
		System.out.println("Essas s�o todas as vendas:");
		System.out.println(this.repositorioVenda.exibirTodasVendas());
		return this.repositorioVenda.exibirTodasVendas();
	}
	
	

}

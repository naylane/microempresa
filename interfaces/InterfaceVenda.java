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
			throw new IllegalArgumentException("Não é possível criar a interface sem o repositório");
		}
		this.repositorioVenda=repositorioVenda;
		this.ler=ler;
	}
	
	
	public void gerenciarVenda() {
		int opcao;
		
		do {
			System.out.println("---- Gerenciamento de Vendas ----");
			System.out.println("Essas são as opções disponivéis:");
			System.out.println("1- Adicionar Venda");
			System.out.println("2- Remover Venda");
			System.out.println("3- Exibir todas as vendas");
			System.out.println("0- Sair");
			System.out.println("Digite o número da opção desejada:");
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
			System.out.println("Qual o valor da venda que deseja adicionar?");
			valor = ler.nextInt();
			
			
		}while(!(confirmacao || operacaoCancelada));
		
		
		
	}
	
	
	private void removerVenda() {
		
	}
	
	
	private List<Venda> exibirTodasVendas() {
		System.out.println("Essas são todas as vendas:");
		return this.repositorioVenda.exibirTodasVendas();
	}
	
	

}

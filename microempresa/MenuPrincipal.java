package microempresa;

import java.util.Scanner;

import interfaces.InterfaceCliente;
import interfaces.InterfaceProduto;
import interfaces.InterfaceVenda;
import repositorios.RepositorioProduto;
import repositorios.RepositorioVenda;

public class MenuPrincipal {
	
	
	private InterfaceCliente interfaceCliente;
	private InterfaceProduto interfaceProduto;
	private InterfaceVenda interfaceVenda;
	private Scanner ler;
	
	
	public MenuPrincipal(RepositorioCliente repositorioCliente, RepositorioProduto repositorioProduto, RepositorioVenda repositorioVenda) {
		this.ler = new Scanner(System.in);
		this.interfaceCliente = new InterfaceCliente(repositorioCliente, ler);
		this.interfaceProduto = new InterfaceProduto(repositorioProduto, ler);
		this.interfaceVenda = new InterfaceVenda(repositorioVenda, ler);
	}


	public void iniciarGerenciamento() {

		int opcao;
		
		do {	
			System.out.println("---- Menu Principal ----");
			System.out.println("Essas são as opçoes de gerenciamento do menu:");
			System.out.println("1- Clientes");
			System.out.println("2- Produtos");
			System.out.println("3- Vendas");
			System.out.println("0- Sair");
			System.out.println("Selecione a opção desejada:");
			opcao = ler.nextInt();
			
			switch(opcao) {
				case 1: 
					this.interfaceCliente.gerenciarCliente();
					break;
				case 2:
					this.interfaceProduto.gerenciarProduto();
					break;
				case 3:
					this.interfaceVenda.gerenciarVenda();
					break;
			}
		}while (opcao!=0);
		
	}
	
}
	


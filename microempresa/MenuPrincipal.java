package microempresa;

import java.util.Scanner;

public class MenuPrincipal {

	private InterfaceCliente interfaceCliente;
	private InterfaceProduto interfaceProduto;
	private InterfaceVenda interfaceVenda;
	private Scanner ler;
	
	
	public MenuPrincipal() {
		this.ler = new Scanner(System.in);
		InterfaceCliente interfaceCliente;
		InterfaceProduto interfaceProduto;
		InterfaceVenda interfaceVenda;
	}

	
	public void iniciarGerenciamento(){

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
			
					break;
				case 2:
			
					break;
				case 3:
			
					break;
			}
		
		}while (opcao!=0);
		
		
		
		
	}

}

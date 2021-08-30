package microempresa;

import java.util.Scanner;

public class InterfaceCliente {
	
	private RepositorioClientes repositorioClientes;
	private Scanner ler;
	
	public InterfaceCliente (RepositorioClientes repositorioCliente, Scanner ler) {
		this.ler = ler;	
	}
	
	
	public void gerenciarCliente() {
		int opcao;	
		do { 
			System.out.println("---- Gereciamento de Clientes ----");
			System.out.println("Essas s�o as op��es:");
			System.out.println("1- Adicionar cliente");
			System.out.println("2- Selecionar cliente");
			System.out.println("3- Remover cliente");
			System.out.println("0- Voltar para o menu principal");	
			System.out.println("Selecione a op��o desejada:");
			opcao = ler.nextInt();
			switch(opcao) {
			
			case 1:
			  adicionarCliente();
			  break;
			case 2:
			  selecionarCliente();
			  break;
			case 3:
			  removerCliente();
			  break;
			}
		} while (opcao != 0);
			
	}
	
	public static Cliente selecionarCliente() {
		
	}
	
	boolean operacaoCancelada=false;
	boolean operacaoConfirmada;
	
	private void adicionarCliente() {
		String nomeDoCliente;
		long cpf;
		String endereco;
		long numeroDeCelular;
		
		do{
			System.out.println("Digite o nome do Cliente/Usu�rio: ");
			nomeDoCliente = ler.nextLine();
			System.out.println("Digite o seu CPF: ");
			cpf = ler.nextLong();
			System.out.println("Digite o seu endere�o: ");
			endereco = ler.nextLine();
			System.out.println("Digite o n�mero de celular: ");
			numeroDeCelular = ler.nextLong();
			System.out.println("Deseja adicionar esta conta? ");
			String resposta = ler.nextLine();
			
		}while{(!(operacaoConfirmada || operacaoCancelada));
		
		
	}
	
	public InterfaceCliente removerCliente() {
		
	}
	

}

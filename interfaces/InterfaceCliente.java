package interfaces;


import java.util.List;
import java.util.Scanner;

import microempresa.Cliente;
import microempresa.RepositorioClientes;



public class InterfaceCliente {
	
	private RepositorioClientes repositorioClientes;
	public Scanner ler;
	
	public InterfaceCliente (RepositorioClientes repositorioCliente, Scanner ler) {
		this.repositorioClientes=repositorioCliente;
		this.ler = ler;	
	}
	
	
	public void gerenciarCliente() {
		int opcao;	
		do { 
			System.out.println("---- Gereciamento de Clientes ----");
			System.out.println("Essas são as opções:");
			System.out.println("1- Adicionar cliente");
			System.out.println("2- Selecionar cliente");
			System.out.println("3- Remover cliente");
			System.out.println("4- Exibir lista de clientes");
			System.out.println("0- Voltar para o menu principal");	
			System.out.println("Selecione a opção desejada: ");
			opcao = ler.nextInt();
			ler.nextLine();
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
			case 4:
			  exibirClientes();
			}
		} while (opcao != 0);
			
	}
	
	private List<Cliente> exibirClientes() {
		System.out.println("Esses são todos os clientes que foram cadastrados no sistema: ");
		return this.repositorioClientes.exibirClientes();
		
	}
	
	public Cliente selecionarCliente() {
		long codigoDoCliente;
		Cliente clienteSelecionado;
        boolean repete=false;
		
		do {
			System.out.println("Digite o codigo do Usuário/cliente: ");
			codigoDoCliente = this.ler.nextLong();
			ler.nextLine();
			clienteSelecionado = this.repositorioClientes.getCliente(codigoDoCliente);
			
			if(clienteSelecionado==null) {
				System.out.println("Cliente/usuário não encontrado. Se deseja tentar novamente, digite 'sim'");
				String respostaDeConfirmacao = ler.nextLine();
				operacaoConfirmada = respostaDeConfirmacao.equalsIgnoreCase("sim");
				if(operacaoConfirmada) {
					repete=true;
				}else {
					repete=false;
				}
			}else {
				repete=false;
			}
		}while(repete);	
		return clienteSelecionado;
	}
		
		
	
	boolean operacaoCancelada=false;
	boolean operacaoConfirmada;
	
	public void adicionarCliente() {
		String nomeDoCliente;
		long cpf;
		String endereco;
		long numeroDeCelular;
		
		do{
			System.out.println("Digite o nome do Cliente/Usuário: ");
			nomeDoCliente = ler.nextLine();
			System.out.println("Digite o seu CPF: ");
			cpf = ler.nextLong();
			ler.nextLine();
			System.out.println("Digite o seu endereço: ");
			endereco = ler.nextLine();
			System.out.println("Digite o número de celular: ");
			numeroDeCelular = ler.nextLong();
			ler.nextLine();
			System.out.println("Deseja adicionar esta conta? ");
			String resposta = ler.nextLine();
			operacaoConfirmada = resposta.equalsIgnoreCase("sim");
			operacaoCancelada = resposta.equalsIgnoreCase("não");
			
		}while(!(operacaoConfirmada || operacaoCancelada));
		
		if (operacaoConfirmada) {
			Cliente cliente = null;
			cliente = new Cliente(nomeDoCliente, cpf, numeroDeCelular, endereco);
			this.repositorioClientes.adicionarCliente(cliente);
		}
		
	}
	
	public void removerCliente() {
		
		boolean operacaoCancelada=false;
		boolean operacaoConfirmada;
		
		String nomeDoCliente;
		long cpf;
		String endereco;
		long numeroDeCelular;
		
		do {
			System.out.println("Digite o nome do Cliente/Usuário: ");
			nomeDoCliente = ler.nextLine();
			System.out.println("Digite o seu CPF: ");
			cpf = ler.nextLong();
			ler.nextLine();
			System.out.println("Digite o seu endereço: ");
			endereco = ler.nextLine();
			System.out.println("Digite o número de celular: ");
			numeroDeCelular = ler.nextLong();
			ler.nextLine();
			System.out.println("Gostaria de remover o cliente?");
			String resposta = ler.nextLine();
			operacaoConfirmada = resposta.equalsIgnoreCase("Sim");
			operacaoCancelada = resposta.equalsIgnoreCase("não");
		}while(!(operacaoConfirmada || operacaoCancelada));
		
		if (operacaoConfirmada) {
			Cliente cliente = null;
			cliente = new Cliente(nomeDoCliente, cpf, numeroDeCelular, endereco);
			this.repositorioClientes.removerCliente(cliente);
			
	
			
		}
		
	}
	
	public void editarCliente() {
		
		int opcao=0;
		Cliente clienteSelecionado = this.selecionarCliente();
		
		if(clienteSelecionado!=null) { // usuário não cancelou
			
			do {
				System.out.println("Essas são os dados que você pode editar:");
				System.out.println("1- Editar nome");
				System.out.println("2- Editar o endereço");
				System.out.println("0- Sair");
				System.out.println("Digite a opção desejada:");
				opcao=ler.nextInt();
				ler.nextLine();
				switch(opcao) {
					case 1:
						editarNome(clienteSelecionado);
						break;
					case 2:
						editarOEndereco(clienteSelecionado);
						break;
				}

			}while(opcao!=0);	
		}

	}

	private void editarNome(Cliente cliente) {
		System.out.println("Digite seu novo nome de usuário: ");
		String novoNome = ler.nextLine();
		cliente.setnomeDoCliente(novoNome);	
	}
	
	private void editarOEndereco(Cliente cliente) {
		System.out.println("Digite seu novo endereço: ");
		String novoEndereco = ler.nextLine();
		cliente.setendereco(novoEndereco);
			
	}
			
}
	



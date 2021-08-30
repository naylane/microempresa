package microempresa;

import repositorios.RepositorioProduto;
import repositorios.RepositorioVenda;

public class Main {

	public static void main(String[] args) {
		
	MenuPrincipal menuPrincipal = new MenuPrincipal(new RepositorioClientes(), new RepositorioProduto(), new RepositorioVenda());
	menuPrincipal.iniciarGerenciamento();
		
	
	}

}

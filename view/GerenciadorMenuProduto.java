package view;

import javax.swing.JPanel;

import repositorios.RepositorioProduto;

public class GerenciadorMenuProduto extends JPanel {

	private MenuProduto menuProduto;
	private RepositorioProduto repositorioProduto;
	private JPanel painelAtual;
	
	public GerenciadorMenuProduto(RepositorioProduto repositorioProduto) {
		this.menuProduto = new MenuProduto(this);
		this.repositorioProduto = repositorioProduto;
		trocarSubPainel(this.menuProduto);
	}
	
	public void trocarSubPainel(JPanel jP) {
//		super.remove(this.painelAtual);
		painelAtual = jP;
		super.add(jP);
	}
	
	public void selecionarMenuProduto() {
		
	}
	
	public void selecionarMenuAdicionar() {
		AdicionarProduto adicionarProduto = new AdicionarProduto(this, this.repositorioProduto);
		
	}
	
	public void selecionarMenuRemover() {
		
	}

	public void selecionarMenuEditar() {
	
	}

	public void selecionarMenuExibirProduto() {
	
	}
	
	public void selecionarMenuExibirTodosProdutos() {
		
	}

}

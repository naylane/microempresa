package view;

import java.awt.Color;

import javax.swing.JPanel;

import repositorios.RepositorioProduto;

public class GerenciadorMenuProduto extends JPanel {

	private MenuProduto menuProduto;
	private RepositorioProduto repositorioProduto;
	private JPanel painelAtual;
	
	public GerenciadorMenuProduto(RepositorioProduto repositorioProduto) {
		super.setLayout(null);
		super.setBackground(Color.RED);
		
		
		this.menuProduto = new MenuProduto(this);
		this.repositorioProduto = repositorioProduto;
		
		
		
		
		trocarSubPainel(this.menuProduto);
	}
	
	public void trocarSubPainel(JPanel jP) {
		if (painelAtual!=null) {
			super.remove(this.painelAtual);
		}
		painelAtual = jP;
		super.add(jP);
		super.repaint();
	}
	
	public void selecionarMenuProduto() {
		trocarSubPainel(menuProduto);
	}
	
	public void selecionarMenuAdicionar() {
		AdicionarProduto adicionarProduto = new AdicionarProduto(this, this.repositorioProduto);
		trocarSubPainel(adicionarProduto);
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

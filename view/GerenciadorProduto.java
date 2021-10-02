package view;

import java.awt.Color;

import javax.swing.JPanel;

import repositorios.RepositorioProduto;

public class GerenciadorProduto extends JPanel {

	private MenuProduto menuProduto;
	private RepositorioProduto repositorioProduto;
	private JPanel painelAtual;
	
	public GerenciadorProduto(RepositorioProduto repositorioProduto) {
		super.setLayout(null);
		
		super.setBackground(Color.RED);
		
		
		this.menuProduto = new MenuProduto(this);
		this.repositorioProduto = repositorioProduto;
		
		
		
		
		this.trocarSubPainel(this.menuProduto);
	}
	
	public void trocarSubPainel(JPanel novoPainel) {
		if (painelAtual!=null) {
			super.remove(this.painelAtual);
		}
		super.add(novoPainel);
		painelAtual = novoPainel;
		super.repaint();
	}
	
	public void selecionarMenuProduto() {
		this.trocarSubPainel(menuProduto);
	}
	
	public void selecionarMenuAdicionar() {
		AdicionarProduto painelAdicionarProduto = new AdicionarProduto(this, this.repositorioProduto);
		this.trocarSubPainel(painelAdicionarProduto);
	}
	
	public void selecionarMenuRemover() {
		//alex
	}

	public void selecionarMenuEditar() {
		//erica
	}

	public void selecionarMenuExibirProduto() {
		//nay
	}
	
	public void selecionarMenuExibirTodosProdutos() {
		//samuel
	}

}

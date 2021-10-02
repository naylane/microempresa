package view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import microempresa.Produto;
import repositorios.RepositorioProduto;

public class AdicionarProduto extends CamposProduto {

	public AdicionarProduto(GerenciadorProduto gerenciadorProduto, RepositorioProduto repositorioProduto) {
		super(gerenciadorProduto); // ???
		
		this.setBackground(Color.GREEN);
		
		
		AdicionarProduto essePainelDeAdicionarProduto = this;
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = essePainelDeAdicionarProduto.lerProduto();
				repositorioProduto.adicionarProduto(produto);
				
				gerenciadorProduto.selecionarMenuProduto();
			}
		});
		btnAdicionar.setBounds(351, 266, 89, 23);
		add(btnAdicionar);

	}

}

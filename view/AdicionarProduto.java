package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import microempresa.Produto;
import repositorios.RepositorioProduto;

public class AdicionarProduto extends CamposProduto {

	public AdicionarProduto(GerenciadorMenuProduto gerenciadorMenuProduto, RepositorioProduto repositorioProduto) {
		super(gerenciadorMenuProduto); // ???
		AdicionarProduto esseAdicionarProduto = this;
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = esseAdicionarProduto.lerProduto();
				repositorioProduto.adicionarProduto(produto);
				
				gerenciadorMenuProduto.selecionarMenuProduto();
			}
		});
		btnNewButton.setBounds(351, 266, 89, 23);
		add(btnNewButton);

	}

}

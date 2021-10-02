package view;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuProduto extends JPanel {

	public MenuProduto(GerenciadorProduto gerenciadorProduto) {

		super.setBounds(5, 5, 700, 500);
		super.setBackground(Color.BLUE);
		setLayout(null);

		JButton btnAdicionar = new JButton("Adicionar produto");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gerenciadorProduto.selecionarMenuAdicionar();
			}
		});
		btnAdicionar.setBounds(10, 63, 117, 23);
		add(btnAdicionar);

		// Alex
		JButton btnRemover = new JButton("Remover produto");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gerenciadorProduto.selecionarMenuRemover();
			}
		});
		btnRemover.setBounds(180, 63, 117, 23);
		add(btnRemover);

		// Erica
		JButton bntEditar = new JButton("Editar produto");
		bntEditar.setBounds(339, 63, 101, 23);
		bntEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gerenciadorProduto.selecionarMenuEditar();
			}
		});
		add(bntEditar);

		// Nay
		JButton btnExibirUmProduto = new JButton("Exibir um produto");
        btnExibirUmProduto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciadorProduto.selecionarMenuExibirProduto();
            }
        });

		// Samuel
		JButton btnExibirTodosProdutos = new JButton("Exibir todos produtos");
		btnExibirTodosProdutos.setBounds(180, 142, 165, 23);
		btnExibirTodosProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gerenciadorProduto.selecionarMenuExibirTodosProdutos();
			}
		});
		add(btnExibirTodosProdutos);

	}
}

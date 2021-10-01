package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuProduto extends JPanel {

	public MenuProduto(GerenciadorMenuProduto gerenciadorMenuProduto) {
		
		setLayout(null);
		
		JButton btnNewButton = new JButton("Adicionar produto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gerenciadorMenuProduto.selecionarMenuAdicionar();
			}
		});
		btnNewButton.setBounds(10, 63, 117, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remover produto");
		btnNewButton_1.setBounds(180, 63, 117, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Editar produto");
		btnNewButton_2.setBounds(339, 63, 101, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exibir um produto");
		btnNewButton_3.setBounds(10, 142, 117, 23);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exibir todos produtos");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(180, 142, 165, 23);
		add(btnNewButton_4);

	}
}

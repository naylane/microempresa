package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import repositorios.RepositorioProduto;

public class JanelaTesteProduto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaTesteProduto frame = new JanelaTesteProduto(new RepositorioProduto());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaTesteProduto(RepositorioProduto repositorioProduto) {
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setBounds(10, 10, 1280, 720);
		contentPane = new GerenciadorProduto(repositorioProduto);
		super.setContentPane(contentPane);
	}

}

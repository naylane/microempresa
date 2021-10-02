package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import microempresa.Produto;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CamposProduto extends JPanel {
	
	protected JTextField tFQuantidade;
	protected JTextField tFPreco;
	protected JTextField tFNomeDoProduto;
	private JLabel lblNewLabel_3;
	private JTextField tFCodigo;

	public CamposProduto(GerenciadorProduto gerenciadorProduto) {

		super.setBounds(5, 5, 700, 600);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do produto:");
		lblNewLabel.setBounds(10, 67, 98, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pre\u00E7o:");
		lblNewLabel_1.setBounds(10, 123, 98, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade:");
		lblNewLabel_2.setBounds(10, 179, 98, 14);
		add(lblNewLabel_2);
		
		tFQuantidade = new JTextField();
		tFQuantidade.setBounds(20, 204, 420, 20);
		add(tFQuantidade);
		tFQuantidade.setColumns(10);
		
		tFPreco = new JTextField();
		tFPreco.setBounds(20, 148, 420, 20);
		add(tFPreco);
		tFPreco.setColumns(10);
		
		tFNomeDoProduto = new JTextField();
		tFNomeDoProduto.setBounds(20, 92, 420, 20);
		add(tFNomeDoProduto);
		tFNomeDoProduto.setColumns(10);
		
		lblNewLabel_3 = new JLabel("C\u00F3digo:");
		lblNewLabel_3.setBounds(10, 11, 46, 14);
		add(lblNewLabel_3);
		
		tFCodigo = new JTextField();
		tFCodigo.setBounds(20, 36, 420, 20);
		add(tFCodigo);
		tFCodigo.setColumns(10);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gerenciadorProduto.selecionarMenuProduto();
			}
		});
		btnCancelar.setBounds(252, 266, 89, 23);
		add(btnCancelar);
	}
	
	protected Produto lerProduto() {
		
		String nomeDoProduto = tFNomeDoProduto.getText();
		int preco = Integer.parseInt(tFPreco.getText());
		int quantidade = Integer.parseInt(tFQuantidade.getText());
		int codigo = Integer.parseInt(tFCodigo.getText());
		
		Produto produto;
		produto=new Produto(nomeDoProduto, preco, quantidade);
		
		return produto;
	}
	
}

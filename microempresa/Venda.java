package microempresa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
	private int codigo;
	private int valor;
	private Date dataDeEmissao;
	private List<LinhaDeVenda> linhaDeVendas; 
	
	private static int numeroDeVendasCriadas=0;
	
	public Venda(int codigo, int valor) {
		this.codigo=gerarCodigo();
		linhaDeVendas=new ArrayList<>();
	}
	
	private static int gerarCodigo() {
		return numeroDeVendasCriadas++;
	}
	
	public void finalizarVenda() {
		int somaTotal=0;
		for (int i = 0; i < linhaDeVendas.size(); i++) {
			LinhaDeVenda linhaDeVendai = linhaDeVendas.get(i);
			int valorDaLinhaDeVendaSelecionada=linhaDeVendai.getProduto().getPreco()*linhaDeVendai.getQuantidade();
			somaTotal+=valorDaLinhaDeVendaSelecionada;
		}
		valor=somaTotal;
		dataDeEmissao=new Date();
	}
	
	public int getCodigo() {
		return codigo;
	}

	public int getValor() {
		return valor;
	}

	public Date getDataDeEmissao() {
		return dataDeEmissao;
	}
	
	public String toString() {
		int codigo=this.codigo;
		int valor=this.valor;
		
		return " |Codigo: "+codigo+"; "+"Valor: "+valor+"| ";
	}

}

package repositorios;

import java.util.ArrayList;
import java.util.List;

import microempresa.Venda;

public class RepositorioVenda {
	
	private List<Venda>listaDeVendas;
	
	public RepositorioVenda() {
		this.listaDeVendas = new ArrayList<>();
	}
	
	public Venda getVenda(int codigo) {
		for (Venda venda : this.listaDeVendas) {
			if(venda.getCodigo()==codigo) {
				return venda;
			}
		}
		throw new IllegalArgumentException("Venda não encontrada.");
	}
	
	
	public void adicionarVenda(Venda venda) {
		this.listaDeVendas.add(venda);
	}
	
	
	public void removerVenda(Venda venda) {
		this.listaDeVendas.remove(venda);
	}
	
	
	public List<Venda> exibirTodasVendas(){
		return new ArrayList<>(listaDeVendas);
	}


}

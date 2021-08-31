package microempresa;

import java.util.ArrayList;
import java.util.List;

public class RepositorioClientes {
	
	private List <Cliente> listaDeClientes;
	
	public RepositorioClientes() {
		this.listaDeClientes=new ArrayList<>();
	}
	
	public Cliente getCliente(long codigoDoCliente) {
		for (Cliente cliente : this.listaDeClientes) {
			if (cliente.getCodigoDoCliente() == codigoDoCliente) {
				return cliente;
			}	
		} throw new IllegalArgumentException("Cliente/usuário não encontrado.");
		
	}
	
	public void adicionarCliente(Cliente cliente) {
	 this.listaDeClientes.add(cliente);
		
	}
	
	public void removerCliente(Cliente cliente) {
	 this.listaDeClientes.add(cliente);
		
	}
		
}

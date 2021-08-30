package microempresa;

import java.util.List;

public class RepositorioClientes {
	
	private List <Cliente> listaDeClientes;
	
	public Cliente getCliente(long codigoDeCliente) {
		for (Cliente cliente : this.listaDeClientes) {
			if (cliente.getCodigoDoCliente() == codigoDeCliente) {
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

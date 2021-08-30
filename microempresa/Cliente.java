package microempresa;

public class Cliente {

	public Cliente ( String nomeDoCliente, long numeroDeCelular, long cpf, String endereco) {
		this.nomeDoCliente = nomeDoCliente;
		this.numeroDeCelular = numeroDeCelular;
		this.cpf = cpf;
		this.endereco = endereco;
		this.codigoDoCliente = gerarCodigo();
	}
	
	private static long contadorDeClientes;
	private long codigoDoCliente;
	private String nomeDoCliente;
	private long numeroDeCelular;
	private long cpf;
	private String endereco;
	
	public String getNomeDoCliente() {
		return nomeDoCliente;
		
	}
	
	public long getNumeroDeCelular() {
		return numeroDeCelular;
		
	}
	
	public String getEndereco() {
		return endereco;
		
	}
	
	public long getCpf() {
		return cpf;
		
	}
	
	public long getCodigoDoCliente() {
		return codigoDoCliente;
		
	}
	
	public static long gerarCodigo() {
		return contadorDeClientes++;
		
	}

}

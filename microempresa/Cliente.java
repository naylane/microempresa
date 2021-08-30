package microempresa;

public class Cliente {
	
	public Cliente ( String nomeDeUsuario, long numeroDeCelular, long cpf, String endereco) {
		this.nomeDeUsuario = nomeDeUsuario;
		this.numeroDeCelular = numeroDeCelular;
		this.cpf = cpf;
		this.endereco = endereco;
		this.codigoDoCliente = gerarCodigo();
	}
	
	private static long contadorDeClientes;
	private long codigoDoCliente;
	private String nomeDeUsuario;
	private long numeroDeCelular;
	private long cpf;
	private String endereco;
	
	private String getNomeDeUsuario() {
		return nomeDeUsuario;
		
	}
	
	private long getNumeroDeCelular() {
		return numeroDeCelular;
		
	}
	
	private String getEndereco() {
		return endereco;
		
	}
	
	private long getCpf() {
		return cpf;
		
	}
	
	public long getCodigoDoCliente() {
		return codigoDoCliente;
		
	}
	
	public static long gerarCodigo() {
		return contadorDeClientes++;
		
	}

}

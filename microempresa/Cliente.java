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
	
	public void setnomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	
	public long getNumeroDeCelular() {
		return numeroDeCelular;
		
	}
	
	public void setnumeroDeCelular(Long numeroDeCelular) {
		this.numeroDeCelular = numeroDeCelular;
	}
	
	
	
	public String getEndereco() {
		return endereco;
		
	}
	
	public void setendereco(String endereco) {
		this.endereco = endereco;
	
	}
	
	
	public long getCpf() {
		return cpf;
		
	}
	
	public void setcpf(long cpf) {
		this.cpf = cpf;
	
	}
	
	
	public long getCodigoDoCliente() {
		return codigoDoCliente;
		
	}
	
	public void setcodigoDoCliente(Long codigoDoCliente) {
		this.codigoDoCliente = codigoDoCliente;
	
	}
	
	
	public static long gerarCodigo() {
		return contadorDeClientes++;
		
	}
	
	public void setcodigo(Long codigo) {
		this.codigoDoCliente = codigo;
	}

	
}




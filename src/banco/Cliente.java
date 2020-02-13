package banco;

public class Cliente {
	private String nome;
	private String cpf;
	private TipoCliente tipo;
	
	public Cliente(String nome, String cpf, TipoCliente tipo) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public TipoCliente getTipo() {
		return this.tipo;
	}
	
	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", tipo=" + tipo + "]";
	}
	
	
	
}
